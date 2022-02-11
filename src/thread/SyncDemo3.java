package thread;

/**
 * 静态方法锁
 * 如果我们在静态方法上使用synchronized,那么该方法就一定具有同步效果。
 *
 * 静态方法指定的锁对象为当前类的类对象，即:Class的实例。
 * JVM在加载一个类时会实例化一个Class的实例与之对应，这个实例称为一个类的类对象。在
 * JVM内部每个被加载的类都有且只有一个Class的实例与之对应。静态方法指定的同步监视器
 * 对象也是它。
 * 后面学习java反射机制时会介绍Class
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo{
//    public synchronized static void dosome(){
    public static void dosome(){
        //同步块中通常也用类对象，引用一个类的类对象格式为:类名.class
        synchronized (Boo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行dosome方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println(t.getName() + ":执行dosome方法完毕!");
        }
    }
}



