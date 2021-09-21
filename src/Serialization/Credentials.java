package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Credentials implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  String Domain;
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
		
		ArrayList<File> l = new ArrayList<File>();
		l.add(new File(domainName));
		
		try {
			
			
			FileOutputStream file = new FileOutputStream(UserId+"creds.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			

			out.writeObject(l);
			out.close();
			file.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void fetchcred(String UserId) {
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO DIGITAL LOCKER 	 *");
		System.out.println("*   YOUR CREDS ARE 	 *");
		System.out.println("*					*");
		System.out.println("==========================================");
		
	
		try {
			FileInputStream file=new  FileInputStream(UserId+"creds.txt");
			ObjectInputStream out=new ObjectInputStream(file);
			 ArrayList e = (ArrayList) out.readObject();
				out.close();
				file.close();

			
			
			Collections.sort(e);
			//System.out.println("Select Domain to get Credentals");

			//for (int i = 0; i < e.size(); i++) {
			//int c = i + 1;
			//System.out.println(c + "." + e.get(i));
	//	}
			creds( UserId);

		} catch (FileNotFoundException e) {
			System.out.println("No data is available");

		} catch (IOException e1) {

			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	public static void creds( String UserId) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Domain Name");
		String domainName=sc.next();

		try {
			FileInputStream file = new FileInputStream(UserId + "." + domainName + ".txt");
			ObjectInputStream out = new ObjectInputStream(file);
			Credentials c = (Credentials) out.readObject();
			System.out.println("Domain Name Is :"+c.Domain);
     		System.out.println("User Name Of "+c.Domain+" Is: "+c.UserName);
     		System.out.println("Password of  "+c.Domain+" Is: "+c.Password);

		


			

		} catch (FileNotFoundException e) {
			System.out.println("No data available");
		} catch (IOException e) {
			System.out.println("No data available");
		} catch (ClassNotFoundException e) {
			System.out.println("No data available");
			e.printStackTrace();
		}

	}
	public static void deleteCreds(String UserId) {
		
			System.out.println("Enter the domain you want to delete");
			Scanner sc=new Scanner(System.in);
			String Domain=sc.next();
			File f=new File(UserId + "." + Domain + ".txt");
			boolean x=f.delete();
			if(x) {
				System.out.println("deleted "+Domain);
			}
			
			

		

		
	}

}
