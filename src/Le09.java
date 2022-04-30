package src;

public class Le09 {
    public boolean isPalindrome(int x) {
        if(x<0)  return false;
        String str=new String();
        while(x>0){
            int a=x%10;
            x=x/10;
            str=str+(char)(a+'0');
            //System.out.println((char)(a+'0'));
        }
        String reverse = new StringBuffer(str).reverse().toString();
       // System.out.println(reverse);
        return reverse.equals(str);
    }
    public static void main(String[] args){
        Le09 test=new Le09();
        System.out.println(test.isPalindrome(12321));
    }
}
