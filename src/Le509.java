package src;

public class Le509 {
    public int fib(int n) {
        int[] f=new int[n+10];
        f[0]=0;f[1]=1;
        for(int i=2;i<=n;i++)
            f[i]=f[i-1]+f[i-2];
        return f[n];
    }
    public static void main(String[] args){
        Le509 test = new Le509();
        System.out.println(test.fib(30));
    }
}
