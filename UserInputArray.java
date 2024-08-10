package ARRAY;
import java.util.Scanner;
public class UserInputArray {
    public int count(int x,int [] arr){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);

        System.out.println("enter  n number");
        int n=sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter number" + n+" element");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");

        }

        System.out.println("count is");
    }
}
