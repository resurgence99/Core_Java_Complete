package javaFileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	
	public static void writeFile() throws IOException {
		String path="./src/javaFileHandling/text.txt";
		FileWriter writer = new FileWriter(path);
		writer.write("Hello World this is a java program. This java program is for writer class demo.");
		writer.close();
	}
	
	public static void writeFileBufferd() throws IOException {
		String path="./src/javaFileHandling/text.txt";
		FileWriter writer = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("Hello World this is a java program.\nThis\t java program is for writer class demo.");
	//  writer.write("Hello World this is a java program. This java program is for writer class demo.");
//		writer.close();
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		//writeFile();
		writeFileBufferd();
	}

}
