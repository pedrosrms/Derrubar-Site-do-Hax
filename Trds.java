public class Trds implements Runnable {

    private Runnable runnable;

    public Trds(Runnable runnable) {
        this.runnable = runnable;

    }

    public void run() {

        if (runnable != null) {
            runnable.run();
        }
    }

}