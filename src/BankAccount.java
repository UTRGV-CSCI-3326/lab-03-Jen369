public class BankAccount {
    public static void main(String[] args){
    //Bob initial balance
    double balance = 2175.37;

    //Bob transactions
    balance -= 302.50; //withdraws
    balance += 50.03; //deposits
    balance -= balance / 2; //withdraws half of balance
    balance += 20.00; //deposits
    balance -= 1.00; //withdraws
    balance *= 2; //deposits paycheck that doubles balance
    balance += 1.00; //deposits

    //Bob's final balance
    System.out.printf("Bob's new balance: $%.2f" , balance);
}
}
