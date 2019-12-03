package pac1;

public class Invoker{
	
	static String  name;

	public static void main(String[] args)
	{
		
		System.out.println("starting");
		
		Logicblock obj= new Logicblock();	
	    obj.state="Remooodzuzaa";
	    
	   name= Logicblock.meth(obj.state);
	   System.out.println(name);
		

	}

}
