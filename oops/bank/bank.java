package bank;

class Account{
    public String name;
    protected String email;
    private String password;
    //getters and setters to acess private
    public String getPassString(){
        return this.password;
    }
    public String setPassString(String pass){
        this.password = pass;
    }
}

public class bank {
    Account account1 = new Account();
    account1.name = "Sidshehria";
    account1.email = "Sidshehria@gmail.com";
    account1.password = "abcd";
    account1.setpassword("abcd");
    System.out.println(account1.getpassword()); 
    
}
