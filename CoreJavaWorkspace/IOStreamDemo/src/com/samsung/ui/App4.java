package com.samsung.ui;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter file name : ");
		String fileName = scanner.nextLine();
		try(FileReader fr = new FileReader(fileName);
			FileWriter fw = new FileWriter("d:\\names-new.txt");) {
			int ch;
			while ( (ch = fr.read()) != -1 ) {
				fw.write(ch);
			}
			System.out.println("file copied successfully.");
		} catch(FileNotFoundException excep) {
			System.out.println("no such file present");
		} catch(IOException excep) {
			System.out.println("file cannot be read");
		}

	}

}