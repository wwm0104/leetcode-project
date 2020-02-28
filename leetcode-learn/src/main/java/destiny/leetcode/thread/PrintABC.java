package destiny.leetcode.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @Author: weiwanmin
 * @Date: 2020/2/27 16:46
 * @Version 1.0
 */
public class PrintABC {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();
    private volatile  int flag = 0;

    public void printA(){
        lock.lock();
        try {
               while (true){
                   if(flag != 0){
                         conditionA.await();
                   }
                   System.out.println("A");
                   flag = 1;
                   conditionB.signal();
               }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void printB(){
        lock.lock();
        try {
            while (true){
                if(flag != 1){
                    conditionB.await();
                }
                System.out.println("B");
                flag=2;
                conditionC.signal();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pringC(){
        lock.lock();
        try {
            while (true){
                if(flag != 2){
                    conditionC.await();
                }
                System.out.println("C");
                flag =0;
                conditionA.signal();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
