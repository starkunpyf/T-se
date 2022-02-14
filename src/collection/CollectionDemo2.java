package collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素会影响集合操作的相关方法
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        /*
           集合重写了toString方法，格式为:
           [元素1.toString(), 元素2.toString(), 元素3.toString(), ....]
         */
        System.out.println(c);

        Point p = new Point(1,2);
        /*
            boolean contains(Object o)
            判断当前集合是否包含给定元素。
            元素是否包含取决于该元素是否与集合现有元素存在equals比较为true的情况
         */
        boolean contains = c.contains(p);
        System.out.println("是否包含该元素:"+contains);


    }
}







