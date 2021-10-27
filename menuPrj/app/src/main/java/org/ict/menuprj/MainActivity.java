package org.ict.menuprj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    // 리니어 레이아웃 1개, 버튼 1개
    LinearLayout layout1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 창부품 연결
        layout1 = (LinearLayout) findViewById(R.id.outLayout);
        btn1 = (Button) findViewById(R.id.btn1);

        setTitle("화면상단이름바꾸기");
    }

    // 외부xml파일 추가로 등록하기
    // 커서를 onCreate 바깥에 둔 다음 상단의 code -> Override Methods를 선택하고,
    // onCreateOptionsMenu를 선택해주세요.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        /*자바 코드로 처리하기 위해 기존 코드 주석
        // 메뉴 추가를 위해 inflater를 활용
        MenuInflater mInflater = getMenuInflater();
        // 기존 레이아웃에 메뉴 삽입
        //.inflate(리소스 폴더 내 xml파일 지정, menu);
        mInflater.inflate(R.menu.menu1, menu); */

        menu.add(0, 1, 0, "배경을 빨강으로 바꾸기");
        menu.add(0, 2, 0, "배경을 파랑으로 바꾸기");
        menu.add(0, 3, 0, "배경을 노랑으로 바꾸기");
        menu.add(0, 4, 0, "배경을 녹색으로 바꾸기");

        // 서브메뉴 추가
        SubMenu sMenu = menu.addSubMenu("서브메뉴명");
        sMenu.add(0, 5, 0, "버튼 45도 회전시키기");
        sMenu.add(0, 6, 0, "버튼 크기 키우기");
        return true;
    }

    // 옵션 요소가 선택되었을때 실행할 코드 추가
    // code -> Override Methods를 선택하고
    // onOptionsItemSelected()를 자동완성 시킨 후 item.getItemId() 디버깅을 먼저 해보세요.

    Integer rotation = 0;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d("선택한아이템", item.getItemId() + "");
        if(item.getItemId() == 1){
            layout1.setBackgroundColor(Color.RED);
        } else if(item.getItemId() == 2){
            layout1.setBackgroundColor(Color.BLUE);
        } else if(item.getItemId() == 4){
            layout1.setBackgroundColor(Color.GREEN);
        } else if(item.getItemId() == 3){
            layout1.setBackgroundColor(Color.YELLOW);
        } else if (item.getItemId() == 5){
            rotation += 45;
            btn1.setRotation(rotation);
            // 45도 고정이 아닌 45도씩 돌아가도록 로직을 수정해보세요.
        } else if (item.getItemId() == 6){
            btn1.setScaleX(2);
        }
        return super.onOptionsItemSelected(item);
    }
}







