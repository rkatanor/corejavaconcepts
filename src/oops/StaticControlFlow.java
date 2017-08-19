package oops;

/**
 * 
 * @author rkatanor
 *static members of a java program execution flow
 *1. identification of static members and if its a variable JVM will assign default values at the time of identification
 *2. execution of static members variable assignments and static blocks
 *3.execution of main method
 */
public class StaticControlFlow {
static int i=10;   //default value is zero
static{
	 				m();
	               System.out.println("first static block");
}
public static void m(){
	System.out.println(j);
	System.out.println("this is a static method");
}
static{
	System.out.println("second static block");
}
public static void main(String[] args) {
	System.out.println(j);
	System.out.println("main method");
}
static int j=20;
}
