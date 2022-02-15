package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List接口
 * List继承自Collection，是最常用的一类集合。特点:可以存放重复元素且有序。
 * List里提供了一套可以通过下标操作元素的方法。
 * 常用实现类:
 * java.util.ArrayList:内部使用数组实现，查询性能更好。
 * java.util.LinkedList:内部使用链表实现，增删性能更好，首尾增删性能最佳。
 * 对性能没有特别苛刻的要求下，通常使用ArrayList即可。
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        //获取集合中第三个元素
        /*
            E get(int index)
            获取指定下标处对应的元素
         */
        String str = list.get(2);//与数组获取元素功能一致 String str = arr[2];
        System.out.println(str);
        //List也可以通过循环下标的方式遍历
        for(int i=0;i<list.size();i++){
            str = list.get(i);
            System.out.println(str);
        }

        /*
            E set(int index,E e)
            将给定元素设置到指定位置上，返回值为该位置原来的元素
            替换元素操作
         */
        //[one,six,three,four,five]
        String old = list.set(1,"six");//将第二个位置原来的two返回
        System.out.println(list);
        System.out.println(old);

        //在不创建新集合的前提下，将集合元素翻转
        for(int i=0;i<list.size()/2;i++){//i:0
//            //获取正数位置上的元素
//            String e = list.get(i);//one
//            //将正数位置上的元素来替换倒数位置上的元素
//            e = list.set(list.size()-1-i,e);//five
//            //将原倒数位置上的元素设置到正数位置上
//            list.set(i,e);
            list.set(i,list.set(list.size()-1-i,list.get(i)));
        }
        // 0    1         3    4
        //[five,six,three,four,one]
        System.out.println(list);

        Collections.reverse(list);//翻转集合

        System.out.println(list);

    }
}




