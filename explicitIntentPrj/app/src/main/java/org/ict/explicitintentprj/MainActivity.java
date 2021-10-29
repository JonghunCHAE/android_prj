package org.ict.explicitintentprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // 버튼 생성
    Button subBtn;
    // 에디트텍스트 생성
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼 연결
        subBtn = (Button) findViewById(R.id.subBtn);
        //에디트텍스트 연결
        et1 = (EditText)findViewById(R.id.et1);

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                                            SubActivity.class);
                // Intent는 startActivity로 보내기 전에
                // intent.putExtra("호출명", 자료); 형식으로
                // 마치 model.addAttrivute("호출명", 자료);와 같이
                // 데이터를 실어둔 다음 전송할 수 있습니다.
                intent.putExtra("test", et1.getText().toString());

                startActivity(intent);
            }
        });
    }
}