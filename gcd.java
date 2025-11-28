
import java.util.Scanner;
public class gcd {
    public int func(int n1,int n2){
        int ans=0;
      for(int i=1;i<Math.min(n1,n1);i++){
        if(n1%i==0 && n2%i==0){
           ans=i;
        }
      }
      return ans;
    }
    public static void main(String[] args){
        gcd g=new gcd();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1");
       int n1= sc.nextInt();
       System.out.println("enter num 2");
       int n2=sc.nextInt();
        
       System.out.println(g.func(n1,n2));
    }
}
