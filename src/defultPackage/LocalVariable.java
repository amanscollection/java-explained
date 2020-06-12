package defultPackage;

public class LocalVariable {

	//instance variable
	public String myVar = "Instance Variable";
	
	public void myMethod(){
		
		String myVar = "local variable";
		System.out.println(myVar);
	}
	
	public static void  main(String args[]){
		LocalVariable obj = new LocalVariable();
		
		System.out.println("Calling Method");
		
		//local variable
		obj.myMethod();
		
		//Instance Variable
		System.out.println(obj.myVar);
	}
			
}
