package basicprogram;
import java.util.Scanner;
public class SumOfEvenNumber {
public static void main(String []Args)
{
	int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range: ");
	n=sc.nextInt();
	for(i=1;i<=n;++i);{
	if(i%2==0)
	{
		sum=sum+i;
	}}
	System.out.println("sum of even number from 1 to"+n+"is: " + sum);
}
}
