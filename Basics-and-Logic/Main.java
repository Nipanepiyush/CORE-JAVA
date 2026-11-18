class BankAccount {

    void interest() {
        System.out.println("Bank account interest");
    }
}

class Savings extends BankAccount {

    void interest() {
        System.out.println("Savings Account: 5% interest");
    }
}

class Current extends BankAccount {

    void interest() {
        System.out.println("Current Account: No interest");
    }
}

class Fixed extends BankAccount {

    void interest() {
        System.out.println("Fixed Account: 7% interest");
    }
}

public class Main {

    public static void main(String[] args) {

        Savings s = new Savings();
        Current c = new Current();
        Fixed f = new Fixed();

        s.interest();
        c.interest();
        f.interest();
    }
}