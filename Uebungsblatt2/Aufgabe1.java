public class Factorial {

     public static void main(String []args){
        System.out.println(binomialkoeffizient());
     }
     
     public static long factorial(int n){
         if (n <= 1) {
             return 1;
         } else {
             return n*factorial(n-1);
         }
     }
     
     public static long binomial(long n, long k){
         if (n < 0 || k < 0) {
             // error
         }
         if (n>=k) {
             return factorial(n)/factorial(k)*factorial(n-k);
         } else {
             return 0;
         }
     }
     
     public static long Lotto(long n, long k){
        return binomial(n, k) * factorial(k);
     }
     
}

