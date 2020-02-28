package destiny.leetcode.thread;

/**
 *
 * 使用三个线程,轮回打印ABC
 * @Author: weiwanmin
 * @Date: 2020/2/27 16:44
 * @Version 1.0
 */
public class PrintABCThreadTest {
    public static void main(String[] args) {
        PrintABC printThread = new PrintABC();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printThread.printA();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printThread.printB();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printThread.pringC();
            }
        }).start();

    }

}
