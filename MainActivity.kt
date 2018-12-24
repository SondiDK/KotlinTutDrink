package sonderegger.dk.drinklingz

import android.app.AlertDialog
import android.app.FragmentManager
import android.content.ClipData
import android.content.ClipDescription
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.DragEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_dialog.view.*
import sonderegger.dk.drinklingz.Enums.CardType

class MainActivity : AppCompatActivity(), View.OnDragListener, View.OnTouchListener {

    val cardDeck = CardController()

    private lateinit var drinkCard: ImageView
    private lateinit var gameCard: ImageView
    private lateinit var challengeCard: ImageView
    private lateinit var type: CardType

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        droPlace.setBackgroundColor(Color.BLUE)

        //listerners on card
        drinkCard = findViewById(R.id.drinkCard) as ImageView
        gameCard = findViewById(R.id.gameCard) as ImageView
        challengeCard = findViewById(R.id.challengeCard) as ImageView

        drinkCard.setOnTouchListener(this)
        gameCard.setOnTouchListener(this)
        challengeCard.setOnTouchListener(this)

        drinkCard.setOnDragListener(this)
        droPlace.setOnDragListener(this)

    }
    override fun onDrag(view: View?, event: DragEvent?): Boolean {
        val action = event?.action
        when (action) {
            DragEvent.ACTION_DRAG_STARTED -> {
            }
            DragEvent.ACTION_DRAG_EXITED -> {
                droPlace.setBackgroundColor(Color.BLUE)
            }
            DragEvent.ACTION_DRAG_ENTERED -> droPlace.setBackgroundColor(Color.GREEN)
            DragEvent.ACTION_DROP -> {
                cardDeck.showCard(this, this.type)
                return true
            }
            DragEvent.ACTION_DRAG_ENDED -> {
                droPlace.setBackgroundColor(Color.BLUE)
                return true
            }
            else -> {
            }
        }// Executed after startDrag() is called.
        return true
    }
    override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
        var shadow: View.DragShadowBuilder? = null

        when (view) {
            drinkCard-> {   shadow = View.DragShadowBuilder(drinkCard)
                type = CardType.DRINK
            }
            gameCard -> { shadow = View.DragShadowBuilder(gameCard)
                type = CardType.GAME
            }
            challengeCard -> {  shadow = View.DragShadowBuilder(challengeCard)
                type = CardType.CHALLENGE
            }
        }
        val data = ClipData.newPlainText("", "")
        view.startDragAndDrop(data, shadow, null, 0)
        return false
    }
    }

