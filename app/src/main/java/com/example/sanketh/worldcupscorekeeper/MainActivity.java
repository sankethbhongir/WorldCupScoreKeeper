package com.example.sanketh.worldcupscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    int scoreForFrance = 0;
    int yellowCardOfFrance = 0;
    int redCardOfFrance = 0;
    int penaltyOfFrance = 0;
    int scoreForEngland = 0;
    int yellowCardOfEngland = 0;
    int redCardOfEngland = 0;
    int penaltyOfEngland = 0;
    @BindView(R.id.scoreOfFrance)
    TextView scoreOfFrance;
    @BindView(R.id.france_penalty_board)
    TextView francePenaltyBoard;
    @BindView(R.id.france_yellow_cards_board)
    TextView franceYellowCardsBoard;
    @BindView(R.id.france_red_cards_board)
    TextView franceRedCardsBoard;
    @BindView(R.id.scoreOfEngland)
    TextView scoreOfEngland;
    @BindView(R.id.england_penalty_board)
    TextView englandPenaltyBoard;
    @BindView(R.id.england_yellow_cards_board)
    TextView englandYellowCardsBoard;
    @BindView(R.id.england_red_cards_board)
    TextView englandRedCardsBoard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if(savedInstanceState != null){
            scoreForFrance = savedInstanceState.getInt("scoreFrance");
            scoreForEngland = savedInstanceState.getInt("scoreEngland");
            penaltyOfFrance = savedInstanceState.getInt("penaltyFrance");
            penaltyOfEngland = savedInstanceState.getInt("penaltyEngland");
            yellowCardOfFrance = savedInstanceState.getInt("yellowCardFrance");
            yellowCardOfEngland = savedInstanceState.getInt("yellowCardEngland");
            redCardOfFrance = savedInstanceState.getInt("redCardFrance");
            redCardOfEngland = savedInstanceState.getInt("redCardEngland");
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        scoreForFrance = savedInstanceState.getInt("scoreFrance");
        scoreForEngland = savedInstanceState.getInt("scoreEngland");
        penaltyOfFrance = savedInstanceState.getInt("penaltyFrance");
        penaltyOfEngland = savedInstanceState.getInt("penaltyEngland");
        yellowCardOfFrance = savedInstanceState.getInt("yellowCardFrance");
        yellowCardOfEngland = savedInstanceState.getInt("yellowCardEngland");
        redCardOfFrance = savedInstanceState.getInt("redCardFrance");
        redCardOfEngland = savedInstanceState.getInt("redCardEngland");

        scoreOfFrance.setText(String.valueOf(scoreForFrance));
        scoreOfEngland.setText(String.valueOf(scoreForEngland));
        englandPenaltyBoard.setText(String.valueOf(penaltyOfEngland));
        francePenaltyBoard.setText(String.valueOf(penaltyOfFrance));
        englandYellowCardsBoard.setText(String.valueOf(yellowCardOfEngland));
        franceYellowCardsBoard.setText(String.valueOf(yellowCardOfFrance));
        englandRedCardsBoard.setText(String.valueOf(redCardOfEngland));
        franceRedCardsBoard.setText(String.valueOf(redCardOfFrance));

        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putInt("scoreFrance",scoreForFrance);
        outState.putInt("scoreEngland",scoreForEngland);
        outState.putInt("penaltyFrance",penaltyOfFrance);
        outState.putInt("penaltyEngland",penaltyOfEngland);
        outState.putInt("yellowCardFrance",yellowCardOfFrance);
        outState.putInt("yellowCardEngland",yellowCardOfEngland);
        outState.putInt("redCardFrance",redCardOfFrance);
        outState.putInt("redCardEngland",redCardOfEngland);
        super.onSaveInstanceState(outState);

    }

    /**
     * displays score for france
     */
    public void displayScoreForFrance(int score) {

        scoreOfFrance.setText(String.valueOf(score));
    }


    /**
     * displays penalties  for france
     */

    public void displayPenaltyForFrance(int penalty) {
        francePenaltyBoard.setText(String.valueOf(penalty));
    }


    /**
     * displays yellow cards  for france
     */

    public void displayYellowCardForFrance(int card) {
        franceYellowCardsBoard.setText(String.valueOf(card));
    }


    /**
     * displays red cards  for france
     */

    public void displayRedCardForFrance(int card) {

        franceRedCardsBoard.setText(String.valueOf(card));
    }


    /**
     * increases goal for france by 1
     */

    @OnClick(R.id.france_goal_btn)
    public void goalForFrance(View view) {
        scoreForFrance += 1;
        displayScoreForFrance(scoreForFrance);
    }

    /**
     * increases goal and penalty for france by 1
     */

    @OnClick(R.id.france_penalty_btn)
    public void penaltyForFrance(View view) {
        penaltyOfFrance += 1;
        scoreForFrance += 1;
        displayScoreForFrance(scoreForFrance);
        displayPenaltyForFrance(penaltyOfFrance);
    }

    /**
     * increases red card for france by 1
     */

    @OnClick(R.id.france_red_btn)
    public void redCardForfrance(View view) {
        redCardOfFrance += 1;
        displayRedCardForFrance(redCardOfFrance);
    }

    /**
     * increases yellow card for france by 1
     */

    @OnClick(R.id.france_yellow_btn)
    public void yellowCardForfrance(View view) {
        yellowCardOfFrance += 1;
        displayYellowCardForFrance(yellowCardOfFrance);
    }


    /**
     * displays score for england
     */
    public void displayScoreForEngland(int score) {
        scoreOfEngland.setText(String.valueOf(score));
    }

    /**
     * displays penalties  for england
     */

    public void displayPenaltyForEngland(int penalty) {

        englandPenaltyBoard.setText(String.valueOf(penalty));
    }

    /**
     * displays yellow cards  for england
     */

    public void displayYellowCardForEngland(int card) {

        englandYellowCardsBoard.setText(String.valueOf(card));
    }

    /**
     * displays red cards  for england
     */

    public void displayRedCardForEngland(int card) {

        englandRedCardsBoard.setText(String.valueOf(card));
    }

    /**
     * increases goal for england by 1
     */

    @OnClick(R.id.england_goal_btn)
    public void goalForEngland(View view) {
        scoreForEngland += 1;
        displayScoreForEngland(scoreForEngland);
    }

    /**
     * increases goal and penalty for england by 1
     */

    @OnClick(R.id.england_penalty_btn)
    public void penaltyForEngland(View view) {
        penaltyOfEngland += 1;
        scoreForEngland += 1;

        displayScoreForEngland(scoreForEngland);
        displayPenaltyForEngland(penaltyOfEngland);
    }

    /**
     * increases red card for englande by 1
     */

    @OnClick(R.id.england_red_button)
    public void redCardForEngland(View view) {
        redCardOfEngland += 1;

        displayRedCardForEngland(redCardOfEngland);
    }

    /**
     * increases yellow card for france by 1
     */

    @OnClick(R.id.england_yellow_btn)
    public void yellowCardForEngland(View view) {
        yellowCardOfEngland += 1;

        displayYellowCardForEngland(yellowCardOfEngland);
    }

    /**
     * resets all scores to zero
     */

    @OnClick(R.id.reset_btn)
    public void reset(View view) {
        scoreForEngland = 0;
        scoreForFrance = 0;
        redCardOfEngland = 0;
        redCardOfFrance = 0;
        yellowCardOfEngland = 0;
        yellowCardOfFrance = 0;
        penaltyOfEngland = 0;
        penaltyOfFrance = 0;
        displayScoreForEngland(scoreForEngland);
        displayScoreForFrance(scoreForFrance);
        displayRedCardForEngland(redCardOfEngland);
        displayRedCardForFrance(redCardOfFrance);
        displayYellowCardForEngland(yellowCardOfEngland);
        displayYellowCardForFrance(yellowCardOfFrance);
        displayPenaltyForEngland(penaltyOfEngland);
        displayPenaltyForFrance(penaltyOfFrance);
    }

}
