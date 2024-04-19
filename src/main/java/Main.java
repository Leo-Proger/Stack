public class Main {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(0);
        s1.push(1);
        s1.push(222);

        var node = s1.pop();
        System.out.println(s1.toString());
        System.out.println(node);
    }
}
