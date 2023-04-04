package Modul3_Latihan_Stack;

import java.util.Stack;

public class StackLibrary {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        System.out.println(st.empty());
        st.push("aku");
        st.push("Anak");
        st.push("Republik");
        st.push("Indonesia");

    System.out.println("Next : "+st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.pop();

        int count = st.search("aku");
        while (count != -1 && count > 1){
            st.pop();
            count --;
        }
 //       System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.empty());

    }
}
