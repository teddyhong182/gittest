package com.teddy.gittest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Hello world!
 *
 */
public class App {


	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main( String[] args ) {
		for (int i = 0; i < 10; i++) {
			logger.debug( "{} Hello GIT!",i);
			logger.debug( "{} Hello GIT stupid!",i);
		}

	}


}
