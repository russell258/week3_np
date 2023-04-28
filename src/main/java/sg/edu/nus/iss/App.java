package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
       List<CashCard> cardList = new ArrayList<>();

       // initialize but should static method initCardList be in App or CashCard class?
       App.initCardList(cardList);

       // Display id and balance of cashcard objects
       for (CashCard card: cardList){
        System.out.println(card.toString());
       }

       // prompt user for id to search
       Console con = System.console();
       System.out.println("Please enter an id that you would like to search for: ");
       String idSearch = con.readLine();


       // call search(), if found and not found condition
       if(CashCard.Search(cardList, idSearch)==null){
        System.out.println("Card was not found!");
       }else{
        CashCard card = CashCard.Search(cardList, idSearch);
        System.out.println(card.toString());

        //prompt user for deduct amount
        System.out.println("How much would you like to deduct?");
        double deductAmount = Double.parseDouble(con.readLine());
        card.Deduct(deductAmount);

       }


    }

    static void initCardList(List<CashCard> cardList){
        // create 5 cashcaard objects with id 1 to 5, balance 25 to 50 and add to cardlist
        CashCard card1 = new CashCard("1", 25.0);
        CashCard card2 = new CashCard("2", 25.0);
        CashCard card3 = new CashCard("3", 30.0);
        CashCard card4 = new CashCard("4", 30.0);
        CashCard card5 = new CashCard("5", 50.0);
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);   
    }



}
