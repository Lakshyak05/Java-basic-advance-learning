public class fibonacci1 {    public static void main(String[] args) {        System.out.println(fibo(5));    }    static int fibo(int n){        int a = 0;        int b = 1;        if(n == 0 || n ==1){            System.out.println(n);            return n;        }        return fibo(n-1) + fibo(n-2);    }}