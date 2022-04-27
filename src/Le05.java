package src;

public class Le05{
    public String longestPalindrome(String s){
        int[][] dp =new int[1010][1010];
        int l=s.length();
        int start=0, end=0;
        int ans = 0;
        for(int i=0;i<l;i++) {
            dp[i][i] = 1;
            if(1>ans){
                ans=1;
                start=i;
                end=i;
            }
            if(i==l-1)  continue;
            if (s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
                dp[i][i + 1] = 2;
                if(2>ans){
                    ans=2;
                    start=i;
                    end=i+1;
                }
            }
        }
        for(int k=1;k<l;k++){
            for(int i=1;i<=l-k-1;i++){
                if(dp[i][i+k-1]==0)  continue;
                int front=i-1, back=i+k;
                if(s.substring(front,front+1).equals(s.substring(back,back+1))){
                    dp[front][back]=dp[i][i+k-1]+2;
                    if(dp[front][back]>ans){
                        ans = dp[front][back];
                        start=front;
                        end=back;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
    public static void main(String[] args) {
        Le05 test = new Le05();
        System.out.println(test.longestPalindrome("aacabdkacaa" ));
    }
}
