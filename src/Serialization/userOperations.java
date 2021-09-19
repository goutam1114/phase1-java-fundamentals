package Serialization;

import java.util.Scanner;

public class userOperations {
	public static void Operations() {
		System.out.println("Please Select Operation You Want to Perform");
		System.out.println("1.Store credentilas\n2.Retrieve Credentilas\n3.Delete Credenilas");
	     Scanner S=new Scanner(System.in);
	     int ch=S.nextInt();

		switch (ch) {
		case 1:System.out.println("Store credentilas");
		break;
		case 2:System.out.println("Retrieve credentilas");
		break;
		case 3:System.out.println("Delete credentilas");
		break;
		}
	}
	

}
