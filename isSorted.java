import java.util.*;
public class isSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        isSorted is=new isSorted();
        System.out.println("enter the n value");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.print(is.isSorted(arr));
    }
    public boolean isSorted(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
