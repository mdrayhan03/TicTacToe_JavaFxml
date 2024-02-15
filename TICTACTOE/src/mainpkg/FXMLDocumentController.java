package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label player1ScoreLabel;
    @FXML
    private Label player2ScoreLabel;
    @FXML
    private Label showResultLabel;
    @FXML
    private Button startButton;
    @FXML
    private Button button1Button;
    @FXML
    private Button button2Button;
    @FXML
    private Button button3Button;
    @FXML
    private Button button4Button;
    @FXML
    private Button button5Button;
    @FXML
    private Button button6Button;
    @FXML
    private Button button7Button;
    @FXML
    private Button button8Button;
    @FXML
    private Button button9Button;
    int stepcounter , ply1 = 0 , ply2 = 0;
    TicTacToe tic ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
    }    

    @FXML
    private void startGameOnAction(ActionEvent event) {
        stepcounter = -1 ;
        tic = new TicTacToe() ;
        player1ScoreLabel.setText(Integer.toString(ply1));
        player2ScoreLabel.setText(Integer.toString(ply2));
        showResultLabel.setText("");
        button1Button.setText("");
        button2Button.setText("");
        button3Button.setText("");
        button4Button.setText("");
        button5Button.setText("");
        button6Button.setText("");
        button7Button.setText("");
        button8Button.setText("");
        button9Button.setText("");
        button1Button.setDisable(false);
        button2Button.setDisable(false);
        button3Button.setDisable(false);
        button4Button.setDisable(false);
        button5Button.setDisable(false);
        button6Button.setDisable(false);
        button7Button.setDisable(false);
        button8Button.setDisable(false);
        button9Button.setDisable(false);
        startButton.setText("Start");
    }

    @FXML
    @SuppressWarnings("empty-statement")
    private void button1ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(0, 0, "X");
            button1Button.setText("X");
        }
        else {
            tic.getPosition(0, 0, "O");
            button1Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button1Button.setDisable(true);
    }

    @FXML
    private void button2ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(0, 1, "X");
            button2Button.setText("X");
        }
        else {
            tic.getPosition(0, 1, "O");
            button2Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button2Button.setDisable(true);
    }

    @FXML
    private void button3ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(0, 2, "X");
            button3Button.setText("X");
        }
        else {
            tic.getPosition(0, 2, "O");
            button3Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button3Button.setDisable(true);
    }

    @FXML
    private void button4ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(1, 0, "X");
            button4Button.setText("X");
        }
        else {
            tic.getPosition(1, 0, "O");
            button4Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button4Button.setDisable(true);
    }

    @FXML
    private void button5ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(1, 1, "X");
            button5Button.setText("X");
        }
        else {
            tic.getPosition(1, 1, "O");
            button5Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button5Button.setDisable(true);
    }

    @FXML
    private void button6ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(1, 2, "X");
            button6Button.setText("X");
        }
        else {
            tic.getPosition(1, 2, "O");
            button6Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button6Button.setDisable(true);
    }

    @FXML
    private void button7ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(2, 0, "X");
            button7Button.setText("X");
        }
        else {
            tic.getPosition(2, 0, "O");
            button7Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button7Button.setDisable(true);
    }

    @FXML
    private void button8ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(2, 1, "X");
            button8Button.setText("X");
        }
        else {
            tic.getPosition(2, 1, "O");
            button8Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button8Button.setDisable(true);
    }

    @FXML
    private void button9ButtonOnAction(ActionEvent event) {
        stepcounter ++ ;
        startButton.setText("Restart");
        if (stepcounter % 2 == 0){
            tic.getPosition(2, 2, "X");
            button9Button.setText("X");
        }
        else {
            tic.getPosition(2, 2, "O");
            button9Button.setText("O");
        }      
        if(tic.check() != 0) {
            showResultLabel.setText(tic.showResult());
            button1Button.setDisable(true);
            button2Button.setDisable(true);
            button3Button.setDisable(true);
            button4Button.setDisable(true);
            button5Button.setDisable(true);
            button6Button.setDisable(true);
            button7Button.setDisable(true);
            button8Button.setDisable(true);
            button9Button.setDisable(true);
            startButton.setText("Start");
            if (tic.check() == 10){
                ply1++ ;
                player1ScoreLabel.setText(Integer.toString(ply1));
            }
            else if (tic.check() == 20){
                ply2++ ;
                player2ScoreLabel.setText(Integer.toString(ply2));
            } 
        }
        else {
            showResultLabel.setText("Now your turn Player " + (((stepcounter + 1) % 2) + 1));
        }
        button9Button.setDisable(true);
    }
}
