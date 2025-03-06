import java.util.UUID;

public class Account {

    private String lastTransaction;
    private final String accountLastName;
    private final String accountFirstName;
    private final String pincode;
    private final String cardNumber;
    private int balance;
    private final UUID accountID;

    public Account(String accountName, String accountFirstName) {
        this.accountLastName = accountName;
        this.accountFirstName = accountFirstName;
        this.accountID = generateAccountId();
        this.cardNumber = generateCardNumber();
        this.pincode = generatePincode();
    }

    public String getCardNumber(){
        return(this.cardNumber);

    }

    public String getAccountLastName(){
        return(this.accountLastName);

    }

    public String generateCardNumber(){
        return(this.accountID.toString().substring(this.accountID.toString().length() - 12));

    }

    public String generatePincode(){
        return(this.accountID.toString().substring(0, 4));

    }

    public UUID generateAccountId(){
        return(UUID.randomUUID());
    }

    public String getPincode(){
        return(this.pincode);

    }

    public String getAccountFirstName(){
        return(this.accountFirstName);

    }

    public String getLastTransaction(){
        return(this.lastTransaction);

    }

    public UUID getAccountID(){
        return(this.accountID);

    }
    public Integer getBalance(){
        return(this.balance);

    }
    public boolean withdraw(Integer amount){
        try{
            this.balance = this.balance - amount;
            this.lastTransaction = "Withdraw $"+amount
                    +"\nOn "+java.time.LocalDateTime.now()+"\n";
            return(true);
        }catch (Exception e){
            return(false);

        }
    }
    public boolean deposit(Integer amount){
        try{
            this.balance = this.balance + amount;
            this.lastTransaction = "Deposit $"+amount
                    +"\nOn "+java.time.LocalDateTime.now()+"\n";
            return(true);
        }catch (Exception e){
            return(false);

        }
    }

    public boolean transfer(Account correspondant_account, Integer amount){
        try{
            this.balance = this.balance - amount;
            correspondant_account.balance = correspondant_account.balance + amount;
            this.lastTransaction = "Transfer $"+amount+
                    "\nTo:  "+correspondant_account.getAccountID()+
                    " ("+correspondant_account.getAccountLastName()+" "+correspondant_account.getAccountLastName()+")"+
                    "\nOn "+java.time.LocalDateTime.now()+"\n";
            return(true);
        }catch (Exception e){
            return(false);

        }
    }

}
