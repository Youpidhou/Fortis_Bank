package bus;

public interface ITransactionnable {
    int getTransaction();
    void setTransaction(int transaction);
    String getDescription();
    void setDescription(String description);
    Date getDateTransaction();
    void setDateTransaction(Date dateTransaction);
    double getAmount();
    void setAmount(double amount);
    EnumTransactionType getTransType();
    void setTransType(EnumTransactionType transType);
}
