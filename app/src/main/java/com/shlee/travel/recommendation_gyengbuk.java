package com.shlee.travel;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class recommendation_gyengbuk extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendation_gyengbuk);
        GridView gridview = (GridView) findViewById(R.id.GridView01);
        gridview.setAdapter(new ImageAdapter_gyengbuk(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                switch(position){//사진의 위치에 따라 어디의 사진인지 토스트메시지를 띄움
                    case 0:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 고령 왕릉전시관", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 구미 에코랜드", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 독도박물관", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 목은기념관", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 불국사", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 영양 반딧불이생태공원", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 영천 한의마을", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 울릉천국", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 포항 구룡포근대문화역사거리", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(recommendation_gyengbuk.this, position+1 +". 황금 대게공원", Toast.LENGTH_SHORT).show();
                        break;
                }             }
        });
    }

}
