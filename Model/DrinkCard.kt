package sonderegger.dk.drinklingz.Model

import sonderegger.dk.drinklingz.Enums.CardType

class DrinkCard: Card() {
    override var title: String = "Drink Card"
    override var description: String = ""
    var sips: Int = 0

    init {
        this.generateSips()
        this.chooseDrinker()
}
    private fun generateSips() {
        this.sips = (2..6).shuffled().first()
    }
    private fun chooseDrinker(){
      val goodOrBad = (1..2).shuffled().first()

        if (goodOrBad == 1) {
           this.description = "You drink " + this.sips + " sips"
        } else {
            this.description = "Pick one to drink " + this.sips + " sips"
        }
    }
}