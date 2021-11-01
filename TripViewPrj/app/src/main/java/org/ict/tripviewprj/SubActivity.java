package org.ict.tripviewprj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class SubActivity extends Activity {

    // 창부품 선언
    TextView tv1;
    Button returnBtn;
    ImageView flag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        // 창부품 연결
        tv1 = (TextView) findViewById(R.id.tv1);
        returnBtn = (Button) findViewById(R.id.returnBtn);
        flag = (ImageView) findViewById(R.id.flag);

        // 국기 고유 주소 저장
        int[] flagNums = { R.drawable.flag0, R.drawable.flag1, R.drawable.flag2,
                R.drawable.flag3, R.drawable.flag4, R.drawable.flag5, R.drawable.flag6,
                R.drawable.flag7, R.drawable.flag8, R.drawable.flag9, R.drawable.flag10,
                R.drawable.flag11, R.drawable.flag12, R.drawable.flag13, R.drawable.flag14};


        Intent intent = getIntent();
        String cityName = intent.getStringExtra("cityName");
        int position = intent.getIntExtra("position", 0);
        flag.setImageResource(flagNums[position]);
        tv1.setText(cityName);

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}
