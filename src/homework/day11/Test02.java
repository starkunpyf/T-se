package homework.day11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 改错题
 * @author Xiloer
 *
 */
public class Test02 {
    /*
        当前类在idea中执行时鼠标右键中的菜单栏中没有run选项，说明当前类
        没有main方法!
     */
//	public static void mian(String args) {
    public static void main(String[] args) {
        //实例化时少了()
//		Collection<String> c = new ArrayList;
        Collection<String> c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        for(String s : c) {
            System.out.println(s);
        }
    }
}



