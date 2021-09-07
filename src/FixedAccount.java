public class FixedAccount extends Account{
    public int tenureYear;
   
    FixedAccount(int ac, double bl, int tn) {
        super(ac, bl);
        this.setTenureYear(tn);
    }
    
    public void setTenureYear(int tenureYear){
        this.tenureYear=tenureYear;
    }
    
    public int getTenureYear(){
        return tenureYear;
    }
    
     void showInfo(){
         System.out.println("FixedAccount Account Number :"+super.getAccountNumber());     
         System.out.println("FixedAccount Current Balance :"+super.getBalance());
         System.out.println("FixedAccount Interest rate is :"+this.getTenureYear());
      
}
    
}
