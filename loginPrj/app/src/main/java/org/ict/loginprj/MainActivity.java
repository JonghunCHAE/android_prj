package org.ict.loginprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 창부품 생성
    EditText idEt, pwEt;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        idEt = (EditText) findViewById(R.id.idEt);
        pwEt = (EditText) findViewById(R.id.pwEt);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> idList = new ArrayList<>();

                idList.add("asdfasdf");
                idList.add("android");
                idList.add("ictict");
                idList.add("javajava");
                idList.add("pqpqpqpq");
                idList.add("qwerqwer");
                idList.add("zxcvzxcv");

                String id = idEt.getText().toString();
                String pw = pwEt.getText().toString();

                if(idList.contains(id) && pw.equals("android")){
                    Intent intent = new Intent(getApplicationContext(),
                                                SuccessActivity.class);
                    intent.putExtra("id", id);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getApplicationContext(),
                                                FailActivity.class);

                    startActivity(intent);
                }


            }
        });
    }
}








