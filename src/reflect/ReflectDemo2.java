package reflect;

import java.util.Scanner;

/**
 * 使用反射机制实例化对象
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person p = new Person();
        System.out.println(p);

        //先获取要实例化对象的类所对应的类对象
//        Class cls = Class.forName("reflect.Person");
        /*
            java.util.ArrayList
            java.util.HashMap
            java.util.Date(日期)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);
        //类对象提供了方法newInstance()可以调用无参且公开的构造器实例化
        Object o = cls.newInstance();
        System.out.println(o);
    }
}




