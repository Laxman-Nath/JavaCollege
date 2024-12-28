/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreadingdemo;

//class Thread1 extends Thread {
//
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Thread 1....." + i);
//        }
//    }
//}
//
//class Thread2 extends Thread {
//
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Thread 2....." + i);
//        }
//    }
//}
class Thread1 implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread 1....." + i);
        }
    }
}

class Thread2 implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread 2....." + i);
        }
    }
}

public class MultithreadingDemo {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();

        Thread2 t2 = new Thread2();

        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);
        t3.start();
        t4.start();

    }

}
