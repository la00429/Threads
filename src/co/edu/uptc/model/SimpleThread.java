package co.edu.uptc.model;

public class SimpleThread extends Thread{
    public SimpleThread() {
        super();
    }

    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Este es el Thread: " + i + " del Thread " + getName());
        }
    }
}
