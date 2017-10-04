package bonilla.courtney.cardstack;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by courtneybonilla on 10/3/17.
 */

public class Card {

    public enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

    public enum Suit {HEARTS, CLUBS, SPADES, DIAMONDS}

    private final Rank rank;
    private final Suit suit;
    public Card(Rank rank, Suit suit)
    {
        this.rank =rank;
        this.suit =suit;
    }

    public Rank rank()
    {
        return rank;
    }
    public Suit suit()
    {
        return suit;
    }


    public void changeNum(Card.Rank rank, TextView t, TextView t2)
    {

        switch (rank){
            case ACE:
                t.setText("1");
                t2.setText("1");
                break;
            case TWO:
                t.setText("2");
                t2.setText("2");
                break;
            case THREE:
                t.setText("3");
                t2.setText("3");
                break;
            case FOUR:
                t.setText("4");
                t2.setText("4");
                break;
            case FIVE:
                t.setText("5");
                t2.setText("5");
                break;
            case SIX:
                t.setText("6");
                t2.setText("6");
                break;
            case SEVEN:
                t.setText("7");
                t2.setText("7");
                break;
            case EIGHT:
                t.setText("8");
                t2.setText("8");
                break;
            case NINE:
                t.setText("9");
                t2.setText("9");
                break;
            case TEN:
                t.setText("10");
                t2.setText("10");
                break;
            case JACK:
                t.setText("J");
                t2.setText("J");
                break;
            case QUEEN:
                t.setText("Q");
                t2.setText("Q");
                break;
            case KING:
                t.setText("K");
                t2.setText("K");
                break;


        }
    }
    public void changeSuit(Card.Suit suit, ImageView left, ImageView center, ImageView right) {

        switch (suit) {
            case HEARTS:
                left.setImageResource(R.drawable.heart);
                center.setImageResource(R.drawable.heart);
                right.setImageResource(R.drawable.heart);
                break;
            case CLUBS:
                left.setImageResource(R.drawable.black_club_suit_u2663_icon_256x256);
                center.setImageResource(R.drawable.black_club_suit_u2663_icon_256x256);
                right.setImageResource(R.drawable.black_club_suit_u2663_icon_256x256);
                break;
            case SPADES:
                left.setImageResource(R.drawable.spades);
                center.setImageResource(R.drawable.spades);
                right.setImageResource(R.drawable.spades);
                break;
            case DIAMONDS:
                left.setImageResource(R.drawable.diamond);
                center.setImageResource(R.drawable.diamond);
                right.setImageResource(R.drawable.diamond);
                break;
        }
    }



}
