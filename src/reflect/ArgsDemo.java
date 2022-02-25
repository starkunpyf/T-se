package reflect;

import java.util.Arrays;

/**
 * JDK5之后java推出了一个特性:变长参数
 */
public class ArgsDemo {
    public static void main(String[] args) {
        doing(1,23,"one");
        doing(1,23,"one","two");
        doing(1,23,"one","two","three");
        doing(1,23,"one","two","three","four");
    }

    /**
     * 变长参数只能是方法的最后一个参数，实际是一个数组类型。
     */
    public static void doing(int age,long a,String... arg){
        System.out.println(arg.length);
        System.out.println(Arrays.toString(arg));
    }
}





