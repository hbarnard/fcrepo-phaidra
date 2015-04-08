/* The contents of this file are subject to the license and copyright terms
 * detailed in the license directory at the root of the source tree (also 
 * available online at http://fedora-commons.org/license/).
 */
package org.fcrepo.server.storage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import java.util.Date;

import org.xml.sax.InputSource;

import org.fcrepo.server.Context;
import org.fcrepo.server.errors.DatastreamNotFoundException;
import org.fcrepo.server.errors.GeneralException;
import org.fcrepo.server.errors.MethodNotFoundException;
import org.fcrepo.server.errors.ObjectIntegrityException;
import org.fcrepo.server.errors.RepositoryConfigurationException;
import org.fcrepo.server.errors.ServerException;
import org.fcrepo.server.errors.StreamIOException;
import org.fcrepo.server.errors.UnsupportedTranslationException;
import org.fcrepo.server.storage.service.ServiceMapper;
import org.fcrepo.server.storage.translation.DOTranslator;
import org.fcrepo.server.storage.types.DeploymentDSBindSpec;
import org.fcrepo.server.storage.types.DigitalObject;
import org.fcrepo.server.storage.types.MethodDef;
import org.fcrepo.server.storage.types.MethodDefOperationBind;
import org.fcrepo.server.storage.types.MethodParmDef;


/**
 * A ServiceDeploymentReader based on a DigitalObject.
 * 
 * @author Chris Wilper
 */
public class SimpleServiceDeploymentReader
        extends SimpleServiceAwareReader
        implements ServiceDeploymentReader {

    private final ServiceMapper serviceMapper;

    public SimpleServiceDeploymentReader(Context context,
                             RepositoryReader repoReader,
                             DOTranslator translator,
                             String exportFormat,
                             String storageFormat,
                             String encoding,
                             InputStream serializedObject)
            throws ObjectIntegrityException, StreamIOException,
            UnsupportedTranslationException, ServerException {
        super(context,
              repoReader,
              translator,
              exportFormat,
              storageFormat,
              encoding,
              serializedObject);
        serviceMapper = new ServiceMapper(GetObjectPID());
    }

    /**
     * Alternate constructor for when a DigitalObject is already available for
     * some reason.
     */
    public SimpleServiceDeploymentReader(Context context,
                             RepositoryReader repoReader,
                             DOTranslator translator,
                             String exportFormat,
                             String encoding,
                             DigitalObject obj) {
        super(context, repoReader, translator, exportFormat, encoding, obj);
        serviceMapper = new ServiceMapper(GetObjectPID());
    }

    public MethodDef[] getServiceMethods(Date versDateTime)
            throws DatastreamNotFoundException, ObjectIntegrityException,
            RepositoryConfigurationException, GeneralException {
        return serviceMapper
                .getMethodDefs(new InputSource(new ByteArrayInputStream(getMethodMapDatastream(versDateTime).xmlContent)));
    }

    public MethodParmDef[] getServiceMethodParms(String methodName,
                                                 Date versDateTime)
            throws MethodNotFoundException, ServerException {
        return getParms(getServiceMethods(versDateTime), methodName);
    }

    public MethodDefOperationBind[] getServiceMethodBindings(Date versDateTime)
            throws DatastreamNotFoundException, ObjectIntegrityException,
            RepositoryConfigurationException, GeneralException {
        return serviceMapper
                .getMethodDefBindings(new InputSource(new ByteArrayInputStream(getWSDLDatastream(versDateTime).xmlContent)),
                                      new InputSource(new ByteArrayInputStream(getMethodMapDatastream(versDateTime).xmlContent)));
    }

    public DeploymentDSBindSpec getServiceDSInputSpec(Date versDateTime)
            throws DatastreamNotFoundException, ObjectIntegrityException,
            RepositoryConfigurationException, GeneralException {
        return serviceMapper
                .getDSInputSpec(new InputSource(new ByteArrayInputStream(getDSInputSpecDatastream(versDateTime).xmlContent)));
    }

    public InputStream getServiceMethodsXML(Date versDateTime)
            throws DatastreamNotFoundException, ObjectIntegrityException {
        return new ByteArrayInputStream(getMethodMapDatastream(versDateTime).xmlContent);
    }

    /**
     * Get the parms out of a particular service method definition.
     * 
     * @param methods
     * @return
     */
    private MethodParmDef[] getParms(MethodDef[] methods, String methodName)
            throws MethodNotFoundException, ServerException {
        for (MethodDef element : methods) {
            if (element.methodName.equalsIgnoreCase(methodName)) {
                return element.methodParms;
            }
        }
        throw new MethodNotFoundException("[getParms] The service deployment object, "
                + m_obj.getPid()
                + ", does not have a service method named '"
                + methodName);
    }
}
