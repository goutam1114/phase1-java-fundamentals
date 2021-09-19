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
		while (c >= 1) {

			System.out.println("1.Registration\n2.Login");
			System.out.println("Enter your Choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			List<String> fileList = new LinkedList<String>();
			switch (choice) {
			case 1:
				System.out.println("Enter your UserId");
				String UserId = sc.next();
				int index = Collections.binarySearch(fileList, UserId);
				System.out.println(fileList);
				System.out.println(index);
				index=1;
				if (index == -1) {
					fileList.add(UserId);
					

					System.out.println("Enter Password");
					String pwd = sc.next();
					System.out.println("Enter email");
					String email = sc.next();
					details d = new details(UserId, pwd, email);
					FileOutputStream file;
					try {
						file = new FileOutputStream(UserId + ".txt");
						FileOutputStream file1 = new FileOutputStream(UserId + ".txt");

						ObjectOutputStream out = new ObjectOutputStream(file);
						out.writeObject(d);
						out.close();
						file.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.println("Username is already taken Please enter other username");
				}

				break;
			case 2:
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

						userOperations.Operations();
					} else {
						System.out.println("Wrong Password");
					}

				} catch (java.io.FileNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println("Not  a Registered User ");
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			}
			System.out.println("Do You Want To Continue");
			c = sc.nextInt();
		}
	}
}
