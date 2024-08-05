import java.util.Scanner;
public class Arrays{
  public static void main(String [] args)
{
     int [] A=new int[5];
int [] B={1,2,3,4,5,6};
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter elements of arrays:");
     for(int i=0;i<5;i++)
 {
     A[i]=sc.nextInt();
 } 
 
System.out.println("The elements of array are:");
     for(int i=0;i<5;i++)
 {
     System.out.println(A[i]);
 } 
System.out.println("The length of array is:"+A.length);
}
}