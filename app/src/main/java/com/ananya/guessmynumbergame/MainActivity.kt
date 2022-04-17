package com.ananya.guessmynumbergame
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    private var number : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        question_text_view.text = resources.getString(R.string.first_question)
        number = 5


    }


    fun arrowDown(view: View){

        if (number == 5){
            number = 3
            question_text_view.text = resources.getString(R.string.second_question)
        }else if (number == 3){
            number = 2
            question_text_view.text = resources.getString(R.string.third_question)
        }else if(number == 2){
            number = 1
            question_text_view.text = resources.getString(R.string.fourth_question)
        }else if (number == 7){
            number = 6
            question_text_view.text = resources.getString(R.string.seventh_question)
        }else if (number == 9){
            number = 8
            question_text_view.text = resources.getString(R.string.ninth_question)
        }

    }


    fun arrowUp(view: View){
        if (number == 3){
            number = 4
            question_text_view.text = resources.getString(R.string.fifth_question)
        }else if (number == 5){
            number = 7
            question_text_view.text = resources.getString(R.string.sixth_question)
        }else if(number == 7){
            number = 9
            question_text_view.text = resources.getString(R.string.eight_question)
        }else if(number == 9){
            number = 10
            question_text_view.text = resources.getString(R.string.ten_question)
        }
    }


    fun resetGame(view: View){

        question_text_view.text = resources.getString(R.string.first_question)

        success_text_view.visibility = View.INVISIBLE

        targeted_number.visibility = View.INVISIBLE

        number = 5

        question_text_view.visibility = View.VISIBLE


    }

    fun successFunction(view: View){

        success_text_view.visibility = View.VISIBLE
        question_text_view.visibility = View.INVISIBLE
        targeted_number.visibility = View.VISIBLE


        targeted_number.text = String.format(resources.getString(R.string.target_number_text_view), number)
    }
}
