import java.util.Scanner;
public class Main {
    static ATM atm = new ATM();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome");

        String temp;
        while(true){
            System.out.println("1 - Create account");
            System.out.println("2 - Login");
            System.out.println("3 - Quit");

            temp = sc.nextLine();
            if(temp.equals("1")){

                System.out.println("Enter Last Name:");
                String name = sc.nextLine();
                System.out.println("Enter First Name:");
                String firstname = sc.nextLine();
                System.out.println("*** Processing ***");

                atm.create_account(new Account(name, firstname));

            }else if(temp.equals("2")){
                login_menu();
            }else {
                System.exit(0);
            }

            //atm.get_account_list();

        }

    }

    public static void login_menu() throws Exception {
        String temp = "";
        while(!temp.equals("6")){
            temp = "";

            System.out.println("Enter Last Name:");
            String lastName = sc.nextLine();
            System.out.println("Enter First Name:");
            String firstName = sc.nextLine();

            System.out.println("*** Checking ***");
            if(atm.does_exist_name(firstName, lastName)){
                System.out.println("Welcome, "+firstName);
                System.out.println("Enter Pincode:");
                String pincode = sc.nextLine();
                System.out.println("*** Processing ***\n");
                Account account = atm.get_account_by_name(firstName, lastName);
                System.out.println("Your Card Number = " + account.getCardNumber());
                System.out.println("Your Account ID: = " + account.getAccountID()+"\n");
                while(!temp.equals("6")) {
                    if (atm.login(lastName, firstName, pincode)) {
                        System.out.println("+Select an option_________________________________+");
                        System.out.println("| 1 - Withdraw               | 2 - Deposit        |");
                        System.out.println("| 3 - Check balance          | 4 - Transfer money |");
                        System.out.println("| 5 - Check last transaction | 6 - Log out        |");
                        System.out.println("+_________________________________________________+|");
                        System.out.print(">");
                        temp = sc.nextLine();
                        int amount;
                        switch (temp) {
                            case "1":
                                System.out.print("Enter amount to withdraw:");
                                amount = sc.nextInt();
                                sc.nextLine();
                                if (account.getBalance() >= amount) {
                                    if (account.withdraw(amount)) {
                                        System.out.println("Withdraw successful, here comes your money");
                                    } else {
                                        System.out.println("Withdraw failed, contact an assistant.");
                                    }


                                } else {
                                    System.out.println("Your account balance is too low.");
                                }

                                break;
                            case "2":
                                System.out.print("Enter amount to deposit:");
                                amount = sc.nextInt();
                                sc.nextLine();
                                if (account.deposit(amount)) {
                                    System.out.println("Deposit successful.");
                                } else {
                                    System.out.println("Deposit failed, contact an assistant.");
                                }

                                break;
                            case "3":
                                System.out.println("Balance : $" + account.getBalance());
                                break;


                            case "4":

                                temp = "";

                                System.out.println("Enter Correspondant's card number:");
                                String correspondantCardNumber = sc.nextLine();
                                System.out.println("*** Checking ***");
                                if (atm.does_exist_card(correspondantCardNumber)) {
                                    Account correspondantAccount = atm.get_account_by_card(correspondantCardNumber);
                                    System.out.print("Enter amount to transfer to "+
                                            correspondantAccount.getAccountFirstName()+" "+
                                            correspondantAccount.getAccountLastName()+" : ");
                                    amount = sc.nextInt();
                                    sc.nextLine();
                                    if (account.getBalance() >= amount) {
                                        if (account.transfer(correspondantAccount, amount)) {
                                            System.out.println("Transfer successful. Bye-Bye, money");
                                        } else {
                                            System.out.println("Transfer failed, contact an assistant.");
                                        }

                                    }else {
                                        System.out.println("Your account balance is too low.");
                                    }
                                }
                                break;

                            case "5":
                                System.out.println("Last Transaction : " + account.getLastTransaction());
                                break;

                            case "6":
                                System.out.println("Sucessfully logged out.");
                                break;
                        }

                    } else {
                        System.out.println("Wrong pincode.");
                    }
                }
            }else{
                System.out.println("This account does not exist! Create one in the main menu.");
            }


        }
    }
}
