import java.util.Scanner;

class divisors{
    public int fun(int n){
        for(int i=1;i<n;i++){
            if(n%i==0){
               System.out.println(i);
            }
        }
        return 0;
    }
    public static void main(String[] args){
        divisors d=new divisors();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        d.fun(n);
    }
}