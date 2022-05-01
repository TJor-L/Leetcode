package src;

public class Le12{
    public String intToRoman(int num) {
        int a=num/1000,b=(num/100)%10,c=(num/10)%10,d=num%10;
        String ans=new String();
        switch(a){
                case 1:  ans=ans+"M"; break;
                case 2:  ans=ans+"MM"; break;
                case 3:  ans=ans+"MMM"; break;
                case 4:  ans=ans+"MMMM"; break;
        }
        switch(b){
                case 1:  ans=ans+"C"; break;
                case 2:  ans=ans+"CC"; break;
                case 3:  ans=ans+"CCC"; break;
                case 4:  ans=ans+"CD"; break;
                case 5:  ans=ans+"D"; break;
                case 6:  ans=ans+"DC"; break;
                case 7:  ans=ans+"DCC"; break;
                case 8:  ans=ans+"DCCC"; break;
                case 9:  ans=ans+"CM"; break;
        }
        switch(c){
                case 1:  ans=ans+"X"; break;
                case 2:  ans=ans+"XX"; break;
                case 3:  ans=ans+"XXX"; break;
                case 4:  ans=ans+"XL"; break;
                case 5:  ans=ans+"L"; break;
                case 6:  ans=ans+"LX"; break;
                case 7:  ans=ans+"LXX"; break;
                case 8:  ans=ans+"LXXX"; break;
                case 9:  ans=ans+"XC"; break;
        }
        switch(d){
                case 1:  ans=ans+"I"; break;
                case 2:  ans=ans+"II"; break;
                case 3:  ans=ans+"III"; break;
                case 4:  ans=ans+"IV"; break;
                case 5:  ans=ans+"V"; break;
                case 6:  ans=ans+"VI"; break;
                case 7:  ans=ans+"VII"; break;
                case 8:  ans=ans+"VIII"; break;
                case 9:  ans=ans+"IX"; break;
        }
        return ans;
    }
    public static void main(String[] args){
        Le12 test = new Le12();
        System.out.println(test.intToRoman(1));
    }
}
