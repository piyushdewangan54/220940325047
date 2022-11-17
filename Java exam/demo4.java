class GrandParent
{
	String grandFatherName;
	String grandMotherName;
	
	GrandParent(String grandFatherName, String grandMotherName)
	{
		this.grandFatherName = grandFatherName;
		this.grandMotherName = grandMotherName;
		
		System.out.println("Grand Father name is : "+grandFatherName);
		System.out.println("Grand Mother name is : "+grandMotherName);
	}
}
class Parent extends GrandParent
{
	String FatherName;
	String MotherName;
	
	Parent(String grandFatherName, String grandMotherName, String FatherName, String MotherName)
	{
		this(grandFatherName, grandMotherName);
		
		this.FatherName = FatherName;
		this.MotherName = MotherName;
		
		System.out.println("Father name is : "+this.FatherName);
		System.out.println("Mother name is : "+this.MotherName);
	}
	Parent(String grandFatherName, String grandMotherName)
	{
		super(grandFatherName, grandMotherName);
	}
}
class child extends Parent
{
	child(String grandFatherName, String grandMotherName, String FatherName, String MotherName)
	{
		super(grandFatherName,grandMotherName,FatherName,MotherName);
	}
	public static void main(String args[])
	{
		child c = new child("Ramesh","Swati","Raj Kumar","Roop mati");
	}
}