import java.util.Scanner;


public class Primecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean res=isprime(n);
        if(res){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }
    }
    public static boolean isprime(int n){
        int c = 2;
        if(n<2){
            return false;
        }
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
