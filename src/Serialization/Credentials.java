package Serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Credentials implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String Domain;
	public String UserName;
	public String Password;

	public Credentials(String domain, String userName, String password) {
		super();
		Domain = domain;
		UserName = userName;
		Password = password;
	}

	@Override
	public String toString() {
		return "Credenials [Domain=" + Domain + ", UserName=" + UserName + ", Password=" + Password + "]";
	}

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Credentials() {
		super();
	}

	static List<Credentials> CredenialsList = new LinkedList<Credentials>();

	public static void getcred(String UserId) {
		System.out.println("Enter Domain Name");
		Scanner s = new Scanner(System.in);
		String domainName = s.next();
		System.out.println("Enter UserName of the " + domainName);
		String UserName = s.next();
		System.out.println("Enter Password of the " + domainName);
		String password = s.next();
		Credentials c = new Credentials(domainName, UserName, password);

		try {
			FileOutputStream file = new FileOutputStream(UserId + "." + domainName + ".txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(c);
			out.close();
			file.close();
		

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> allFiles = new ArrayList<String>();
		allFiles.add(domainName);
		allFiles.add(UserId);
		FileOutputStream file1;
		try {
			file1 = new FileOutputStream( UserName+"credList.txt");
			ObjectOutputStream out1 = new ObjectOutputStream(file1);
			out1.writeObject(allFiles);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

	}
	

}
