import java.util.*;
public class Duplicate1{
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("enter the array elements:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.println("The Repeating element is:"+arr[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        Duplicate1 d = new Duplicate1();
        d.input();
    }
}