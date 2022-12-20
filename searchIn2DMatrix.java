import java.io.*;
import java.util.*;

class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix[0].length;
        for(int i = 0;i<matrix.length;i++){
            int front = 0;
            int end = length - 1;
            while(front <= end){
                int mid = (front+end)/2;
                if(matrix[i][mid] == target) {
                    return true;
                }
                else if(matrix[i][mid] > target){
                    end-=1;
                }
                else{
                    front+=1;
                }
            }
        }
        return false;
    }

public static void main(String gg[])
{
int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
int target = 3;
boolean res = searchMatrix(matrix,target);
System.out.println(res);
}
}

// time O(NlogN)