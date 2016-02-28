
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * Created by endrias on 2/28/2016.
 * */


public class UserSort {
    ArrayList<Card> cards;
    HashMap<Card,ArrayList<Card>> cardComparsions;
    displayInterface display;

    public UserSort(ArrayList<Card> cards, displayInterface display){
        this.cards = cards;
        this.display = display;
        cards = modfiedMergeSort(cards);
        display.display(cards);
    }

    private ArrayList<Card> modfiedMergeSort(ArrayList <Card> sort) {
        if(sort.size() == 0 || sort.size() ==1){
            return sort;
        }
        ArrayList<Card> leftHalf = new ArrayList<Card>();
        ArrayList<Card> rightHalf = new ArrayList<Card>();
        int leftHalfSize = sort.size()/2;
        int rightHalfSize = sort.size() - leftHalfSize;
        for(int i = 0; i< leftHalfSize; i++)
        {
            leftHalf.add(sort.get(i));
        }
        for(int i =leftHalfSize; i<sort.size(); i++){
            rightHalf.add(sort.get(i));
        }
        leftHalf = modfiedMergeSort(leftHalf);
        rightHalf = modfiedMergeSort(rightHalf);
        return combine(leftHalf,rightHalf);
    }

    private ArrayList<Card> combine(ArrayList<Card> leftHalf, ArrayList<Card> rightHalf) {
        ArrayList<Card> combined = new ArrayList<Card> ();
        int i = 0;
        int j = 0;
        Random color = new Random();
        while(i < leftHalf.size() && j <rightHalf.size()){
            Card leftCard = leftHalf.get(i);
            Card rightCard  = rightHalf.get(j);
            int red = color.nextInt(266);
            int blue = color.nextInt(266);
            int green = color.nextInt(266);
            int compare = display.compare(leftCard.index, rightCard.index);
            Color generate = new Color(red,blue,green);
            if(compare < 0 ){
                combined.add(rightCard);
                rightCard.color = generate;
                i++;
            }
            if(compare > 0 ){
                combined.add(leftCard);
                leftCard.color = generate;
            }
            if(compare == 0){
                leftCard.color = generate;
                leftCard.color = generate;
                combined.add(leftCard);
                combined.add(rightCard);
            }
        }
        return combined;
    }

}
