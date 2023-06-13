import java.util.*;
public class Peek{
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("enter the size of the array element:");
        int n = sc.nextInt();
        System.out.println("enter the array elements:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<i+1;j++){
                if(arr[i] > arr[j]){
                    System.out.println("The biggest number in array is:"+arr[i]);
                }
            }
        }
    }
    public static void main(String... args){
        Peek p = new Peek();
        p.input();
    }
}