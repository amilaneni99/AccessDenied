package com.ietevit.accessdenied;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ietevit.accessdenied.R;

import java.util.List;

public class Contact extends AppCompatActivity {

    EditText name, message;
    Button send;
    LinearLayout call;
    CardView pres,tech1,tech2;
    LinearLayout dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        name = findViewById(R.id.name);
        message = findViewById(R.id.msg);
        send = findViewById(R.id.send);
        call = findViewById(R.id.call);
        pres = findViewById(R.id.president);
        tech1 = findViewById(R.id.tech1);
        tech2 = findViewById(R.id.tech2);
        dev = findViewById(R.id.dev);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        actionBar.setTitle("Contact Us");

        GradientDrawable gd = new GradientDrawable();
        gd.setColor(Color.parseColor("#00FFFFFF"));
        gd.setCornerRadius(30);
        gd.setStroke(4, Color.BLACK);

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call(view);
            }
        });

        name.setBackground(gd);
        message.setBackground(gd);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "ietevit@vit.ac.in", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Mail from " + name.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    finish();
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Contact.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        pres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linkedin(view, "amogh-raut-b3823516a");
            }
        });
        tech1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linkedin(view, "chitturiarunkrishna");
            }
        });
        tech2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linkedin(view, "mayank-sethia");
            }
        });
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linkedin(view,"amilaneni-abhinav");
            }
        });
    }

    public boolean onSupportNavigateUp() {
        finish();

        return true;
    }

    public void call(View view) {
        try {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:7382204958"));
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            startActivity(callIntent);
            } catch (ActivityNotFoundException activityException) {
                Log.e("Calling a Phone Number", "Call failed", activityException);
            }

    }

    public void linkedin(View view, String name) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://" + name));
        final PackageManager packageManager = this.getPackageManager();
        final List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        if (list.isEmpty()) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedin.com/profile/view?id=" + name));
        }
        startActivity(intent);
    }
}
