package sonderegger.dk.drinklingz

import sonderegger.dk.drinklingz.Model.PlayerManager

/**
 * Created by Oliver on 07-10-2018.
 */


fun main(args : Array<String>) {
    val pm = PlayerManager()

    pm.addPlayer("finn")
    pm.addPlayer("jens")
    pm.addPlayer("kim")

    for ( name in pm.playerList ){
        println(name)
    }
    println("-------start game----------")
    pm.startGame()
    println(pm.currentPlayer)

    println("-------switch turn----------")
    pm.switchTurn()
    println(pm.currentPlayer?.name)

    println("-------switch turn----------")
    pm.switchTurn()
    println(pm.currentPlayer)

    println("-------switch turn----------")
    pm.switchTurn()
    println(pm.currentPlayer)

}