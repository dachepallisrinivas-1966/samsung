package com.samsung.ui;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter file name : ");
		String fileName = scanner.nextLine();
	
		try (FileReader fr = new FileReader(fileName)){
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch(FileNotFoundException excep) {
			System.out.println("no such file available");
		} catch(IOException excep) {
			System.out.println("cannot read file");
		} finally {
			scanner.close();
		}
	}

}