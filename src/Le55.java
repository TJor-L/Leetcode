package src;

public class Le55 {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxx=0;
        for(int i=0;i<n;i++){
            if(maxx<i)  return false;
            maxx=Math.max(maxx,i+nums[i]);
        }
        return true;
    }
}
