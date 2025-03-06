import java.util.ArrayList;
import java.util.List;

public class ATM {

    private final List<Account> accountList = new ArrayList<>();


    public ATM(){
        System.out.println("oui");
    }

/*
    public void get_account_list(){
     for(Account account : accountList){
         System.out.println("Last Name: "+account.getAccountLastName()+" , First Name: "+account.getAccountFirstName()+" , PinCode: "+account.getPincode()+" , Card Number: "+account.getCardNumber());

     }
 }
*/

    public boolean does_exist_card(String cardNumber){
        for(Account account:accountList){
            if(account.getCardNumber().equals(cardNumber)){
                return(true);
            }
        }
        return(false);

    }

    public boolean does_exist_name(String firstName, String lastName){
        for(Account account:accountList){
            if(account.getAccountFirstName().equals(firstName) && account.getAccountLastName().equals(lastName)){
                return(true);
            }
        }
        return(false);

    }

    public Account get_account_by_name(String firstName, String lastName) throws Exception {
        for(Account account:accountList){
            if(account.getAccountFirstName().equals(firstName) && account.getAccountLastName().equals(lastName)){
                return(account);
            }
        }
        throw new Exception("This account does not exist.");
    }

    public Account get_account_by_card(String cardNumber) throws Exception {
        for(Account account:accountList){
            if(account.getCardNumber().equals(cardNumber)){
                return(account);
            }
        }
        throw new Exception("This account does not exist.");
    }



    public void create_account(Account account){
        this.accountList.add(account);
        System.out.println("\nYour pincode is "+account.getPincode());
        System.out.println("Your card number is "+account.getCardNumber()+"\n");

    }

    public boolean login(String lastName, String firstName, String pincode) throws Exception {
        return get_account_by_name(firstName, lastName).getPincode().equals(pincode);
    }




}