class Solution {
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        
    char[] arr = answerKey.toCharArray();
    int c = 0;
    int st = 0;
    int ans = 0;

    for(int i=0; i<arr.length; i++)
    {
        if(arr[i]=='F'){
            c++;
        }
        while(c>k)
        {
            if(arr[st]=='F')
            {
                c--;
            }
            st++;
        }
        ans = Math.max(ans,i-st+1);
    }

    c=0;
    st=0;

    for(int i=0; i<arr.length; i++)
    {
        if(arr[i]=='T'){
            c++;
        }
        while(c>k)
        {
            if(arr[st]=='T')
            {
                c--;
            }
            st++;
        }
        ans = Math.max(ans,i-st+1);
    }

return ans;
    }
public static void main(String[] gg)
{
String s = "TFFT";
int k = 2;
System.out.print(Solution.maxConsecutiveAnswers(s,k));
}
}