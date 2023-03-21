package Version_IAccountable;



public interface IAccount {
	
    public String getAccountNumber();
    void setAccountNumber(String accountNumber);

    public Version_IAccountable.Date getDateOfOpening();
    void setDateOfOpening(Date dateOfOpening);

    public String getStatus();
    void setStatus(EnumStatus active);

    public double getBalance();
    void setBalance(double balance);

    
    // 
    default String accountInfo() {
        return "Account [accountNumber=" + getAccountNumber() + ", dateOfOpening=" + getDateOfOpening() + ", status=" + getStatus()
                + ", balance=" + getBalance() + "]";
    }
}
