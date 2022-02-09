package homework.day05;

import java.io.*;

/**
 * 改正下面程序的错误
 *
 * 程序实现需求:使用缓冲流完成文件的复制操作
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		//类名拼写不对
//		BufferedInputStream bis = new BuffereddInputStream(fis);
		BufferedInputStream bis = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream("test_cp.txt");
		//应当创建缓冲字节输出流
//		BufferedInputStream bos = new BufferedOutputStream(fos);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int d = 0;
		//1判断要为!=-1
		//2不能用if，要使用while
//		if ((d = bis.read()) == -1) {
		while ((d = bis.read()) != -1) {
			//方法名拼写错误
//			bos.wirte(d);
			bos.write(d);
		}
		System.out.println("复制完毕!");
		//缺少关闭流的操作
		bis.close();
		bos.close();

	}
}
