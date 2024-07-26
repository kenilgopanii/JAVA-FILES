import java.util.Scanner;

class Date {
    private int month, day, year;
    private Scanner sc = new Scanner(System.in);

    public Date() {
        getDate(); 
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Day is invalid");
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Month is invalid");
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getDate() {
        System.out.println("Enter the date:");
        System.out.print("Day: ");
        int d = sc.nextInt();
        setDay(d);
        System.out.print("Month: ");
        int m = sc.nextInt();
        setMonth(m);
        System.out.print("Year: ");
        int y = sc.nextInt();
        setYear(y);
    }

    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class java13{
    public static void main(String[] args) {
        Date date = new Date();
        date.displayDate(); 
    }
}