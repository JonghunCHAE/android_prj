package org.ict.calculatorprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. 부품 배치가 끝나면 제일 먼저 부품을 선언해줍니다.
    // 같은 종류의 위젯은 한 줄에 몰아서 선언해도 상관없음
    Button plus, minus, div, mul;
    EditText leftVal, rightVal;
    TextView leftTv, rightTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. 배치된 부품을 자바 코드와 연결
        plus = (Button)findViewById(R.id.plusBtn);
        minus = (Button)findViewById(R.id.minusBtn);
        div = (Button)findViewById(R.id.divBtn);
        mul = (Button)findViewById(R.id.multiBtn);
        leftVal = (EditText)findViewById(R.id.et1);
        rightVal = (EditText)findViewById(R.id.et2);
        leftTv = (TextView)findViewById(R.id.infoTv);
        rightTv = (TextView)findViewById(R.id.resultTv);

        // 3. 버튼별로 기능 부여하기
        //  예시로 plus버튼만 설정
        // plus버튼을 클릭했을때
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 왼쪽 입력창, 오른쪽 입력창 값 얻어오기
                String lResult = leftVal.getText().toString();
                String rResult = rightVal.getText().toString();

                // 얻어온 값은 문자이므로 숫자로 바꿔서 더한 결과를 저장
                int resultInt = Integer.parseInt(lResult) + Integer.parseInt(rResult);

                //결과값 화면에 출력하기
                // int를 String으로 바꾸는 가장 쉬운 방법은 그냥 빈 문자열을 더하는것.
                rightTv.setText(resultInt + "");

                // 이 코드를 토대로 나머지 연산도 만들어주시고
                // 다 된 분들은 더하기 연한 수 왼쪽, 오른쪽 입력창 값을 비워주세요.
                leftVal.setText("");
                rightVal.setText("");

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 왼쪽 입력창, 오른쪽 입력창 값 얻어오기
                String lResult = leftVal.getText().toString();
                String rResult = rightVal.getText().toString();

                // 얻어온 값은 문자이므로 숫자로 바꿔서 더한 결과를 저장
                int resultInt = Integer.parseInt(lResult) - Integer.parseInt(rResult);

                //결과값 화면에 출력하기
                // int를 String으로 바꾸는 가장 쉬운 방법은 그냥 빈 문자열을 더하는것.
                rightTv.setText(resultInt + "");

                // 이 코드를 토대로 나머지 연산도 만들어주시고
                // 다 된 분들은 더하기 연한 수 왼쪽, 오른쪽 입력창 값을 비워주세요.
                leftVal.setText("");
                rightVal.setText("");
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 왼쪽 입력창, 오른쪽 입력창 값 얻어오기
                String lResult = leftVal.getText().toString();
                String rResult = rightVal.getText().toString();

                // 얻어온 값은 문자이므로 숫자로 바꿔서 더한 결과를 저장
                int resultInt = Integer.parseInt(lResult) * Integer.parseInt(rResult);

                //결과값 화면에 출력하기
                // int를 String으로 바꾸는 가장 쉬운 방법은 그냥 빈 문자열을 더하는것.
                rightTv.setText(resultInt + "");

                // 이 코드를 토대로 나머지 연산도 만들어주시고
                // 다 된 분들은 더하기 연한 수 왼쪽, 오른쪽 입력창 값을 비워주세요.
                leftVal.setText("");
                rightVal.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 왼쪽 입력창, 오른쪽 입력창 값 얻어오기
                String lResult = leftVal.getText().toString();
                String rResult = rightVal.getText().toString();

                // 얻어온 값은 문자이므로 숫자로 바꿔서 더한 결과를 저장
                int resultInt = Integer.parseInt(lResult) / Integer.parseInt(rResult);

                //결과값 화면에 출력하기
                // int를 String으로 바꾸는 가장 쉬운 방법은 그냥 빈 문자열을 더하는것.
                rightTv.setText(resultInt + "");

                // 이 코드를 토대로 나머지 연산도 만들어주시고
                // 다 된 분들은 더하기 연한 수 왼쪽, 오른쪽 입력창 값을 비워주세요.
                leftVal.setText("");
                rightVal.setText("");
            }
        });


    }
}