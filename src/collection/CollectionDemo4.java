package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合间的操作
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new HashSet();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:"+c1);
        Collection c2 = new ArrayList();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2);
        /*
            boolean addAll(Collection c)
            将给定集合中的所有元素添加到当前集合中(取并集)
            操作后当前集合发生了改变则返回true
         */
        c1.addAll(c2);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

    }
}







