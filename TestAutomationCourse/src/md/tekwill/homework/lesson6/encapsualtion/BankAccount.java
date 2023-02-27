package md.tekwill.homework.lesson6.encapsualtion;

public class BankAccount {

    private String accountNumber;
    private float balance;
    private String ownerName;
    private static final String BANK_IBAN_NUMBER = "MD18TRGAAA11111003000000";//constanta

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public float getBalance(){
        return this.balance;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public String getOwnerName(){
        return this.ownerName;
    }




}
