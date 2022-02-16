package homework.day11;

import java.util.*;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Random random = new Random();
//		List<Integer> list = new ArrayList<>();
//		while(list.size()<10){//集合元素不够10个
//			int num = random.nextInt(100);//生成的随机数
//			if(!list.contains(num)) {//如果集合不包含该随机数
//				list.add(num);
//			}
//		}
//		System.out.println(list.size());
//		System.out.println(list);

		Set<Integer> set = new HashSet<>();
		while(set.size()<10) {//集合元素不够10个
			set.add(random.nextInt(100));
		}
		System.out.println(set.size());
		System.out.println(set);
	}
}
