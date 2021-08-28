package JavaCourseChallenges.p1;

public class AnyObject {
    private int val;
    private AnyObject next = null;

    public AnyObject(){}
    public AnyObject(int val){
        this.val = val;
    }
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public AnyObject getNext() {
        return next;
    }

    public void setNext(AnyObject next) {
        this.next = next;
    }


}
