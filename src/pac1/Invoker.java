package pac1;

public class Invoker{
	
	static String  name;

	public static void main(String[] args)
	{
		
		
		
		Logicblock obj= new Logicblock();	
	    obj.state="Remo";
	    
	   name= Logicblock.meth(obj.state);
	   System.out.println(name);
		

	}

}
