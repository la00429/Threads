package co.edu.uptc.model;

public class SimpleRunnable implements Runnable {

    private String nameThread;

    public SimpleRunnable(String nameThread) {
        this.nameThread = nameThread;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Este es el Thread: " + i + " del Thread " + nameThread);
        }

    }
}
