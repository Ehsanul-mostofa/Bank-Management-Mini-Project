public class Customer {
    
    private String name;
    private int nid;
    Account acc[] = new Account[5];
    
    
    Customer(String nm, int id) {
        this.setName(nm);
        this.setNid(id);
    }

    
    public void setName(String name){
      this.name=name;
    }
    public String getName(){
       return name;     
    }
    
    public void setNid(int nid){
    this.nid=nid;
    }
    public int getNid(){
    return nid;
    }
    
    
    
}
