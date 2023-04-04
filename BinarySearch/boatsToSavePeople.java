import java.util.*;
class Solution {
    public static int numRescueBoats(int[] people, int limit) {
        int number = 0;
        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        while( l <= r){
            if(people[l] + people[r] <= limit)
                l++;
            r--;
            number++;
        }
        return number;
    }
public static void main(String[] gg)
{
int[] pp = new int[]{1,2,2,3};
System.out.print(numRescueBoats(pp,3));
}
}