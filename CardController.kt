package sonderegger.dk.drinklingz

import android.content.Context
import android.support.v7.app.AppCompatActivity
import sonderegger.dk.drinklingz.Enums.CardType
import sonderegger.dk.drinklingz.Model.CardDeck


class CardController():  AppCompatActivity(){

    val cd = CardDeck()




    fun confirmFireMissiles(context: Context) {
        val dialog = DialogCard(context)

       val card = cd.getCard(CardType.DRINK)

        dialog.buildDialog(card.description).show()
    }


}

