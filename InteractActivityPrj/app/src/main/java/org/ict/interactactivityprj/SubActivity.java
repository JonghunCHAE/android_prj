package org.ict.interactactivityprj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import java.nio.file.Files;

public class SubActivity extends Activity {
    // 돌아가기 버튼 선언
    Button returnBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        // 돌아가기 버튼 연결
        returnBtn = (Button) findViewById(R.id.returnBtn);

        // 인텐트에 들어있는 숫자 2개를 변수에 저장해주세요.
        // startActivityForResult는 defaultValue(값이 안들어오면 대신받을값)을
        // 설정해줘야한다.
        Intent intent = getIntent();
        int num1 = intent.getIntExtra("num1", 0);
        int num2 = intent.getIntExtra("num2", 0);
        // main에서 보낸 두 숫자를 합한 결과값을 sub에서 처리
        int resultNum = num1 + num2;

        // returnBtn이 클릭되었을때 돌려줘야함
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 인텐트 종료시 돌려보낼 값은, 목적지가 mainActivity인 인텐트를
                // 다시 만들어서 보내줍니다.
                Intent returnIntent = new Intent(getApplicationContext(),
                                                MainActivity.class);

                returnIntent.putExtra("resultNum", resultNum);
                // 입력된 값은 setResult로 보내고, RESULT_OK는 상수 -1입니다.
                // setResult에 담긴 인텐트는 뒤로가기시 main쪽에 연결됩니다.
                setResult(RESULT_OK, returnIntent);

                finish();

            }
        });

    }
}
