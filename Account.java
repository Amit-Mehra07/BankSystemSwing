package JavaProject.BankSystemSwing.src;

import java.util.Date;

public class Account implements Comparable{
    //variables that will initialize by specific constructor
   //this is a class variable, & it's shareable between all the classes.
static int nextAccountNumber = 10001;
int accountNumber;
String owner;
City city;
char gender;
double balance;
Date openDate;

    //an empty constructor
    public Account() {
    }

     //constructor to create a new account holder, it will ask
    //name, city and gender from the user.
    public Account(String owner, City city, char gender) {
        //initialized account number for first customer
        accountNumber = nextAccountNumber;
        nextAccountNumber+= 1;

        this.owner = owner;
        this.city = city;
        this.gender = gender;
        balance = 0.0;//initially balance is 0.0 until the details of the user save
        openDate = null;//System.currentDate();
    }

    //this constructor will invoke when holder modifies their balance
    public Account(int accountNumber, String owner, City city, char gender, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.city = city;
        this.gender = gender;
        setBalance(balance);
    }

    //setter method for balance
    public void  setBalance(double b) {
     //It checks if b is greater than zero,
    //put balance equal to b, otherwise balance equal to 0.0
        balance = b > 0.0 ? b: 0.0;
    }

    //here we overriding our toString() method
    @Override
    public String toString() {
        return "(" + accountNumber + ")" +
                ": " + owner +
                "[" + gender + "]"+
                ", " + city.cityName +
                " Amt. " + balance;
    }

    @Override
    public int compareTo(Object o) {
        //I'm casting this and comparing the owner,
        //to the owner account with the account number
        //that we have passed it to see that the comparison.
        return this.owner.compareTo(((Account) o).owner);
    }

    //when holder wants to credit money into their account
    public void deposit(double amount){
        if (amount > 0){
            setBalance(balance + amount);
        }
    }
    //when holder wants to debit money from their account
    public void withdraw(double amount){
        if(amount > 0){
            if(amount <= balance){
                setBalance(balance - amount);
            }
            else {
                setBalance(balance);
            }
        }
    }
}
