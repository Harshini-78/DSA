
import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        insertionsort in=new insertionsort();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the arrays values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sortedarr=new int[n];
        sortedarr=in.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(sortedarr[i]+" ");
        }
    }
    public int[] sort(int[] arr){
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }
}
