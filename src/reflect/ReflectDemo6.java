package reflect;

import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
//        Person p = new Person();
//        p.secret();//私有方法不能在类的外部被访问

        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        //getMethod()获取公开方法
//        Method method = cls.getMethod("secret");
        //获取私有方法
        Method method = cls.getDeclaredMethod("secret");
        //强行打开访问权限
        method.setAccessible(true);
        method.invoke(o);
    }
}
