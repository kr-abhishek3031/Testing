package exceptionHandling;

public class robot {
    private int yC;
    private int xC;
    robot (){
        this.yC = 0;
        this.xC = 0;
    }
    public void updateY(int displacement){
        this.yC += displacement;
    }
    public void updateX(int displacement){
        this.xC += displacement;
    }
    public int getyC(){return this.yC;}
    public int getxC(){return this.xC;}
    public void setyC(int init){this.yC = init;}
    public void setxC(int init){this.xC = init;}
}
