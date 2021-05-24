package sg.edu.rp.c346.id19014750.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
//        tvAnswer.setText("In Second Activty");

        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question"); //*cont from here
        tvAnswer.setText(questionSelected + " answer is: Queue");

        //*Another way of doing activities in one activities
//        if(questionSelected.equalsIgnoreCase("Q1")){
//            tvAnswer.setText(questionSelected + " answer is: Queue");
//        }
//        else if (questionSelected.equalsIgnoreCase("Q2")){
//            tvAnswer.setText(questionSelected + " answer is: Gone");
//        }

    }
}