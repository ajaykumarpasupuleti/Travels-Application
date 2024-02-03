package com.flm.travels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LogoDisplay {
	private String filePath;

	public LogoDisplay(String filePath) {
		this.filePath = filePath;
	}
	
	public void logoDisplay() {
		try {
			File textFile = new File(filePath);
			FileReader textFileReader = new FileReader(textFile);
			int charAsciiValue = textFileReader.read();
			System.out.print("********** ");
			while (charAsciiValue != -1) {
				System.out.print((char) charAsciiValue);
				charAsciiValue = textFileReader.read();
			}
			System.out.println(" ************");
			textFileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Oh Oh!!!! We Couldn't Fetch The Logo (-_-)");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}