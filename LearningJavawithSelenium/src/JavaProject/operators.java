package operatorsinJava;

public class operators {

	public static void main(String[] args) {
	//operators 
		//	1) Arithmetic Operators +,-,/,*

		int a=20, b=10;
		System.out.println("The sum of a+b is:"+(a+b));
		System.out.println("The sum of a-b is:"+(a-b));
		System.out.println("The sum of a*b is:"+(a*b));
		System.out.println("The sum of a+b is:"+(a/b));
		
	//Relational Operators < > !> <=,>=, ==	
		// return boolean value True or False 
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	b=20;
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	
	boolean res=a>b;
	System.out.println(res);
	
	// 3) logical operator &&-and,||- OR, ! not equal
	//returns boolean value
	//works between  2 boolean values
	boolean x=true;
	boolean y=false;
	System.out.println(x&&y);
	System.out.println(x||y);
	System.out.println(!x);
	System.out.println(!y);
	
	
	// 4) increment Operator
	a = 10;
	System.out.println(a);
	
	a = a+1;
	System.out.println(a);
	
	// 5)Assignment Operator = ,+=,-=, *= /= %=
	 int d=10;
	 d=d+5;
	 System.out.println(d);
	
	
	
			
	}

}
