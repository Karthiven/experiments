package pac1;

public class Invoker{
	
	static String  name;

	public static void main(String[] args)
	{
		
		System.out.println("starting again for 3");
		System.out.println("starting again for final");
		System.out.println("last of nov");
		
		
		Logicblock obj= new Logicblock();	
	    obj.state="Remooodzuzaa";
	    
	   name= Logicblock.meth(obj.state);
	   System.out.println(name);
		
	   System.out.println("summing up");

	}

}
