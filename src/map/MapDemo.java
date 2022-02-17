package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map接口 查找表
 * Map体现的结构是一个多行两列的表格，其中左列称为"key",右列称为"value"
 * Map总是以key-value对的形式保存一组数据。并且可以根据key获取对应的value。
 * Map有一个要求，key不允许重复(equals比较)
 *
 * 常用实现类:
 * java.util.HashMap,我们称它为"散列表"。当今查询速度最快的数据结构。
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        /*
            V put(K k,V v)
            向当前Map中保存一组键值对
         */
        map.put("语文",99);
        //如果Map的value是包装类类型，获取时不要用基本类型接收，避免自动拆箱引发空指针
        Integer value = map.put("数学",98);//key不存在时,put方法返回值为null
        System.out.println("value:"+value);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",99);
        System.out.println(map);

        value = map.put("数学",77);//key已经存在则替换value，返回值为key原来对应的value
        System.out.println("value:"+value);
        System.out.println(map);

        /*
            V get(Object key)
            根据给定的key获取对应的value，如果给定的key不存在，则返回值为null
         */
        value = map.get("语文");
        System.out.println("语文:"+value);
        value = map.get("体育");
        System.out.println("体育:"+value);
    }
}
