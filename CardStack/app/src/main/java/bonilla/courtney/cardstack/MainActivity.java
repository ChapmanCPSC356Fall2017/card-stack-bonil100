package bonilla.courtney.cardstack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    TextView text_up_left, text_low_right;
    ImageView suit_left, suit_center, suit_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the view to the frame ace layout I made
        setContentView(R.layout.frame_layout_ace);

        text_up_left = (TextView) findViewById(R.id.text_top_left);
        text_low_right = (TextView) findViewById(R.id.text_bottom_right);
        suit_left = (ImageView) findViewById(R.id.heart_top_left);
        suit_center = (ImageView) findViewById(R.id.heart_center);
        suit_right = (ImageView) findViewById(R.id.heart_bottom_right);


        //make the whole frame layout clickable--> xml is set clickable to true
        FrameLayout fl = (FrameLayout)findViewById(R.id.frame_layout);
        fl.setOnClickListener (new View.OnClickListener() {
            //when the frame is clicked, want a different card to "pop" up
            public void onClick(View v) {

                //make a new stack
                Stack<Card> cards = new Stack<>();
                Collections.shuffle(cards);


                //randomize the stack


                //create 52 card objects from class Card
                Card c1 = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
                Card c2 = new Card(Card.Rank.TWO, Card.Suit.HEARTS);
                Card c3 = new Card(Card.Rank.THREE, Card.Suit.HEARTS);
                Card c4 = new Card(Card.Rank.FOUR, Card.Suit.HEARTS);
                Card c5 = new Card(Card.Rank.FIVE, Card.Suit.HEARTS);
                Card c6 = new Card(Card.Rank.SIX, Card.Suit.HEARTS);
                Card c7 = new Card(Card.Rank.SEVEN, Card.Suit.HEARTS);
                Card c8 = new Card(Card.Rank.EIGHT, Card.Suit.HEARTS);
                Card c9 = new Card(Card.Rank.NINE, Card.Suit.HEARTS);
                Card c10 = new Card(Card.Rank.TEN, Card.Suit.HEARTS);
                Card c11 = new Card(Card.Rank.JACK, Card.Suit.HEARTS);
                Card c12 = new Card(Card.Rank.QUEEN, Card.Suit.HEARTS);
                Card c13 = new Card(Card.Rank.KING, Card.Suit.HEARTS);
                Card c14 = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
                Card c15 = new Card(Card.Rank.TWO, Card.Suit.DIAMONDS);
                Card c16 = new Card(Card.Rank.THREE, Card.Suit.DIAMONDS);
                Card c17 = new Card(Card.Rank.FOUR, Card.Suit.DIAMONDS);
                Card c18 = new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS);
                Card c19 = new Card(Card.Rank.SIX, Card.Suit.DIAMONDS);
                Card c20 = new Card(Card.Rank.SEVEN, Card.Suit.DIAMONDS);
                Card c21 = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
                Card c22 = new Card(Card.Rank.NINE, Card.Suit.DIAMONDS);
                Card c23 = new Card(Card.Rank.TEN, Card.Suit.DIAMONDS);
                Card c24 = new Card(Card.Rank.JACK, Card.Suit.DIAMONDS);
                Card c25 = new Card(Card.Rank.QUEEN, Card.Suit.DIAMONDS);
                Card c26 = new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
                Card c27 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
                Card c28 = new Card(Card.Rank.TWO, Card.Suit.CLUBS);
                Card c29 = new Card(Card.Rank.THREE, Card.Suit.CLUBS);
                Card c30 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
                Card c31 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
                Card c32 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
                Card c33 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
                Card c34 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
                Card c35 = new Card(Card.Rank.NINE, Card.Suit.CLUBS);
                Card c36 = new Card(Card.Rank.TEN, Card.Suit.CLUBS);
                Card c37 = new Card(Card.Rank.JACK, Card.Suit.CLUBS);
                Card c38 = new Card(Card.Rank.QUEEN, Card.Suit.CLUBS);
                Card c39 = new Card(Card.Rank.KING, Card.Suit.CLUBS);
                Card c40 = new Card(Card.Rank.ACE, Card.Suit.SPADES);
                Card c41 = new Card(Card.Rank.TWO, Card.Suit.SPADES);
                Card c42 = new Card(Card.Rank.THREE, Card.Suit.SPADES);
                Card c43 = new Card(Card.Rank.FOUR, Card.Suit.SPADES);
                Card c44 = new Card(Card.Rank.FIVE, Card.Suit.SPADES);
                Card c45 = new Card(Card.Rank.SIX, Card.Suit.SPADES);
                Card c46 = new Card(Card.Rank.SEVEN, Card.Suit.SPADES);
                Card c47 = new Card(Card.Rank.EIGHT, Card.Suit.SPADES);
                Card c48 = new Card(Card.Rank.NINE, Card.Suit.SPADES);
                Card c49 = new Card(Card.Rank.TEN, Card.Suit.SPADES);
                Card c50 = new Card(Card.Rank.JACK, Card.Suit.SPADES);
                Card c51 = new Card(Card.Rank.QUEEN, Card.Suit.SPADES);
                Card c52 = new Card(Card.Rank.KING, Card.Suit.SPADES);


                //push all 52 cards on the stack
                cards.push(c1);
                cards.push(c2);
                cards.push(c3);
                cards.push(c4);
                cards.push(c5);
                cards.push(c6);
                cards.push(c7);
                cards.push(c8);
                cards.push(c9);
                cards.push(c10);
                cards.push(c11);
                cards.push(c12);
                cards.push(c13);
                cards.push(c14);
                cards.push(c15);
                cards.push(c16);
                cards.push(c17);
                cards.push(c18);
                cards.push(c19);
                cards.push(c20);
                cards.push(c21);
                cards.push(c22);
                cards.push(c23);
                cards.push(c24);
                cards.push(c25);
                cards.push(c26);
                cards.push(c27);
                cards.push(c28);
                cards.push(c29);
                cards.push(c30);
                cards.push(c31);
                cards.push(c32);
                cards.push(c33);
                cards.push(c34);
                cards.push(c35);
                cards.push(c36);
                cards.push(c37);
                cards.push(c38);
                cards.push(c39);
                cards.push(c40);
                cards.push(c41);
                cards.push(c42);
                cards.push(c43);
                cards.push(c44);
                cards.push(c45);
                cards.push(c46);
                cards.push(c47);
                cards.push(c48);
                cards.push(c49);
                cards.push(c50);
                cards.push(c51);
                cards.push(c52);

                //pop the top card

                Card topCard = cards.pop();


            }

        });
    }
}