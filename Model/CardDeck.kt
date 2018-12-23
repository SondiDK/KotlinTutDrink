package sonderegger.dk.drinklingz.Model

import sonderegger.dk.drinklingz.Enums.CardType
import java.util.*

class CardDeck() {

    var drinkCards: MutableList<Card> = mutableListOf<Card>()
    var gameCards: MutableList<Card> = mutableListOf<Card>()
    var challengeCards: MutableList<Card> = mutableListOf<Card>()

    init {
      this.fillDecks()
    }

    fun fillDecks() {

        for (i in 1..3) {
            drinkCards.add(Card(description = i.toString(), type = CardType.DRINK))
        }

        for (i in 1..3) {
            gameCards.add(Card(description = "Buffalo", type = CardType.GAME))
        }

        for (i in 1..3) {
            challengeCards.add(Card(description = "Planken", type = CardType.CHALLENGE))
        }


    }

    fun getCard(type:CardType):Card{

        when (type){
            CardType.DRINK -> { return drinkCards[this.getRandomCardNumber(this.drinkCards)] }

            CardType.GAME -> { return gameCards[this.getRandomCardNumber(this.gameCards)] }

            CardType.CHALLENGE -> { return challengeCards[this.getRandomCardNumber(this.challengeCards)] }
            }

        }


    fun getRandomCardNumber(list: MutableList<Card>): Int{
        val size = list.size-1
        val randomInteger = (0..size).shuffled().first()
        return randomInteger
    }

}