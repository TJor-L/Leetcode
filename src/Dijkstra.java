package src;

import static java.lang.Math.min;
import java.util.Scanner;
public class Dijkstra{
    int[] value = new int[100010];
    int[] to = new int[100010];
    int[] nxt = new int[100010];
    int [] head = new int[100010];
    int total=0;
    public void adl(int a, int b, int c){
        total++;
        to[total] = b;
        value[total] = c;
        nxt[total] = head[a];
        head[a] = total;
    }
    public int[] getShortestPath(int u,int n){
      //  System.out.println("xxx");
        int[] dis = new int[100010];
        boolean[] book = new boolean[100010];
        for(int i=1;i<=n;i++)
            dis[i]=2147483647;
        dis[u]=0;
        for(int i=1;i<=n;i++){
            int start=-1;
            for(int j=1;j<=n;j++)
                if(book[j]==false && (start==-1 || dis[start]>dis[j]))
                    start=j;
            book[start]=true;
            //System.out.println(start);
            for(int e=head[start];e!=0;e=nxt[e]) {
               // System.out.println(e);
                dis[to[e]] = min(dis[to[e]], dis[start] + value[e]);
            }
        }
        return dis;
    }
    public static void main(String[] args){
        Dijkstra test = new Dijkstra();
        Scanner input = new Scanner(System.in);
        int n,m,s;
        n=input.nextInt();
        m=input.nextInt();
        s=input.nextInt();
        for(int i=1;i<=m;i++){
            int a,b,c;
            a=input.nextInt();
            b=input.nextInt();
            c=input.nextInt();
            test.adl(a,b,c);
        }
        int[] result = test.getShortestPath(s, n);
        for(int i=1;i<=n;i++)
            System.out.print(result[i]+" ");
    }
}
