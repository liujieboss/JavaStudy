package demo;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
    private static int queueDeep=4;
    public void createThreadPool(){
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(2, 4, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(queueDeep), new ThreadPoolExecutor.DiscardOldestPolicy());
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1);
            }                        catch (InterruptedException e){
                e.printStackTrace();
            }
            while (getQueueSize(tpe.getQueue())>=queueDeep){
                System.out.println("队列已满，等3秒再添加任务");
                try{
                    Thread.sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            TaskThreadPool ttp=new TaskThreadPool(i);
            System.out.println("put i:"+i);
            tpe.execute(ttp);
        }
        tpe.shutdown();
    }

    private synchronized int getQueueSize(Queue queue){
        return queue.size();
    }

    public static void main(String[] args) {
        ThreadPoolExecutorTest test = new ThreadPoolExecutorTest();
        test.createThreadPool();
    }

}

class TaskThreadPool implements Runnable{
    private int index;

    public TaskThreadPool(int index){
        this.index=index;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread()+" index:"+index);
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
