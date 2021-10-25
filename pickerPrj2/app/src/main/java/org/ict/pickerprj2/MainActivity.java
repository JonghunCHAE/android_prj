package org.ict.pickerprj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    // 부품생성
    Button btn1, btn2;
    DatePicker dPicker;
    TimePicker tPicker;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 부품 연결
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        dPicker = (DatePicker) findViewById(R.id.dPicker);
        tPicker = (TimePicker) findViewById(R.id.tPicker);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

        //출근버튼 처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 시간을 얻어서 tv1에 출력해줍니다.(연월일시분)
                int year = dPicker.getYear();
                int month = (dPicker.getMonth() + 1);
                int day = dPicker.getDayOfMonth();
                int hour = tPicker.getHour();
                int min= tPicker.getMinute();
                tv1.setText(year + "년/" + month + "월/" +day + "일/"
                                                        + hour + "시/" + min + "분" );
                // 2. btn2와 활성화상태로 만들고, btn1은 못 쓰게 만들어야함.
                btn2.setEnabled(true);
                btn1.setEnabled(false);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 현재 시간 얻어오기
                long now =System.currentTimeMillis();
                Date date = new Date(now);
                
                // 1. 시간을 얻어서 dPicker, tPicker에 갱신
                dPicker.updateDate((date.getYear()+1900), (date.getMonth()), date.getDate());
                tPicker.setHour(date.getHours());
                tPicker.setMinute(date.getMinutes());
                Log.d("연",  (1900 + date.getYear()) + "");
                Log.d("월", date.getMonth() + "");
                Log.d("일", date.getDate() + "");

                Log.d("시간", date.getHours() + "");
                Log.d("분", date.getMinutes() + "");
                //세팅된 시간을 가져옴
                int year = dPicker.getYear();
                int month = (dPicker.getMonth() + 1);
                int day = dPicker.getDayOfMonth();
                int hour = tPicker.getHour();
                int min= tPicker.getMinute();
                
                tv2.setText(year + "년/" + month + "월/" +day + "일/"
                        + hour + "시/" + min + "분" );
                btn2.setEnabled(false);
            }
        });






    }
}




