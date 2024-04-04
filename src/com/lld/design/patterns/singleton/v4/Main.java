package com.lld.design.patterns.singleton.v4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Set<Logger> set = new HashSet<>();
        ExecutorService service = Executors.newFixedThreadPool(100);
        List<Future<Logger>> list = new ArrayList<>();
        for(int i = 0; i < 1000; i++){
           list.add(service.submit(Logger.getInstance()));
        }

        for(Future<Logger> log : list){
            set.add(log.get());
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println(set.size());
    }
}
