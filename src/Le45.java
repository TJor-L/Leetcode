package src;

public class Le45 {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] f = new int[n+10];
        for(int i=1;i<n;i++) f[i]=2147483647;
        for(int i=0;i<n;i++){
            for(int j=1;j<=nums[i];j++)
                f[i+j]=Math.min(f[i+j],f[i]+1);
        }
        return f[n-1];
    }
}
