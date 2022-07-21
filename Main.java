package odev2;

public class Main {

	public static void main(String[] args) {
		Category category=new Category("Proglamlama",1);
		
		
		Category category2=new Category("It",2);
		
		Instructor instructor1=new Instructor("Engin", "Demirog");
		
		Instructor instructor2=new Instructor("Alperen", "Öztürk");
		
		
		Course course1 =new Course("Java",category,instructor1);
		
		
		Course course2 =new Course("C#",category,instructor2);
		
		
		
		
          System.out.println("**************************");
          System.out.println("Kurslar");
          System.out.println(instructor1.getFirstName() +" "+instructor1.getLastName());
         
          System.out.println(course1.getName() +"\n"+ course1.getCategory().getName());
       
          
	}
	

}
