package org.ict.contextmenuprj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //창부품(리니어레이아웃, 버튼2개)
    LinearLayout bgl;
    Button backBtn, changeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //창부품 연결
        bgl = (LinearLayout) findViewById(R.id.bgl);
        backBtn = (Button) findViewById(R.id.backBtn);
        changeBtn = (Button) findViewById(R.id.changeBtn);
        // backBtn, changeBtn을 클릭했을때 컨텍스트 메뉴가 뜨도록 연결
        registerForContextMenu(backBtn);
        registerForContextMenu(changeBtn);
    }

    // 각각 버튼을 클릭했을때 menu1, menu2가 조건에 맞게 표출되도록 설정
    // onCreateContextMenu를 Override를 통해 구현합니다
    // 상단 Code -> Override Methods 들어가서 위 메서드를 구현해주세요.

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        // 메뉴 생성을 위해 Inflater 생성
        MenuInflater mInflater = getMenuInflater();
        Log.d("태그", v + "");

        // v는 추가 아까한 registerForCotnextMenu에 등록된 요소입니다.
        // 롱클릭이므로 길게 눌러야 나옵니다.
        if (v == backBtn){
            // backBtn에는 menu1.xml을 연결
            mInflater.inflate(R.menu.menu1, menu);
        }
        if (v == changeBtn){
            mInflater.inflate(R.menu.menu2, menu);
        }
    }


    // menu1, menu2 내부의 옵션을 클릭했을때 실행할 내용들은
    // onContextItemSelected를 Override를 통해 구현합니다.
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        Log.d("선택된 요소", item.getItemId()+"");
        if (item.getItemId() == R.id.backRed){
            bgl.setBackgroundColor(Color.RED);
        } else if(item.getItemId()==R.id.backBlue) {
            bgl.setBackgroundColor(Color.BLUE);
        } else if(item.getItemId()==R.id.backGreen) {
            bgl.setBackgroundColor(Color.GREEN);
        } else if(item.getItemId()==R.id.backYellow) {
            bgl.setBackgroundColor(Color.YELLOW);
        } else if(item.getItemId() == R.id.rotate){
            changeBtn.setRotation(45);
        } else if(item.getItemId() == R.id.upSize){
            changeBtn.setScaleX(2);
        }

        return super.onContextItemSelected(item);
    }
}




