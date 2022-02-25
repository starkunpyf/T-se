package reflect;

/**
 * java反射机制
 * 反射是java中的动态机制，它允许我们在程序运行期间再确定对象的实例化，方法的调用，
 * 属性的操作等。使得程序的灵活度大大提升，但是同时也带来了更多的资源开销和较低的
 * 运行效率。
 * 程序不能过度的依赖反射机制。
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
        /*
            Class 类对象
            Class的每一个实例用于表示JVM中加载的一个类，并且每个被JVM加载的类都
            有且只有一个Class的实例。
            通过Class我们可以得知其表示的类的一切信息:类名，包名，有哪些构造器，方法
            属性等。并在运行期间获取后进行相关操作。

            因此反射操作的第一步就是获取要操作的类的类对象。获取一个类的类对象方式有:
            1:类名.class
              例如:
              Class cls = String.class;
              Class cls = int.class;
            注:基本类型只能通过上述方式获取类对象

            2:Class.forName(String className)
              使用Class的静态方法forName传入要加载的类的完全限定名(包名.类名)
              例如:
              Class cls = Class.forName("java.lang.String")
         */
    }
}






