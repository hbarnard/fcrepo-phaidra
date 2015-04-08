/* The contents of this file are subject to the license and copyright terms
 * detailed in the license directory at the root of the source tree (also 
 * available online at http://fedora-commons.org/license/).
 */
package org.fcrepo.server.errors;

/**
 * Signals that a method associated with a Service Deployment could not 
 * be found.
 * 
 * @author Ross Wayland
 */
public class MethodNotFoundException
        extends StorageException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a MethodNotFoundException.
     * 
     * @param message
     *        An informative message explaining what happened and (possibly) how
     *        to fix it.
     */
    public MethodNotFoundException(String message) {
        super(message);
    }

    public MethodNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
