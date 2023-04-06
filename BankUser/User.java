package BankUser;

/**
 * User
 */
public class User {
    private String userName;
    private int accountNumber;
    private ContaPupança contaPupança;
    private ContaEspecial contaEspecial;
    public User(String userName, int accountNumber){
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.contaPupança = new ContaPupança();
        this.contaEspecial = new ContaEspecial();
    }
    public String getUserName(){
        return this.userName;
    }
    public int getAccountNumner(){
        return this.accountNumber;
    }
    public ContaPupança getContaPoupança(){
        return this.contaPupança;
    }
    public ContaEspecial getContaEspecial(){
        return this.contaEspecial;
    }
}