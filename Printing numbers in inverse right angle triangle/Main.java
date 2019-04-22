import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n;
      for(int r=1;r<=n;r++)
      {
        for(int c=n1;c>=1;c--)
        {
           System.out.print(c);
        }
       System.out.println();
    n1--;
      } 
}
}