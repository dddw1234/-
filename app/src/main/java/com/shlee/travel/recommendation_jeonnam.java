package com.shlee.travel;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class recommendation_jeonnam extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendation_jeonnam);
        GridView gridview = (GridView) findViewById(R.id.GridView01);
        gridview.setAdapter(new ImageAdapter_jeonnam(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                switch(position){//사진의 위치에 따라 어디의 사진인지 토스트메시지를 띄움
                    case 0:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 낙성읍성 민속마을", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 메타프로방스", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 보해매실농원", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 섬진강 기차마을", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 순천 드라마촬영장", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 여수 아쿠아플라넷", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 오동도", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 장흥 묵촌리 동백림", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 진도개 테마파크", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(recommendation_jeonnam.this, position+1 +". 해남 미황사", Toast.LENGTH_SHORT).show();
                        break;
                }             }
        });
    }

}
