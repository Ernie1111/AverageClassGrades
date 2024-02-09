import java.util.Scanner;
public class AverageClassGrades {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double gradeValues;   //all the int being used for the program.
        double gradesTotal;
        double gradesCurrent;
        double i;
        double gradeMax = 0.0;
        double gradeMin = 0.0;

        System.out.println("Getting the Average, Maximum, and Minimum of grades.");

        System.out.print("Number of grades:"); //Input of number of grades being used
        gradeValues = scnr.nextDouble();
        gradesTotal = 0;



        for(i = 0; i < gradeValues; ++i) {//for loop variable and loop expression
            System.out.print("Input Grade: %");
            gradesCurrent = scnr.nextDouble();
            gradesTotal += gradesCurrent;//used later for grade average


            if(i==0.0) {        //used to get the max grade
                gradeMax = gradesCurrent;
            }
            else if(gradesCurrent > gradeMax){
                gradeMax = gradesCurrent;
            }
            if(i==0.0) {    //used to get the minimum grade
                gradeMin = gradesCurrent;
            }
            else if (gradesCurrent < gradeMin) {
                gradeMin = gradesCurrent;
            }


        }

        System.out.println("Average Grade: %" + (Math.round(gradesTotal/gradeValues)));//grade average
        System.out.println("Max Grade: %" + gradeMax); //Grade Max
        System.out.println("Minimum Grade: %" + gradeMin); // Grade Minimum






    }
}