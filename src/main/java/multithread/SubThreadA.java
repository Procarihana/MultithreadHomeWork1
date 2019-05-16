package multithread;


//创建一个继承Thread类的子类
public class SubThreadA extends Thread {

    private Object obj ;

    public SubThreadA(Object obj){
    this.obj = obj;
    }

    public void run(){
        for (int i = 0;i<26;i++){
            System.out.print((char) ('A'+i)+"");
        }
}


}
