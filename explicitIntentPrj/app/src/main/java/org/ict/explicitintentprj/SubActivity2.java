package org.ict.explicitintentprj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SubActivity2 extends Activity {

    // 텍스트뷰 생성
    TextView message2;
    // 버튼 생성
    Button cancel2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub2);
        // 부품 연결
        message2 = (TextView) findViewById(R.id.message2);
        cancel2 = (Button) findViewById(R.id.cancelBtn2);

        // 인텐트 받아오기
        Intent intent = getIntent();

        String data = intent.getStringExtra("test");

        message2.setText(data);


        cancel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
