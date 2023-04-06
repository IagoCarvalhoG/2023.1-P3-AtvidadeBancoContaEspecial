package BankSystem;
import BankUser.User;
import java.util.ArrayList;
public class UsersList {
    private static ArrayList<User> userList = new ArrayList<>();

    public static void addUserToList(User user){
        userList.add(user);
    }
    public static User findUser (int accountNumber){
        for(int i=0; i<userList.size();i++){
            if(userList.get(i).getAccountNumner() == accountNumber){
                return userList.get(i);
            }
        }
        System.out.println("Não foi encontrado usuário nesta conta");
        return null;
    }
}
