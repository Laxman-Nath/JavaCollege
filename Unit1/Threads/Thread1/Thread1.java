public class Thread1 extends Thread{
public void run(){
int i=1;
    while(i<=100){
        System.out.println(i+" Hello");
        i++;
    }
}
public static void main(String [] args)
{
  Thread1 t1=new Thread1();
  t1.start();
int i=1;
  while(i<=100){
           System.out.println(i+" world");
           i++;
       }
}
}