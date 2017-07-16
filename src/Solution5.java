import java.util.Stack;

public class Solution5 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length != popA.length || pushA == null || popA == null)
            return false;
        Stack<Integer> st = new Stack();
        int i = 0;
        int j = 0;
        while(i < pushA.length){
            st.push(pushA[i]);
            while(!st.isEmpty() && st.peek() == popA[j]){
                st.pop();
                j++;
            }
            i++;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] popA = {4,5,3,2,1};
        int [] popB = {4,5,3,1,2};
        System.out.println(IsPopOrder(pushA,popA));
        System.out.println(IsPopOrder(pushA,popB));

    }
}