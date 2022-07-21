package odev2;

public class Course {
 private String name;
 private Category category;
 private Instructor instructer;

public Course(String name, Category category, Instructor instructer) {

	this.name = name;
	this.category = category;
	this.instructer = instructer;
}
public String getName() {
	return name="Java";
}
public void setName(String name) {
	this.name = name;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Instructor getInstructer() {
	return instructer;
}
public void setInstructer(Instructor instructer) {
	this.instructer = instructer;
}
 
}
