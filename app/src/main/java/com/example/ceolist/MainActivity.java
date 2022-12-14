package com.example.ceolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Modeldata> l1=new ArrayList();

    int[] img = {R.drawable.nadella, R.drawable.alon, R.drawable.mark, R.drawable.andyjassy,
            R.drawable.mukesh, R.drawable.tim_cook, R.drawable.sundar, R.drawable.safracatz};

    int[] img1 = {R.drawable.microsoft, R.drawable.tesla, R.drawable.facbook, R.drawable.amazon,
            R.drawable.reliance, R.drawable.apple, R.drawable.google, R.drawable.oracle};
    String[] name = {"Satya Nadella", "Elon Musk", "Mark Zuckerberg", "Andy Jassy", "Mukesh Ambani", "Tim Cook",
            "Sundar Pichai", "SafraCatz"};


    String[] company = {"Microsoft", "Tesla", "Meta(facebook)", "Amazon", "Relince", "Apple", "Google", "Oracle"};

    String[] country = {"US", "US", "US", "US", "INDIA", "US", "US", "US"};

    String[] detail = {"Satya Narayana Nadella is an Indian-American business executive. He is the executive chairman and CEO of Microsoft, succeeding Steve Ballmer in 2014 as CEO and John W. Thompson in 2021 as chairman.",
            "Elon Reeve Musk FRS is a business magnate and investor. He is the founder, CEO, and Chief Engineer at SpaceX; angel investor, CEO, and Product Architect of Tesla, Inc.; founder of The Boring Company; and co-founder of Neuralink and OpenAI.",
            "Mark Elliot Zuckerberg is an American media magnate, internet entrepreneur, and philanthropist. He is known for co-founding the social media website Facebook and its parent company Meta Platforms, of which he is the chairman, chief executive officer, and controlling shareholder.",
            "Andrew R. Jassy is an American business executive who has been the president and chief executive officer of Amazon since 2021.",
            "Mukesh Dhirubhai Ambani is an Indian billionaire industrialist. He is the chairman and managing director of Reliance Industries Ltd., a Fortune Global 500 company and India's most valuable company by market value.",
            "Timothy Donald Cook is an American business executive and engineer who has been the chief executive officer of Apple Inc. since 2011. Cook previously served as the company's chief operating officer under its co-founder Steve Jobs.",
            "Pichai Sundararajan, better known as Sundar Pichai, is an Indian-American business executive. He is the chief executive officer of Alphabet Inc. and its subsidiary Google. Born in Madurai, India, Pichai earned his degree from IIT Kharagpur in metallurgical engineering.",
            "Safra Ada Catz is an American billionaire banker and technology executive. She is the CEO of Oracle Corporation. She has been an executive at Oracle since April 1999, and a board member since 2001. In April 2011, she was named co-president and chief financial officer, reporting to founder Larry Ellison."};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
        for(int i=0;i< img.length;i++)
        {
            Modeldata m1 =new Modeldata();
            m1.setImage(img[i]);
            m1.setName(name[i]);
            m1.setCompany(company[i]);
            m1.setCountry(country[i]);
            m1.setDetail(detail[i]);
            m1.setImage1(img1[i]);
            l1.add(m1);
        }
        initsetupView();
    }
    private void initBinding() {
        recyclerView =findViewById(R.id.recyclerview);
    }

    private void initsetupView() {
        rvAdapter adapter =new rvAdapter(this,l1);
        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);}

    {
    }
}