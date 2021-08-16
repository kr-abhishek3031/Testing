package Aug16.Exercise.exercise1;

public class PrintNumbers extends Thread{
    private boolean even;
    //private int strt;
    PrintNumbers (boolean even){
        this.even= even;

    }
    @Override
    public void run(){
        if(!even){
            for(int i=2;i<=10;i+=2) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            for(int j=1;j<10;j+=2) {
                System.out.println(j);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
