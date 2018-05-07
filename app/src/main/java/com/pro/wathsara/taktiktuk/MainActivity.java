package com.pro.wathsara.taktiktuk;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private int x =0;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x == 0) {
                    button1.setText("X");
                    count=count+1;
                    if((button1.getText()==button2.getText() && button1.getText()==button3.getText())||(button1.getText()==button5.getText() && button1.getText()==button9.getText())||(button1.getText()==button4.getText() && button1.getText()==button7.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x + 1;
                } else {
                    button1.setText("O");
                    count=count+1;
                    if((button1.getText()==button2.getText() && button1.getText()==button3.getText())||(button1.getText()==button5.getText() && button1.getText()==button9.getText())||(button1.getText()==button4.getText() && button1.getText()==button7.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"O Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x - 1;
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x==0){
                    button2.setText("X");
                    count=count+1;
                    if((button2.getText()==button1.getText() && button2.getText()==button3.getText())||(button2.getText()==button5.getText() && button2.getText()==button8.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x+1;
                }else{
                    button2.setText("O");
                    count=count+1;
                    if((button2.getText()==button1.getText() && button2.getText()==button3.getText())||(button2.getText()==button5.getText() && button2.getText()==button8.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"O Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x-1;
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x==0){
                    button3.setText("X");
                    count=count+1;
                    if((button3.getText()==button2.getText() && button3.getText()==button1.getText())||(button3.getText()==button5.getText() && button3.getText()==button7.getText())||(button3.getText()==button6.getText() && button3.getText()==button9.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x+1;
                }else{
                    button3.setText("O");
                    count=count+1;
                    if((button3.getText()==button2.getText() && button3.getText()==button1.getText())||(button3.getText()==button5.getText() && button3.getText()==button7.getText())||(button3.getText()==button6.getText() && button3.getText()==button9.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"O Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x-1;
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x==0){
                    button4.setText("X");
                    count=count+1;
                    if((button4.getText()==button5.getText() && button4.getText()==button6.getText())||(button4.getText()==button1.getText() && button4.getText()==button7.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x+1;
                }else{
                    button4.setText("O");
                    count=count+1;
                    if((button4.getText()==button5.getText() && button4.getText()==button6.getText())||(button4.getText()==button1.getText() && button4.getText()==button7.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"O Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x-1;
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x==0){
                    button5.setText("X");
                    count=count+1;
                    if((button5.getText()==button1.getText() && button5.getText()==button9.getText())||(button5.getText()==button3.getText() && button5.getText()==button7.getText())||(button5.getText()==button2.getText() && button5.getText()==button8.getText())||(button5.getText()==button4.getText() && button5.getText()==button6.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x+1;
                }else{
                    button5.setText("O");
                    count=count+1;
                    if((button5.getText()==button1.getText() && button5.getText()==button9.getText())||(button5.getText()==button3.getText() && button5.getText()==button7.getText())||(button5.getText()==button2.getText() && button5.getText()==button8.getText())||(button5.getText()==button4.getText() && button5.getText()==button6.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"O Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x-1;
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x==0){
                    button6.setText("X");
                    count=count+1;
                    if((button6.getText()==button3.getText() && button6.getText()==button9.getText())||(button6.getText()==button5.getText() && button6.getText()==button4.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x+1;
                }else{
                    button6.setText("O");
                    count=count+1;
                    if((button6.getText()==button3.getText() && button6.getText()==button9.getText())||(button6.getText()==button5.getText() && button6.getText()==button4.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"O Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x-1;
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x==0){
                    button7.setText("X");
                    count=count+1;
                    if((button7.getText()==button4.getText() && button7.getText()==button1.getText())||(button7.getText()==button5.getText() && button7.getText()==button3.getText())||(button7.getText()==button8.getText() && button7.getText()==button9.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x+1;
                }else{
                    button7.setText("O");
                    count=count+1;
                    if((button7.getText()==button4.getText() && button7.getText()==button1.getText())||(button7.getText()==button5.getText() && button7.getText()==button3.getText())||(button7.getText()==button8.getText() && button7.getText()==button9.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"O Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x-1;
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x==0){
                    button8.setText("X");
                    count=count+1;
                    if((button8.getText()==button7.getText() && button8.getText()==button9.getText())||(button8.getText()==button2.getText() && button8.getText()==button5.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x+1;
                }else{
                    button8.setText("O");
                    count=count+1;
                    if((button8.getText()==button7.getText() && button8.getText()==button9.getText())||(button8.getText()==button2.getText() && button8.getText()==button5.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"O Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x-1;
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x==0){
                    button9.setText("X");
                    count=count+1;
                    if((button9.getText()==button6.getText() && button9.getText()==button3.getText())||(button9.getText()==button5.getText() && button9.getText()==button1.getText())||(button9.getText()==button8.getText() && button9.getText()==button7.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x+1;
                }else{
                    button9.setText("O");
                    count=count+1;
                    if((button9.getText()==button6.getText() && button9.getText()==button3.getText())||(button9.getText()==button5.getText() && button9.getText()==button1.getText())||(button9.getText()==button8.getText() && button9.getText()==button7.getText())){
                        //alert who wins
                        Toast.makeText(getApplicationContext(),"X Wins the Game Press New game to start Again",Toast.LENGTH_LONG).show();
                    }else if (count==9){
                        Toast.makeText(getApplicationContext(),"Game Draw Press New game to start Again",Toast.LENGTH_LONG).show();

                    }
                    x = x-1;
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                x=0;
                count=0;
            }
        });
    }


}
