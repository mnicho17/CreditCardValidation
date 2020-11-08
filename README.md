Module 6: Decision Structures
Assignment 6: Credit Card Validation
Problem Description:
Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with:

4 for Visa cards
5 for Master cards
37 for American Express cards
6 for Discover cards
IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine if a card number is entered correctly or if a credit card is scanned correctly by a scanner. Almost all credit card numbers are generated following this validity check, commonly known as the Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626):

Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
2 * 2 = 4
2 * 2 = 4
4 * 2 = 8
1 * 2 = 2
6 * 2 = 12 (1 + 2 = 3)
5 * 2 = 10 (1 + 0 = 1)
8 * 2 = 16 (1 + 6 = 7)
4 * 2 = 8

Now add all single-digit numbers from Step 1.
4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37

Add all digits in the odd places from right to left in the card number.
6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38

Sum the results from Step 2 and Step 3.
37 + 38 = 75

If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.
Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid. Here are the three functions that you are required to write:

A method AnaRL() which has a String parameter x which is the credit card number read and returns an int and is implemented as follows:
public static int AnaRL(String x){}
Use a for loop to add the values of the odd numbers of the String x.
In the case of 4388576018402626, the value returned is 38. (30 points)
A method AnaLR() which has a String parameter x which is the credit card number read and returns an int and is implemented as follows:
public static int AnaLR(String x){}
Use a for loop to add the values of the even numbers of the String x.
Make sure every number that is read is doubled.
If a number after is doubled is >=10, make sure you add its digits only.
In the case of 4388576018402626, the value returned is 37. (30 points)
A method Div10 which has an int sum which is the sum of both int returned from 1. and 2. and returns a boolean:
public static boolean Div10(){int sum}
If the remainder of sum divided by 10 is 0, then return true.
else return false.(30 points)
Your class Val looks like (10 points):

import java.util.Scanner;
public class Val {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
String x= sc.next();
int res1=AnaLR(x);
int res2=AnaRL(x);
int sum=res1+res2;
System.out.println(sum);
boolean bool=Div10(sum);
if(bool)
System.out.println("Credit Card  " + x + "  " + " is valid ");
else
System.out.println("Credit Card  " + x + "  " + " is  not valid ");

}

HINT: code for AnaRL():

public static int AnaRL(String num){
int total = 0;
for(int i = num.length() - 1; i >= 0; i -= 2){
total += Integer.parseInt(num.charAt(i) +"");}
return total;
}

Here are sample runs of the program:

Sample 1:
Enter a credit card number as a long integer: 4246345689049834

4246345689049834 is invalid

Sample 2:
Enter a credit card number as a long integer: 4388576018410707

4388576018410707 is valid
