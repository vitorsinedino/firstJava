import java.util.Scanner;

class QuickStart {
    public static void main(String[] args) {
        int age = 0;
        int guess = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("im an old god, try to guess my age");
        age = (int) (Math.round(Math.random() * 100));
        while (guess != age) {
            guess = input.nextInt();
            if (guess > age) {
                System.out.println("I'm not that old !!!");
            } else if (guess < age) {
                System.out.println("I'm not young, child !!");
            }
        }
        ;
        System.out.println("Congratulations mortal !!");

    }
}