package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class InfoActivity extends AppCompatActivity {
    EditText edtName, edtEmail, edtPass, edtUsername;
    RadioGroup rdbGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().setTitle("Account Info");
        edtName = findViewById(R.id.edName);
        edtEmail = findViewById(R.id.edEmail);
        edtUsername = findViewById(R.id.edUserName);
        edtPass = findViewById(R.id.edPass);

        Intent intent = getIntent();
        edtName.setText(intent.getStringExtra("Username"));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.navigation_Save){
        }
        return super.onOptionsItemSelected(item);
    }
}