import java.util.Stack;
public class StackLearn {
    public static void main(String[] args) {
        Stack <String> animals=new Stack<>();
        animals.push("Lion");
        animals.push("dog");
        animals.push("cat");
        animals.push("cow");
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println( animals.pop());
        System.out.println(animals);
    }
}
