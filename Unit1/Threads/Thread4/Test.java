class Display{
public synchronized void show(String name){
for(int i=0;i<10;i++){
System.out.println(name);
try{
Thread.sleep(5000);
}
catch(InterruptedException e){
System.out.println(e);
}
}

}
}

class Thread1 extends Thread{
Display d1;
Thread1(Display d1){
this.d1=d1;
}
public void run(){
d1.show("Laxman");
}
}
class Thread2 extends Thread{
Display d1;
public Thread2(Display d1){
this.d1=d1;
}
public void run(){
d1.show("Rohit");
}
}

public class Test{
public static void main(String [] args){
Display d=new Display();
Thread1 t1=new Thread1(d);
Thread2 t2=new Thread2(d);
t1.start();
t2.start();
}
}