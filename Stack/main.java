package Stack;

public class main {

    public static void main(String[] args) {
        stack st = new stack(5);
        st.Push(10);
        st.Push(20);
        st.Push(30);
        st.Push(40);
        //st.Push(50);
        st.Display();
        System.out.println(" ");
        int pop = st.Pop();
        System.out.println("Pop "+pop);
        st.Display();

        System.out.println("----------");
        st.Peek();



    }
}
