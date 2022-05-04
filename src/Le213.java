package src;

public class Le213 {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)  return nums[0];
        int[][] f = new int[n+10][2];
        int[][] g = new int[n+10][2];
        int[] a = new int[n+10];
        int[] b = new int[n+10];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
            b[i]=nums[i];
        }
        a[0]=0;
        b[n-1]=0;
        for(int i=1;i<=n;i++){
            f[i][0]=Math.max(f[i-1][0],f[i-1][1]);
            f[i][1]=f[i-1][0]+a[i-1];
        }
        for(int i=1;i<=n;i++){
            g[i][0]=Math.max(g[i-1][0],g[i-1][1]);
            g[i][1]=g[i-1][0]+b[i-1];
        }

        return Math.max(Math.max(g[n][1],g[n][0]),Math.max(f[n][1],f[n][0]));
    }
}
