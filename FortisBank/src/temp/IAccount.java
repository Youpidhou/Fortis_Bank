package temp;



public interface IAccount {
	
    String getAccountNumber();
    void setAccountNumber(String accountNumber);

    temp.Date getDateOfOpening();
    void setDateOfOpening(Date dateOfOpening);

    String getStatus();
    void setStatus(EnumStatus active);

    double getBalance();
    void setBalance(double balance);

    
    // 
    default String accountInfo() {
        return "Account [accountNumber=" + getAccountNumber() + ", dateOfOpening=" + getDateOfOpening() + ", status=" + getStatus()
                + ", balance=" + getBalance() + "]";
    }
}
