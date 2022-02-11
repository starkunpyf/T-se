package thread;

/**
 * sleep方法要求必须处理中断异常。
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中，此时该线程的interrupt()方法被调用时
 * 会立即中断该睡眠阻塞，并抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {

    }
}
