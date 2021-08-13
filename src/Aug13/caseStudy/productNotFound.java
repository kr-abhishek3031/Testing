package Aug13.caseStudy;

public class productNotFound extends Exception{
    public productNotFound(String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}