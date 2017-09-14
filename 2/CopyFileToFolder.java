package com.imooc.algorithm02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class CopyFileToFolder {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file1 = new File("d:\\java");
		File file2 = new File("d:\\jad");
		
		String[] strArr = file1.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		
		for(String str : strArr){
			BufferedReader br = new BufferedReader(new FileReader(new File(file1,str)));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file2, str.replace(".java", ".jad"))));
			
			String line = null;
			
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			br.close();
			bw.close();
		}
	}

}
