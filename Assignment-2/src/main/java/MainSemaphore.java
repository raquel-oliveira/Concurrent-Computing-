
//Solution of Shared Bathroom problem
public class MainSemaphore {
    static final int capacity = 5;

    public static void main(String args[]) throws InterruptedException {
        BathroomSemaphore bathroom = new BathroomSemaphore(capacity);
        Thread b = new Thread(bathroom);
        b.start();
        try {
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
