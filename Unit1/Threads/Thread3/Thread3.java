class MyThread extends Thread{
    public MyThread(String name){
        super(name); // Settings the name for the thread
        setPriority(Thread.MAX_PRIORITY);
    }
}
 class Thread3 {


    public static void main(String[] args) {
       MyThread t1=new MyThread("Thread1");
       System.out.println("Id of thread is:"+t1.getId());
       System.out.println("Name of thread:"+t1.getName());
       System.out.println("Is it alive:"+t1.isAlive());
       System.out.println("Priority of thread:"+t1.getPriority());
       System.out.println("State of thread now  is:"+t1.getState());
       t1.start();
       System.out.println("Now the state of thread is:"+t1.getState());
       
    }
    
}