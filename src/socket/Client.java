package socket;

import java.net.Socket;

/**
 * 聊天室客户端
 */
public class Client {
    /**
     * java.net.Socket 套接字
     * Socket封装了TCP协议的通讯细节，我们使用他可以与远端计算机建立TCP链接。并
     * 基于一堆流的IO操作完成与远端计算机的数据交换。
     */
    private Socket socket;

    /**
     * 初始化客户端
     */
    public Client(){

    }
    /**
     * 客户端开始工作的方法
     */
    public void start(){

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }


}






