import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner ( System.in );
      int n = sc.nextInt();
      int n1;
      n1=n;
      int r=0,prod=1,sum=0;
      while(n>0)
      {
        r = n % 10;
        for ( int i = 1 ; i <= r ; i++ )
        {
             prod = prod *i ;
        }
        sum=sum+prod;
        prod=1;
        n = n / 10;
      } 
      if ( n1 == sum )
        System.out.println ( "Yes" );
      else
        System.out.println ( "No" );
      
	}
}