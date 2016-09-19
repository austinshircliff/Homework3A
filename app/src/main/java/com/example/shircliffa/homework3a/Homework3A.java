package com.example.shircliffa.homework3a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Homework3A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3);
    }
    public void Rockclicked (View v)
    {
        Toast.makeText(Homework3A.this, "Rock was Clicked", Toast.LENGTH_SHORT).show();
    }
    public void Paperclicked (View v)
    {
        Toast.makeText(Homework3A.this, "Paper was Clicked", Toast.LENGTH_SHORT).show();
    }
    public void Scissorsclicked (View v)
    {
        Toast.makeText(Homework3A.this, "Scissors was Clicked", Toast.LENGTH_SHORT).show();
    }
    public void Lizardclicked (View v)
    {
        Toast.makeText(Homework3A.this, "Lizard was Clicked", Toast.LENGTH_SHORT).show();
    }
    public void Spockclicked (View v)
    {
        Toast.makeText(Homework3A.this, "Spock was Clicked", Toast.LENGTH_SHORT).show();
    }
}
