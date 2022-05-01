package src;

public class Le14 {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int minn=2147483647;
        String ans = new String();
        for(int i=0;i<n;i++)  minn=Math.min(minn,strs[i].length());
        for(int i=1;i<=minn;i++){
            String example=strs[0].substring(0,i);
            int flag=0;
            for(int j=1;j<n;j++){
                if(!example.equals(strs[j].substring(0,i)))
                    flag=1;
            }
            //System.out.println(example);
            if(flag==0)  ans=example;
        }
        return ans;
    }
    public static void main(String[] args){
        Le14 test = new Le14();
        String[] ar = new String[]{"flower","flow","flight"};
        System.out.println(test.longestCommonPrefix(ar));
    }
}
