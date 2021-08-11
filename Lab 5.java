import java.util.*;

class MyInteger {
    private int n;

    public MyInteger() {}

    public MyInteger(int n) {
        this.n = n;
    }

    public int getInteger() {
        return this.n;
    }

    public void setInteger(int n) {
        this.n = n;
    }
}


public class revision5 {
    private static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);
    
    public static void getTwoInteger(MyInteger m, MyInteger n) {
        m.setInteger(rand.nextInt(10));
        n.setInteger(rand.nextInt(10));
    }

    public static char getOperator() {
        String ops = "+-*";
        return ops.charAt(rand.nextInt(3));
    }

    public static boolean checkAnswer(int x, int y, char oper, int answer) {
        int actualAns = 0;

        switch (oper) {
            case '+':
                actualAns = x + y;
                break;

            case '-':
                actualAns = x - y;
                break;
            
            case '*':
                actualAns = x * y;
                break;
        }

        if (answer != actualAns) {
            System.out.println("Wrong answer\n");
            return false;
        }
        System.out.println("Correct answer\n");
        return true;
    }

    public static void main(String[] args) {
        int maxScore = 5;

        System.out.println("Welcome to CSIT 111 Arithmetic World");
        System.out.println("You will solve 5 difficult arithmetic\n");
        
        MyInteger m = new MyInteger();
        MyInteger n = new MyInteger();


        for (int i = 1; i < 6; i++) {
            char operator = getOperator();
            getTwoInteger(m, n);
            
            System.out.printf("Question %d: %d %s %d = ?%nYour answer: ", i, m.getInteger(), operator, n.getInteger());
        
            int userAnswer = input.nextInt();

            if (!checkAnswer(m.getInteger(), n.getInteger(), operator, userAnswer)) {
                maxScore--;
            }
        }

        if (maxScore <= 2) {
            System.out.printf("Your score %d / 5, hope you can score full mark next time", maxScore);
        }else {
            System.out.printf("Your score %d / 5, well done", maxScore);
        }
        
    }
}