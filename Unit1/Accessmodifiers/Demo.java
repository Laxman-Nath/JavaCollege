public class Demo{
public class Data{
 private int x=1;
static int y=2;
static public int z=3;
static protected int a=4;



}
public class Data2 {
Data d=new Data();
public  void display(){

System.out.println(d.x);
System.out.println(d.y);
System.out.println(d.z);
System.out.println(d.a);
}
}
public static void main(String [] args){
 new Data2().display();
}
}