package Q1;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private String address;
    private long phoneNumber;
    private int age;
    private int bankAccountNumber;
    private int password;
    private double availableBalance;
    HashMap<String, Double> transactions = new HashMap<>();

    public User(String name, String address, int age, long phoneNumber, int bankAccountNumber, int password, double availableBalance) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.password = password;
        this.availableBalance = availableBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double amount) {
        this.availableBalance += amount;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public String print() {
        String print = "User Name" + name + "User Account Number" + bankAccountNumber + "\n";
        int count = 0;
        while(count <= transactions.size() && count <= 10) {
            for(Map.Entry<String,Double> entry : transactions.entrySet()) {
                print += entry.getKey() + ":" + entry.getValue();
                count++;
            }
        }
        return print;
    }
}

