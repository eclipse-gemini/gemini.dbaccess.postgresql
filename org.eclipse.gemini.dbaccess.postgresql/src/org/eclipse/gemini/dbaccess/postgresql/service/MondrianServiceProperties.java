/*******************************************************************************
 * Copyright (c) 2010 Oracle.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0 
 * and Apache License v2.0 which accompanies this distribution. 
 * The Eclipse Public License is available at
 *     https://www.eclipse.org/legal/epl-2.0/
 *
 *     SPDX-License-Identifier: EPL-2.0
 * and the Apache License v2.0 is available at 
 *     http://www.opensource.org/licenses/apache2.0.php.
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *     Jose C. Dominguez - Service property constants for Oracle JDBC support 
 ******************************************************************************/

package org.eclipse.gemini.dbaccess.postgresql.service;


/**
 * Service property values for Derby data source factory services.
 */
public class MondrianServiceProperties {

    // Register a service under each of the following driver class names
    public static final String MONDRIAN_MSSQL_DRIVER_CLASS = "mondrian.olap4j.MondrianOlap4jDriver";

    // Register all Oracle factory services under this driver name
    public static final String MONDRIAN_MSSQL_DRIVER_NAME = "MondrianOlap4j";

}
