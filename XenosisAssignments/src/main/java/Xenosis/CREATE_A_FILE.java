package Xenosis;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CREATE_A_FILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*
		 File myFile=new File("simpleFile.txt");
		
		   try {
			    myFile.createNewFile();
		   }catch(IOException e) {
			    System.out.println("unable to create the file");
			    e.printStackTrace();
		   }
		   System.out.println("successfully");
		  
		try {
			 FileWriter file=new FileWriter("simpleFile.txt");
			 file.write("Pawan Raikwar");
			 file.close();
	     }catch(IOException e) {
	    	  e.printStackTrace();
	     }
		   */
		
		File file=new File("simpleFile.txt");
		
		 try {
			  Scanner sc=new Scanner(System.in);
			  
			  while(sc.hasNextLine()) {
				   String line=sc.nextLine();
				   System.out.println(line);
			  }
			  sc.close();
		 }
		 catch(Exception  e) {
			  e.printStackTrace();
		 }
	}

}
