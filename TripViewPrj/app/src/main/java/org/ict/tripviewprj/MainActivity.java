package org.ict.tripviewprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // 창부품 생성
    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        lv1 = (ListView) findViewById(R.id.lv1);

        // 부품에 넣을 리스트 생성
        final String[] trips = {
                "서울", "울릉도", "상하이", "광저우", "하와이", "캘리포니아",
                "파리", "니스", "함부르크", "베를린", "우수아이아", "로마",
                "나폴리", "방콕", "호치민"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, trips);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                                View view,
                                                int position,
                                                long id) {
                Intent intent = new Intent(getApplicationContext(),
                                            SubActivity.class);
                intent.putExtra("cityName", trips[position]);
                // 국기 표현시 알맞은 그림을 택하기 위해 전송
                intent.putExtra("position", position);
                startActivity(intent);

            }
        });

    }
}