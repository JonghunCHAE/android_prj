package org.ict.widgetprj9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    // 부품 생성
    // 뷰플리퍼 변수 하나, 버튼 2개, 뷰플리퍼는 final 도 붙어야함.
    Button prev, next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // 연결도 해주세요.
        // 뷰플리퍼는 final로 선언해야 제대로 돌아가기때문에 onCreate안쪽에 선언
        // 다른 부품들은 일반적으로 선언 위치가 따로 정해져있지 않습니다.
        final ViewFlipper vf1;
        prev = (Button)findViewById(R.id.prevBtn);
        next = (Button)findViewById(R.id.nextBtn);
        vf1 = (ViewFlipper)findViewById(R.id.vf1);
        
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vf1.showPrevious();// 전 페이지 넘어가기
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vf1.showNext();
            }
        });

    }
}