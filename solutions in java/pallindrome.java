// Java program to check whether a number
// is Palindrome or not.
import java.lang.*;
import java.util.*;//for scanner->used to take input from the keyboard
class pallindromecheker
{ 
  //a function to reverse the number
	static int reverseDigits(int num)
	{
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}
  //to cjeck whether the given number is a pallindrome or not
	static int isPalindrome(int n)
	{
		int rev_n = reverseDigits(n);
		if (rev_n == n)
			return 1;
		else
			return 0;
	}

	public static void main(String []args)
	{
	   scanner s=new scanner(system.in);
     int num;
     num=s.nextInt();//.nextInt() is a method in the class scaaaner which  takes   integer values from the keyboard
     if(isPalindrome(num))
     {
       System.out.println("The number is a pallindrome");
     }
     else
       System.out.println("The number is not a pallindrome");

	}

}
