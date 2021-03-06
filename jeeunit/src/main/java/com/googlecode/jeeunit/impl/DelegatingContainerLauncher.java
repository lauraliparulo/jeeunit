/*
 * Copyright 2011 Harald Wellmann
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
package com.googlecode.jeeunit.impl;

import java.io.File;
import java.io.FileFilter;
import java.net.URI;

import com.googlecode.jeeunit.spi.ContainerLauncher;

abstract public class DelegatingContainerLauncher<T extends ContainerLauncher> implements ContainerLauncher {
    
    abstract public T getSingleton();
    
    @Override
    public void launch() {
        getSingleton().launch();
    }

    @Override
    public void shutdown() {
        getSingleton().shutdown();
    }

    @Override
    public URI autodeploy() {
        return getSingleton().autodeploy();
    }

    @Override
    public void setClasspathFilter(FileFilter filter) {
        getSingleton().setClasspathFilter(filter);
    }

    @Override
    public void addMetadata(File file) {
        getSingleton().addMetadata(file);
    }

    @Override
    public URI getContextRootUri() {
        return getSingleton().getContextRootUri();
    }
}
