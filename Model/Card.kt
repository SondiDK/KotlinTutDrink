package sonderegger.dk.drinklingz.Model

import android.os.Parcel
import android.os.Parcelable
import sonderegger.dk.drinklingz.Enums.CardType

/**
 * Created by Oliver on 25-09-2018.
 */
abstract class Card() {
    abstract var description: String
    abstract var title: String

}