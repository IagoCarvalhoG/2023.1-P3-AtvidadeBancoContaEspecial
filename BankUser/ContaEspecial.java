package BankUser;

public class ContaEspecial{
    protected double credit = 2000;
    protected double ammountToPay = 0;
    public void payUsingCredit(double value){
        if((this.ammountToPay + value)>this.credit){
            System.out.println("Compra não autorizada");
        }else{
            this.ammountToPay += value;
            System.out.println("Compra autorizada");
        }
    }
    public void endOfMonth(){
        System.out.println("Extrato do cartão é de " + this.ammountToPay);
        this.ammountToPay = 0;
    }
    public void withdraw(double value){
        if((this.ammountToPay + value)>this.credit){
            System.out.println("Saque não autorizado");
        }else{
            this.ammountToPay += value;
            System.out.println("Você sacou " + value);
        }
    }
    
}
