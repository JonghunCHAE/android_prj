package org.ict.loginprj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SuccessActivity extends Activity {

    // 로그아웃
    Button logoutBtn;
    TextView idTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginsuccess);

        // 로그아웃버튼 연결
        logoutBtn = (Button) findViewById(R.id.logoutBtn);
        idTv = (TextView) findViewById(R.id.idTv);

        // 이동할때 활용한 인텐트 불러오기
        Intent intent = getIntent();

        String id = intent.getStringExtra("id");

        idTv.setText(id + "님이 로그인 하셨습니다.");

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
