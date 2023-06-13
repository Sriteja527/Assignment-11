import java.util.*;
public class Root {
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter the non-negative integer:");
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            for(int j=1;j<n;j++){
                if(i*j == n){
                    System.out.println("The Square root of"+n+"is" +i);
                    break;
                }
            }
            break;
        }
    }
    public static void main(String[] args){
        Root r = new Root();
        r.input();
    }
}