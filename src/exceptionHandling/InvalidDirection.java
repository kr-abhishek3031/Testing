package exceptionHandling;

public class InvalidDirection extends Exception{
    public InvalidDirection (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}
