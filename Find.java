package ARRAY;

public class Find {
    void Find(){
        int  number[]={1,4,6,8,4};
        int x=10;
        int s=0;
        for(int i=0;i<number.length;i++){
            if(number[i]+number[number.length-1]==x){
s=number[i];
            }

        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Find d=new Find();
        d.Find();
    }
}
