package temp;


import java.util.Date;

public interface Account {
	
    String getAccountNumber();
    void setAccountNumber(String accountNumber);

    Date getDateOfOpening();
    void setDateOfOpening(Date dateOfOpening);

    String getStatus();
    void setStatus(String status);

    double getBalance();
    void setBalance(double balance);

    EnumAccountType getAccountType();
    void setAccountType(EnumAccountType accountType);
    
    // 
    default String accountInfo() {
        return "Account [accountNumber=" + getAccountNumber() + ", dateOfOpening=" + getDateOfOpening() + ", status=" + getStatus()
                + ", balance=" + getBalance() + ", accountType=" + getAccountType() + "]";
    }
}
