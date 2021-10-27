package org.ict.photomenuprj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        iv = (ImageView) findViewById(R.id.iv);

    }

    // 창 생성시 처리할 옵션
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        /*
        // 메뉴바 추가하기
        menu.add(0, 1, 0, "고양이");
        menu.add(0, 2, 0, "둘리");
        menu.add(0, 3, 0, "코딩");
        */
        // 현 레이아웃에 메뉴적용을 위해 인플레이터 생성
        MenuInflater mInflater = getMenuInflater();
        // 기존 레이아웃에 리소스 폴더 내 xml파일 저장
        mInflater.inflate(R.menu.manu, menu);
        return true;
    }

    // 메뉴 클릭시 반응하게 만들기
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d("선택한 버튼 아이디", item.getItemId()+"");
        if(item.getItemId() == R.id.cat){
            iv.setImageResource(R.drawable.cat);
        } else if(item.getItemId() == R.id.dino){
            iv.setImageResource(R.drawable.dino);
        } else if(item.getItemId() == R.id.cord){
            iv.setImageResource(R.drawable.button);
        }

        return super.onOptionsItemSelected(item);

    }
}



