package com.classes;

import java.util.logging.Logger;

/**
 * This class demonstrates a for and while loop. It also allow the student to
 * see the iterations and index
 **/
public class HelloWorld {

	private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());
	HelloString helloString = new HelloString();

	public void helloForLoop() {
		int j = 0;
		for (int i = 0; i < 9; i++) {
			System.out.println(helloString.getHello() + " while loop  " + (i + 1) + " times");
			j++;
		}
		LOGGER.info("End of For Loop with " + (j + 1) + " iterations");
	}

	public void helloWhileLoop() {
		int i = 0;
		boolean looper = true;
		while (looper) {
			System.out.println(helloString.getHello() + " for loop  " + (i + 1) + " times");
			i = i + 1;
			if (i > 9) {
				looper = false;
			}
		}
		LOGGER.info("End of while loop with " + (i) + " iterations");
	}

}
