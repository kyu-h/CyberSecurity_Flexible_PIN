package com.example.user.pin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button pressedButton;
    TextView textbox;
    LinearLayout pad, pad_1, pad_2, pad_3, pad_4;
    AbsoluteLayout backpad;
    Random random;
    Button[][] buttons;
    String[][] btn_number = { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*","0", "#"} };
    String[] btn_number_random = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*","0", "#" };
    int[] num_low = {0, 1, 2, 3};
    int[] num_col = {0, 1, 2};
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textbox= findViewById(R.id.box);
        pad= findViewById(R.id.pad);
        backpad = findViewById(R.id.backpad);
        random = new Random();
        int[][] btnId = {
                {R.id.button1, R.id.button2, R.id.button3}, {R.id.button4, R.id.button5, R.id.button6}, {R.id.button7, R.id.button8, R.id.button9}
                , {R.id.buttonA,R.id.button0, R.id.buttonB}
        };

        buttons = new Button[4][3];
        for(int i=0;i<4;i++){
            for(int j=0; j<3; j++)
            buttons[i][j] = findViewById(btnId[i][j]);
        }
    }
    public void suffle_vertical(){
        int[] temp_low = {9, 9, 9, 9};
        int num;

        for(int i=0; i<4;i++) {
            flag = 0;
            num = random.nextInt(4);

            for(int j=0; j<4; j++){
                if(temp_low[j]  == num){
                    flag = 1;

                }
            }
            if(flag == 1){
                i--;

            }
            else{
                temp_low[i] = num;
            }
        }
        textbox.setText("");
        for(int k=0; k<4; k++){
            num_low[k] = temp_low[k];
        }
    }
    public void suffle_horizon(){
        int[] temp_col = {9, 9, 9};
        int num;

        for(int i=0; i<3;i++) {
            flag = 0;
            num = random.nextInt(3);

            for(int j=0; j<3; j++){
                if(temp_col[j]  == num){
                    flag = 1;

                }
            }
            if(flag == 1){
                i--;

            }
            else{
                temp_col[i] = num;
            }
        }
        textbox.setText("");
        for(int k=0; k<3; k++){
            num_col[k] = temp_col[k];
        }
    }

    public void set_number(){
        int shuffle_constant = random.nextInt(2);
        for(int l=0;l<3;l++){
            num_col[l]=l;
        }
        for(int k=0;k<4;k++){
            num_low[k]=k;
        }
        if(shuffle_constant == 0){

            suffle_horizon();
        }
        else{

            suffle_vertical();

        }



        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                buttons[i][j].setText(btn_number[num_low[i]][num_col[j]]);
            }
        }
    }
    public void set_number_randomly(){
        int[] temp_num = {111,111,111,111,111,111,111,111,111,111,111,111};
        int num;
        int k = 0;
        for(int i=0; i<12;i++) {
            flag = 0;
            num = random.nextInt(12);

            for(int j=0; j<12; j++){
                if(temp_num[j]  == num){
                    flag = 1;

                }
            }
            if(flag == 1){
                i--;

            }
            else{
                temp_num[i] = num;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                buttons[i][j].setText(btn_number_random[temp_num[k]]);
                k++;
            }
        }
    }
    public void make (View v){
        //set_number_randomly();
        //pad.setX(random.nextInt(120));
        //pad.setY(20+random.nextInt(420));
        set_size(200);
        pad.setY(150);
        pad.setVisibility(View.VISIBLE);

    }

    public void set_size(int a){
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){

                //buttons[i][j].setHeight(a);
                //buttons[i][j].setWidth(a);
                ViewGroup.LayoutParams params = buttons[i][j].getLayoutParams();
                params.width = a;
                params.height = a;
                buttons[i][j].setLayoutParams(params);
            }
        }
    }
    public void play (View v){
        switch(v.getId()){

            case R.id.button0:
                pressedButton = findViewById(R.id.button0);
                break;
            case R.id.button1:
                pressedButton = findViewById(R.id.button1);
                break;
            case R.id.button2:
                pressedButton = findViewById(R.id.button2);
                break;
            case R.id.button3:
                pressedButton = findViewById(R.id.button3);
                //pad.setVisibility(View.INVISIBLE);
               break;
            case R.id.button4:
                pressedButton = findViewById(R.id.button4);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button5:
                pressedButton = findViewById(R.id.button5);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button6:
                pressedButton = findViewById(R.id.button6);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button7:
                pressedButton = findViewById(R.id.button7);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button8:
                pressedButton = findViewById(R.id.button8);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button9:
                pressedButton = findViewById(R.id.button9);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.buttonA:
                pressedButton = findViewById(R.id.buttonA);
                //textbox.append(pressedButton.getText());
                //pad.setVisibility(View.INVISIBLE);

              //  pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.buttonB:
                pressedButton = findViewById(R.id.buttonB);
               // textbox.append(pressedButton.getText());
                //pad.setVisibility(View.INVISIBLE);
               // suffle_vertical();

                break;
            default:
                break;


        }
        if(pressedButton.getText() == "*"){
            textbox.setText("");
            pad.setVisibility(View.INVISIBLE);
        }
        else{
            textbox.append(pressedButton.getText());
        }
    }
}
