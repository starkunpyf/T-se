package thread;

/**
 * 获取线程相关信息的一组方法
 *
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//获取到主线程

        String name = main.getName();//获取线程的名字
        System.out.println("名字:"+name);

        long id = main.getId();//获取线程的唯一标识
        System.out.println("id:"+id);

        int priority = main.getPriority();//获取线程优先级
        System.out.println("priority:"+priority);

    }
}



