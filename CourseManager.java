package odev2;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
   List<Course> courses;
   
   public CourseManager() {
	   courses=new ArrayList<>();
   }
    public void add(Course course) {   
    	courses.add(course);
   }
  
    public List<Course> getAll() {
		return courses;
	}
}
