import java.util.Stack;

class reverseStack{
 
	public static void reverseStackRecu(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int topElement = st.pop();
            reverseStackRecu(st);
            insertAtBottom(st, topElement);
        }
    }

    public static void insertAtBottom(Stack<Integer> st, int item) {
        
        if (st.isEmpty()) {
            st.push(item);
        } else {
            int temp = st.pop();
            insertAtBottom(st, item);
            st.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println("Initial stack: " + st);
        reverseStackRecu(st);
        System.out.println("After reversing: " + st);
    }
}
