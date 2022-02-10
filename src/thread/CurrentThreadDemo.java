package thread;

/**
 * java中所有的代码都是靠线程运行的，main方法也不例外。JVM启动后会创建一个线程来执行
 * main方法，并且该线程的名字也叫"main",因此我们通常称它为"主线程"。但是它和我们创建
 * 的线程并无区别。
 *
 * Thread提供了一个静态方法:
 * static Thread currentThread()
 * 该方法可以获取运行这个方法的线程。
 *
 * current:当前的
 *
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        //让主线程执行currentThread以便得到它
        Thread main = Thread.currentThread();
        System.out.println("主线程:"+main);
        dosome();//主线程执行dosome方法

    }

    public static void dosome(){
        Thread t = Thread.currentThread();//获取运行dosome方法的线程
        System.out.println("运行dosome方法的线程:"+t);

    }
}





