package Aug16.Exercise;

import java.lang.Runnable;
/*
Create three threads one for Eat Pizza, one for Drink Coke and Third one for keep listing music.
Use all three styles of three in creating them.
 */
public class ThreadingExamples {

    public static void main(String[] args) {
        EatPizza ep = new EatPizza();
        Thread t = new Thread(ep, "eat pizza");
        t.start();
        DrinkCoke dc = new DrinkCoke();
        dc.start();
        new Thread() {
            public void run() {
                System.out.println("Listening to music anonymously");
            }
        }.start();
    }


}
