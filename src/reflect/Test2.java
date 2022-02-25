package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URISyntaxException;

/**
 * 自动调用与当前类Test2在同一个包下所有类中 方法名含有s的无参公开方法。
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //定位Test2所在的目录(包)
        File dir = new File(
            Test2.class.getResource(".").toURI()
        );
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        //遍历每一个class文件
        for(File sub : subs){
            String fileName = sub.getName();//获取文件名:例如Test2.class
            String className = fileName.substring(0,fileName.indexOf("."));
            Class cls = Class.forName(Test2.class.getPackage().getName()+"."+className);
            //实例化对象
            Object o = cls.newInstance();
            Method[] methods = cls.getDeclaredMethods();
            for(Method method : methods){
                if(method.getName().contains("s")&&
                   method.getParameterCount()==0&&
                   method.getModifiers()==Modifier.PUBLIC){
                    System.out.println("自动调用"+className+"的方法:"+method.getName());
                    method.invoke(o);
                }
            }

        }


    }
}
