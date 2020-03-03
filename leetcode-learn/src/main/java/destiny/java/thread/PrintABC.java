package destiny.java.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/3 21:33
 * @Version 1.0
 */
public class PrintABC {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition aCondition = lock.newCondition();
    private static Condition bCondition = lock.newCondition();
    private static Condition cCondition = lock.newCondition();

    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                try {
                    lock.lock();
                    System.out.println("A");
                    bCondition.signal();
                    aCondition.await();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }

        }).start();
        new Thread(()->{
            while (true){
                try {
                    lock.lock();
                    System.out.println("B");
                    cCondition.signal();
                    bCondition.await();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                try {
                    lock.lock();
                    System.out.println("C");
                    aCondition.signal();
                    cCondition.await();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }).start();
    }
}
