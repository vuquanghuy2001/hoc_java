package ss5;

public class ex8 {
    public static void main(String[] args) {
        int num=1;
        boolean flag=false;
        for(; !flag;num++){
            System.out.println("value of num:" +num);
            if (num==5){
                flag=true;
            }
        }
    }
}
