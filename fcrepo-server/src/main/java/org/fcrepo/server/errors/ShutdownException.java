/* The contents of this file are subject to the license and copyright terms
 * detailed in the license directory at the root of the source tree (also 
 * available online at http://fedora-commons.org/license/).
 */
package org.fcrepo.server.errors;

/**
 * Superclass for shutdown-related exceptions.
 * 
 * @author Chris Wilper
 */
public class ShutdownException
        extends ServerException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates an ShutdownException.
     * 
     * @param message
     *        An informative message explaining what happened and (possibly) how
     *        to fix it.
     */
    public ShutdownException(String message) {
        super(null, message, null, null, null);
    }

    public ShutdownException(String message, Throwable cause) {
        super(null, message, null, null, cause);
    }

    public ShutdownException(String bundleName,
                             String code,
                             String[] replacements,
                             String[] details,
                             Throwable cause) {
        super(bundleName, code, replacements, details, cause);
    }

}
