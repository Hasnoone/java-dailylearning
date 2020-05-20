package com.study.dailylearning.thread.artconcurrencyprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @create: 下午 5:09 17/5/2020
 **/
public class Priority {

    private static volatile boolean notStart = true;
    private static volatile boolean notEnd = true;


    public static void main(String[] args) throws InterruptedException {
        List<Job> jobs = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            int priority = i < 5 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY;

            Job job = new Job(priority);
            jobs.add(job);


            Thread thread = new Thread(job, "Thread:" + i);

            thread.setPriority(priority);
            thread.start();




        }
        notStart = false;
        TimeUnit.SECONDS.sleep(10);
        notEnd = false;


        for (Job item : jobs) {

            System.out.println(item.priority+"======="+item.jobCount);
        }

    }






    static class Job implements Runnable {

        private int priority;
        private int jobCount;


        public Job(int priority) {
            this.priority = priority;
        }

        @Override
        public void run() {
            while (notStart) {
                Thread.yield();

            }


            while (notEnd) {
                Thread.yield();
                ++jobCount;
            }



        }
    }

}







