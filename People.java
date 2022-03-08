import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class People {
	private File file;
	
	//  Instantiating an arrayList with filters to be referenced when filter methods are called
    ArrayList<String> filter = new ArrayList<String>(
      List.of(
    		  "teacher",
               "student",
               "male",
               "female"
              )
    	);
	
	//	Constructor that accepts file as parameter and saves file data
	public People(File file) {
		setFile(file);
	}
	    
    //  getter for file
	public File getFile() {
		return file;
	}

	//  setter for file
	public void setFile(File newFile) {
		file = newFile;
	}

	//  return based on students OR teachers filter
	public void list(String role) throws FileNotFoundException {
		System.out.printf("\n1: List of people: \ntype: %s\n", role);
		Scanner s = new Scanner(file);
		
//		if role is equal to "teacher" in filter arrList
		if(role.equals(filter.get(0))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				String newAge = s.next();
				
//				if role is equal to "teacher" in filter arrList
				if (newRole.equals(filter.get(0))) { 
					System.out.printf("%s \n", newName);
				}
			}
		} 
		else if(role.equals(filter.get(1))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				String newAge = s.next();

				if (newRole.equals("student")) { 
					System.out.printf("%s \n", newName);
				}
			}
		}
	}
	
	//	return based on m/f filter AND students/teachers filter (Overloading method)
	public void list(String role, String sex) throws FileNotFoundException {
		System.out.printf("\n2: List of people: \ntype: %s, gender: %s\n", role, sex);

		Scanner s = new Scanner(file);

		if(role.equals(filter.get(0))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				String newAge = s.next();
				
//						print for male teachers
				if (newRole.equals(filter.get(0)) && sex.equals(filter.get(2)) && newSex.equals(filter.get(2))) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female teachers
				else if (newRole.equals(filter.get(0)) && sex.equals(filter.get(3)) && newSex.equals(filter.get(3))) { 
					System.out.printf("%s \n", newName);
				}
			}
		} 
		else if(role.equals(filter.get(1))) {
//					System.out.println("student");
			while(s.hasNext()) {
//						System.out.println(file.next());
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				String newAge = s.next();

//						print for male students
				if (newRole.equals(filter.get(1)) && sex.equals(filter.get(2)) && newSex.equals(filter.get(2))) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female students
				else if (newRole.equals(filter.get(1)) && sex.equals(filter.get(3)) && newSex.equals(filter.get(3))) { 
					System.out.printf("%s \n", newName);
				}
			}
		}
	}
	
	//	return based on m/f filter AND students/teachers filter AND greater than age (Overloading method)
	public void list(String role, String sex, int age) throws FileNotFoundException {
		System.out.printf("\n3: List of people: \ntype: %s, gender: %s, age: >= %s\n", role, sex, age);

		Scanner s = new Scanner(file);

		if(role.equals(filter.get(0))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				int newAge = Integer.parseInt(s.next());
				
//						print for male teachers
				if (newRole.equals(filter.get(0)) && sex.equals(filter.get(2)) && newSex.equals(filter.get(2)) && (newAge >= age)) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female teachers
				else if (newRole.equals(filter.get(0)) && sex.equals(filter.get(3)) && newSex.equals(filter.get(3))  && (newAge >= age)) { 
					System.out.printf("%s \n", newName);
				}
			}
		} 
		else if(role.equals(filter.get(1))) {
			while(s.hasNext()) {
//						System.out.println(file.next());
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				int newAge = Integer.parseInt(s.next());

//						print for male teachers
				if (newRole.equals(filter.get(1)) && sex.equals(filter.get(2)) && newSex.equals(filter.get(2))  && (newAge >= age)) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female teachers
				else if (newRole.equals(filter.get(1)) && sex.equals(filter.get(3)) && newSex.equals(filter.get(3))  && (newAge >= age)) { 
					System.out.printf("%s \n", newName);
				}
			}
		}
	}
	
	//	return based on greater than age filter AND students/teachers filter (Overloading method)
	public void list(String role, int age) throws FileNotFoundException {
		System.out.printf("\n5: List of people: \ntype: %s, age: >= %s\n", role, age);

		Scanner s = new Scanner(file);

		if(role.equals(filter.get(0))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				int newAge = Integer.parseInt(s.next());
				
//						print for male teachers
				if (newRole.equals(filter.get(0)) && (newAge >= age)) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female teachers
				else if (newRole.equals(filter.get(0)) && (newAge >= age)) { 
					System.out.printf("%s \n", newName);
				}
			}
		} 
		else if(role.equals(filter.get(1))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				int newAge = Integer.parseInt(s.next());

//						print for male students
				if (newRole.equals(filter.get(1)) && (newAge >= age)) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female students
				else if (newRole.equals(filter.get(1)) && (newAge >= age)) { 
					System.out.printf("%s \n", newName);
				}
			}
		}
	}
	
	//	return based on m/f filter AND students/teachers filter, AND greater + less than age filter (Overloading method)
	public void list(String role, String sex, int greater, int less) throws FileNotFoundException {
		System.out.printf("\n4: List of people: \ntype: %s, gender: %s, age: >= %s AND <= %s\n", role, sex, greater, less);

		Scanner s = new Scanner(file);

		if(role.equals(filter.get(0))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				int newAge = Integer.parseInt(s.next());
				
//						print for male teachers
				if (newRole.equals(filter.get(0)) && sex.equals(filter.get(2)) && newSex.equals(filter.get(2)) && (newAge >= greater) && (newAge <= less)) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female teachers
				else if (newRole.equals(filter.get(0)) && sex.equals(filter.get(3)) && newSex.equals(filter.get(3))  && (newAge >= greater) && (newAge <= less)) { 
					System.out.printf("%s \n", newName);
				}
			}
		} 
		else if(role.equals(filter.get(1))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				int newAge = Integer.parseInt(s.next());

//						print for male students
				if (newRole.equals(filter.get(1)) && sex.equals(filter.get(2)) && newSex.equals(filter.get(2))  && (newAge >= greater) && (newAge <= less)) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female students
				else if (newRole.equals(filter.get(1)) && sex.equals(filter.get(3)) && newSex.equals(filter.get(3))  && (newAge >= greater) && (newAge <= less)) { 
					System.out.printf("%s \n", newName);
				}
			}
		}
	}
	
	//  return based on role, and age conditional
	public void list(String role, int greater, int less) throws FileNotFoundException {
		System.out.printf("\n6: List of people: \ntype: %s, age: >= %s AND <= %s\n", role, greater, less);

		Scanner s = new Scanner(file);

		if(role.equals(filter.get(0))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				int newAge = Integer.parseInt(s.next());
				
//						print for male teachers
				if (newRole.equals(filter.get(0)) && (newAge >= greater) && (newAge <= less)) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female teachers
				else if (newRole.equals(filter.get(0)) && (newAge >= greater) && (newAge <= less)) { 
					System.out.printf("%s \n", newName);
				}
			}
		} 
		else if(role.equals(filter.get(1))) {
			while(s.hasNext()) {
				String newRole = s.next();
				String newName = s.next();
				String newSex = s.next();
				int newAge = Integer.parseInt(s.next());

//						print for male students
				if (newRole.equals(filter.get(1)) && (newAge >= greater) && (newAge <= less)) { 
					System.out.printf("%s \n", newName);
				} 
//						print for female students
				else if (newRole.equals(filter.get(1)) && (newAge >= greater) && (newAge <= less)) { 
					System.out.printf("%s \n", newName);
				}
			}
		}
	}

}
