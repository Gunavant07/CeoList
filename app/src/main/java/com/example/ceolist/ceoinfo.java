package com.example.ceolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ceoinfo extends AppCompatActivity {

    String Name,company,country,info;
    int imagelogo,imagowner;
    TextView txtname,txtinfo;
    TextView txtcompany;
    TextView txtcountry;
    ImageView profile_image,imglogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceoinfo);
        initBinding();
        getIntentData();
        setIntentData();
    }
    private void getIntentData() {
        Name=getIntent().getStringExtra("txtname");
        company=getIntent().getStringExtra("txtcompany");
        country=getIntent().getStringExtra("txtcountry");
        info=getIntent().getStringExtra("txtinfo");
        imagowner=getIntent().getIntExtra("profile_image",0);
        imagelogo=getIntent().getIntExtra("imglogo",0);
    }

    private void setIntentData() {
        txtname.setText(Name);
        txtcompany.setText(company);
        txtcountry.setText(country);
        txtinfo.setText(info);
        profile_image.setImageResource(imagowner);
        imglogo.setImageResource(imagelogo);


    }

    private void initBinding() {
        txtname=findViewById(R.id.txtname);
        txtcompany=findViewById(R.id.txtcompany);
        txtcountry=findViewById(R.id.txtcountry);
        txtinfo=findViewById(R.id.txtinfo);
        profile_image=findViewById(R.id.profile_image);
        imglogo=findViewById(R.id.imglogo);
    }
}