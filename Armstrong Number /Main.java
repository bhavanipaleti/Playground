import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner ( System.in );
      int n1;
      int sum=0,r=0;
      int n = sc.nextInt();
      n1=n;
      while(n>0)
      {
        r=n%10;
        sum=sum+r*r*r;
        n=n/10;
      }
     if(sum==n1)
     {
       System.out.println("Armstrong Number");
	}
      else
      {
        System.out.println("Not a Armstrong Number");
      }
}
}