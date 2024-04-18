import co.edu.uptc.model.SimpleRunnable;
import co.edu.uptc.model.SimpleThread;

public class Main {
    public static void main(String[] args) {
        SimpleThread thread1 = new SimpleThread();
        SimpleThread thread2 = new SimpleThread();

        Thread threadRunnable = new Thread(new SimpleRunnable("Runnable"));
        thread1.start();
        thread2.start();
        threadRunnable.start();
        System.out.println("Fin del hilo principal");
    }
}