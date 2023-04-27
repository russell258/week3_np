package sg.edu.nus.iss;

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

       // call search()

       // if found

       // if not found

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

    public CashCard Search(List<CashCard> cardList, String targetId){
        for (CashCard card: cardList){
            if (targetId.equals(card.getId())){
                return card;
            }else{
                return null;
            }
        }
    }

}
