package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class operation {

	public static void main(String[] args) {
		int c = 1;
		int choice = welcome();
		Scanner sc = new Scanner(System.in);
		while (c >= 1) {

			switch (choice) {
			case 1:
				register();
				break;
			case 2:
				login();
				break;

			}
			System.out.println("Do You Want To Continue");
			c = sc.nextInt();
		}
	}

	public static void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UserId");
		String UserId = sc.next();

		System.out.println("Enter Password");
		String pwd = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		details d = new details(UserId, pwd, email);
		FileOutputStream file;
		try {
			FileOutputStream file1 = new FileOutputStream(UserId + ".txt");

			ObjectOutputStream out = new ObjectOutputStream(file1);
			out.writeObject(d);
			out.close();
			file1.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void login() {
		Scanner sc = new Scanner(System.in);
		FileInputStream file1;
		try {
			System.out.println("Enter your UserId");
			String UserId1 = sc.next();

			file1 = new FileInputStream(UserId1 + ".txt");
			ObjectInputStream out = new ObjectInputStream(file1);
			details e = (details) out.readObject();

			System.out.println("Enter Password");
			String pwd1 = sc.next();
			if (pwd1.equals(e.Password)) {

				userOperations.Operations(e.userId);
			} else {
				System.out.println("Wrong Password");
			}

		} catch (java.io.FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("Not  a Registered User ");
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int welcome() {
		String s = "***********************************Welcome to Lockme************************************";
		String d = "*********************************a digital lock for you*********************************";
		String a="******************************************************************************************";
		System.out.println(a);
		System.out.println(s);
		System.out.println(d);
		System.out.println(a);

		System.out.println("1.Registration\n2.Login");
		System.out.println("Enter your Choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;

	}

}
