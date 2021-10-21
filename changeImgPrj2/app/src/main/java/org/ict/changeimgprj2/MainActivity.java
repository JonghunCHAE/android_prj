package org.ict.changeimgprj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    TextView tv1;
    Switch sch1;
    RadioGroup rg1;
    RadioButton rbtn1, rbtn2;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        tv1 = (TextView) findViewById(R.id.tv1);
        sch1 = (Switch) findViewById(R.id.sch1);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton) findViewById(R.id.rbtn2);
        iv1 = (ImageView) findViewById(R.id.iv1);

        //이벤트 연결
        sch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("디버깅", isChecked + "");

                // 스위치가 켜져있다면, 요소들 모두 보이게
                if(isChecked){
                    rg1.setVisibility(View.VISIBLE);
                    rbtn1.setVisibility(View.VISIBLE);
                    rbtn2.setVisibility(View.VISIBLE);
                    iv1.setVisibility(View.VISIBLE);
                } else {
                    // 스위치 off시 요소들 안보이게
                    rg1.setVisibility(View.INVISIBLE);
                    rbtn1.setVisibility(View.INVISIBLE);
                    rbtn2.setVisibility(View.INVISIBLE);
                    iv1.setVisibility(View.INVISIBLE);
                }
            }
        });

        // 1. rbtn1, rbtn2에 onClick이벤트를 걸어서 처리
        // 2. rg1을 이용해서 rbtn1, rbtn2중 어떤게 클릭되었는지 감지해 처리
        // 어제 2를 이용해 처리했기때문에 오늘은 1로 처리하겠습니다.
        rbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.setImageResource(R.drawable.ic_launcher_foreground);
            }
        });

        rbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.setImageResource(R.drawable.ic_launcher_background);
            }
        });

    }}








