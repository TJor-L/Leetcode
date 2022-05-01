package src;

public class Le11 {
    public int maxArea(int[] height) {
        int ans=0,n=height.length;
        int left=0,right=n-1;
        while(left<right){

            ans=Math.max(ans,Math.min(height[left],height[right])*(right-left));
            if(height[right]<height[left])
                right--;
            else
                left++;
        }
        return ans;
    }
    public static void main(String[] args){
        Le11 test = new Le11();
        int[] ar = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(test.maxArea(ar));
    }
}
