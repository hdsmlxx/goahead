package lxx.thread;

/**
 * @author bengka
 * @classname InterupterThread
 * @description TODO
 * @date 2022/6/25 17:14
 */
public class InterrupterThread {

    public static void main(String[] args) throws InterruptedException {
        // 创建线程
        Thread thread = new Thread(() -> {
            while (true) {
                // 判断线程是否标记中断
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                System.out.println("thread running ...");
            }
        });
        // 开启线程
        thread.start();
        
        Thread.sleep(1000);
        
        // 打断线程
        /*
            不是真正的中断线程，而是标记为interrupt 状态
         */
        thread.interrupt();
        
    }

}
