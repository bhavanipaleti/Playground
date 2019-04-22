import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=n;c++)
        {
         if(r==c || (r+c)==(n+1))
         {
           System.out.print("*");
         }
          else
        System.out.print(" ");
        }
        System.out.println();
	}
}
}