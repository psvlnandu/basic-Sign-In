package com.example.apphelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onRegisterbtnClick(View view)
    {
        TextView txtFirstName=findViewById(R.id.txtFirstName);
        TextView txtLastName=findViewById(R.id.txtLastName);
        TextView txtEmail=findViewById(R.id.txtEmail);

        EditText editTextFirstName=findViewById(R.id.editTextFirstName);
        EditText editTextLastName=findViewById(R.id.editTextLastName);
        EditText editTextEmail=findViewById(R.id.editTextEmail);

        txtFirstName.setText("FirstName:" +editTextFirstName.getText().toString());
        txtLastName.setText("LastName:" +editTextLastName.getText().toString());
        txtEmail.setText("Email:" +editTextEmail.getText().toString());


    }
}