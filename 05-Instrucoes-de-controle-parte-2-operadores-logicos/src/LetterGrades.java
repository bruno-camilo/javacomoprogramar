import java.util.Scanner;

public class LetterGrades{
    public static void main(String[] args){
        int total = 0;
        int gradeCounter = 0;
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;
        int fCounter = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n %s%n% s%n", "Enter the integer grades in the range 0-100.", "Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
        "On Windows type <Ctrl> z then press Enter");
        
        while(input.hashNext()){
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;
        }
    }
}
