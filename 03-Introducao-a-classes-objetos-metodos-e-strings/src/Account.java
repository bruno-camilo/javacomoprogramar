// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.


public class Account{
    private String name;    // variável de instância 
    private double balance; // variavel de instância
    
   // public Account(){} // construtor padrão

    public Account(String name, double balance){
        this.name = name;
        
        if(balance > 0.0)   // valida se o balance é maior que 0.0 se não for
            this.balance = balance; // 

    }

    // método para definir o nome no objeto
    public String getName(){
        return this.name;
    }

    // método para recuperar o nome do objeto
    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return this.balance;        
    }
    
    public void deposit(double depositAmount){
        if (depositAmount > 0.0)
            this.balance += depositAmount;    
    }
}
