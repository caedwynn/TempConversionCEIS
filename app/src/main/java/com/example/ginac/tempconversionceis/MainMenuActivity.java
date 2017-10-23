package com.example.ginac.tempconversionceis;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//Add a listener to the button to take you to the temp converter
        Button btnWeather=(Button) findViewById(R.id.btnWeather);
        btnWeather.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              goWeather();
                                          }
                                      }
        );
        Button btnTicTacToe =(Button) findViewById(R.id.btnTicTacToe);
        btnTicTacToe.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              goGame();
                                          }
                                      }
        );
        Button btnSong =(Button) findViewById(R.id.btnSong);
        btnSong.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                goSong();
                                            }
                                        }
        );
        Button btnTakePic=(Button) findViewById(R.id.btnTakePic);
        btnTicTacToe.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                goTakePic();
                                            }
                                        }
        );
        Button btnInfo =(Button) findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                goInfo();
                                            }
                                        }
        );
        Button btnDraw=(Button) findViewById(R.id.btnDraw);
        btnDraw.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              goDraw();
                                          }
                                      }
        );
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private void goWeather() {
        Intent intent = new Intent(MainMenuActivity.this, WeatherActivity.class);
        this.startActivity(intent);
    }

    private void goDraw() {
        Intent intent = new Intent(MainMenuActivity.this, MyDrawing.class);
        this.startActivity(intent);
    }
    private void goGame() {
        Intent intent = new Intent(MainMenuActivity.this, TicTacToeActivity.class);
        this.startActivity(intent);
    }
    private void goInfo() {
        Intent intent = new Intent(MainMenuActivity.this, InformationPageActivity.class);
        this.startActivity(intent);
    }
    private void goSong() {
        Intent intent = new Intent(MainMenuActivity.this, SongActivity.class);
        this.startActivity(intent);
    }
    private void goTakePic() {
        Intent intent = new Intent(MainMenuActivity.this, TakePictureActivity.class);
        this.startActivity(intent);
    }
}
