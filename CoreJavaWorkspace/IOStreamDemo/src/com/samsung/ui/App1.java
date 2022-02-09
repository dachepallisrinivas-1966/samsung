package com.samsung.ui;
import java.io.File;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter path and file name: ");
		String path = scanner.next();
		
		File file = new File(path);
		if (file.exists()) {
			if (file.isFile()) {
				System.out.println("This file is of " + file.length() + " bytes in size.");
			} else {
				System.out.println("The files present in this folder are ...");
				File[] files = file.listFiles();
				for(File currentFile : files) {
					System.out.println(
							currentFile.getName() + "\t" +
							(currentFile.isDirectory() ? "<DIR>" : "<FILE>") + "\t" + 
							(currentFile.length()) + " bytes" + "\t"
					);
				}
			}
		} else {
			System.out.println("File or path is not found");
		}
		
		scanner.close();
	}

}
