package org.fcrepo.server.management;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2015-01-15T12:26:31.873+01:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://www.fedora.info/definitions/1/0/types/", name = "Fedora-API-M")
@XmlSeeAlso({org.fcrepo.server.types.gen.ObjectFactory.class})
public interface FedoraAPIM {

    @WebResult(name = "purgedDate", targetNamespace = "")
    @RequestWrapper(localName = "purgeObject", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.PurgeObject")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#purgeObject")
    @ResponseWrapper(localName = "purgeObjectResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.PurgeObjectResponse")
    public java.lang.String purgeObject(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage,
        @WebParam(name = "force", targetNamespace = "")
        boolean force
    );

    @WebResult(name = "datastream", targetNamespace = "")
    @RequestWrapper(localName = "getDatastream", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetDatastream")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#getDatastream")
    @ResponseWrapper(localName = "getDatastreamResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetDatastreamResponse")
    public org.fcrepo.server.types.gen.Datastream getDatastream(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID,
        @WebParam(name = "asOfDateTime", targetNamespace = "")
        java.lang.String asOfDateTime
    );

    @WebResult(name = "objectXML", targetNamespace = "")
    @RequestWrapper(localName = "export", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.Export")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#export")
    @ResponseWrapper(localName = "exportResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.ExportResponse")
    public byte[] export(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "format", targetNamespace = "")
        java.lang.String format,
        @WebParam(name = "context", targetNamespace = "")
        java.lang.String context
    );

    @WebResult(name = "modifiedDate", targetNamespace = "")
    @RequestWrapper(localName = "modifyDatastreamByReference", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.ModifyDatastreamByReference")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#modifyDatastreamByReference")
    @ResponseWrapper(localName = "modifyDatastreamByReferenceResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.ModifyDatastreamByReferenceResponse")
    public java.lang.String modifyDatastreamByReference(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID,
        @WebParam(name = "altIDs", targetNamespace = "")
        org.fcrepo.server.types.gen.ArrayOfString altIDs,
        @WebParam(name = "dsLabel", targetNamespace = "")
        java.lang.String dsLabel,
        @WebParam(name = "MIMEType", targetNamespace = "")
        java.lang.String mimeType,
        @WebParam(name = "formatURI", targetNamespace = "")
        java.lang.String formatURI,
        @WebParam(name = "dsLocation", targetNamespace = "")
        java.lang.String dsLocation,
        @WebParam(name = "checksumType", targetNamespace = "")
        java.lang.String checksumType,
        @WebParam(name = "checksum", targetNamespace = "")
        java.lang.String checksum,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage,
        @WebParam(name = "force", targetNamespace = "")
        boolean force
    );

    @WebResult(name = "datastreamID", targetNamespace = "")
    @RequestWrapper(localName = "addDatastream", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.AddDatastream")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#addDatastream")
    @ResponseWrapper(localName = "addDatastreamResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.AddDatastreamResponse")
    public java.lang.String addDatastream(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID,
        @WebParam(name = "altIDs", targetNamespace = "")
        org.fcrepo.server.types.gen.ArrayOfString altIDs,
        @WebParam(name = "dsLabel", targetNamespace = "")
        java.lang.String dsLabel,
        @WebParam(name = "versionable", targetNamespace = "")
        boolean versionable,
        @WebParam(name = "MIMEType", targetNamespace = "")
        java.lang.String mimeType,
        @WebParam(name = "formatURI", targetNamespace = "")
        java.lang.String formatURI,
        @WebParam(name = "dsLocation", targetNamespace = "")
        java.lang.String dsLocation,
        @WebParam(name = "controlGroup", targetNamespace = "")
        java.lang.String controlGroup,
        @WebParam(name = "dsState", targetNamespace = "")
        java.lang.String dsState,
        @WebParam(name = "checksumType", targetNamespace = "")
        java.lang.String checksumType,
        @WebParam(name = "checksum", targetNamespace = "")
        java.lang.String checksum,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage
    );

    @WebResult(name = "purgedVersionDate", targetNamespace = "")
    @RequestWrapper(localName = "purgeDatastream", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.PurgeDatastream")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#purgeDatastream")
    @ResponseWrapper(localName = "purgeDatastreamResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.PurgeDatastreamResponse")
    public java.util.List<java.lang.String> purgeDatastream(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID,
        @WebParam(name = "startDT", targetNamespace = "")
        java.lang.String startDT,
        @WebParam(name = "endDT", targetNamespace = "")
        java.lang.String endDT,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage,
        @WebParam(name = "force", targetNamespace = "")
        boolean force
    );

    @WebResult(name = "modifiedDate", targetNamespace = "")
    @RequestWrapper(localName = "setDatastreamVersionable", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.SetDatastreamVersionable")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#setDatastreamVersionable")
    @ResponseWrapper(localName = "setDatastreamVersionableResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.SetDatastreamVersionableResponse")
    public java.lang.String setDatastreamVersionable(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID,
        @WebParam(name = "versionable", targetNamespace = "")
        boolean versionable,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage
    );

    @WebResult(name = "objectXML", targetNamespace = "")
    @RequestWrapper(localName = "getObjectXML", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetObjectXML")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#getObjectXML")
    @ResponseWrapper(localName = "getObjectXMLResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetObjectXMLResponse")
    public byte[] getObjectXML(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid
    );

    @WebResult(name = "modifiedDate", targetNamespace = "")
    @RequestWrapper(localName = "modifyDatastreamByValue", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.ModifyDatastreamByValue")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#modifyDatastreamByValue")
    @ResponseWrapper(localName = "modifyDatastreamByValueResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.ModifyDatastreamByValueResponse")
    public java.lang.String modifyDatastreamByValue(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID,
        @WebParam(name = "altIDs", targetNamespace = "")
        org.fcrepo.server.types.gen.ArrayOfString altIDs,
        @WebParam(name = "dsLabel", targetNamespace = "")
        java.lang.String dsLabel,
        @WebParam(name = "MIMEType", targetNamespace = "")
        java.lang.String mimeType,
        @WebParam(name = "formatURI", targetNamespace = "")
        java.lang.String formatURI,
        @WebParam(name = "dsContent", targetNamespace = "")
        byte[] dsContent,
        @WebParam(name = "checksumType", targetNamespace = "")
        java.lang.String checksumType,
        @WebParam(name = "checksum", targetNamespace = "")
        java.lang.String checksum,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage,
        @WebParam(name = "force", targetNamespace = "")
        boolean force
    );

    @WebResult(name = "modifiedDate", targetNamespace = "")
    @RequestWrapper(localName = "modifyObject", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.ModifyObject")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#modifyObject")
    @ResponseWrapper(localName = "modifyObjectResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.ModifyObjectResponse")
    public java.lang.String modifyObject(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "state", targetNamespace = "")
        java.lang.String state,
        @WebParam(name = "label", targetNamespace = "")
        java.lang.String label,
        @WebParam(name = "ownerId", targetNamespace = "")
        java.lang.String ownerId,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage
    );

    @WebResult(name = "datastream", targetNamespace = "")
    @RequestWrapper(localName = "getDatastreamHistory", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetDatastreamHistory")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#getDatastreamHistory")
    @ResponseWrapper(localName = "getDatastreamHistoryResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetDatastreamHistoryResponse")
    public java.util.List<org.fcrepo.server.types.gen.Datastream> getDatastreamHistory(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID
    );

    @WebResult(name = "pid", targetNamespace = "")
    @RequestWrapper(localName = "getNextPID", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetNextPID")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#getNextPID")
    @ResponseWrapper(localName = "getNextPIDResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetNextPIDResponse")
    public java.util.List<java.lang.String> getNextPID(
        @WebParam(name = "numPIDs", targetNamespace = "")
        java.math.BigInteger numPIDs,
        @WebParam(name = "pidNamespace", targetNamespace = "")
        java.lang.String pidNamespace
    );

    @WebResult(name = "objectPID", targetNamespace = "")
    @RequestWrapper(localName = "ingest", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.Ingest")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#ingest")
    @ResponseWrapper(localName = "ingestResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.IngestResponse")
    public java.lang.String ingest(
        @WebParam(name = "objectXML", targetNamespace = "")
        byte[] objectXML,
        @WebParam(name = "format", targetNamespace = "")
        java.lang.String format,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage
    );

    @WebResult(name = "added", targetNamespace = "")
    @RequestWrapper(localName = "addRelationship", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.AddRelationship")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#addRelationship")
    @ResponseWrapper(localName = "addRelationshipResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.AddRelationshipResponse")
    public boolean addRelationship(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "relationship", targetNamespace = "")
        java.lang.String relationship,
        @WebParam(name = "object", targetNamespace = "")
        java.lang.String object,
        @WebParam(name = "isLiteral", targetNamespace = "")
        boolean isLiteral,
        @WebParam(name = "datatype", targetNamespace = "")
        java.lang.String datatype
    );

    @WebResult(name = "relationships", targetNamespace = "")
    @RequestWrapper(localName = "getRelationships", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetRelationships")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#getRelationships")
    @ResponseWrapper(localName = "getRelationshipsResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetRelationshipsResponse")
    public java.util.List<org.fcrepo.server.types.gen.RelationshipTuple> getRelationships(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "relationship", targetNamespace = "")
        java.lang.String relationship
    );

    @WebResult(name = "datastream", targetNamespace = "")
    @RequestWrapper(localName = "getDatastreams", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetDatastreams")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#getDatastreams")
    @ResponseWrapper(localName = "getDatastreamsResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.GetDatastreamsResponse")
    public java.util.List<org.fcrepo.server.types.gen.Datastream> getDatastreams(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "asOfDateTime", targetNamespace = "")
        java.lang.String asOfDateTime,
        @WebParam(name = "dsState", targetNamespace = "")
        java.lang.String dsState
    );

    @WebResult(name = "validation", targetNamespace = "")
    @RequestWrapper(localName = "validate", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.Validate")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#validate")
    @ResponseWrapper(localName = "validateResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.ValidateResponse")
    public org.fcrepo.server.types.gen.Validation validate(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "asOfDateTime", targetNamespace = "")
        java.lang.String asOfDateTime
    );

    @WebResult(name = "purged", targetNamespace = "")
    @RequestWrapper(localName = "purgeRelationship", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.PurgeRelationship")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#purgeRelationship")
    @ResponseWrapper(localName = "purgeRelationshipResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.PurgeRelationshipResponse")
    public boolean purgeRelationship(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "relationship", targetNamespace = "")
        java.lang.String relationship,
        @WebParam(name = "object", targetNamespace = "")
        java.lang.String object,
        @WebParam(name = "isLiteral", targetNamespace = "")
        boolean isLiteral,
        @WebParam(name = "datatype", targetNamespace = "")
        java.lang.String datatype
    );

    @WebResult(name = "modifiedDate", targetNamespace = "")
    @RequestWrapper(localName = "setDatastreamState", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.SetDatastreamState")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#setDatastreamState")
    @ResponseWrapper(localName = "setDatastreamStateResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.SetDatastreamStateResponse")
    public java.lang.String setDatastreamState(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID,
        @WebParam(name = "dsState", targetNamespace = "")
        java.lang.String dsState,
        @WebParam(name = "logMessage", targetNamespace = "")
        java.lang.String logMessage
    );

    @WebResult(name = "checksum", targetNamespace = "")
    @RequestWrapper(localName = "compareDatastreamChecksum", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.CompareDatastreamChecksum")
    @WebMethod(action = "http://www.fedora.info/definitions/1/0/api/#compareDatastreamChecksum")
    @ResponseWrapper(localName = "compareDatastreamChecksumResponse", targetNamespace = "http://www.fedora.info/definitions/1/0/types/", className = "org.fcrepo.server.types.gen.CompareDatastreamChecksumResponse")
    public java.lang.String compareDatastreamChecksum(
        @WebParam(name = "pid", targetNamespace = "")
        java.lang.String pid,
        @WebParam(name = "dsID", targetNamespace = "")
        java.lang.String dsID,
        @WebParam(name = "versionDate", targetNamespace = "")
        java.lang.String versionDate
    );
}
