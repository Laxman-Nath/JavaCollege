package synchronization;

class Factorial {

    

   

    public  void findFactorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            System.out.println("calculating factorial of "+n);
            fact=fact*i;
        }
        
        System.out.println("Factorial :"+fact);
    }
}

class Thread1 extends Thread {

    Factorial m;

    public Thread1(Factorial m) {
        this.m = m;
    }

    public void run() {
       m.findFactorial(30);
    }
}




class Thread2 extends Thread {

     Factorial m;

    public Thread2(Factorial m) {
        this.m = m;
    }

    public void run() {
        m.findFactorial(10);
    }
}

public class Synchronization {

    public static void main(String[] args) {
        Factorial m1=new Factorial();
        Thread1 t1=new Thread1(m1);
        Thread2 t2=new Thread2(m1);
        t1.start();
        t2.start();
    }

}
