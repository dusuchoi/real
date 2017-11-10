package com.your.dream.real;

import sun.rmi.runtime.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args ) {
    	for(String arg : args) {
    		logger.setLevel(Level.INFO);
    		logger.info("parameter: " + arg);
    	}

    }
}
