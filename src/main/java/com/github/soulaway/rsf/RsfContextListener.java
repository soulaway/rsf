package com.github.soulaway.rsf;

import javax.servlet.ServletContextEvent;

import org.apache.camel.component.sparkrest.SparkServletContextListener;

public class RsfContextListener extends SparkServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
    	System.out.println("contextInitialized");
    	super.contextInitialized(event);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
    	System.out.println("contextDestroyed");
    	super.contextDestroyed(event);
    }
}
