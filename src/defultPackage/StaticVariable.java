package defultPackage;

public class StaticVariable {

	/* without satic or with static */
	public static String myClassVar = "Static or class variable";
	
	public static void main(String[] args) {

		StaticVariable obj = new StaticVariable();
		StaticVariable obj1 = new StaticVariable();
		StaticVariable obj2 = new StaticVariable();

		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		
		obj2.myClassVar = "Changed text";
		
		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		
	}

}
