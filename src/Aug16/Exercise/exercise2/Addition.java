package Aug16.Exercise.exercise2;

public class Addition implements Runnable {
    public int a;
    public int b;
    public int out;

    Addition (int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        this.out = a+b;
        System.out.println("Resultant output: " + this.out);
    }
}
