package src;

public class Le06 {
    public String convert(String s, int numRows) {
        char[][] map=new char[1010][1010];
        if(numRows==1)  return s;
        int l=s.length();
        int i=0,j=0;
        int flag=0;
        map[0][0]=s.charAt(0);
        for(int p=1;p<l;p++){
            if(flag==0){
                i++;
                map[i][j]=s.charAt(p);
                if(i==numRows-1)
                    flag=1;
                continue;
            }
            if(flag==1){
                i--;
                j++;
                map[i][j]=s.charAt(p);
                if(i==0)
                    flag=0;
                continue;
            }
        }
        String ans = new String();
        for(int p=0;p<numRows;p++){
            for(int q=0;q<=j;q++){
                if(map[p][q]!='\0') {
                    //System.out.print(map[p][q]);
                    ans = ans + map[p][q];
                }
            }
            //System.out.print("\n");
        }
        return ans;
    }
    public static void main(String[] args) {
        Le06 test = new Le06();
        System.out.println(test.convert("ABC", 1));
    }
}
