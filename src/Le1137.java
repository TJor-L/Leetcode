package src;

public class Le1137 {
    public int tribonacci(int n) {
        int[] f=new int[n+10];
        f[0]=0;f[1]=1;f[2]=1;
        for(int i=3;i<=n;i++)
            f[i]=f[i-1]+f[i-2]+f[i-3];
        return f[n];
    }
    public static void main(String[] args){
        Le1137 test = new Le1137();
        System.out.println(test.tribonacci(37));
    }
}
