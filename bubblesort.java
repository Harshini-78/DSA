
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        bubblesort b=new bubblesort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values of array upto length13");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sortedarr=new int[n];
        sortedarr=b.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(sortedarr[i]+" ");
        }

    }
    public int[] sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
