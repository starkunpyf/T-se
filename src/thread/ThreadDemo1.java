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

/**
 * 这种创建线程方式的优点是:结构简单，便于匿名内部类形式创建。
 * 缺点:
 * 1:由于java是单继承的，这导致如果继承了Thread就无法再继承其他类去复用方法，实际开发
 *   中会造成很多不便。
 * 2:定义线程时重写了run方法直接将任务定义在了线程中，导致线程与任务存在必然的耦合关系，
 *   不利于线程的重用。
 */
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
