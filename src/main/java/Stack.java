public class Stack {
    private StackNode top;

    public Stack() {
        top = null;
    }

    public void push(int newWeight) {
        if (top == null) {
            top = new StackNode();
            top.weight = newWeight;
            top.down = null;
            return;
        }

        StackNode tmp = top;
        top = new StackNode();
        top.weight = newWeight;
        top.down = tmp;
        return;
    }

    public int pop() {
        int oldWeight = top.weight;
        top = top.down; // if 1 el == null
        return oldWeight;
    }

    public String toString() {
        String str = "[";

        if (top != null) {
            str += top.weight;
            StackNode tmp = top;

            while (tmp.down != null) {
                tmp = tmp.down;
                str += ", " + tmp.weight;
            }
        }
        return str + "]";
    }
}
