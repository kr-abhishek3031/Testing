package Aug16.Exercise.exercise1;
/*
Exercise :
Create two threads using basic thread concepts and use them to print numbers from 1-10 such that thread one is printing odd numbers and thread two is printing even numbers.



 */
public class Main {
    public static void main(String[] args) {
        Thread even = new PrintNumbers(true );
        Thread odd = new PrintNumbers(false );
        odd.start();
        even.start();
    }
}
