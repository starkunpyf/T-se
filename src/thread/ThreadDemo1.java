package thread;

/**
 * 多线程
 * 多线程可以并发执行多个任务
 * 线程的第一种创建方式:
 * 继承Thread并重写run方法，在run方法中定义需要并发执行的任务代码。
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        /*
            注意，启动线程要调用start方法，而非直接调用run方法。当调用start后线程便会
            纳入到线程调度器程序中统一被管理。一旦它被分配到了CPU的时间片就会开始自动执行
            它的run方法了。
         */
        t1.start();
        t2.start();
    }
}
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你是谁啊?");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("开门，查水表的!");
        }
    }
}
