package com.example.abhinav.accessdenied;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class Contact extends AppCompatActivity {

    EditText name, message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        name = findViewById(R.id.name);
        message = findViewById(R.id.msg);
        send = findViewById(R.id.send);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        actionBar.setTitle("Contact Us");

        GradientDrawable gd = new GradientDrawable();
        gd.setColor(Color.parseColor("#00FFFFFF"));
        gd.setCornerRadius(30);
        gd.setStroke(2,Color.BLACK);

        name.setBackground(gd);
        message.setBackground(gd);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","as.abhi99@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Mail from "+name.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    finish();
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Contact.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public boolean onSupportNavigateUp() {
        finish();

        return true;
    }
}
