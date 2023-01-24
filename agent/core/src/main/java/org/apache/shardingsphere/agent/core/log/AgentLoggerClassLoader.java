/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.agent.core.log;

import org.apache.shardingsphere.agent.core.classloader.AgentExtraClassLoader;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.jar.JarFile;

/**
 * Agent logger class loader.
 */
public final class AgentLoggerClassLoader extends AgentExtraClassLoader {
    
    public AgentLoggerClassLoader(final Collection<JarFile> loggingJars, final File resourcePath) {
        super(AgentLoggerFactory.class.getClassLoader().getParent(), loggingJars, Collections.singleton(resourcePath));
    }
    
    public AgentLoggerClassLoader() {
        super(AgentLoggerFactory.class.getClassLoader(), Collections.emptyList());
    }
}