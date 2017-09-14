package com.imooc;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileManager a = new FileManager("d:\\Exec\\a.txt", new char[]{'\n'});
		FileManager b = new FileManager("d:\\Exec\\b.txt", new char[]{'\n'});
		
		FileWriter c = new FileWriter("d:\\Exec\\c.txt");
		
		String aWord = null;
		String bWord = null;
		
		while ((aWord = a.nextWord()) != null) {
			c.write(aWord + "\n");
			if((bWord = b.nextWord()) != null){
				c.write(bWord + "\n");
			}
		}
		while((bWord = b.nextWord()) != null){
			c.write(bWord + "\n");
		}
		
		c.close();
	}
}


