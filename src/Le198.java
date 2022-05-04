package src;

public class Le198 {
    public int rob(int[] nums) {
        int n=nums.length;
        int[][] f = new int[n+10][2];
        for(int i=1;i<=n;i++){
            f[i][0]=Math.max(f[i-1][0],f[i-1][1]);
            f[i][1]=f[i-1][0]+nums[i-1];
        }
        return Math.max(f[n][1],f[n][0]);
    }
}
