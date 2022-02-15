package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为List集合。
 * 数组的工具类Arrays提供了一个静态方法asList，可以将一个数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("Array:"+Arrays.toString(array));
        List<String> list = Arrays.asList(array);
        System.out.println("List:"+list);
        //对该集合的操作就是对原数组对应的操作
        list.set(1,"six");
        System.out.println("List:"+list);
        System.out.println("Array:"+Arrays.toString(array));
        /*
            由于数组是定长的，因此对集合增删元素会导致对数组进行同等操作，这时会抛出
            异常:UnsupportedOperationException
            Unsupported:不支持的
            Operation:操作
         */
//        list.add("seven");
        /*
            如果有增删需求，则需要另外创建一个集合，并先将数组转换的集合内容导入后
            方可进行。
         */
//        List<String> list2 = new ArrayList<>();
//        list2.addAll(list);
        /*
            所有集合都支持一个参数为Collection的构造器，目标是在创建当前集合
            的同时包含给定集合中的所有元素
         */
        List<String> list2 = new ArrayList<>(list);

        System.out.println("list2:"+list2);
        list2.add("seven");
        System.out.println("list2:"+list2);
    }
}
