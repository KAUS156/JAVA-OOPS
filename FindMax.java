package ARRAY;

public class FindMax {
    void Max(){
        int arr[] = {1,3,6,8,3};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        FindMax d=new FindMax();
        d.Max();
    }
}
