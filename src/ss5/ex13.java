package ss5;

public class ex13 {
    public static void main(String[] args) {

        int i;
        outer:
        for (i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Hello");
// Break out of outer loop
                break outer; }
            System.out.println("This is the outer loop.");
        }
        System.out.println("Good - Bye");
    }
}
