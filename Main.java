package odev2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Category category=new Category("Proglamlama",1);
		
		
		Category category2=new Category("It",2);
		
		Instructor instructor1=new Instructor("Engin", "Demirog");
		
		Instructor instructor2=new Instructor("Alperen", "Öztürk");
		
		
		Course course1 =new Course("Java",category,instructor1);
		
		
		Course course2 =new Course("C#",category,instructor2);
		
		 CourseManager courseManger=new CourseManager();
		 courseManger.add(course2);
		 courseManger.add(course1);
		
		 List<Course> courses=courseManger.getAll();
		 
		 for(Course course:courses) {
			 System.out.println(course1.getName() + " " + course1.getCategory().getName() + " " + course1.getInstructer().getFirstName() + " " +course1.getInstructer().getLastName());
		 }
		 
        
         
       
       
          
	}
	

}
