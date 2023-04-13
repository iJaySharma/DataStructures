class Solution
{
public static int function(int n)
{
int sb = 0;
int cj = 3;
int count=0;

for(int curr=0;curr<=(n-3);curr=curr + (cj-sb))
{
count++; 
}
return count;
}
public static void main(String[] gg)
{
int step =12;
System.out.print(function(step));
}
}