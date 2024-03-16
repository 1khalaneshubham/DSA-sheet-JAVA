import java.util.*;

public class AccessModifiers {
    public static void main(String[] args) {
        
        BankAccount myAcc = new BankAccount();
        myAcc.username = "ShubhamKhalane";
        // myAcc.password = "@123$129"; yala Access nahi karta yet nahi bahi
        myAcc.setPassword("@123$129");

    }
}

class BankAccount {

    public String username;
    private String password;

    public void setPassword(String pwd) {
        
        password = pwd;

    }

}