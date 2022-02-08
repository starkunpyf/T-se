package exception;

/**
 * finally块
 * finally是异常处理机制中的最后一块，它可以直接跟在try语句块之后或最后一个catch之后。
 *
 * finally语句块的特点是:
 * 只要程序可以执行到try语句块中，无论是否出现异常，最终都要执行finally块的代码。
 *
 * 因此我们会将如释放资源等操作放在finally中确保执行，比如IO操作后的close()调用。
 */
public class FinallyDemo {
}
