import java.util.List;

public class Main {
    public static void main(String[] args) {
        question1(15);
        question2a(5);
        question2b(5);
        question2c(5);
        question2d(5);
        questionNo3(List.of(12,9,13,6,10,4,7,2));
    }
    public static void question1(int n) {
            for (int i = 0; i <= n; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    System.out.println("OKYES");
                } else if (i % 3 == 0) {
                    System.out.println("OK");
                } else if (i % 4 == 0) {
                    System.out.println("OK");
                } else {
                    System.out.println(i);
                }
            }
        System.out.println();
    }

    public static void question2a(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void question2b(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void question2c(int n) {
        int x = 0;
        String opt = "up";
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if (x == 1) opt = "up";
                if (x == n) opt = "down";

                if (opt.equals("up")) System.out.print(++x + "");
                if (opt.equals("down")) System.out.print(--x + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void question2d(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    System.out.print((start + (n - i)) + " ");
                } else {
                    System.out.print((start + (i - 1)) + " ");
                }
                start += n;
            }
            start = 1;
            System.out.println();
        }
        System.out.println();
    }

    public static void questionNo3(List<Integer> numbers) {
        List<Integer> newNumber = numbers.stream()
                .filter(n -> n % 3 != 0)
                .sorted()
                .toList();
        System.out.println(newNumber);
        System.out.println();
    }
}