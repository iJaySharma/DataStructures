import java.util.*; 
class MyStack {
    private static Queue<Integer> q;

  public  MyStack() {
        q = new LinkedList<>();
    }

    public static  void push(int x) {
        q.add(x);
        for (int i = 1; i < q.size(); i++) {
            q.add(q.remove());
        }
    }

    public static int pop() {
        return q.remove();
    }

    public static int top() {
        return q.peek();
    }

    public static boolean empty() {
        return q.isEmpty();
    }
public static void main(String[] gg)
{
MyStack obj = new MyStack();
  obj.push(8);
  obj.push(9);
  int param_2 = obj.pop();
  int param_3 = obj.top();
  boolean param_4 = obj.empty();
System.out.print(param_2);
System.out.print(param_3);
System.out.print(param_4);
}
}