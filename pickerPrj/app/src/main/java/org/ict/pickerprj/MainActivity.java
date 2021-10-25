package org.ict.pickerprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    DatePicker dPicker;
    Button btn1, btn2;
    TextView tv1, tv2;

    // 전역변수에 날짜 관련 정보 저장
    Integer yearInt, month, day;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        dPicker = (DatePicker) findViewById(R.id.dPicker);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);

        // 창부품이 연결되면, 먼저 1차적으로 날짜정보를 가져옵니다.
        yearInt = dPicker.getYear();
        month = dPicker.getMonth() + 1;
        day = dPicker.getDayOfMonth();


        // 날짜 처리는 DatePicker에 날짜가 변할때마다 변수에 담는것으로 처리합니다.
        // 창이 열리자마자 가져오게 할 때는 dPicker.getYear(), .getMonthOfYear()등을 활용
        dPicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view,
                                      int year,
                                      int monthOfYear,
                                      int dayOfMonth) {
                yearInt = year;
                month = monthOfYear + 1;
                day = dayOfMonth;
                Log.d("날짜",
                        yearInt + "년/" + month + "월/" + day + "일");
            }
        });// 날짜 변경시 이벤트 처리

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               tv1.setText(yearInt + "년/" + month + "월/" + day + "일");
           }
       });// 체크인 버튼 눌렀을때

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               tv2.setText(yearInt + "년/" + month + "월/" + day + "일");
           }
       });// 체크아웃 버튼 눌렀을때

    }
}














