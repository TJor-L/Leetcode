package src;
/*
    这道题的题意是，给出一个字符串s和匹配串P。判断两个串是否匹配。特殊的是p串中会有. 和 *。.表示可以代替任意字符，*则是可以重复前面的字符任意次（0次也可以）
    大体上思路就是，对于p的一个*，比如说是a*，我们要搞明白这在s串中对应了究竟几个a。
    考虑递归，如果p串中出现a*，那么我们循环减去s串的所有a。
 */
public class Le10 {
    public boolean isMatch(String s, String p) {
        if(p.isEmpty())  return s.isEmpty();//如果p为空，那么s必须是空的
        if(p.length()==1)  return s.length()==1 && (p.charAt(0)=='.' || p.charAt(0)==s.charAt(0));//第一位字符进行比较
        if(p.charAt(1)!='*'){
            if(s.isEmpty())  return false;
            else return (p.charAt(0)=='.' || p.charAt(0)==s.charAt(0)) && isMatch(s.substring(1),p.substring(1));
        }
        while(!s.isEmpty() && (p.charAt(0)=='.' || p.charAt(0)==s.charAt(0))){//
            if(isMatch(s,p.substring(2)))  return true;
            s=s.substring(1);
        }
        return isMatch(s,p.substring(2));
    }
    public static void main(String[] args){
        Le10 test = new Le10();
        System.out.println(test.isMatch("aab","c*a*b"));
    }
}
