package Q1;
import java.util.HashMap;
import java.util.Scanner;

public class Atm {
    private double availableAmountInMachine;
    User user;
    HashMap<Integer, Integer> userData = new HashMap<>();

    public Atm(User user) {
        this.user = user;
        userData.put(user.getBankAccountNumber(), user.getPassword());
    }

    public void currentLogIn(){
        System.out.println("Please input your account number to log in or register it as a new account");
        Scanner input = new Scanner(System.in);
        int bankAccountNumber = input.nextInt();
        if(userData.containsKey(bankAccountNumber)) {
            System.out.println("Please input your password");
            int password = input.nextInt();
            if(password == userData.get(bankAccountNumber)) {
                System.out.println("Successfully logged in!");
            }
            else {
                System.out.println("Forget your password? Tap 1 to retry, Tap 2 to reset your password");
                switch (input.nextInt()) {
                    case 1:
                        currentLogIn();
                        break;
                    case 2:
                        forgot();
                        break;
                }
                return;
            }
        }

        else {
            System.out.println("Register this number as a new account? \n" + bankAccountNumber +
                    "\nTap 1 to set your password, tap 2 to cancel");
            if (input.nextInt() == 1) {
                System.out.println("Reset your Password");
                int newPass = input.nextInt();
                userData.put(bankAccountNumber, newPass);
                System.out.println("Successfully registered!");
            }
        }
        operations();
    }

    public void forgot() {
        System.out.println("Please enter your name");
        Scanner s = new Scanner(System.in);
        String nameIn = s.nextLine();
        System.out.println("Please enter your age");
        int ageIn = s.nextInt();
        System.out.println("Please enter your Phone number");
        int phoneIn = s.nextInt();
        if(nameIn.equals(user.getName()) && ageIn == user.getAge() && phoneIn == user.getPhoneNumber()) {
            System.out.println("Please enter your new password");
            int newPass = s.nextInt();
            userData.put(user.getBankAccountNumber(), newPass);
            System.out.println("Your password reset successfully!");
            currentLogIn();
        }
        System.out.println("Incorrect information!");
    }

    public void operations() {
        Scanner option = new Scanner(System.in);
        System.out.println("Please select a option: \n " +
                "Tap 1 to check your available account balance \n" +
                "Tap 2 to withdrawal  \n" +
                "Tap 3 to deposit \n" +
                "Tap 4 to check your last 10 transactions \n" +
                "Tap 5 to change your password\n" +
                "Tap 6 to exit");
        switch(option.nextInt()) {
            case 1:
                availableBalance();
                break;
            case 2:
                withdrawal();
                break;
            case 3:
                deposit();
                break;
            case 4:
                recentTransactions();
                break;
            case 5:
                changePassword();
                break;
            case 6:
                return;
        }
    }

    public double availableBalance() {
        return user.getAvailableBalance();
    }

    public double withdrawal() {
        Scanner s = new Scanner(System.in);
        double amount = s.nextDouble();
        if(amount < user.getAvailableBalance() && amount < availableAmountInMachine) {
            user.setAvailableBalance(- amount);
            double transactionFee = setTransactionFee(amount);
            availableAmountInMachine -= amount;
            availableAmountInMachine += transactionFee;
        }

        user.transactions.put("withdrawal", amount);
        return user.getAvailableBalance();
    }

    public double deposit() {
        Scanner s = new Scanner(System.in);
        double amount = s.nextDouble();
        double transactionFee = setTransactionFee(amount);
        user.setAvailableBalance(amount - transactionFee);
        availableAmountInMachine += amount;
        availableAmountInMachine += transactionFee;

        user.transactions.put("deposit", amount);
        return user.getAvailableBalance();
    }

    public void recentTransactions() {
        user.print();
    }

    public void changePassword() {
        forgot();
    }

    public double setTransactionFee(double transaction) {
        return transaction * 0.02;
    }

}