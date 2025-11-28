import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        selectionsort s=new selectionsort();
        System.out.println("Enter n value");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values of array upto length");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sortedarr=new int[n];
        sortedarr=s.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(sortedarr[i]+" ");
        }
    }
    public int[] sort(int[] arr){
        int n=arr.length;
        int temp=0;
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
        return arr;
    }
}
