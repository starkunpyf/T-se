package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * java反射机制
 * 反射是java中的动态机制，它允许我们在程序运行期间再确定对象的实例化，方法的调用，
 * 属性的操作等。使得程序的灵活度大大提升，但是同时也带来了更多的资源开销和较低的
 * 运行效率。
 * 程序不能过度的依赖反射机制。
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
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

            3:类加载器ClassLoader形式
         */

//        Class cls = String.class;//获取String的类对象

//        Class cls = Person.class;

//        Class cls = Class.forName("java.lang.String");
//        Class cls = Class.forName("reflect.Person");
        /*
            java.util.ArrayList
            java.io.FileInputStream
            reflect.Person
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        //通过类对象获取其表示的String的相关信息
        String name = cls.getName();
        System.out.println(name);
        name = cls.getSimpleName();
        System.out.println(name);
        //获取包名
        System.out.println(cls.getPackage().getName());
        //获取当前类对象所表示的类的所有公开方法(包含从超类继承的方法)
        Method[] methods = cls.getMethods();
        System.out.println(cls.getSimpleName()+":一共有"+methods.length+"个公开方法");

        //获取当前类对象所表示的类自身定义的所有方法(含私有方法，不含从超类继承的方法)
//        Method[] methods = cls.getDeclaredMethods();
//        System.out.println(cls.getSimpleName()+":一共有"+methods.length+"个本类方法");
//
        for(Method method : methods){
            System.out.println(method.getName());
        }

    }
}






