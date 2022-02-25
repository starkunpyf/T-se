package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 自动调用Person本类中所有名字含有"s"的无参的公开方法
 * 提示:
 * Method提供的方法:
 * int getParameterCount()
 * 可以获取其表示的方法的参数个数
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            if(method.getName().contains("s")&&
               method.getParameterCount()==0&&
                //判断当前方法是否为public的方法
                method.getModifiers() == Modifier.PUBLIC){
                System.out.println("自动执行方法:"+method.getName());
                method.invoke(o);
            }
        }
    }
}
