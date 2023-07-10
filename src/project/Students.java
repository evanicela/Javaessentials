package project;


public class Students {
	String name;
	char sex;
	int age;
	String course;
Students(String name, char sex, int age, String course){
	
	
	this.name =name;
	this.sex =sex;
	this.age =age;
	this.course =course;
}
void Networking() 
{
	System.out.println(name+" is taking a Networking engineering course");
}
void Cybersecurity() {
	
System.out.println(name+" is taking a Cybersecurity course");
	}
void Programming() 
{
	System.out.println(name+" is taking a Programming course");
}

}
