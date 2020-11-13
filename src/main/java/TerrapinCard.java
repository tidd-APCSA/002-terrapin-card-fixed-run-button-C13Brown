public class TerrapinCard{
  private double balance;

  public TerrapinCard(double theBalance){
    balance = theBalance;
  }

public String toString(){
  return "The card has " + balance + " dollars";
}

public void payEconomical() {
  if(balance < 2.5){
    System.out.println("Insufficient Funds");
  }
  else{
    balance = balance - (double) 2.5;
  }
}

public void payGourmet() {
if(balance < 4){
    System.out.println("Insufficient Funds");
  }
  else{
    balance-=4;
  }
}

public void loadMoney(double amount) {
  if(amount > 0){
balance += amount;
  }
if(balance > 150){
  balance = 150;
}
}

}
