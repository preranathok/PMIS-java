package Day5;




class BankAccount1 {
    String accountHolder;


    BankAccount1(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
    }

}

class SavingsAccount extends BankAccount1 {
    double interestRate = 4.5;


    SavingsAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest rate: " + interestRate + "%");
    }


}


