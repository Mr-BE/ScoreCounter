package com.example.android.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global variables for team values
    int NULL_SCORE;
    final int POSSESSION_SCORE = 50;

    int scoreForHome = NULL_SCORE;
    int scoreForAway = NULL_SCORE;

    int noOfYellowHome = NULL_SCORE;
    int noOfYellowAway = NULL_SCORE;
    int noOfRedHome = NULL_SCORE;
    int noOfRedAway = NULL_SCORE;
    int noOfFoulsHome = NULL_SCORE;
    int noOfFoulsAway = NULL_SCORE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *Home team values
     */
   // Displays the given score for Home Team.

  public void displayForTeamHome(int score) {
    TextView scoreView = findViewById(R.id.homeTeamScore);
    scoreView.setText(String.valueOf(score));
}
// Update home possession Display
    public void displayPossessionHome(int possession){
      TextView homePossessionView = findViewById(R.id.homePossessionValue);
      homePossessionView.setText(String.valueOf(possession));
    }

    // Display home foul
    public void displayFoulHome (int count){
      //Locate view
        TextView homeFoulsTextView = findViewById(R.id.homeFoulValue);
        //Set value to view
        homeFoulsTextView.setText(String.valueOf(count));
    }
    //Display home red cards
    public void displayRedCardHome (int count){
        //locate home team yellow card view
        TextView homeRedText = findViewById(R.id.homeRedCardValue);
        //set value to view
        homeRedText.setText(String.valueOf(noOfRedHome));


    }
    //Display home Yellow cards
    public void displayYellowCardHome (int count){

        //locate home team yellow card view
        TextView homeYellowText = findViewById(R.id.homeYellowCardValue);
        //set value to view
        homeYellowText.setText(String.valueOf(count));
    }

    /*
     * Handles goal clicks for home team
     */
    public void addGoalHome (View view){
        scoreForHome ++;
        displayForTeamHome(scoreForHome);
    }

    //Handles home team foul count
    public void addFoulHome (View view){
        //increase value
        noOfFoulsHome ++;
        //update the home team's foul view
        displayFoulHome(noOfFoulsHome);
    }

    //Handles home team yellow card count
    public void  addYellowHome (View view) {
        //increase yellow card count
        noOfYellowHome ++;
       //update view
        displayYellowCardHome(noOfYellowHome);
    }

    //Handles home team red card count
    public void  addRedHome (View view) {
        //increase red card count
        noOfRedHome ++;
        //update view
        displayRedCardHome(noOfRedHome);
    }

    //Handles home team possession count
    public void addPossessionHome (View view){
        /*
        Home side
         */
        //Locate home possession text
        TextView currentHomePossession = findViewById(R.id.homePossessionValue);
        //Get string value for home team possession text field
        String currentHomePossessionText = currentHomePossession.getText().toString();
        //Convert Home team String to numerical value
        int currentHomePossessionValue = Integer.parseInt(currentHomePossessionText);
        //increase home team possession value
        int homePossession = currentHomePossessionValue +1;

        /*
        Away Side
         */
        //Locate home possession text
        TextView currentAwayPossession = findViewById(R.id.awayPossessionValue);
        //Get string value from away team possession text field
        String currentAwayPossessionText = currentAwayPossession.getText().toString();
        //Convert above text to numerical value
        int currentAwayPossessionValue = Integer.parseInt(currentAwayPossessionText);
        //increase away team possession value
        int awayPossession = currentAwayPossessionValue -1;

        //Make sure possession does not exceed 100%
        if ( homePossession >=100 || awayPossession <= 0){
            homePossession =100;
            awayPossession =0;

            displayPossessionAway(awayPossession);
            displayPossessionHome(homePossession);
        }
        else {

            displayPossessionHome(homePossession);
            displayPossessionAway(awayPossession);

        }

    }

    /**
     * Team B Methods
     */
   // Displays the given score for Team B.

    public void displayForTeamAway(int score) {
        TextView scoreView = findViewById(R.id.awayTeamScore);
        scoreView.setText(String.valueOf(score));
    }

    // Updates away possession Display
    public void displayPossessionAway (int possession){
        TextView awayPossessionView = findViewById(R.id.awayPossessionValue);
        awayPossessionView.setText(String.valueOf(possession));
    }

    //Displays foul count for away team
    public void displayFoulAway (int foul){
        //Locate view
        TextView awayFoulsTextView = findViewById(R.id.awayFoulValue);
        //set value
        awayFoulsTextView.setText(String.valueOf(foul));

    }
    //Displays red card count for away team
    public void displayRedCardAway (int count){
        //locate away team yellow card view
        TextView awayRedText = findViewById(R.id.awayRedCardValue);
        //set value to view
        awayRedText.setText(String.valueOf(count));

    }
    //Displays yellow card count for away team
    public void displayYellowCardAway (int count){
        //locate away team yellow card view
        TextView awayYellowText = findViewById(R.id.awayYellowCardValue);
        //set value to view
        awayYellowText.setText(String.valueOf(count));

    }

    /*
     * Handles goal clicks for away team
     */
    public void addGoalAway(View view){
        scoreForAway ++;
        displayForTeamAway(scoreForAway);
    }

    //Handles away team foul count
    public void addFoulAway (View view){
        //increase value
        noOfFoulsAway ++;
        //update the home team's foul view
        displayFoulAway(noOfFoulsAway);
    }

    //Handles away team yellow card count
    public void  addYellowAway (View view) {
        //increase yellow card count
        noOfYellowAway ++;
       //update view
        displayYellowCardAway(noOfYellowAway);

    }

    //Handles away team red card count
    public void  addRedAway (View view) {
        //increase red card count
        noOfRedAway ++;

       //update view
        displayRedCardAway(noOfRedAway);
    }


    //Handles home team possession count
    public void addPossessionAway (View view){

        /*
        Away Side
         */
        //Locate home possession text
        TextView currentAwayPossession = findViewById(R.id.awayPossessionValue);
        //Get string value from away team possession text field
        String currentAwayPossessionText = currentAwayPossession.getText().toString();
        //Convert above text to numerical value
        int currentAwayPossessionValue = Integer.parseInt(currentAwayPossessionText);
        //increase away team possession value
        int awayPossession = currentAwayPossessionValue +1;


/*
        Home side
         */
        //Locate home possession text
        TextView currentHomePossession = findViewById(R.id.homePossessionValue);
        //Get string value for home team possession text field
        String currentHomePossessionText = currentHomePossession.getText().toString();
        //Convert Home team String to numerical value
        int currentHomePossessionValue = Integer.parseInt(currentHomePossessionText);
        //increase home team possession value
        int homePossession = currentHomePossessionValue -1;

        displayPossessionHome(homePossession);
        displayPossessionAway(awayPossession);


        //Make sure possession does not exceed 100%
        if ( awayPossession >=100 || homePossession <= 0){
            awayPossession =100;
            homePossession =0;

            displayPossessionAway(awayPossession);
            displayPossessionHome(homePossession);
        }
        else {

            displayPossessionHome(homePossession);
            displayPossessionAway(awayPossession);

        }
    }



    /**
     * Reset Button clicks
     */
    public void resetButton (View view){
        //Reset values
        noOfRedAway = NULL_SCORE;
        noOfYellowAway = NULL_SCORE;
        noOfFoulsAway =NULL_SCORE;
        noOfYellowHome =NULL_SCORE;
        noOfRedHome =NULL_SCORE;
        noOfFoulsHome =NULL_SCORE;
        scoreForHome = NULL_SCORE;
        scoreForAway = NULL_SCORE;

        //Update views
        displayForTeamHome(scoreForHome);
        displayForTeamAway(scoreForAway);
        displayPossessionHome(POSSESSION_SCORE);
        displayPossessionAway(POSSESSION_SCORE);
        displayRedCardHome(noOfRedHome);
        displayRedCardAway(noOfRedAway);
        displayYellowCardHome(noOfYellowHome);
        displayYellowCardAway(noOfYellowAway);
        displayFoulHome(noOfFoulsHome);
        displayFoulAway(noOfFoulsAway);

    }
}
