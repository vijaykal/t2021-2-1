import java.util.Scanner;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		 char operator;
		 Double number1,number2,result;
		 Scanner input=new Scanner(System.in);
		 operator=input.next().charAt(0);
		 System.out.println("enter  first number");
		 number1=input.nextDouble();
		 
		 System.out.println("enter second number");
		 number2=input.nextDouble();
		 
		 switch (operator) {
		 case '+':
			 result=number1+number2;
		  System.out.println(number1+" "+number2+"="+result);
		  break;
		  
		 case '-':
			 result=number1-number2;
		  System.out.println(number1+" "+number2+"="+result);
		  break; 
		  
		 case '*':
			 result=number1*number2;
		  System.out.println(number1+" "+number2+"="+result);
		  break;
		  
		 case '/':
			 result=number1/number2;
		  System.out.println(number1+" "+number2+"="+result);
		  break;
		  default:
			System.out.println("invalid operator");
		  break;
		 }
		 input.close();
		}
	

	}


