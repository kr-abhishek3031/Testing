package JavaCourseChallenges.p1;

/*
*Write a program to find middle node of a linked list using Java.
* Use classes and reference technique do not use java collections prebuilt list classes.
 */
public class Main {
    public static AnyObject formLinkedList(int counter){
        boolean flag= false;
        AnyObject head = null;
        AnyObject previous =null;
        while(counter!=0){
            AnyObject temp = new AnyObject(counter);
            if(flag==false){
                head = temp;
                flag=true;
                previous = temp;
            }
            else{
                previous.setNext(temp);
                previous = temp;
            }
            counter--;
        }
        return head;
    }
    public static AnyObject findMiddle(AnyObject head){
        if(head ==null || head.getNext()==null ){
            return head;
        }
        AnyObject tempHead = head;
        while(tempHead!=null && tempHead.getNext()!=null){
            tempHead = tempHead.getNext().getNext();
            head = head.getNext();
        }

        return head;
    }
    public static void main(String[] args) {
        AnyObject head = formLinkedList(0);
       /*
        while(test!=null){
            System.out.println(test.getVal());
            test  = test.getNext();
        }*/
        try {
            AnyObject middleObject = findMiddle(head);
            System.out.println(middleObject.getVal());
        }
        catch (NullPointerException ex){
            System.out.println("Invalid request");
        }
    }
}
