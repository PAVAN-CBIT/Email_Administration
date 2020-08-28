
public class Email
 {
  private String firstName;
  private String lastName ;
  private String password ;
  private String department ;
  private String mailboxcapacity=500; ;
  private String alternate Email  ;
  private int default password length = 10;
  private String company suffix = "kpcompany.com";
  public Email(String firstName,String lastName)
      {
         this.firstName = firstName;
         this.lasttName = lastName;
         System.out.println("Email created" +this.firstname+" "+this.lastname);
         this.department = set department();
         System.out.println("Department"+this.department);   
          this.password=random password(default password length);
          System.out.println("your password"+" "+this.password);
          email=firstname.tolowercase()+" "+lastname.tolowercase+"@"+department+company suffix;
          System.out.println("your email is"+email);
    
    




      }

  private string set department()
  {
  system.out.print("enter the department"\n1 for sales\n2 for accounts\n3");
                   scanner in = new scanner(system.in);
                   department choice =in.next int();
                   if(department choice==1)
                   {
                     return sales;
                   }
                   else if(department choice==2)
                   {
                     return devlpment;
                   }
                   else if(department choice==3)
                   {
                     return accountant;
                   }
                   else
                   {
                     return" ";
                   }
                   
                   
                   
                   
    }
                   
              
                   
                   
                   
                   private string random password(int length)
                   
                   { 
                     string passwordset="ABCDEFGHIJKLMNOP123";
                     char[]password = new char[length];
                     for(int i=0;i<length;i++)
                    {
                     int random password = (int)(math.random()*passwordSet.length());
                       password[i]=passwordSet.charAt(random);
                     }
                   
                   return new string(password);
                   }
                   
                   
                   
                   
                   
                   
                   
  
  public void setmailboxcapacity(int capacity)
                   {
                     
                     this.mailbox capacity = capacity;
                   }
                   public void setalternate Email(string alternate Email)
                   {
                   this.alternateEmail=alternateEmail;
                   
                   
                   }
                   public void change password(string password)
                   {
                     
                     this.password=password;
                   }
                   public int getmailbox capacity()
                   {
                   return mailbox capacity;
                   }
  
    public string getalternate email()
                   {
                   return alternate email;
                   }
                  
      public string get password()
                   {
                   return password;
                   }
                   
                   public string showinfo()
                   {
                   return"Name"+firstName+" "+lastName+"company email"+email+"Email capacity"+emailbox capacity+"mb"                   
                   }

                   
                   
}
