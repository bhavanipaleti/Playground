import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int c=0;
    if(n<0)
       n=n*-1;
  
    do
    {
       c++;
      n=n/10;
    }while(n>0);
   
     if(temp<0)
        c++;
    char str[]=new char[c];
    if(temp<0)
    {
       temp=temp*-1;
      str[0]='-';
    }
    c=c-1;
    while(temp>0)
      {
        char ch=(char)((temp%10)+'0');
        str[c]=ch;
        c--;
        temp=temp/10;
      }
   
    System.out.print(str);
    
  }
}