package ex_20122024;
import java.util.Scanner;

public class DoctorNames {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] doctorNames = new String[5];

        // Prompt user to enter 5 doctor names
        System.out.println("Please enter the names of 5 doctors:\n");

        for (int i = 0; i<doctorNames.length; i++){

            System.out.println("DoctorName"+(i+1)+":\t");
            doctorNames[i] = sc.nextLine();
            

        }

        for (String doctorName: doctorNames)
        {
            System.out.println("doctorName=>\t"+doctorName);
            

        }
        System.out.println("Enter day number to select doctor");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println(doctorNames[1]+" will attending you!");
                break;
            case 2:
                System.out.println(doctorNames[2]+" will attending you!");
                break;
            default:
                System.out.println("You have to select a day number!");
                break;
        }

    sc.close();
    }
}
