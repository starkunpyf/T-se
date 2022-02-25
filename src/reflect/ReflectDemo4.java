package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 使用反射机制调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.sayHello();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String className = scanner.nextLine();
        System.out.println("请输入方法名:");
        String methodName = scanner.nextLine();
        //实例化
//        Class cls = Class.forName("reflect.Person");
        Class cls = Class.forName(className);
        Object o = cls.newInstance();//Person o = new Person();
        //获取要调用的方法
        //仅传入方法名时，是获取该无参方法
//        Method method = cls.getMethod("sayHello");//表示的Person的成员方法sayHello()
        Method method = cls.getMethod(methodName);
        method.invoke(o);//o.sayHello()

    }
}




