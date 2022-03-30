package Pkg7;

public class Immutable 
{
	
		public static void main(String[] args) 
		{

		System.out.println("Before change");

		Address ad = new Address(1234, "Mumbai");
		Student s1=new Student(10, "Sanjivani", ad);
		System.out.println(s1);
		System.out.println(ad);

		System.out.println("After change");
		s1.getAd().setCity("Kolhapur");
		s1.getAd().setPin(3456);

		System.out.println(s1);
		}
		}

