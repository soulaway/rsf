package com.github.soulaway.rsf;

import org.apache.camel.component.sparkrest.ServletSparkApplication;

public class RsfServlet extends ServletSparkApplication {
    
	@Override
    public void init() {
		System.out.println("init");    
		super.init();
	}
}
