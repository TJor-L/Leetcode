package src;

public class Le07 {
    public int reverse(int x) {
        long ans=0;
        int flag=0;
        if(x<0){
            x=-x;
            flag=1;
        }
        long n=1;
        while(true){
            if(n*10>x && n<=x){
                break;
            }
            n=n*10;
        }
        while(x>=1){
            int now=x%10;
            ans+=n*now;
            x=x/10;
            n=n/10;
        }
        if(ans>2147483647)  return 0;
        if(flag==1)  return -(int)ans;
        return (int)ans;
    }
    public static void main(String[] args) {
        Le07 test = new Le07();
        System.out.println(test.reverse(83629));
    }
}
