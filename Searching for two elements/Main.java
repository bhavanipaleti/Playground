import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int is_matched=0;
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int sear_ele1=sc.nextInt();
      int sear_ele2=sc.nextInt();
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]==sear_ele1)
        {
           is_matched=1;
           System.out.println(i);
        }
      } 
      if(is_matched==0)
        System.out.println("-1");
      is_matched=0;
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]==sear_ele2)
        {
           is_matched=1;
           System.out.println(i);
        }
      } 
      if(is_matched==0)
        System.out.println("-1");
     
      
      
      
  
      }
    }
