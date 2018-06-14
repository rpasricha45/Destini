package com.londonappbrewery.destini;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Story {
    private TextView mystory;
    private  Button topButton, bottomButton;

    public Story ( final TextView story , final Button top,final Button bottom){
        mystory = story;
        topButton = top;
        bottomButton= bottom;
    }

    public void Story3(){
        mystory.setText(R.string.T3_Story);
        topButton.setText(R.string.T3_Ans1);
        bottomButton.setText(R.string.T3_Ans2);

        // set up on click listener for top Button
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mystory.setText(R.string.T6_End);
                setButtonInvisble();
            }
        });

       // set up on click listern fo the bottom Button

       bottomButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mystory.setText(R.string.T5_End);
               setButtonInvisble();
           }
       });

    }
    private void setButtonInvisble (){
        /*
            This method makes the button not visible after a closed fate
         */
    topButton.setVisibility(View.INVISIBLE);
    bottomButton.setVisibility(View.INVISIBLE);
    }

    public void Story2(){
        // this is the Story 2 when user clicks bottom Button

        mystory.setText(R.string.T1_Story);
        topButton.setText(R.string.T2_Ans1);
        bottomButton.setText(R.string.T2_Ans2);

        // Top button for Story 2 leads to story 3
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Story3();
            }
        });


      bottomButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              // left button

              mystory.setText(R.string.T4_End);
          }
      });
    }
}
