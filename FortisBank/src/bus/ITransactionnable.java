package bus;

/**
 * 
 * @author Miguel Beauchemin
 * @author Dominic Potvin
 */
public interface ITransactionnable {
    
    // Getters and setters for transaction
    int getTransaction();
    void setTransaction(int transaction);
    
    // Getters and setters for description
    String getDescription();
    void setDescription(String description);
    
    // Getters and setters for dateTransaction
    Date getDateTransaction();
    void setDateTransaction(Date dateTransaction);
    
    // Getters and setters for amount
    double getAmount();
    void setAmount(double amount);
    
    // Getters and setters for transType
    EnumTransactionType getTransType();
    void setTransType(EnumTransactionType transType);
}
