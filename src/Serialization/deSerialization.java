package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class deSerialization {

	public static void main(String[] args) throws FileNotFoundException {
	  try {
		FileInputStream file=new  FileInputStream("file-db.txt");
		ObjectInputStream out=new ObjectInputStream(file);
		employee e = (employee) out.readObject();
		//System.out.println("id "+e.id);
		//System.out.println("name "+e.name);
		//System.out.println("salary "+e.salary);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your UserId");
		String userId=s.next();
		
		//System.out.println(userId);
		if(userId.equals(e.name))
		{
			System.out.println("enter password");
			String pwd=s.next();		
			if(pwd.equals(e.password))
			{
				System.out.println("Welcome");
				
			}
			else {
				System.out.println("Sorry Wrong Password");
			}
			
			
		}
		else {
			System.out.println("Incorrect UserId");
		}
		
		
		
		
	} catch (IOException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
