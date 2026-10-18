       Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i)  == '(') {
                st.push(s.charAt(i));
            }

            if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i)  == ')') {
                st.pop();

                if (st.pop()==s.charAt(i)) {
                    return true;
                }
            }

        }