package javaFileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
	
	public static void readFile() throws IOException {
		//String path = "C:\\Users\\Ganesh G\\Desktop\\JAVA\\basic_ptoj\\src\\javaFileHandling\\AutomationPractise.csv";
		
		String path = ".\\src\\javaFileHandling\\AutomationPractise.csv";
		FileReader reader = new FileReader(path);
//		int i = reader.read();
//		System.out.println((char)i);
		
//		reader.read();
//		reader.read();
		int i;
		while((i = reader.read())!=-1) {
			System.out.println((char)i);
		}
		
		reader.close();
		
	}

	public static void readUsingBuffered() throws IOException {
		String path = ".\\src\\javaFileHandling\\AutomationPractise.csv";
		FileReader reader = new FileReader(path);
		BufferedReader br = new BufferedReader(reader);
		
		String line1 = br.readLine();
		
		System.out.println(line1);
		
		String line;
		while((line = br.readLine())!=null) {
			System.out.println(line+ ", ");
			}
		reader.close();

	
		
	}
	
	public static void main(String[] args) throws IOException {
		//readFile();
		readUsingBuffered();
	
	}
}
