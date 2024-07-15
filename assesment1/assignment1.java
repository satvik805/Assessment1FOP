
/**
 * Write a description of class assignment1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class assignment1
{
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       System.out.print("Enter name of assignment: ");
       String name = s.nextLine();
       ArrayList<Float> marks = getStudentMarks(s);//this function will input marks of each student from user
       System.out.println(name);
       System.out.println("Name of the assignment : " + name);
       System.out.println("Marks of students : " + marks);
       float[] highestlowest = computeminmax(marks); // compute highest and lowest marks out of 30 students
       System.out.println("Highest marks obtained in " + name + " is " + highestlowest[0]);
       System.out.println("Lowest marks obtained in " + name + " is " + highestlowest[1]);
       double[] meanstd = MeanStd(marks);
       System.out.println("Mean : " + meanstd[0]);
       System.out.println("Standard deviation : " + meanstd[1]);
   }
   public static ArrayList<Float> getStudentMarks(Scanner s){
       ArrayList<Float> marks = new ArrayList<>();
       for(int i = 0 ; i < 30 ; i++){
           System.out.print("Marks of student " + (i + 1) + " : ");
           float n = s.nextFloat();
           System.out.println();
           if (n >= 0 && n <= 30){
               
               marks.add(n);
               
           }else{
               System.out.println("Please enter a number between 0 and 30");
               i = i - 1;
           }
       }
       return marks; 
   }
   public static float[] computeminmax(ArrayList<Float> marks){
       
   }
   public static double[] MeanStd(ArrayList<Float> marks){
       
   }
}
