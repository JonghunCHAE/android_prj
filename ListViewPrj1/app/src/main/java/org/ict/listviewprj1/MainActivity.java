package org.ict.listviewprj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //리스트뷰 선언
    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 리스트뷰 연결
        lv1 = (ListView) findViewById(R.id.lv1);

        // 리스트뷰에 적용할 목록
        // 가고싶은 여행지 15개
        final String[] trips = {
            "방콕", "쿤밍", "바르셀로나", "마드리드", "아이슬란드", "캘리포니아",
                "오사카", "블라디보스토크", "상하이", "호치민", "세렝게티", "하와이",
                "울릉도", "도쿄", "우수아이아"
        };

        // 리스트뷰는 AdapterView를 상속해 만들어졌음.
        // 생성시 .xml화면(this를 주면 자동으로 setContentView에서 설정파일로 잡힙니다.)
        // 스타일, 그리고 출력자료를 파라미터로 순서대로 넣습니다.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                                        android.R.layout.simple_list_item_1, trips);
        // lv1에 adapter내용을 적용
        lv1.setAdapter(adapter);

        // 위임식 클릭 이벤트 처리
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d("parent확인", parent+"");
                Log.d("view확인", view+"");
                Log.d("position확인", position+"");
                Log.d("id확인", id+"");
                // 인덱스번호를 이용해 클릭하면 Toast형태로
                // 클릭한 도시명이 뜨도록 만들어주세요.
                Toast.makeText(getApplicationContext(),
                        trips[position]+"", Toast.LENGTH_SHORT).show();
            }
        });



    }
}


