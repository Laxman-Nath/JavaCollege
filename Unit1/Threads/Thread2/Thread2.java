// Implementing multithreadig by implementing the Runnable interface

class My implements Runnable{
    public void run(){
        int i=1;
        while(i<50){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
 class Thread2 {

    
    public static void main(String[] args) {
       My m=new My();
       Thread t=new Thread(m);
       t.start();
       int i=1;
       while(i<50){
           System.out.println(i+" world");
           i++;
       }
       
    }
    
}
