package defultPackage;

public class InstanceVariable {
 
	public String myClassVar = "Static or class variable";

	
	public static void main(String[] args) {
		
		InstanceVariable obj = new InstanceVariable();
		InstanceVariable obj1 = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();

		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		
		obj2.myClassVar = "Changed text";
		
		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		
	}

}
