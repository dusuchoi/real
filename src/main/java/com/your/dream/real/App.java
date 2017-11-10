package com.your.dream.real;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static Logger logger = Logger.getLogger("log");
    public static void main( String[] args ) {
    	for(String arg : args) {
    		logger.log(Level.INFO,"parameter: "+ arg);
    	}
    }
}
