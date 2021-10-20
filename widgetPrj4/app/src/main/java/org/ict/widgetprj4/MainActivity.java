package org.ict.widgetprj4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    Button btn1;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //창부품 연결
        btn1 = (Button)findViewById(R.id.btn1);
        et1 = (EditText)findViewById(R.id.et1);

        // 버튼에 온클릭 설정까지만(내부코드는 없어도 됩니다.)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("click", "클릭감지됨");

                // 29페이지를 참조해서, EditText내부 부품 값을 얻어주세요.
                String result = et1.getText().toString();
                // 얻어온 값을 로그로 찍어주세요.
                Log.i("detect",result);
                // 얻어온 값을 토스트로 찍어보세요.
                Toast.makeText(MainActivity.this, result,
                                    Toast.LENGTH_SHORT).show();
            }
        });
    }
}