package com.shlee.travel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ToggleButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


class DBHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "map.db";//데이터베이스 이름
    private static final int DATABASE_VERSION = 1;//데이터베이스 버젼

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }//데이터베이스 사용을 위한 DBHelper

    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE contacts (name TEXT, color INTEGER)");
        for(int i=1; i<18; i++){
            db.execSQL("INSERT INTO contacts VALUES ('image" + i + "'" + ", '0');");//데이터 베이스에 image1부터 image17까지에 0 저장
        }
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS contacts");
    }
}

public class map extends AppCompatActivity {
    DBHelper helper;
    SQLiteDatabase db;

    private static final String TAG = "MusicService";

    ImageButton image_gwangju, image_seoul, image_sejong, image_dajeon, image_incheon, image_dague, image_ulsan, image_jeju, image_busan, image_gangwon, image_gyenggi, image_chungbuk, image_chungnam, image_gyengbuk, image_gyengnam, image_jeonbuk, image_jeonnam;
    class MyListener_gwangju implements View.OnClickListener{//광주를 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");//color에 초록색 저장
            if(colorFilterColor == color){//colorFilterColor가 초록색일시
                image_gwangju.setColorFilter(Color.parseColor("#BFBBBB"));//회색으로 변경
                colorFilterColor = 0;//colorFilterColor를 다시 0으로 설정

            }
            else{
                image_gwangju.setColorFilter(color, PorterDuff.Mode.MULTIPLY);//colorFilterColor가 초록색이 아닐때 이미지의 색을 초록색으로 변경
                colorFilterColor = color;//colorFilterColor를 초록색으로 설정

            }
            update("image1");//데이터베이스에 image1의 color값을 0또는1로 변경
        }
    }
    class MyListener_seoul implements View.OnClickListener{//서울 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_seoul.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;

            }
            else{
                image_seoul.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;

            }
            update("image2");
        }
    }
    class MyListener_sejong implements View.OnClickListener{//세종 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_sejong.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_sejong.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image3");
        }    }
    class MyListener_dajeon implements View.OnClickListener{//대전 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_dajeon.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_dajeon.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image4");
        }    }
    class MyListener_incheon implements View.OnClickListener{//인천 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_incheon.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_incheon.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image5");
        }    }
    class MyListener_dague implements View.OnClickListener{//대구 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_dague.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_dague.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image6");
        }    }
    class MyListener_ulsan implements View.OnClickListener{//울산 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_ulsan.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_ulsan.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image7");
        }    }
    class MyListener_jeju implements View.OnClickListener{//제주 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_jeju.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;

            }
            else{
                image_jeju.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image8");
        }    }
    class MyListener_busan implements View.OnClickListener{//부산 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_busan.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_busan.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image9");
        }    }
    class MyListener_gangwon implements View.OnClickListener{//강원도 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_gangwon.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_gangwon.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image10");
        }
    }
    class MyListener_gyenggi implements View.OnClickListener{//경기도 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_gyenggi.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_gyenggi.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image11");
        }    }
    class MyListener_chungbuk implements View.OnClickListener{//충청북도 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_chungbuk.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_chungbuk.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image12");
        }    }
    class MyListener_chungnam implements View.OnClickListener{//충청남도 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_chungnam.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_chungnam.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image13");
        }    }
    class MyListener_gyengbuk implements View.OnClickListener{//경상북도 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_gyengbuk.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_gyengbuk.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image14");
        }    }
    class MyListener_gyengnam implements View.OnClickListener{//경상남도 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_gyengnam.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_gyengnam.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image15");
        }    }
    class MyListener_jeonbuk implements View.OnClickListener{//전라북도 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_jeonbuk.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_jeonbuk.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image16");
        }    }
    class MyListener_jeonnam implements View.OnClickListener{//전라남도 클릭시
        int colorFilterColor = 0;
        public void onClick(View v){
            int color = Color.parseColor("#4CAF50");
            if(colorFilterColor == color){
                image_jeonnam.setColorFilter(Color.parseColor("#BFBBBB"));
                colorFilterColor = 0;
            }
            else{
                image_jeonnam.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                colorFilterColor = color;
            }
            update("image17");
        }    }


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        helper = new DBHelper(this);//helper객체 선언
        db = helper.getReadableDatabase();

        image_gwangju = (ImageButton) findViewById(R.id.gwangju);//각 지역의 이미지버튼 찾기
        image_seoul = (ImageButton) findViewById(R.id.seoul);
        image_sejong = (ImageButton) findViewById(R.id.sejong);
        image_dajeon = (ImageButton) findViewById(R.id.dajeon);
        image_incheon = (ImageButton) findViewById(R.id.incheon);
        image_dague = (ImageButton) findViewById(R.id.daegu);
        image_ulsan = (ImageButton) findViewById(R.id.ulsan);
        image_jeju = (ImageButton) findViewById(R.id.jeju);
        image_busan = (ImageButton) findViewById(R.id.busan);
        image_gangwon = (ImageButton) findViewById(R.id.gangwon);
        image_gyenggi = (ImageButton) findViewById(R.id.gyenggi);
        image_chungbuk = (ImageButton) findViewById(R.id.chungbuk);
        image_chungnam = (ImageButton) findViewById(R.id.chungnam);
        image_gyengbuk = (ImageButton) findViewById(R.id.gyengbuk);
        image_gyengnam = (ImageButton) findViewById(R.id.gyengnam);
        image_jeonbuk = (ImageButton) findViewById(R.id.jeonbuk);
        image_jeonnam = (ImageButton) findViewById(R.id.jeonnam);

        if(search("image1") == 1){//image1의 color값이 1인경우 초록색
            image_gwangju.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image1") == 0){//0인경우 회색
            image_gwangju.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image2") == 1){
            image_seoul.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image2") == 0){
            image_seoul.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image3") == 1){
            image_sejong.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image3") == 0){
            image_sejong.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image4") == 1){
            image_dajeon.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image4") == 0){
            image_dajeon.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image5") == 1){
            image_incheon.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image5") == 0){
            image_incheon.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image6") == 1){
            image_dague.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image6") == 0){
            image_dague.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image7") == 1){
            image_ulsan.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image7") == 0){
            image_ulsan.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image8") == 1){
            image_jeju.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image8") == 0){
            image_jeju.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image9") == 1){
            image_busan.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image9") == 0){
            image_busan.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image10") == 1){
            image_gangwon.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image10") == 0){
            image_gangwon.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image11") == 1){
            image_gyenggi.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image11") == 0){
            image_gyenggi.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image12") == 1){
            image_chungbuk.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image12") == 0){
            image_chungbuk.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image13") == 1){
            image_chungnam.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image13") == 0){
            image_chungnam.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image14") == 1){
            image_gyengbuk.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image14") == 0){
            image_gyengbuk.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image15") == 1){
            image_gyengnam.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image15") == 0){
            image_gyengnam.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image16") == 1){
            image_jeonbuk.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image16") == 0){
            image_jeonbuk.setColorFilter(Color.parseColor("#BFBBBB"));
        }
        if(search("image17") == 1){
            image_jeonnam.setColorFilter(Color.parseColor("#4CAF50"));
        }
        else if(search("image17") == 0){
            image_jeonnam.setColorFilter(Color.parseColor("#BFBBBB"));
        }


        MyListener_gwangju buttonListener1 = new MyListener_gwangju();//각 버튼에 Listener설정
        image_gwangju.setOnClickListener(buttonListener1);

        MyListener_seoul buttonListener2 = new MyListener_seoul();
        image_seoul.setOnClickListener(buttonListener2);

        MyListener_sejong buttonListener3 = new MyListener_sejong();
        image_sejong.setOnClickListener(buttonListener3);

        MyListener_dajeon buttonListener4 = new MyListener_dajeon();
        image_dajeon.setOnClickListener(buttonListener4);

        MyListener_incheon buttonListener5 = new MyListener_incheon();
        image_incheon.setOnClickListener(buttonListener5);

        MyListener_dague buttonListener6 = new MyListener_dague();
        image_dague.setOnClickListener(buttonListener6);

        MyListener_ulsan buttonListener7 = new MyListener_ulsan();
        image_ulsan.setOnClickListener(buttonListener7);

        MyListener_jeju buttonListener8 = new MyListener_jeju();
        image_jeju.setOnClickListener(buttonListener8);

        MyListener_busan buttonListener9 = new MyListener_busan();
        image_busan.setOnClickListener(buttonListener9);

        MyListener_gangwon buttonListener10 = new MyListener_gangwon();
        image_gangwon.setOnClickListener(buttonListener10);

        MyListener_gyenggi buttonListener11 = new MyListener_gyenggi();
        image_gyenggi.setOnClickListener(buttonListener11);

        MyListener_chungbuk buttonListener12 = new MyListener_chungbuk();
        image_chungbuk.setOnClickListener(buttonListener12);

        MyListener_chungnam buttonListener13 = new MyListener_chungnam();
        image_chungnam.setOnClickListener(buttonListener13);

        MyListener_gyengbuk buttonListener14 = new MyListener_gyengbuk();
        image_gyengbuk.setOnClickListener(buttonListener14);

        MyListener_gyengnam buttonListener15 = new MyListener_gyengnam();
        image_gyengnam.setOnClickListener(buttonListener15);

        MyListener_jeonbuk buttonListener16 = new MyListener_jeonbuk();
        image_jeonbuk.setOnClickListener(buttonListener16);

        MyListener_jeonnam buttonListener17 = new MyListener_jeonnam();
        image_jeonnam.setOnClickListener(buttonListener17);
    }

    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();//토글버튼이 on인지 off인지 확인

        if(on){
            Log.d(TAG, "onToggleClicked() start");//on이면 노래 재생
            startService(new Intent(this, MusicService.class));
        } else{
            Log.d(TAG, "onToggleClicked() stop");//off이면 노래 정지
            stopService(new Intent(this, MusicService.class));
        }
    }

    public void onBackPressed(){//뒤로가기 버튼을 누를시
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);//메뉴상자 객체 생성
        alertDialogBuilder.setMessage("종료하시겠습니까?");
        alertDialogBuilder.setPositiveButton("네",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {//'네' 선택시 앱 종료
                        Intent a = new Intent(Intent.ACTION_MAIN);
                        a.addCategory(Intent.CATEGORY_HOME);
                        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(a);
                        //finish();
                    }
                });
        alertDialogBuilder.setNegativeButton("아니오",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {//아니오 선택시 원래 화면으로
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    public int search(String name){//데이터베이스 내 각각의 name에서 color값 찾는 함수
        int color = 0;
        Cursor cursor = db.rawQuery("SELECT * FROM contacts WHERE name='" + name + "';", null);
        while(cursor.moveToNext()){
            color = cursor.getInt(1);
        }
        return color;
    }
    public void update(String name){//데이터베이스 내 color값 변경 함수
        if(search(name) == 0){//color값 0일때 1로 변경
            db.execSQL("UPDATE contacts SET color = 1 WHERE name='" + name + "';");
        }
        else if(search(name) == 1){//color값 1일때 0으로 변경
            db.execSQL("UPDATE contacts SET color = 0 WHERE name='" + name + "';");
        }
    }
    public boolean onCreateOptionsMenu(Menu menu){//메뉴 생성
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.regions, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.seoul_btn://메뉴에서 서울 버튼 클릭시 서울 관광지 추천해주는 화면으로 감
                Intent intent_seoul = new Intent(getApplicationContext(), recommendation_seoul.class);
                startActivity(intent_seoul);
                return true;
            case R.id.busan_btn:
                Intent intent_busan = new Intent(getApplicationContext(), recommendation_busan.class);
                startActivity(intent_busan);
                return true;
            case R.id.daejeon_btn:
                Intent intent_daejeon = new Intent(getApplicationContext(), recommendation_dajeon.class);
                startActivity(intent_daejeon);
                return true;
            case R.id.daegu_btn:
                Intent intent_daegu = new Intent(getApplicationContext(), recommendation_daegu.class);
                startActivity(intent_daegu);
                return true;
            case R.id.incheon_btn:
                Intent intent_incheon = new Intent(getApplicationContext(), recommendation_incheon.class);
                startActivity(intent_incheon);
                return true;
            case R.id.gwangju_btn:
                Intent intent_gwangju = new Intent(getApplicationContext(), recommendation_gwangju.class);
                startActivity(intent_gwangju);
                return true;
            case R.id.ulsan_btn:
                Intent intent_ulsan = new Intent(getApplicationContext(), recommendation_ulsan.class);
                startActivity(intent_ulsan);
                return true;
            case R.id.jeju_btn:
                Intent intent_jeju = new Intent(getApplicationContext(), recommendation_jeju.class);
                startActivity(intent_jeju);
                return true;
            case R.id.sejong_btn:
                Intent intent_sejong = new Intent(getApplicationContext(), recommendation_sejong.class);
                startActivity(intent_sejong);
                return true;
            case R.id.gangwon_btn:
                Intent intent_gangwon = new Intent(getApplicationContext(), recommendation_gangwon.class);
                startActivity(intent_gangwon);
                return true;
            case R.id.gyenggi_btn:
                Intent intent_gyenggi = new Intent(getApplicationContext(), recommendation_gyenggi.class);
                startActivity(intent_gyenggi);
                return true;
            case R.id.chungbuk_btn:
                Intent intent_chungbuk = new Intent(getApplicationContext(), recommendation_chungbuk.class);
                startActivity(intent_chungbuk);
                return true;
            case R.id.chungnam_btn:
                Intent intent_chungnam = new Intent(getApplicationContext(), recommendation_chungnam.class);
                startActivity(intent_chungnam);
                return true;
            case R.id.gyengbuk_btn:
                Intent intent_gyengbuk = new Intent(getApplicationContext(), recommendation_gyengbuk.class);
                startActivity(intent_gyengbuk);
                return true;
            case R.id.gyengnam_btn:
                Intent intent_gyengnam = new Intent(getApplicationContext(), recommendation_gyengnam.class);
                startActivity(intent_gyengnam);
                return true;
            case R.id.jeonbuk_btn:
                Intent intent_jeonbuk = new Intent(getApplicationContext(), recommendation_jeonbuk.class);
                startActivity(intent_jeonbuk);
                return true;
            case R.id.jeonnam_btn:
                Intent intent_jeonnam = new Intent(getApplicationContext(), recommendation_jeonnam.class);
                startActivity(intent_jeonnam);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
