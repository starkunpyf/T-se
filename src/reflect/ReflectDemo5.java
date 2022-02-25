package reflect;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method method = cls.getMethod("dosome",String.class);//dosome(String)
        method.invoke(o,"玩游戏");//p.dosome("玩游戏");

        Method method1 = cls.getMethod("dosome",String.class,int.class);
        method1.invoke(o,"看电视",5);
    }
}
