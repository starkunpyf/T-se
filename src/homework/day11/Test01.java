package homework.day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 改错题
 *
 * 程序需求:向一个List集合中添加10个数字1-10，并将它们
 * 遍历出来并输出到控制台。
 *
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		//1泛型只能指定引用类型
		//2List是一个接口，不能实例化
//		List<int> list = new List<int>();
		List<Integer> list = new ArrayList<>();

		//集合中没有元素，要存入元素
		for(int i=1;i<=10;i++){
			list.add(i);
		}

		//最好给迭代器也指定泛型
//		Iterator it = list.iterator();
		Iterator<Integer> it = list.iterator();
		/*
			没有遵从迭代器遍历的问取的过程
		 */
//		boolean b = it.hasNext();
//		while(b) {//死循环，因为b再没有更改过!!!
//			int i = it.next();//已经next取过一次了
//			System.out.println(it.next());//不能问一次连续取两次!
//		}

		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
	}
}





