package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 * Map支持三种遍历方式:
 * 1:单独遍历key
 * 2:遍历每一组键值对
 * 3:单独遍历value(这个操作不常用)
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",99);
        System.out.println(map);
        /*
            Set keySet()
            将当前Map中所有的key以一个Set集合形式返回。
         */
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println("key:"+key);
        }

        /*
            遍历每一组键值对
            Set entrySet()
            将当前Map中每一组键值对以Entry实例形式表示并存入集合后返将其返回。
            java.util.Map.Entry它的每一个实例用于表示一组键值对
            entry:条目
         */
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> e : entrySet){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);
        }
    }
}
