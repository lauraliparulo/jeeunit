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

package com.googlecode.jeeunit.spring.impl;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.googlecode.jeeunit.impl.AbstractTestRunnerServlet;
import com.googlecode.jeeunit.spi.Injector;

/**
 * Test runner servlet using Spring injection from the root context of a web application.
 * 
 * @author hwellmann
 *
 */
public class TestRunnerServlet extends AbstractTestRunnerServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected Injector createInjector() {
        ServletContext context = getServletContext();
        WebApplicationContext appContext = WebApplicationContextUtils
                .getWebApplicationContext(context);
        SpringInjector injector = new SpringInjector(appContext.getAutowireCapableBeanFactory());

        return injector;
    }
}
