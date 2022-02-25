package reflect;

import java.lang.reflect.Constructor;

/**
 * 使用指定的构造器实例化对象
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Person p = new Person("李四",55);
        System.out.println(p);
        //1加载类对象
        Class cls = Class.forName("reflect.Person");
        //2获取对应的构造器  Person(String name,int age)
//        cls.getConstructor();//不传参获取的为无参构造器
        Constructor c = cls.getConstructor(String.class,int.class);
        //3通过构造器实例化对象 new Person("王五",22);
        Object o = c.newInstance("王五",22);
        System.out.println(o);
    }
}
