package Aug16.Exercise.exercise2;
/*
Exercise :
Create a fixed thread pool from executor service for 5 threads and use them to get addition of two numbers.

 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Addition add1 = new Addition(1, 2);
        Addition add2 = new Addition(2, 2);
        Addition add3 = new Addition(3, 2);
        Addition add4 = new Addition(4, 2);
        Addition add5 = new Addition(5, 2);
        Addition add6 = new Addition(6, 2);
        executorService.submit(add1);
        executorService.submit(add2);
        executorService.submit(add3);
        executorService.submit(add4);
        executorService.submit(add5);
        executorService.submit(add6);

        executorService.shutdown();

    }
}
