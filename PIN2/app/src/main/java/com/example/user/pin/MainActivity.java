package com.example.user.pin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button pressedButton;
    TextView textbox;
    LinearLayout pad;
    LinearLayout pad01;
    LinearLayout pad02;
    LinearLayout pad03;
    LinearLayout pad04;
    AbsoluteLayout backpad;
    Random random;
    Button[][] buttons;
    String[][] btn_number = { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*","0", "#"} };
    int[] num_low = {0, 1, 2, 3};
    int[] num_col = {0, 1, 2};
    int push_num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textbox= findViewById(R.id.box);
        pad= findViewById(R.id.pad);
        pad01= findViewById(R.id.pad01);
        pad02= findViewById(R.id.pad02);
        pad03= findViewById(R.id.pad03);
        pad04= findViewById(R.id.pad04);

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

        textbox.bringToFront();
    }

    public void set_number(){
        for(int l=0;l<3;l++){
            num_col[l]=l;
        }
        for(int k=0;k<4;k++){
            num_low[k]=k;
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                buttons[i][j].setText(btn_number[num_low[i]][num_col[j]]);
            }
        }
    }
    public void make (View v){
        set_number();
        int rand_x = 0;
        int rand_y = 0;

        rand_x = random.nextInt(440) - 200;
        rand_y = random.nextInt(600) + 20;
        pad.setX(rand_x);
        //Log.i("x", String.valueOf(rand_x));
        pad.setY(rand_y);
        //Log.i("y", String.valueOf(rand_y));
        pad.setVisibility(View.VISIBLE);

        pad01.setX(rand_x + 600);
        pad01.setY(rand_y + 800);
        pad01.setVisibility(View.VISIBLE);

        pad02.setX(rand_x - 600);
        pad02.setY(rand_y - 800);
        pad02.setVisibility(View.VISIBLE);

        pad03.setX(rand_x - 600);
        pad03.setY(rand_y + 800);
        pad03.setVisibility(View.VISIBLE);

        pad04.setX(rand_x + 600);
        pad04.setY(rand_y - 800);
        pad04.setVisibility(View.VISIBLE);
    }
    public void play (View v){
        switch(v.getId()){

            case R.id.button10:
            case R.id.button20:
            case R.id.button30:
            case R.id.button40:
            case R.id.button0:
                pressedButton = findViewById(R.id.button0);
                pressedButton = findViewById(R.id.button10);
                pressedButton = findViewById(R.id.button20);
                pressedButton = findViewById(R.id.button30);
                pressedButton = findViewById(R.id.button40);
                break;
            case R.id.button1:
            case R.id.button11:
            case R.id.button21:
            case R.id.button31:
            case R.id.button41:
                pressedButton = findViewById(R.id.button1);
                pressedButton = findViewById(R.id.button11);
                pressedButton = findViewById(R.id.button21);
                pressedButton = findViewById(R.id.button31);
                pressedButton = findViewById(R.id.button41);
                break;
            case R.id.button2:
            case R.id.button12:
            case R.id.button22:
            case R.id.button32:
            case R.id.button42:
                pressedButton = findViewById(R.id.button2);
                pressedButton = findViewById(R.id.button12);
                pressedButton = findViewById(R.id.button22);
                pressedButton = findViewById(R.id.button32);
                pressedButton = findViewById(R.id.button42);
                break;
            case R.id.button3:
            case R.id.button13:
            case R.id.button23:
            case R.id.button33:
            case R.id.button43:
                pressedButton = findViewById(R.id.button3);
                pressedButton = findViewById(R.id.button13);
                pressedButton = findViewById(R.id.button23);
                pressedButton = findViewById(R.id.button33);
                pressedButton = findViewById(R.id.button43);
                //pad.setVisibility(View.INVISIBLE);
               break;
            case R.id.button4:
            case R.id.button14:
            case R.id.button24:
            case R.id.button34:
            case R.id.button44:
                pressedButton = findViewById(R.id.button4);
                pressedButton = findViewById(R.id.button14);
                pressedButton = findViewById(R.id.button24);
                pressedButton = findViewById(R.id.button34);
                pressedButton = findViewById(R.id.button44);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button5:
            case R.id.button15:
            case R.id.button25:
            case R.id.button35:
            case R.id.button45:
                pressedButton = findViewById(R.id.button5);
                pressedButton = findViewById(R.id.button15);
                pressedButton = findViewById(R.id.button25);
                pressedButton = findViewById(R.id.button35);
                pressedButton = findViewById(R.id.button45);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button6:
            case R.id.button16:
            case R.id.button26:
            case R.id.button36:
            case R.id.button46:
                pressedButton = findViewById(R.id.button6);
                pressedButton = findViewById(R.id.button16);
                pressedButton = findViewById(R.id.button26);
                pressedButton = findViewById(R.id.button36);
                pressedButton = findViewById(R.id.button46);

                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button7:
            case R.id.button17:
            case R.id.button27:
            case R.id.button37:
            case R.id.button47:
                pressedButton = findViewById(R.id.button7);
                pressedButton = findViewById(R.id.button17);
                pressedButton = findViewById(R.id.button27);
                pressedButton = findViewById(R.id.button37);
                pressedButton = findViewById(R.id.button47);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button8:
            case R.id.button18:
            case R.id.button28:
            case R.id.button38:
            case R.id.button48:
                pressedButton = findViewById(R.id.button8);
                pressedButton = findViewById(R.id.button18);
                pressedButton = findViewById(R.id.button28);
                pressedButton = findViewById(R.id.button38);
                pressedButton = findViewById(R.id.button48);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.button9:
            case R.id.button19:
            case R.id.button29:
            case R.id.button39:
            case R.id.button49:
                pressedButton = findViewById(R.id.button9);
                pressedButton = findViewById(R.id.button19);
                pressedButton = findViewById(R.id.button29);
                pressedButton = findViewById(R.id.button39);
                pressedButton = findViewById(R.id.button49);
                //pad.setVisibility(View.INVISIBLE);
                break;
            case R.id.buttonA:
            case R.id.button1A:
            case R.id.button2A:
            case R.id.button3A:
            case R.id.button4A:
                pressedButton = findViewById(R.id.buttonA);
                pressedButton = findViewById(R.id.button1A);
                pressedButton = findViewById(R.id.button2A);
                pressedButton = findViewById(R.id.button3A);
                pressedButton = findViewById(R.id.button4A);
                push_num = 1;
                break;
            case R.id.buttonB:
            case R.id.button1B:
            case R.id.button2B:
            case R.id.button3B:
            case R.id.button4B:
                pressedButton = findViewById(R.id.buttonB);
                pressedButton = findViewById(R.id.button1B);
                pressedButton = findViewById(R.id.button2B);
                pressedButton = findViewById(R.id.button3B);
                pressedButton = findViewById(R.id.button4B);
                break;
            default:
                break;
        }

        if(push_num == 1){
            textbox.setText("");
            pad.setVisibility(View.INVISIBLE);
            pad01.setVisibility(View.INVISIBLE);
            pad02.setVisibility(View.INVISIBLE);
            pad03.setVisibility(View.INVISIBLE);
            pad04.setVisibility(View.INVISIBLE);

            push_num = 0;
        }else {
            textbox.append(pressedButton.getText());
        }
    }
}
