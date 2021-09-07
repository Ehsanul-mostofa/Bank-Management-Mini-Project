public class SavingsAccount extends Account {
    public double interestRate;
    
    SavingsAccount(int ac, double bl, double ir) {
        super(ac, bl);
        this.setInterestRate(ir);
    }
    
    public void setInterestRate(double interestRate){
    this.interestRate=interestRate;
    }
    
    
    public double getInterestRate(){
         return interestRate;
    } 
    
    
    
     void showInfo(){
         System.out.println("SavingsAccount Account Number :"+super.getAccountNumber());     
         System.out.println("SavingsAccount Current Balance :"+super.getBalance());
         System.out.println("SavingsAccount Interest rate is :"+this.getInterestRate());
         
}
    
}
    
    

