package ru.job4j.concurrent;

public class Wget {
    public static void main(String[] args) {

        Thread thread = new Thread(
                () -> {
                    try {
                        System.out.println("Start loading ... ");
                        int index = 1;
                        while (index < 100) {
                            System.out.println("\rLoading : " + index + "%");
                            Thread.sleep(30);
                            index = index + 1;
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
