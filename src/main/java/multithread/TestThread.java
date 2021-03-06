package multithread;

public class TestThread {
    static class SubThread1 implements Runnable {
        private Thread t1;

        SubThread1() {
            t1 = new Thread(this);
            t1.start();

        }

        public void run() {
            for (int i = 0; i < 26; i++) {
                System.out.print((char) ('A' + i) + "");
            }
            System.out.println("SubThread1 exciting.");
        }
    }
        static class SubThread2 implements Runnable{
            private Thread t2;
            SubThread2(){
                t2=new Thread(this);
                t2.start();
            }
            public void run(){
                for (int b = 0;b<26;b++){
                    System.out.print((char)('a'+b)+"");
                }
                System.out.println("SubThread2 exciting.");
            }
        }


    public static void main(String args[]){
        SubThread1 t1 = new SubThread1();
        SubThread2 t2 = new SubThread2();
        try{
            for (int a =0;a<100;a++){
                System.out.println(Thread.currentThread().getName()+":"+a);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("The MainThread interrupt.");
        }System.out.println("The MainThread exciting.");
    }
}
