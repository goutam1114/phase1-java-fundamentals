package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo {

	public static void main(String[] args) throws FileNotFoundException {
		employee e=new employee(4,"goutam",45444.45, "ho");
		//to convert object into byte
		//create a file
		try {
			FileOutputStream file=new FileOutputStream("file-db.txt");
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
