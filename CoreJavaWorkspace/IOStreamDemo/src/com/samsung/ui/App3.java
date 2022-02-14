package com.samsung.ui;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter file name : ");
		String fileName = scanner.nextLine();
		
		try (FileReader fr = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(fr);){

			String line = null;
			while(true) {
				line = br.readLine();
				if (line == null)			// EOF
					break;
				System.out.println(line);
			}
			
		} catch (FileNotFoundException excep) {
			System.out.println("No such file present.");
		} catch(IOException excep) {
			System.out.println("Could not read file.");
		} finally {
			scanner.close();
		}

	}

}