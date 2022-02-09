package socket;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * 聊天室服务端
 */
public class Server {
    /**
     * java.net.ServerSocket
     * ServerSocket是运行在服务端的，它的主要工作:
     * 1:打开服务端口(客户端就是通过这个端口与服务端建立链接)
     * 2:监听该服务端口，一旦一个客户端链接，则会返回一个Socket实例，并通过这个
     *   Socket实例与链接的客户端进行交互
     *
     * 如果我们将Socket比喻为"电话"，那么ServerSocket相当于是"总机"。
     *
     */
    private ServerSocket server;

    public Server(){
        try {
            /*
                实例化ServerSocket的同时需要指定打开的服务端口，客户端就是通过该
                端口建立链接的。
                如果该端口已经被操作系统其他程序占用了，那么这里会抛出异常:
                java.net.BindException:address already in use
                         绑定异常        地址    已经     被占用了
             */
            server = new ServerSocket(8088);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start(){

    }

    public static void main(String[] args) {

    }

}
