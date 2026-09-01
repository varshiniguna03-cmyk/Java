import java.util.Scanner;

public class PersonCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if (age >= 0 && age < 13) {
            System.out.println("Child");
        } 
        else if (age >= 13 && age < 18) {
            System.out.println("Teen");
        } 
        else if (age >= 18 && age <= 40) {
            System.out.println("Major");
        } 
        else if (age >= 41 && age <= 60) {
            System.out.println("Matured");
        } 
        else if (age > 60) {
            System.out.println("Senior Citizen");
        } 
        else {
            System.out.println("Baby");
        }

        sc.close();
    }
}