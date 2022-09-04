package demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("---main start---"+Thread.currentThread().getId());
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int a = 10 / 0;
            System.out.println("当前线程" + Thread.currentThread().getId() + "---当前结果" + a);
            return a;
        }).whenComplete((result, exception) -> {
            System.out.println("异步任务完成了，结果：" + result);
            System.out.println("异步任务异常：" + exception);
            throw new RuntimeException("whenComplete抛出异常");
        }).exceptionally((exception) -> {
            System.out.println("捕获异步任务异常：" + exception);
            return 10;
        });
        System.out.println("任务结果："+future.get());
    }
}
