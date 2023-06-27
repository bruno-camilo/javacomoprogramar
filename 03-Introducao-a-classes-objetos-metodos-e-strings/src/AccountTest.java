// Cria e manipula um objeto Account.
import java.util.Scanner;

public class AccountTest{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        

        //adicionando um construtor na instanciação do objeto
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue" , -7.53);
                
        // saldo inicial 
        displayAccount(account1);
        displayAccount(account2);
        
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);        
        account1.deposit(depositAmount);
        
        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);// adiciona ao saldo de account2

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);
        /*
        Account account = new Account();
        System.out.printf("Initial name is: %s%n%n", account1.getName());
        
        System.out.print("Please enter the name: ");
        String name = input.nextLine();

        account1.setName(name);
        System.out.println();
        System.out.printf("Name in object myAccount %s%n", account1.getName());
        */
        input.close();
    }
    
    public static void displayAccount(Account account){
    
    System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());
    
    } 
}
