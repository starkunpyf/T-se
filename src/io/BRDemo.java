package io;

import java.io.*;

/**
 * 缓冲字符输入流:java.io.BufferedReader
 * 1:块读文本数据加速
 * 2:可以按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前程序的源代码输出到控制台上
        //文件字节输入流，低级流，字节流。功能:从文件中读取字节
        FileInputStream fis = new FileInputStream("./src/io/BRDemo.java");
        //转换输入流，高级流，字符流。功能:1衔接字节与其他字符流  2:将读取的字节转换为字符
        InputStreamReader isr = new InputStreamReader(fis);
        //缓冲字符输入流，高级流，字符流。功能:1块读文本数据加速 2:按行读取字符串
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();
        System.out.println(line);

        br.close();



    }
}


