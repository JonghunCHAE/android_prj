package org.ict.widgetprj7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    // 창부품 생성
    Button btn1, btn2, btn3;
    Chronometer cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 부품 연결
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        cm = (Chronometer) findViewById(R.id.cm);

        // 시작 클릭시 크로노미터가 작동하도록
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm.start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm.stop();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm.setBase(SystemClock.elapsedRealtime());
                cm.stop();
            }
        });


    }
}






