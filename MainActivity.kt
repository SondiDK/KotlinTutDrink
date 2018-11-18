package sonderegger.dk.drinklingz

import android.app.AlertDialog
import android.app.FragmentManager
import android.content.ClipData
import android.content.ClipDescription
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.DragEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_dialog.view.*

class MainActivity : AppCompatActivity(), View.OnDragListener, View.OnTouchListener {

    val newFragment = DialogCard(context = this )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        droPlace.setBackgroundColor(Color.BLUE)
        drinkCard.setOnTouchListener(this)
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
                droPlace.setBackgroundColor(Color.BLACK)
                confirmFireMissiles()
                return true
            }
            DragEvent.ACTION_DRAG_ENDED -> {

                return true
            }
            else -> {
            }
        }// Executed after startDrag() is called.

        return true
    }



    override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
        var shadow: View.DragShadowBuilder? = null
        //ToDo ehhm switchcase you dumb piece of shit?
        if (view === drinkCard ) {

            shadow = View.DragShadowBuilder(drinkCard)
        }



        val data = ClipData.newPlainText("", "")

        view.startDragAndDrop(data, shadow, null, 0)
        return false
    }

    fun confirmFireMissiles() {

      newFragment.dialog().show()
        }
    }

