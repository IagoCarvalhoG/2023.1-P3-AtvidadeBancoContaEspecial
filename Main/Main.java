package Main;
import java.util.Scanner;
import BankUser.User;
import BankSystem.UsersList;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int codeInterface = -1;
    public static void main(String[] args) {
        while(codeInterface !=0){
            System.out.println("1. Para adicionar usuário");
            System.out.println("2. Para logar em sua conta");
            switch(sc.nextInt()){
                case 1:
                addUser();
                break;

                case 2:
                login();
                break;

                case 0:
                System.exit(0);
                break;
            }
        }
    }
    private static void addUser(){
        System.out.println("Adicione o nome do usuário, em seguida seu número de conta para cadastro");
        User user = new User(sc.next(), sc.nextInt());
        UsersList.addUserToList(user);
        System.out.println("Deseja fazer outra operação?");
    }
    private static void login(){
        int userIndex = -1;
        System.out.println("Digite o código da conta que será usada");
        User loggedUser = UsersList.findUser(sc.nextInt());
        if(loggedUser != null){
            System.out.println("Você está logado na conta de " + loggedUser.getUserName());
            while(userIndex != 0){
                System.out.println("1. Para adicionar dinheiro na conta");
                System.out.println("2. Para retirar dinheiro da conta");
                System.out.println("0. Para deslogar da conta");
                userIndex = sc.nextInt();
                switch(userIndex){
                    case 0:
                    System.out.println("Você está deslogando da conta de " + loggedUser.getUserName());
                    loggedUser.getContaEspecial().endOfMonth();
                    loggedUser.getContaPoupança().updateSavingsEndMonth();
                    System.out.println("Sua popança atual é de " + loggedUser.getContaPoupança().getSavings());
                    break;
                    case 1:
                    userDeposit(loggedUser);
                    break;
    
                    case 2:
                    userWithdraw(loggedUser);
                    break;
                }
            }
        }
    }
    private static void userWithdraw(User user){
        System.out.println("Quanto deseja retirar");
        int value = sc.nextInt();
        System.out.println("1. Para sacar da poupança");
        System.out.println("2. Para sacar do crédito");
        int index = sc.nextInt();
        if(index == 1){
            user.getContaPoupança().withdrawFromSavings(value);
        }else if (index == 2){
            user.getContaEspecial().withdraw(value);
        }
    }
    private static void userDeposit(User user){
        System.out.println("Quanto deseja depositar");
        int value = sc.nextInt();
        user.getContaPoupança().transferToSavings(value);
    }
}
