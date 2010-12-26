/*
 * Copyright 2010 Harald Wellmann
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
package com.googlecode.jeeunit.glassfish;

import com.googlecode.jeeunit.spi.ContainerLauncher;
import com.sun.jersey.api.client.WebResource;

public class GlassfishLauncher implements ContainerLauncher {
    
    public GlassfishLauncher() {
    }
    
    @Override
    public WebResource getTestRunner() {
        GlassfishContainer container = GlassfishContainer.getInstance();
        return container.getTestRunner();
    }
    
    
    @Override
    public void launch() {
        GlassfishContainer container = GlassfishContainer.getInstance();
        container.launch();
    }

}