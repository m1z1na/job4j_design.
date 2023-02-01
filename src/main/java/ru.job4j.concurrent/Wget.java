package ru.job4j.concurrent;

public class Wget {
    public static void main(String[] args) {

        Thread thread = new Thread(
                () -> {
                    try {
                        System.out.println("Start loading ... ");
                        long start = System.currentTimeMillis();
                        long end = start + 3000;
                        while (System.currentTimeMillis() < end) {
                            System.out.println("\rLoading : " + (System.currentTimeMillis() - start) * 100 / (end - start) + "%");
                            Thread.sleep(30);
                        }
                        System.out.println("Loaded.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
        thread.start();
        System.out.println("Main");
    }
}
