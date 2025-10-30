public class MainL5 {

    public static void main(String[] args) {
        MyStackL5 newStack = new MyStackL5();

        newStack.push(21);
        newStack.push(12);
        newStack.push(76);
        newStack.push(43);
        newStack.push(89);

        newStack.pop();

        System.out.println(newStack.head.data);
    }

}
