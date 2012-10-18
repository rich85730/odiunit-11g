/*
 * Copyright 2012 Robson Kraemer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.rpk.odiunit;

import java.sql.Connection;

/**
 * Used to represent a SQL Script that execute environment set up
 * @author Robson Kraemer
 *
 */
public interface ODISqlScriptSetUp extends ODISetUpStatement {

	/**
	 * 
	 * @return the directory location of SQL script to execute
	 */
	String scriptLocation();
	
	/**
	 * Provides a connection to database which script must be executed
	 * @return
	 */
	Connection getConnection();
}
