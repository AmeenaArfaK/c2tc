package tns.day3;

class Person
{
	String name;
	String city;
	void getData()
	{
		name="arfa";
		city="bangalore";
	}
	void accept(String nm,String ct)
	{
		name=nm;
		city=ct;
	}
	void show()
	{
		System.out.println("person details are : Name - "+name+" City - "+city+"");
	}
}
public class PersonDemo {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.getData();
		p1.show();
		
		Person p2=new Person();
		p2.accept("parth", "mumbai");
		p2.show();

	}

}
