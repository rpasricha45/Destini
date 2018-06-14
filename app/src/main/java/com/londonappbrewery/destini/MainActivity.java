package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button topButton;
    Button bottomButton ;
    Story currentStory ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton= findViewById(R.id.buttonBottom);

        final Story myStory = new Story(mStory,topButton,bottomButton);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

    topButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) { // This is the onlclick listener for the top Button

        myStory.Story3();// story 3 line


        }
    });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {// this is the onclick listener for Bottom Button
            myStory.Story2();
            }
        });

    }

}
