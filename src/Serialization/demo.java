package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo {

	public static void main(String[] args) throws FileNotFoundException {
		employee e=new employee(4,"goutam",45444.45, "Sonu@114");
		//to convert object into byte
		//create a file
		//System.out.println(e.password);
		String S="file-db";
		try {
			FileOutputStream file=new FileOutputStream(S+".txt");
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(e);
			out.close();
			file.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
