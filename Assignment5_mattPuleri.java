import java.io.*;

/*
Matthew Puleri - mattew.puleri@bellevuecollege.edu
Student ID: 950724778
03.07.2022

This program reads from a people.txt file (located in this same directory)
Through the main function a new People instance is created from the People class.
Then the overloaded "list" methods are called with arguments used by the method
to filter through the people.txt file. The class file references an arrayList of filters
such as male/female to print the relevant information. 

*/

public class Assignment5_mattPuleri {

	public static void main(String[] args) throws FileNotFoundException {

	    File file = new File("/Users/MattPuleri/Desktop/School/Bellevue College/CS210/Tests/Assignment5/people.txt");
	    People data = new People(file);
	    
	    data.list("student"); 
	    data.list("student", "female");   
	    data.list("student","female", 10);  
	    data.list("student","male", 25, 30); 
	    data.list("teacher", 20); 
	    data.list("student", 10, 15);
	}

}
