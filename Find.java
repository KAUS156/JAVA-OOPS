package ARRAY;

//test
//not required
public class Find {
    void Find(){
        int  number[]={1,4,6,8,9};
        int x=10;
        int s=0;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]+number[j]==x){
                    s++;
            }


            }

        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Find d=new Find();
        d.Find();
    }
}
