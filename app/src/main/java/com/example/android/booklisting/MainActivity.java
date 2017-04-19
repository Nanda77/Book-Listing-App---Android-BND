package com.example.android.booklisting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//When User Clicks on search button following method gets triggered

    public void onSearch(View view) {
        EditText topic = (EditText) findViewById(R.id.enter_query);

        String query = topic.getText().toString();

        query = query.replace(" ", "");

//Passing user entered query
        BookList.passQuery(query);

        Intent bookListIntent = new Intent(this, BookList.class);
        startActivity(bookListIntent);

    }
}
