import java.util.Scanner;

class ClassAverage{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int contador = 1;

        while(contador <= 10){
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            contador ++;            
            }                
        int averange = total /10;
        
        System.out.printf("%n Total of all 10 grades is %d%n",total);
        System.out.printf("Class averange is %d%n", averange);
    }
}
