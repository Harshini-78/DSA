
import java.util.Scanner;

public class seiveofero {
    public static void main(String[] args) {
        seiveofero s=new seiveofero();
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(s.func(n));
    }
    public int func(int n){
        int[] prime=new int[n+1];
        for(int i=2;i<=n;i++){
            prime[i]=1;
        }
        for(int i=2;i*i<=n;i++){
            if(prime[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=0;
                }
            }
        }
        for(int i=2;i<=n;i++){
        if(prime[i]==1) {
            System.out.println(i);
        }
    }
    return 0;
    }
}
