public class Account {
    private String id;
    private String name;
    private int balance = 0;


    public Account() {

    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int credit(int amount){
        balance += amount;
        return balance;
    }
    public int debit(int amount){
        if(amount <= balance){
            balance-= amount;
        }
        else {
            System.out.println("sorry your money is less the entered amount.. ");
        }
        return balance;
    }
    public int transferTo(Account another,int amount){
        if(amount <= balance){
            balance -= amount;
            another.credit(amount);
        }else {
            System.out.println("sorry your money is less the entered amount.. ");
        }
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
return name;
    }
public void setBalance(int balance){
       this.balance=balance;
}
public int getBalance(){
        return balance;
}

    @Override
    public String toString() {
        return "Hello to your Bank Account Here is your information: {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance= " + balance +
                '}';
    }
}