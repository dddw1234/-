package com.shlee.travel;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class recommendation_daegu extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendation_daegu);
        GridView gridview = (GridView) findViewById(R.id.GridView01);
        gridview.setAdapter(new ImageAdapter_daegu(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                switch(position){//사진의 위치에 따라 어디의 사진인지 토스트메시지를 띄움
                    case 0:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 83타워", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 국채보상운동 기념공원", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 김광석거리", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 달성공원 동물원", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 대구 수목원", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 대구 스파밸리", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 안지랑 곱창거리", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 월광 수변공원", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 이월드", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(recommendation_daegu.this, position+1 +". 칠성 야시장", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

}
