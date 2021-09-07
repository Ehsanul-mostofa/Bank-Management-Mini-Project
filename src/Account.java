 
    abstract class Account {
    
    public int accountNumber;
    public double balance;
    
    Account(int an, double bal) {
        this.setAccountNumber(an);
        this.setBalance(bal);
    }
    
    public void setAccountNumber(int accountNumber){
      this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
       return accountNumber;  
    }
    
    public void setBalance(double balance){
    this.balance=balance;
    }
    public double getBalance(){
    return balance;
    }
      
    abstract void showInfo();

    public int getTenureYear(){
        int tr = 0;
        return tr;
    }

    public double getInterestRate(){
        int ir = 0;
        return ir;
    } 
    
}
    
   
