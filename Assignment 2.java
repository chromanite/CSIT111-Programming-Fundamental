import java.io.File;
import java.io.IOException;
import java.util.Scanner;

enum Month {
    Jan, Feb, Mar, Apr, May, Jun, 
    Jul, Aug, Sep, Oct, Nov, Dec;
}

class Date {
    private int day;
    private Month month;
    private int year;

    Date() {
        this.day = 1;
        this.month = Month.Jan;
        this.year = 2021;
    }

    Date (int day, Month month, int year) {
        setDate(day, month, year);
    }

    public int getDay() {
        return this.day;
    }

    public Month getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDate(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class HeartRates {
    private String firstName;
    private String lastName;
    private Date dob;
    private int currentYear;

    HeartRates(String firstName, String lastName, Date dob, int currentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.currentYear = currentYear;
    }

    HeartRates(HeartRates hr) {
        this.firstName = getFirstName();
        this.lastName = getlastName();
        this.dob = getDOB();
        this.currentYear = getCurrentYear();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    public Date getDOB() {
        return this.dob;
    }

    public int getCurrentYear() {
        return this.currentYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDOB(Date dob) {
        this.dob = dob;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
    
    public int getAge(){
        return getCurrentYear() - dob.getYear();
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public double getMinimumTargetHeartRate() {
        return 0.5 * getMaximumHeartRate();
    }

    public double getMaximumTargetHeartRate() {
        return 0.85 * getMaximumHeartRate();
    }
    
    public void printInfo() {
        System.out.println("Name: " + getFirstName() + ", " + getlastName());
        System.out.printf("Date of birth: %d %s %d%n", getDOB().getDay(), getDOB().getMonth(), getDOB().getYear());
        System.out.println("Current year:" + getCurrentYear());
        System.out.printf("Your age: %d years old%n", getAge());
        System.out.println("Clinic analysis, base on your age: ");
        System.out.println("\t1.Your maximum heart rate is " + getMaximumHeartRate());
        System.out.printf("\t2.Your minimum target heart rate is %.2f%n", getMinimumTargetHeartRate());
        System.out.printf("\t3.Your maximum target heart rate is %.2f%n%n", getMaximumTargetHeartRate());
    }
}

public class revision2 {
    public static void main(String[] args) throws IOException{
        
        final String PATH = "C:\\Users\\minzh\\Google Drive\\CSIT111\\Assignment\\A2\\infile.txt";

        Scanner input = new Scanner(new File(PATH));

        String firstName = input.nextLine();
        String lastName = input.nextLine();
        Date d = new Date(input.nextInt(), Month.valueOf(input.next()), input.nextInt());
        int currentYear = input.nextInt();

        HeartRates hr = new HeartRates(firstName, lastName, d, currentYear);

        input.nextLine();

        firstName = input.nextLine();
        lastName = input.nextLine();
        Date d2 = new Date(input.nextInt(), Month.valueOf(input.next()), input.nextInt());
        currentYear = input.nextInt();

        HeartRates hr2 = new HeartRates(firstName, lastName, d2, currentYear);

        hr.printInfo();
        hr2.printInfo();
    }
}
