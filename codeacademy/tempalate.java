public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.name);
    bankOfGods.accountOne.addFunds(5);
    bankOfGods.accountOne.getInfo();

  }

}

public class CheckingAccount{
  private String name;
  private int balance;

  public CheckingAccount(String inputName, int inputBalance){
    name = inputName;
    balance = inputBalance;
  }

  private void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }

  private void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }

  public static void main(String[] args){
    CheckingAccount myAccount =new CheckingAccount("Zeus", 100);
    System.out.println(myAccount.balance);
    myAccount.addFunds(5);
    System.out.println(myAccount.balance);
  }

}