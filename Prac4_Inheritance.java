class BankAccount {

    void deposit() {
        System.out.println("money deposited");
    }

    void withdraw() {
        System.out.println("money withdrawn");
    }
}

class SavingsAccount extends BankAccount {

    void interest() {
        System.out.println("interest added");
    }
}

public class Main {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.deposit();
        s.withdraw();
        s.interest();
    }
}
