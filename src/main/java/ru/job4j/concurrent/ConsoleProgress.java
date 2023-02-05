package ru.job4j.concurrent;

public class ConsoleProgress implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread progress = new Thread(new ConsoleProgress());
        progress.start();
        Thread.sleep(3000);
        progress.interrupt();
    }

    @Override
    public void run() {
        var process = new String[]{"-", "\\", "|", "/"};
        int counter = 0;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                for (int i = 0; i < process.length; i++) {
                    System.out.print("\r load: " + process[i]);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
