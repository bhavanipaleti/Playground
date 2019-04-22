import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int b1=sc.nextInt();
    int e1=sc.nextInt();
    int n1=pon(b1,e1);
    System.out.println(n1);
  }
  public static int pon(int b2,int e2)
  {
     int prod=1;
   for(int i=1;i<=e2;i++)
   {
       prod=prod*b2;
   }
    return prod;
  }
} 