import java.util.*;
class Solution
{
public static int[] function(int[] arr)
{
int n = arr.length;

int[] left = new int[n];
int[] right = new int[n];
int[] prod = new int[n];

left[0]=1;
right[n-1]=1;

for(int i=1;i<n;i++)
{
left[i]=arr[i-1]*left[i-1];
}

for(int j=n-2;j>=0;j--)
{
right[j]=right[j+1]*arr[j+1];
}

for(int k=0; k<n; k++)
{
prod[k]=left[k]*right[k];
}
return prod;
}
public static void main(String[] gg)
{
int[] nums = new int[]{10,3,5,6,2};
int[] res = function(nums);
System.out.println(Arrays.toString(res));
}
}