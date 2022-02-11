package thread;

/**
 * 线程提供的方法:join可以协调线程的同步运行
 * 多线程是并发运行，本身是一种异步运行的状态。
 * 同步运行:多个线程执行是存在了先后顺序。
 * 异步运行:各自执行各自的
 *
 * join:加入
 * finish:完成
 */
public class JoinDemo {
    static boolean isFinish = false;//表示图片是否下载完毕

    public static void main(String[] args) {
        Thread download = new Thread(){
            public void run(){
                System.out.println("down:开始下载图片...");
                for(int i=1;i<=100;i++){
                    System.out.println("down:"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("down:图片下载完毕!");
                isFinish = true;
            }
        };

        Thread show = new Thread(){
            public void run(){
                System.out.println("show:开始显示文字");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println("show:显示文字完毕!");

                //将show线程阻塞，直到download执行完毕(图片下载完毕)
//                Thread.sleep(?);//无法准确预估download结束时间
                try {
                    /*
                        当show线程调用download.join()后便进入了阻塞状态。
                        直到download线程执行完毕才会解除阻塞。
                     */
                    download.join();
                } catch (InterruptedException e) {
                }

                System.out.println("show:开始显示图片...");
                if(!isFinish){
                   throw new RuntimeException("图片加载失败!");
                }
                System.out.println("show:图片显示完毕");
            }
        };
        download.start();
        show.start();
    }
}
