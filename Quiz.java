package test;
import java.util.Scanner;
class B{
	static void Mycalc(){
	showMenu();
	Scanner sc =new Scanner(System.in);
	int num,a,b;
	num=sc.nextInt();
	
	a= getFirstNumber();
	b= getSecondNumber();
	switch(num){
	case 1: addNumbers(a,b);
	break;
	case 2: subNumbers(a,b);
	break;
	case 3: multNumbers(a,b);
	break;
	case 4 : divNumbers(a,b);
	}
	
	}

static void showMenu(){
	System.out.println("Add-----------1");
	System.out.println("Sub-----------2");
	System.out.println("Mul-----------3");
	System.out.println("Div-----------4");
}
static void getNumber(){
	
	getFirstNumber();
	getSecondNumber();
}
static int getFirstNumber(){
	int a;
	Scanner sc =new Scanner(System.in);
	System.out.println("number1:");
	a=sc.nextInt();
	return a;
}
static int getSecondNumber(){
	int b;
	Scanner sc =new Scanner(System.in);
	System.out.println("number:");
	b=sc.nextInt();
	return b;
}
static void addNumbers(int a, int b){
	int result=0;
	result = a+b;
	System.out.println(a+" + "+b+" = "+result);
	
}
static void subNumbers(int a, int b){
	int result=0;
	result = a-b;
	System.out.println(a+" - "+b+" = "+result);
}
static void multNumbers(int a, int b){
	int result=0;
	result = a*b;
	System.out.println(a+" * "+b+" = "+result);
}
static void divNumbers(double a, double b){
	double result=0;
	result = a/b;
	System.out.println(a+" / "+b+" = "+result);
}

}
public class Quiz{
	public static void main(String args[]){
		B b=new B();
		b.Mycalc();
	}
}

