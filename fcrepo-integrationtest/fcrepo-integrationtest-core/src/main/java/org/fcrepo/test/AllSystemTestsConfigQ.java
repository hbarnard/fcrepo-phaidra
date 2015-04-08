/* The contents of this file are subject to the license and copyright terms
 * detailed in the license directory at the root of the source tree (also
 * available online at http://fedora-commons.org/license/).
 */
package org.fcrepo.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses( {org.fcrepo.test.AllCommonSystemTests.class,
        org.fcrepo.test.api.TestAPIAConfigA.class,
        org.fcrepo.test.api.TestAPIALiteConfigA.class,
        org.fcrepo.test.api.TestHTTPStatusCodesConfigQ.class,
        org.fcrepo.test.api.TestManyDisseminations.class,
        org.fcrepo.test.api.TestRESTAPIConfigQ.class})
public class AllSystemTestsConfigQ {

    // Supports legacy tests runners
    public static junit.framework.Test suite() throws Exception {

        junit.framework.TestSuite suite =
                new junit.framework.TestSuite(AllSystemTestsConfigQ.class
                        .getName());

        suite.addTest(org.fcrepo.test.AllCommonSystemTests.suite());
        suite.addTest(org.fcrepo.test.api.TestAPIAConfigA.suite());
        suite.addTest(org.fcrepo.test.api.TestAPIALiteConfigA.suite());
        suite.addTest(org.fcrepo.test.api.TestHTTPStatusCodesConfigQ.suite());
        suite.addTest(org.fcrepo.test.api.TestManyDisseminations.suite());
        suite.addTest(org.fcrepo.test.api.TestRESTAPIConfigQ.suite());

        return suite;
    }
}
