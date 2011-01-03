// Copyright (c) 2002 Cunningham & Cunningham, Inc.
// Released under the terms of the GNU General Public License version 2 or later.

package com.googlecode.jeeunit.fit.eg.music.spring;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/META-INF/spring/fit-context.xml")
public class Display extends fit.RowFixture {
    
    @Inject
    private MusicLibrary musicLibrary;

    public Class<?> getTargetClass() {
        return Music.class;
    }

    public Object[] query() {
        return musicLibrary.displayContents();
    }

    public Object parse (String s, Class type) throws Exception {
        if (type.equals(Date.class))    {return Music.dateFormat.parse(s);}
        return super.parse (s, type);
    }

}
