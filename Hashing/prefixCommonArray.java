import java.util.*;
class Solution {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;
        int[] C = new int[n];
      
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int count=0;
        for(int i=0; i<n; i++)
        {
            setA.add(A[i]);
            setB.add(B[i]);
            if(setB.contains(A[i]))count=count+1;
            if(setA.contains(B[i]) && A[i]!=B[i])count = count+1;
            C[i]=count;
        }
        return C;
    }
public static void main(String[] args)
{
int[] numA = new int[]{1,3,2,4};
int[] numB = new int[]{3,1,2,4};
int[] c = findThePrefixCommonArray(numA,numB);
System.out.print(Arrays.toString(c));
}
}