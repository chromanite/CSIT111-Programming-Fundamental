import java.util.ArrayList;

import java.util.Random;

class Staff {
    public static int SIZE = 8;

    private String name;
    private double[] score;

    public Staff(String name) {
        this.name = name;
        this.score = new double[SIZE];
        generateScore();
    }

    public String getName() {
        return this.name;
    }

    private void generateScore(){
        Random rand = new Random();

        for (int i = 0; i < score.length; i++) {
            double rng = 0 + (10 - 0) * rand.nextDouble();
            this.score[i] = rng;
        }
    }

    private int highest() {
      int high = 0;
      
      for (int i = 0; i < score.length; i++) {
        if (score[i] > high) {
            high = i;
        }
      }

      return high;
    }

    private int lowest() {
        int low = 10;
      
        for (int i = 0; i < score.length; i++) {
          if (score[i] < low) {
            low = i;
          }
        }
        
        return low;
    }

    public double average() {
        double sum = 0;

        for (double value : score) {
            sum += value;
        }

        sum -= (score[highest() + lowest()]);
        
        return sum / (score.length - 2);
    }
 
    public void printInfo() {
        System.out.printf("%-12s", getName());

        for (double value : score) {
            System.out.printf("%-5.1f", value);
        }

        System.out.printf("%4.2f%n", average());
    }
}       


class Revision3 {

    private static String[] name = {
        "Staff 1", "Staff 2", "Staff 3", "Staff 4",
        "Staff 5", "Staff 6", "Staff 7", "Staff 8",
    };

    public static String diamond(ArrayList<Staff> alist) {
        ArrayList<Double> alistScore = new ArrayList<Double>();

        double first = 0;

        for (Staff score: alist) {
            alistScore.add(score.average());
        }

        for (Double score : alistScore) {
            if (score > first) {
                first = score;
            }
        }

        return alist.get(alistScore.indexOf(first)).getName();
    }

    public static String gold(ArrayList<Staff> alist) {
        ArrayList<Double> alistScore = new ArrayList<Double>();

        double first = 0;
        double second = 0;

        for (Staff score : alist) {
            alistScore.add(score.average());
        }

        for (Double score : alistScore) {
            if (score > first) {
                second = first;
                first = score;
            } else if (score > second) {
                second = score;
            }
        }

        return alist.get(alistScore.indexOf(second)).getName();
    }

    public static String bronze(ArrayList<Staff> alist) {
        ArrayList<Double> alistScore = new ArrayList<Double>();

        for (Staff score : alist) {
            alistScore.add(score.average());
        }

        double third = 10;

        for (Double score : alistScore) {
            if (score < third) {
                third = score;
            }
        }
        return alist.get(alistScore.indexOf(third)).getName();
    }

    public static void create(ArrayList<Staff> alist) {
        for (String value : name) {
            alist.add(new Staff(value));
        }
    }

    public static void display(ArrayList<Staff> alist) {
        System.out.printf("%-10s", "Name");

        for (int i = 1; i <= 8; i++) {
            System.out.printf("%4s%d", "S", i);
        }
        
        System.out.printf("%9s%n", "Average");

        for (Staff staff : alist) {
            staff.printInfo();
        }

        System.out.println("\nFirst is " + diamond(alist));
        System.out.println("Second is " + gold(alist));
        System.out.println("Third is " + bronze(alist));
    }

    public static void main(String[] args) {
        
        ArrayList<Staff> alist =  new ArrayList<Staff>();

        create(alist);
        display(alist);

    }
}