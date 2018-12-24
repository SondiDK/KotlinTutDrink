package sonderegger.dk.drinklingz

import android.content.Context
import android.support.v7.app.AppCompatActivity
import sonderegger.dk.drinklingz.Enums.CardType
import sonderegger.dk.drinklingz.Model.CardDeck


class CardController():  AppCompatActivity(){

   private val cd = CardDeck()




    fun showCard(context: Context, type: CardType) {
        val dialog = DialogCard(context)
        val card = cd.getCard(type)

        dialog.buildDialog(card?.title, card?.description).show()
    }


}

