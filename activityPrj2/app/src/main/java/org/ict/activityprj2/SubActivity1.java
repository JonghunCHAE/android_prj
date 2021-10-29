package org.ict.activityprj2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class SubActivity1 extends Activity {

    // 버튼 2개
    Button moveSub2, cancel1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1);

        // 연결
        moveSub2 = (Button) findViewById(R.id.moveSub2);
        cancel1 = (Button) findViewById(R.id.cancel1);

        moveSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sub2로 보내기 위해 인텐트 생성 및 보내기
                Intent intent = new Intent(getApplicationContext(),
                                            SubActivity2.class);
                startActivity(intent);
            }
        });

        cancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
