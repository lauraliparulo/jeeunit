/*
 * Copyright  2000-2005 The Apache Software Foundation
 * Modified 2010 by Harald Wellmann
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.googlecode.jeeunit.report;

/**
 * <p> Interface groups XML constants.
 * Interface that groups all constants used throughout the <tt>XML</tt>
 * documents that are generated by the <tt>XMLJUnitResultFormatter</tt>
 * As of now the DTD is:
 * <code><pre>
 * <----------------- @todo describe DTDs ---------------------->
 *
 * </pre></code>
 * @see XMLJUnitResultFormatter
 * @see XMLResultAggregator
 */
public class XmlConstants 
{
    /** the testsuites element for the aggregate document */
    public static final String TESTSUITES = "testsuites";

    /** the testsuite element */
    public static final String TESTSUITE = "testsuite";

    /** the testcase element */
    public static final String TESTCASE = "testcase";

    /** the error element */
    public static final String ERROR = "error";

    /** the skipped element */
    public static final String SKIPPED = "skipped";

    /** the failure element */
    public static final String FAILURE = "failure";

    /** the system-err element */
    public static final String SYSTEM_ERR = "system-err";

    /** the system-out element */
    public static final String SYSTEM_OUT = "system-out";

    /** package attribute for the aggregate document */
    public static final String ATTR_PACKAGE = "package";

    /** name attribute for property, testcase and testsuite elements */
    public static final String ATTR_NAME = "name";

    /** time attribute for testcase and testsuite elements */
    public static final String ATTR_TIME = "time";

    /** errors attribute for testsuite elements */
    public static final String ATTR_ERRORS = "errors";

    /** failures attribute for testsuite elements */
    public static final String ATTR_FAILURES = "failures";

    /** tests attribute for testsuite elements */
    public static final String ATTR_TESTS = "tests";

    /** type attribute for failure and error elements */
    public static final String ATTR_TYPE = "type";

    /** message attribute for failure elements */
    public static final String ATTR_MESSAGE = "message";

    /** the properties element */
    public static final String PROPERTIES = "properties";

    /** the property element */
    public static final String PROPERTY = "property";

    /** value attribute for property elements */
    public static final String ATTR_VALUE = "value";

    /** classname attribute for testcase elements */
    public static final String ATTR_CLASSNAME = "classname";

    /** id attribute */
    public static final String ATTR_ID = "id";
}
