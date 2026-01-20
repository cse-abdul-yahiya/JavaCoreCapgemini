/**
 * 
 */
package com.capgemini.core_java_filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class FileHandler {
	public static final String path ="/Users/File_handling//data.txt";
	public static final String data="Hello World";
	public static File file;
	
	public static void create() throws IOException {
		file = new File(path);
		if(file.createNewFile()) {
			System.out.println("File created");
		}
		else {
			System.out.println("File Alredy Exits!");
		}
	}
	public static void update() throws IOException{
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(data);
		fileWriter.flush();
		fileWriter.close();
		System.out.println("File Updated");
	}
	
	public static void read() throws FileNotFoundException, IOException {
		FileReader fileReader = new FileReader(file);
		int i;
		while((i=fileReader.read())>0) {
			System.out.println((char)i);
		}
		fileReader.close();
		
	}
	public static void delete() {
		if(file.delete()) {
			System.out.println("File Deleted");
		}
		else {
			System.out.println("File Doesn't Exist!");
		}
	}

}
