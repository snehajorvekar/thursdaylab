package basicprogram;
import java.util.Scanner;
public class FindFirstAndLastNumber {
public static void main(String []Args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int num=sc.nextInt();
System.out.println("Given number is:"+ num);
int firstDigit=0;
int lastDigit=0;
lastDigit=num%10;
System.out.println("Last digit is:"+lastDigit);
while(num!=0)
{
	firstDigit=num%10;
	num=num/10;
}
{
System.out.println("First digit is:"+firstDigit);	
}
}
}
