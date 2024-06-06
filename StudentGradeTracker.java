import java.util.*;
public class StudentGradeTracker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("Student Grades Calculator");
        System.out.println("How many grades you want to enter? ");
        int no = sc.nextInt();
        for(int i=1; i<=no; i++){
            System.out.print("Enter a student's grade[" + i + "]:");
            double grade = sc.nextDouble();
            grades.add(grade);

        }
        if(grades.isEmpty()){
            System.out.println("No grades were entered.");
        }
        else{
            double average = calcAverage(grades);
            double highest = calcHighest(grades);
            double lowest = calcLowest(grades);

            System.out.println("\nGrades View:");
            System.out.println("Average grade: "+ average);
            System.out.println("highest Grade: "+ highest);
            System.out.println("Lowest Grade: "+ lowest);
        }
    }
    public static double calcAverage(ArrayList<Double> grades){
        double sum = 0;
        for(double grade : grades){
            sum+=grade;
        }
        return sum/grades.size();

    }
    public static double calcHighest(ArrayList<Double> grades){
        double highest = Double.NEGATIVE_INFINITY;
        for(double grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }
    public static double calcLowest(ArrayList<Double> grades){
        double lowest = Double.POSITIVE_INFINITY;
        for (double grade : grades){
            if(grade < lowest ){
                lowest = grade;
            }
        }
        return lowest;
    }
 
}
