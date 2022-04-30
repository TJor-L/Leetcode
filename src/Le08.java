package src;

public class Le08 {
    public int myAtoi(String s) {
        int l=s.length();
        long x=0;
        boolean is_negative=false;
        boolean have_positive=false;
        String digit = new String();
        int start=0;
        int zest=0;
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if((start==1 || zest==1) && !Character.isDigit(c))  break;
            if((c=='-' || c=='+') && i==l-1)  break;
            if((c=='-' || c=='+') && !Character.isDigit(s.charAt(i+1)))
                break;
            if(c=='-' && start==0 && zest==0){
                is_negative=true;
            }
            else if(!Character.isDigit(c) && c!=' ' && c!='+'){
                break;
            }
            else if(c=='+')  have_positive=true;
            if(Character.isDigit(c)){
                if(c!='0')  start=1;
                if(c=='0' && start==0){
                    zest=1;
                    continue;
                }
                digit=digit+c;
            }
        }
        l=digit.length();
        //System.out.println(digit);
        for(int i=0;i<l;i++){
            int a=(int)digit.charAt(i)-(int)'0';
            long p=x*10+a;
            //System.out.println(p);
            if((long)(x*10+a)>2147483647){
                //System.out.println("yes")
                x=2147483647;
                if(is_negative)  x++;
                break;
            }
            x=x*10+a;
            //System.out.println(x);
        }
        if(is_negative && have_positive)  return 0;
        if(is_negative)  return -(int)x;
        return (int)x;
    }
    public static void main(String[] args){
        Le08 test=new Le08();
        System.out.println(test.myAtoi("+"));
    }
}
