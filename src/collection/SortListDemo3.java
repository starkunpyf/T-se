package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("小泽老师");
        list.add("传奇");
        System.out.println(list);
//        Collections.sort(list);
        //定义一个比较器，按照字多字少排序
        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
//        Collections.sort(list, Comparator.comparingInt(String::length));

        System.out.println(list);


    }
}
