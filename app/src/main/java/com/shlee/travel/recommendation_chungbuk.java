package com.shlee.travel;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class recommendation_chungbuk extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendation_chungbuk);
        GridView gridview = (GridView) findViewById(R.id.GridView01);
        gridview.setAdapter(new ImageAdapter_chungbuk(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                switch(position){//사진의 위치에 따라 어디의 사진인지 토스트메시지를 띄움
                    case 0:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 단양 다누리 아쿠아리움", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 상수 허브랜드", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 수암골 벽화마을", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 온달 국민관광지", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 의림지 파크랜드", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 청주랜드", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 청풍 문화재단지", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 청풍호 관광 모노레일", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 충주 라이트월드", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(recommendation_chungbuk.this, position+1 +". 큰바위얼굴 테마파크", Toast.LENGTH_SHORT).show();
                        break;
                }            }
        });
    }

}
