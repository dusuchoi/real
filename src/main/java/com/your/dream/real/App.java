package com.your.dream.real;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
		Logger logger = Logger.getLogger("log");
    	for(String arg : args) {
    		logger.log(Level.FINE,"parameter: {}", arg);
    	}
    }
}
