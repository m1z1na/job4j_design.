package ru.job4j.concurrent;

public class ConsoleProgress implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread progress = new Thread(new ConsoleProgress());
        progress.start();
        Thread.sleep(3000); /* симулируем выполнение параллельной задачи в течение 5 секунд. */
        progress.interrupt();
    }

    @Override
    public void run() {
        var process = new String[]{"-", "\\", "|", "/"};
        int counter = 0;

        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(100);
                System.out.print("\r load: " + process[counter]);

                if (counter + 1 == process.length) {
                    counter = 0;
                } else {
                    counter = ++counter;
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }
}
