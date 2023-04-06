package BankUser;

public class ContaPupança{

    protected double savings = 0;

    public double getSavings(){
        return this.savings;
    }
    public void transferToSavings(double value){
        this.savings = this.savings + value;
        System.out.println("Sua poupança atual é de " + this.savings);
    }
    public void withdrawFromSavings(double ammountToWithdraw){
        if(this.savings < ammountToWithdraw){
            System.out.println("Not enough cash!");
        }else{
            System.out.println("Você sacou " + ammountToWithdraw);
            this.savings -= ammountToWithdraw;
        }
    }
    public void updateSavingsEndMonth(){
        this.savings += this.savings * 0.3;
        System.out.println("Valor atualizado, agora é " + this.savings);
    }
    
}
