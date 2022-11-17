import java.util.*;

class demo1{
	public static void main(String args[])
	{
		List<String> str = new ArrayList<String>();
		str.add("Mango");
		str.add("Banana");
		str.add("orange");
		str.add("chiku");
		str.add("apple");
		str.add("Pineapple");
		
		for(String s: str)
		{
			System.out.println(s);
		}
	}
}