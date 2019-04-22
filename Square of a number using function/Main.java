import java.util.Scanner;
class Main
{
    public static int square(int n)
    {
      int n1=n*n;
      return n1;
    } 
  
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int n2=square(num);
      System.out.println(n2);
	} 
}