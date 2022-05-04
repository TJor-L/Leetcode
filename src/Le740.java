package src;

public class Le740 {
    public int deleteAndEarn(int[] nums) {
        int[] a = new int[10010];
        int n=nums.length;
        for(int i=0;i<n;i++)
            a[nums[i]]+=nums[i];
        int[][] f = new int[10100][2];
        for(int i=1;i<=10000;i++){
            f[i][0]=Math.max(f[i-1][0],f[i-1][1]);
            f[i][1]=f[i-1][0]+nums[i];
        }
        return Math.max(f[10000][0],f[10000][1]);
    }
}
