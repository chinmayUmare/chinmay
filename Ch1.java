
//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//Expected Output :
//Hello
//Alexandra Abramov


// class Ch1
// {
	// public static void main(String [] args)
	// {
		// System.out.println("hello");
		// System.out.println("Chinmay Umare");
	// }
// }



// 2. Write a Java program to print the sum of two numbers.
// Test Data: 74 + 36


// class Ch1
// {
	// public static void main(String [] args)
	// {
		// int i=74;
		// int j=36;
		
		// int sum=i+j;
		// System.out.println(sum);
	// }
// }

// class Ch1
// {
	// public static void main(String [] args) 
	
	// {
		// String s1=args[0];
		// String s2=args[1];
		
		// int i=Integer.parseInt(args[0]);
		// int j=Integer.parseInt(args[1]);
		
		// System.out.println("arguments ="+args[0]);
		// System.out.println("arguments ="+args[1]);
		// System.out.println("sum ="+(i+j));
	// }
		
// }
 
 
 // 3. Write a Java program to divide two numbers and print on the screen.
// Test Data : 50/3
// Expected Output : 16



// class Ch1
// {
	// public static void main (String [] args)
	// {
		// int i=100;
		// int j=10;
		// int divide= i/j;
		// System.out.println(divide);
	// }
// }


 // class Ch1
 // {
	 // public static void main (String [] args)
	 // {
		 // String s1= args[0];
		 // String s2= args[1];
		 
		 // int i=Integer.parseInt(args[0]);
		 // int j=Integer.parseInt(args[1]);
		 
		 // System.out.println(args[0]);
		 // System.out.println(args[1]);
		 // System.out.println("divide ="+(i/j));
	 // }
 // }
 
 
 
 
 // 4. Write a Java program to print the result of the following operations.
// Test Data:
// a. -5 + 8 * 6
// b. (55+9) % 9
// c. 20 + -3*5 / 8
// d. 5 + 15 / 3 * 2 - 8 % 3
// Expected Output :
// 43
// 1
// 19
// 13




// class Ch1
// {
   // public static void main (String [] args)
   // {
	   // System.out.println("expression1 ="+(-5+8*6));
	   // System.out.println("expression 2 ="+(64%9));
	   // System.out.println("expression 3 ="+(20 + (-3)*5/8));
	   // System.out.println("expression 4 ="+(5+15/3*2-8%3));
   // }
// }




// 5. Write a Java program that takes two numbers as input and display the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125



// class Ch1
// {
	// public static void main(String[] args)
	// {
		// int i=25;
		// int j=5;
		// int m=i*j;
		
		// System.out.println("multiply ="+m);
	// }
// }




// 

// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000





// class Ch1
// {
	// public static void main(String[]args)
	// {
		// int i=125;
		// int j=24;
		
		// int m=i*j;
		// int a=i+j;
		// int s=i-j;
		// int d=i/j;
		// int rem=i%j;
		// System.out.println("mul="+m+ "add ="+a+ "sub ="+s+ "div ="+d+ "rem ="+rem);
	// }
	
// }





// 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80






// class Ch1
// {
	// public static void main(String[]args)
	// {
		// int j=8;
		// int i;
		// for(i=0; i<=10; ++i)
			// System.out.println("table of 8 ="+(j*i));
	// }
// }






//8. Write a Java program to display the following pattern.




// 9. Write a Java program to compute the specified expressions and print the output.
// Test Data:
// ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
// Expected Output
// 2.138888888888889

     


// class Ch1
// {
	// public static void main(String []args)
	// {
		// float i=25.5F;
		// float j=3.5F;
		// float k=40.5F;
		// float l=4.5F;
		// double output=(i*j-j*j )/(k-l);
		// System.out.println(output);
	// }
// }




// 10. Write a Java program to compute a specified formula.
// Specified Formula :
// 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
// Expected Output
// 2.9760461760461765






// class Ch1
// {
	// public static void main(String []args)
	// {
		// double i=4.0;
		// double j=1.0;
		// int k=3;
		// int l=5;
		// int m=7;
		// int n=9;
		// int o=11;
		// double output=i*(1-(j/k)+(j/l)-(j/m)+(j/n)-(j/o));
		// System.out.println(output);
	// }
// }


// import java.util.Scanner;
// class Ch1
// {
	// public static void main(String args [])
	// {	
				// int n1=3;
				// int n2=2;
				
				// int max = (n1 < n2) ? n1 : n2;
				// System.out.println("Maximum= "+max);
				
				// int r=(n1>n2) ? (n1+n2):(n1-n2);
				// System.out.println("Result= "+r);
				
				// String s=(n1%2==0) ? "Even":"Odd";
				// System.out.println("Result= "+s);
				
				// boolean b=(n1%2==0) ? true : false;
				// System.out.println("Result= "+b);
				
				// String c=(n1%2==0) ? "true" : "false";
				// System.out.println("Result= "+c);
				
				 // char f=(n1%2==0) ? 'c' : 'r';
				 // System.out.println("Result= "+f);
				
	// }
// }





// 11. Write a Java program to print the area and perimeter of a circle.
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586






// class Ch1
// {
	// public static void main(String[]args)
	// {
		// double r=7.5;
		// double pi=3.1415;
		// double area=pi*r*r;
		// double perimeter=2*pi*r;
		
		// System.out.println(area);
		// System.out.println(perimeter);
	// }
// }



// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.



// class Ch1
// {
	// public static void main(String[]args)
	// {
		// int i=10;
		// int j=20;
		// int k=30;
		// int avg=(i+j+k)/3;
		// System.out.println(avg);
	// }
// }




