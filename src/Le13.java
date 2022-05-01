package src;

public class Le13 {
    public int romanToInt(String s) {
        int l=s.length(),ans=0;
        for(int i=0;i<l;i++){
            char c=s.charAt(i),nxt='\0';
            if(i!=l-1) nxt=s.charAt(i+1);
            if(c=='I'){
                if(nxt=='V' || nxt=='X')  ans--;
                else  ans++;
            }
            if(c=='V')  ans+=5;
            if(c=='X'){
                if(nxt=='L' || nxt=='C')  ans-=10;
                else  ans+=10;
            }
            if(c=='L')  ans+=50;
            if(c=='C'){
                if(nxt=='D' || nxt=='M')  ans-=100;
                else  ans+=100;
            }
            if(c=='D')  ans+=500;
            if(c=='M')  ans+=1000;
        }
        return ans;
    }
    public static void main(String[] args){
        Le13 test = new Le13();
        System.out.println(test.romanToInt("LVIII"));
    }
}
