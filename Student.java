package Pkg7;

public final class Student 
{
	
private final int  rollNo;
private final String name;
private final Address ad;


public Student(int rollNo, String name, Address ad) 
{
	super();
	this.rollNo = rollNo;
	this.name = name;
	
	Address clonead =new Address();
	clonead.setCity(ad.getCity());
	clonead.setPin(ad.getPin());
	
	this.ad= clonead;	
}


public int getRollNo() 
{
	return rollNo;
}

public String getName() 
{
	return name;
}

public Address getAd() 
{
	Address clonedad= new Address();
	clonedad.setCity(ad.getCity());
	clonedad.setPin(ad.getPin());
	return clonedad;
}
@Override
public String toString() 
{
	return "Student [rollNo=" + rollNo + ", name=" + name + ", ad=" + ad + "]";
}


}