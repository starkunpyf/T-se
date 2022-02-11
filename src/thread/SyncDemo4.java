package thread;

/**
 * 互斥锁
 * 当使用多个synchronized锁定多个代码片段，并且指定的锁对象(同步监视器对象)相同时，
 * 那么这些代码片段之间就是互斥的，多个线程不能同时访问他们。
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread t1 = new Thread(){
            public void run(){
                foo.methodA();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                foo.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}
class Foo{
    public synchronized void methodA(){
        Thread t = Thread.currentThread();//运行A方法的线程
        System.out.println(t.getName()+":正在执行A方法...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println(t.getName()+":执行A方法完毕!");
    }
//    public synchronized void methodB(){
    public void methodB(){
        synchronized(this) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行B方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println(t.getName() + ":执行B方法完毕!");
        }
    }
}





