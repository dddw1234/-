package com.shlee.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    class MyView extends AppCompatImageView implements View.OnTouchListener{

        private Bitmap image;
        public MyView(Context context){//커스텀뷰 사용
            super(context);
            setBackgroundColor(Color.parseColor("#FF0099cc"));//배경색 변경

            Resources r = context.getResources();
            image = BitmapFactory.decodeResource(r, R.drawable.train);//비트맵을 사용하여 이미지 저장
        }
        public boolean onTouch(View v, MotionEvent event){
            Intent intent = new Intent(getApplicationContext(), map.class);
            startActivity(intent);//인텐트 사용하여 map.class로 화면 전환
            return true;
        }
        public void onDraw(Canvas canvas){
            canvas.drawBitmap(image, 420, 1200, null);//저장한 이미지를 그림
            super.onDraw(canvas);
            Paint paint = new Paint();//paint 객체 설정
            paint.setTextSize(200);//글씨크기 설정
            canvas.drawText("여행 지도", 150, 800, paint);//paint사용하여 제목 작성
            this.setOnTouchListener(this);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//타이틀바를 없애고 전체화면으로 전환
        MyView w = new MyView(this);//커스텀뷰 객체 선언
        setContentView(w);//커스텀뷰 화면 출력
    }

}