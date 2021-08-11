package Aug11;

public class sorting {
    public static void main(String[] args) {
        int [] x = {1,3,4,0,10,0,8,0,7,0};
        boolean y= false;
        for (int i=0;i< x.length;i++){
            for (int j=0;j< x.length - i-1;j++){
                if(x[j] > x[j+1]){
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                    y = true;
                }
            }
            if( !y){
                break;
            }
        }
        for(int i: x){
            System.out.println(i);
        }

    }
}
