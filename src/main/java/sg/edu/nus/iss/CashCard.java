package sg.edu.nus.iss;

import java.util.List;

public class CashCard {
    private String id;
    private double balance;
    

    // constructor + check for overloading

    public CashCard() {
    }

    public CashCard(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //top up
    public void TopUp(double topUpAmount){
        if (topUpAmount>0){
            this.balance+=topUpAmount;
            System.out.println(topUpAmount+" has been added. "+ this.balance + " is the new balance");
        }
    }

    //deduct

    public boolean Deduct(double deductAmount){
        boolean deducted = false;
        // set a if condition later to change the deducted depending on success
        if (deductAmount<this.balance && deductAmount>0){
            this.balance -= deductAmount;
            System.out.println(deductAmount+" has been deducted. "+ this.balance + " remaining.");

            deducted= true;
        }else{
            System.out.println("Failed to deduct: Insufficient balance or invalid entry");
        }
        return deducted;
    }




    //to let me print out and see the members later on
    @Override
    public String toString() {
        return "CashCard [id=" + id + ", balance=" + balance + "]";
    }

    static CashCard Search(List<CashCard> cardList, String targetId){
        for (CashCard card: cardList){
            if (targetId.equals(card.getId())){
                return card;
            }
        }
        return null;
    }
    

}
