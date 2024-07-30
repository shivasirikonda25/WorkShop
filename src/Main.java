import java.util.*;
public class Main {
    public static int triplets(int[] arr)
    {
        Arrays.sort(arr);
        int n=arr.length;
        Set<String> s=new HashSet<>();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int x=i+1;
            int y=n-1;
            int sum=-1*arr[i];
            while(x<y)
            {
                int s1=arr[x]+arr[y];
                if(s1<sum)
                {
                    x++;
                }
                else if(s1>sum)
                {
                    y--;
                }
                else {
                    cnt++;
                    int[] a={sum,arr[x],arr[y]};
                    Arrays.sort(a);
                    String str1="";
                    for(int c=0;c<3;c++) str1=str1+""+a[c];
                    s.add(str1);
                    x++;
                    y--;
                }
            }

        }
        return cnt;

    }
    public static int longest(int[] arr)
    {
       int n=arr.length;
       int cnt=0;
       int max=0;
       for(int i=0;i<n;i++)
       {
           if(i==0)
           {
               cnt=1;
           }
           else if(arr[i]-arr[i-1]==1)
           {
               cnt++;
           }
           else {
               max=Math.max(max,cnt);
               cnt=1;
           }
       }
       max=Math.max(max,cnt);
       return max;
    }
    public static void main(String[] args)
    {
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int[] a=new int[n];
             for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int res=triplets(a);
         System.out.println(res+" "+longest(a));

    }
}