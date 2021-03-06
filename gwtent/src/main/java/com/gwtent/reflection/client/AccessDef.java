/*******************************************************************************
 *  Copyright 2001, 2007 JamesLuo(JamesLuo.au@gmail.com)
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 * 
 *  Contributors:
 *******************************************************************************/


package com.gwtent.reflection.client;

/**
 * Access info for Class, Field and Method
 * 
 * @author James Luo 2007-12-24 下午05:21:39
 * 
 */
public interface AccessDef {
	public boolean isFinal();

	public boolean isPrivate();

	public boolean isProtected();

	public boolean isPublic();

	public boolean isStatic();

//	public boolean isTransient();
//
//	public boolean isVolatile();

}
