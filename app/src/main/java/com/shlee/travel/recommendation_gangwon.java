package com.shlee.travel;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class recommendation_gangwon extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendation_gangwon);
        GridView gridview = (GridView) findViewById(R.id.GridView01);
        gridview.setAdapter(new ImageAdapter_gangwon(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                switch(position){//사진의 위치에 따라 어디의 사진인지 토스트메시지를 띄움
                    case 0:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 강원랜드", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 구곡폭포", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 남이섬", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 대관령 삼양목장", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 모래시계공원", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 애니메이션 박물관", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 울산바위", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 정동진 레일바이크", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(recommendation_gangwon.this, position+1 +". 하슬라 아트월드", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

}
