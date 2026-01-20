/**
 * 
 */
package com.capgemini.core_java_filehandling;

import java.io.IOException;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		try {
			FileHandler.create();
			FileHandler.update();
			FileHandler.read();
			FileHandler.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
