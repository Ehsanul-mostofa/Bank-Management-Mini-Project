import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Start
{

    private static int case3c2;
  
    public static void main(String[] args) throws IOException{
     
        boolean repeatProgram = true;
        
    while(repeatProgram) {
                try {
           
           
            System.out.println(" ____________________________________________________________________");
            System.out.println("|                                                                    | ");
            System.out.println("|              Which One Would You Like To Pick                      |");
            System.out.println("|              1. Employee Management                                |");
            System.out.println("|              2. Customer Management                                |");
            System.out.println("|              3. Customer Account Management                        |");
            System.out.println("|              4. Account Transactions                               |");
            System.out.println("|              5. Exit                                               |");
            System.out.println("|____________________________________________________________________|");
            
            Scanner myObj = new Scanner(System.in);
            System.out.println("Choose Any Of The Option From Above : ");
            int inputMain = myObj.nextInt();
  
            switch (inputMain) {
                
                case 1:
                 
                    System.out.println("Options For Employee Management");
                    System.out.println("1. Insert New Employee : ");       
                    System.out.println("2. Get Existing Employee by Id :");
                    System.out.println("3. Show All Employees : ");
                             
                    Scanner myObj1 = new Scanner(System.in);
                    int case1 = myObj1.nextInt();
                      
                    switch (case1) {
                        
                        case 1:
                            System.out.println("How Many New Employee Info ? ");
                            Scanner loopObject = new Scanner(System.in);
                          int loop1Size = loopObject.nextInt();
                              
                            for(int i=1;i<=loop1Size;i++){

                                File f = new File("Employee.txt");
                                f.createNewFile();
                                FileWriter EmployeeOut = new FileWriter("Employee.txt", true);
                                BufferedWriter bw = new BufferedWriter(EmployeeOut);
                                
                try (PrintWriter printOut = new PrintWriter(bw)) {
                    System.out.println("Insert New Employee : ");
                    
                    Scanner inp = new Scanner(System.in);
                    System.out.println("Enter Employee NAME : ");
                    String input1 = inp.nextLine();
                    
                    System.out.println("Enter Employee ID : ");
                    String input2 = inp.nextLine();
                    
                    System.out.println("Enter Employee Salary : ");
                    double input3 = inp.nextInt();
                    
                    Employee em = new Employee(input1, input2, input3);
                    
                    printOut.write(em.getEmpId()+ " " );
                    printOut.write(em.getName()+ " " );
                    printOut.write(String.valueOf(em.getSalary()) + " ");
                    printOut.write("\r\n");
                }
                                System.out.println("Information Stored In Database Successfully");
                            }
                            break;
                            
                        case 2:
                               Scanner  idScanner= new Scanner(System.in);
                               System.out.println("Enter Emp ID : ");
                               String  inputTakenId=idScanner.nextLine();                         
                            Scanner sc2 = null;
                          
                            try {
                                sc2 = new Scanner(new File("Employee.txt"));
                            } catch (FileNotFoundException e) {
                            }
                            while (sc2.hasNextLine()) {
                                    Scanner s2 = new Scanner(sc2.nextLine());
                                while (s2.hasNext()) {
                                    String s = s2.next();
                                    if(inputTakenId.equals(s)) {
                                        System.out.println("Employee ID : "+s);
                                        s = s2.next();
                                        System.out.println("Employee Name : "+s);
                                        s = s2.next();
                                        System.out.println("Employee Salary : "+s);
                                    }
                                }
                            }

                            
                            break;
                        case 3:
                          
                            try {
                             File readFile = new File("Employee.txt");
                try (Scanner myReader = new Scanner(readFile)) {
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                }
                           } catch (FileNotFoundException e) {
                             System.out.println("An error occurred.");
                           }
                            
                            break;
                     }
                    
                    break;
                case 2:
                    System.out.println("Options for Customer Management : ");
                    System.out.println("1. Insert New Customer : ");
                    System.out.println("2. Get Existing Customer by Id :");
                    System.out.println("3. Show All Customer : ");
                    
                    Scanner myObj2 = new Scanner(System.in);
                    int case2 = myObj2.nextInt();
                    
                    switch (case2) {
                        
                        case 1:
                             System.out.println("How Many New Customers ? ");
                            Scanner loopObject = new Scanner(System.in);
                          int loop2Size = loopObject.nextInt();
                          
                            for(int i=1;i<=loop2Size;i++){

                                File f = new File("Customer.txt");
                                f.createNewFile();
                                FileWriter CustomerOut = new FileWriter("Customer.txt", true);
                                BufferedWriter aw = new BufferedWriter(CustomerOut);
                try (PrintWriter printOut = new PrintWriter(aw)) {
                    System.out.println("Insert New Customer : ");
                    
                    Scanner cus = new Scanner(System.in);
                    System.out.println("Enter Customer NAME : ");
                    String input1 = cus.nextLine();
                    
                    System.out.println("Enter Customer ID : ");
                    int input2 = cus.nextInt();
                    
                    Customer cu = new Customer(input1, input2);
                  
                    printOut.write(cu.getNid()+ " " );
                    printOut.write(cu.getName()+ " " );
                   
                    printOut.write("\r\n");
                }
                   System.out.println("Information Stored In Database Successfully");
                                
                            }
                            break;
                            
                            case 2:
                               Scanner  idScanner= new Scanner(System.in);
                          System.out.println("Enter Cust ID : ");
                         String  inputTakenId=idScanner.nextLine();                         
                            Scanner sc2 = null;
                          
                            try {
                                sc2 = new Scanner(new File("Customer.txt"));
                            } catch (FileNotFoundException e) {
                            }
                            while (sc2.hasNextLine()) {
                                    Scanner s2 = new Scanner(sc2.nextLine());
                                while (s2.hasNext()) {
                                    String s = s2.next();
                                    if(inputTakenId.equals(s)) {
                                        System.out.println("Customer ID : "+s);
                                        s = s2.next();
                                        System.out.println("Customer Name : "+s);
                                        
                                    }
                                }
                            }

                            
                            break;
                            case 3:
                         
                            
                            try {
                             File readFile = new File("Customer.txt");
                             try (Scanner myReader = new Scanner(readFile)) {
                             while (myReader.hasNextLine()) {
                             String data = myReader.nextLine();
                             System.out.println(data);
                               }
                                  }
                           } catch (FileNotFoundException e) {
                             System.out.println("An error occurred.");
                           }
                            
                            break;
                       
                    }
                    break;
                case 3:
                    
                    System.out.println("Options for Customer Account Management:");
                    System.out.println("1. Insert New Account : ");       
                    System.out.println("2. Get Existing Account by Id :");
                    System.out.println("3. Show All Accounts : ");
                    
                    Scanner myObj3 = new Scanner(System.in);
                    int case3 = myObj3.nextInt();
                    
                    switch (case3) {
                        case 1:
                           System.out.println("Options for Account Type: ");
                    System.out.println("1. FixedAccount : ");
                    System.out.println("2. SavingsAccount :");
                    Scanner myObj4 = new Scanner(System.in);
                    int caseFixedOrSavings = myObj4.nextInt();
                    
                    switch (caseFixedOrSavings) {
                        
                        case 1:
                            System.out.println("How Many New Account Info ? ");
                            Scanner loopObject3 = new Scanner(System.in);
                          int loop1Size3 = loopObject3.nextInt();
                              
                            for(int i=1;i<=loop1Size3;i++){

                                File f = new File("Account.txt");
                                f.createNewFile();
                                FileWriter AccountOut = new FileWriter("Account.txt", true);
                                BufferedWriter cw = new BufferedWriter(AccountOut);
                                
                try (PrintWriter printOut = new PrintWriter(cw)) {
                    System.out.println("Insert New Account Info : ");
                    
                    Scanner inp = new Scanner(System.in);
                    System.out.println("Enter Account Number : ");
                    int input1 = inp.nextInt();
                    
                    System.out.println("Enter Balance : ");
                    double input2 = inp.nextDouble();
                    
                    System.out.println("Enter TenureYear : ");
                    int input3 = inp.nextInt();
                    
                    Account acc = new FixedAccount(input1, input2, input3);
                              
                    printOut.write(acc.getAccountNumber()+ " " );
                    printOut.write(acc.getBalance()+ " " );
                    printOut.write(String.valueOf(acc.getTenureYear()) + " ");
                    printOut.write("\r\n");
                    
                }
                         System.out.println("Information Stored In Database Successfully");
                            }
                            break; 
                    
                       
                            case 2:
                            System.out.println("How Many New Account Info ? ");
                            Scanner loopObject4 = new Scanner(System.in);
                          int loop1Size4 = loopObject4.nextInt();
                              
                            for(int i=1;i<=loop1Size4;i++){

                                File f = new File("Account.txt");
                                f.createNewFile();
                                FileWriter AccountOut = new FileWriter("Account.txt", true);
                                BufferedWriter cw = new BufferedWriter(AccountOut);
                                
                try (PrintWriter printOut = new PrintWriter(cw)) {
                    System.out.println("Insert New Account Info : ");
                    
                    Scanner inp = new Scanner(System.in);
                    System.out.println("Enter Account Number : ");
                    int input1 = inp.nextInt();
                    
                    System.out.println("Enter Balance : ");
                    double input2 = inp.nextDouble();
                    
                    System.out.println("Enter InterestRate : ");
                    double input3 = inp.nextDouble();
                    
                    Account acc = new SavingsAccount(input1, input2, input3);
                              
                    printOut.write(acc.getAccountNumber()+ " " );
                    printOut.write(acc.getBalance()+ " " );
                    printOut.write(String.valueOf(acc.getInterestRate()) + " ");
                    printOut.write("\r\n");
                }
                                System.out.println("Information Stored In Database Successfully");
                            }
                            break; 
                            
                    } 
                    break;
                  
                        case 2:
                            
                            
                            Scanner  idScanner= new Scanner(System.in);
                          System.out.println("Enter Account ID : ");
                         String  inputTakenId=idScanner.nextLine();                         
                            Scanner sc2 = null;
                          
                            try {
                                sc2 = new Scanner(new File("Account.txt"));
                            } catch (FileNotFoundException e) {
                            }
                            while (sc2.hasNextLine()) {
                                    Scanner s2 = new Scanner(sc2.nextLine());
                                while (s2.hasNext()) {
                                    String s = s2.next();
                                    if(inputTakenId.equals(s)) {
                                        System.out.println("Account Number is : "+s);
                                        s = s2.next();
                                        System.out.println("Account balance is : "+s);
                                        s = s2.next();
                                        System.out.println("Account special attribute : "+s);
                                        
                                    }
                                }
                            }

                            
                            break;
                     
                        case 3:
                            try {
                             File readFile = new File("Account.txt");
                          try (Scanner myReader = new Scanner(readFile)) {
                         while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                }
                           } catch (FileNotFoundException e) {
                             System.out.println("An error occurred.");
                           }
                            
                            break;
                     }
                    
                    break;
                    
                case 4:
                    System.out.println("Options for Account Transactions :");
                    System.out.println("1. Deposit Money : ");
                    System.out.println("2. Withdraw Money :");
                    System.out.println("3. Transfer Money : ");
                    
                    Scanner myObj4 = new Scanner(System.in);
                    int case4 = myObj4.nextInt();
                    
                    switch (case4) {
                        case 1:
                            System.out.println("What Is Your Account Number  ? ");
                            Scanner deposit = new Scanner(System.in);
                          int depAccNo = deposit.nextInt();
                        
                            double depAmo=0;
                          String extaBalance=null;
                          String spaAtt=null;
                          boolean checked = true;

                         File f= new File("Account.txt");        
                         File tempFile = new File("tempAccount.txt"); 
                         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
                         Scanner sc = new Scanner(f);
     
                         while(sc.hasNextLine())
                    {
                   String currentLine= sc.nextLine();
                   String[] tokens = currentLine.split(" ");
                        if(Integer.valueOf(tokens[0])==depAccNo && checked)
                   {
                              deposit.nextLine();                          
                          System.out.println("How much money do you want to deposit ?");
                            depAmo= deposit.nextDouble();
                            extaBalance = tokens[1];
                            spaAtt = tokens[2];
                             double extaBalanceDouble = parseDouble(extaBalance);
             
                              double calcWith = extaBalanceDouble+depAmo;
                               String newBal = String.valueOf(calcWith);
                            
                               currentLine = tokens[0]+" "+newBal+" "+spaAtt ;
             
            
                       checked = false;
         }
                        writer.write(currentLine + System.getProperty("line.separator"));

     }
                        writer.close(); 
                        sc.close();
                        f.delete();
                        boolean successful = tempFile.renameTo(f);
                                                    
                            break;
                  
                        case 2:
                            System.out.println("What Is Your Account Number  ? ");
                            Scanner withdraw = new Scanner(System.in);
                            int accNo = withdraw.nextInt();
                  
        double withAmo=0;
        String extBalance=null;
        String spAtt=null;
        boolean withChecked = true;

     File withF= new File("Account.txt");          
     File tempFileWith = new File("tempAccount.txt"); 
     BufferedWriter writerWith = new BufferedWriter(new FileWriter(tempFileWith));
     Scanner withSc = new Scanner(withF);
     
     while(withSc.hasNextLine())
     {
         String currentLine= withSc.nextLine();
         String[] tokens = currentLine.split(" ");
         if(Integer.valueOf(tokens[0])==accNo && withChecked)
         {
             withdraw.nextLine();                          
             System.out.println("How much money do you want to withdraw ?");
             withAmo= withdraw.nextDouble();
             extBalance = tokens[1];
             spAtt = tokens[2];
             double extBalanceDouble = parseDouble(extBalance);
             
             double calWith = extBalanceDouble-withAmo;
             String newBal = String.valueOf(calWith);
             

             if(extBalanceDouble>withAmo){
                currentLine = tokens[0]+" "+newBal+" "+spAtt ;
             }
             else{
                 System.out.println("Not sufficient balance.");
             }
             withChecked = false;
         }
         writerWith.write(currentLine + System.getProperty("line.separator"));

                   }
              writerWith.close(); 
              withSc.close();
              withF.delete();
              boolean successfulWith = tempFileWith.renameTo(withF);
                                      
                            break;
                      case 3:
                            System.out.println("What Is Your Account Number  ? ");
                            Scanner transfer = new Scanner(System.in);
                            int tranNum = transfer.nextInt();
                          
                            double traAmo=0;
                            System.out.println("How much money do you want to transfer ?");
                            traAmo= transfer.nextDouble();
                          
                        System.out.println("What Is Account Number where you want to transfer money ? ");
                        Scanner transferto = new Scanner(System.in);
                        int tranAccNo = transferto.nextInt();
                          
                          
        String extaaBalance=null;
        String spaaAtt=null;
        boolean withinChecked = true;

     File withFF= new File("Account.txt");          
     File temppFileWith = new File("tempAccount.txt");
     BufferedWriter writersWith = new BufferedWriter(new FileWriter(temppFileWith));
     Scanner withhSc = new Scanner(withFF);
    
     while(withhSc.hasNextLine())
     {
         String currentLine= withhSc.nextLine();
         String[] tokens = currentLine.split(" ");
         if(Integer.valueOf(tokens[0])==tranNum && withinChecked)
         {
             transfer.nextLine();                                       
             extaaBalance = tokens[1];
             spaaAtt = tokens[2];
             double extaaBalanceDouble = parseDouble(extaaBalance);
             
             double caalWith = extaaBalanceDouble-traAmo;
             String newwBal = String.valueOf(caalWith);
            
             if(extaaBalanceDouble>traAmo){
                currentLine = tokens[0]+" "+newwBal+" "+spaaAtt ;
             }
             else{
                 System.out.println("Not sufficient balance.");
             }
             withinChecked = false;
         }
         writersWith.write(currentLine + System.getProperty("line.separator"));

     }
     writersWith.close(); 
     withhSc.close();
     withFF.delete();
     boolean successfullWith = temppFileWith.renameTo(withFF);
     
    
                  
                          String exttaBalance=null;
                          String sppaAtt=null;
                          boolean checking = true;

     File fg= new File("Account.txt");         
     File temmpFile = new File("temmpAccount.txt"); 
     BufferedWriter writerr = new BufferedWriter(new FileWriter(temmpFile));
     Scanner scg = new Scanner(fg);
     
     while(scg.hasNextLine())
     {
         String currentLine= scg.nextLine();
         String[] tokens = currentLine.split(" ");
         if(Integer.valueOf(tokens[0])==tranAccNo && checking)
         {
                              transferto.nextLine();                          
                          
                            exttaBalance = tokens[1];
                            sppaAtt = tokens[2];
                             double exttaBalanceDouble = parseDouble(exttaBalance);
             
                              double calcsWith = exttaBalanceDouble+traAmo;
                               String newBala = String.valueOf(calcsWith);
                            
                               currentLine = tokens[0]+" "+newBala+" "+sppaAtt ;
             
            
                       checking = false;
         }
                        writerr.write(currentLine + System.getProperty("line.separator"));

     }
                        writerr.close(); 
                        scg.close();
                        fg.delete();
                        boolean successfully = temmpFile.renameTo(fg);
                                                    
                            break;        
                   
                    }
                    break;
                
                case 5:
                    
                    System.out.println("Exit");
                    repeatProgram = false;
                    
                    
                    break;
                 
     
        }
        }
        catch (IOException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    }
    

}
 