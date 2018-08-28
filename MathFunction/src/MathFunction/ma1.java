package MathFunction;
import java.util.Scanner;
public class ma1 {
//declarations
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Math2 Maths = new Math2();
double answer = 0;
double inputA, inputB;
char operator;
boolean done = false;
//getting input
while (done == false) {
System.out.println("Please enter your First Number Operator Secound Number:\n ");
inputA = input.nextDouble();
operator = input.next().charAt(0);
inputB = input.nextDouble();
//identifying operation to be performed
switch (operator) {
case '+': answer = Maths.add(inputA, inputB);
break;
case '-': answer = Maths.subtract(inputA, inputB);
break;
case '*': answer = Maths.multiply(inputA, inputB);
break;
case '/': answer = Maths.divide(inputA, inputB);
break;
case '^': answer = Maths.power(inputA, inputB);
break; }
//Printing answer
System.out.println(answer); }
input.close();
}
}
