import java.nio.channels.CompletionHandler;
import java.util.concurrent.*;

public class ThreadTest {
    interface CallBackListener {
        void onCallback();

    }

    void callFunc(CallBackListener callBackListener) {
        System.out.println("callFunc = " + Thread.currentThread().getName());

        Thread t = new Thread(() -> {
            int i = 0;
            while (i < 5) {
                i++;
                System.out.println(i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            callBackListener.onCallback();
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        callBackListener.onCallback();
    }

    void test () {
        System.out.println("test = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("main = " + Thread.currentThread().getName());
        ThreadTest t = new ThreadTest();
        t.callFunc(() -> {
            System.out.println("onCallback -- onCallback = " + Thread.currentThread().getName());
            t.test();
        });
    }
}
