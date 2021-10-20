package org.ict.changeimageprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    TextView tv1, tv2;
    CheckBox cb1;
    RadioGroup rg1;
    RadioButton dinoBtn, catBtn;
    Button scBtn;
    ImageView catImg, dinoImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        cb1 = (CheckBox)findViewById(R.id.cb1);
        rg1 = (RadioGroup)findViewById(R.id.rg1);
        dinoBtn = (RadioButton)findViewById(R.id.dinoBtn);
        catBtn = (RadioButton)findViewById(R.id.catBtn);
        scBtn = (Button)findViewById(R.id.scBtn);
        catImg = (ImageView)findViewById(R.id.catImg);
        dinoImg = (ImageView)findViewById(R.id.dinoImg);

        // 체크박스 클릭을 감지하도록 하려면 setOnCheckedChangeListener를 사용하고
        // 내부에는 new C까지 적고 자동완성을 시키면 쉽게 처리할 수 있습니다.
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // true, false여부를 체크해야함
                Log.d("isChecked", isChecked + "");
                // 클릭해서 true면 어플이 보이게, false면 안보이게 하기 위해
                // if~else분기를 작성해주세요.
                if(isChecked){
                   // ImageView를 제외한 창부품을 보이도록 전환
                    // android:text="" 의 기입내용을 바꿀때 setText()를 썻습니다.
                    // android:visibility를 바꿀때는 setVisibility()를 씁니다.
                    tv2.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
                    dinoBtn.setVisibility(View.VISIBLE);
                    catBtn.setVisibility(View.VISIBLE);
                    scBtn.setVisibility(View.VISIBLE);
                } else {
                    // 창부품이 보이지 않도록 전환
                    tv2.setVisibility(View.INVISIBLE);
                    rg1.setVisibility(View.INVISIBLE);
                    dinoBtn.setVisibility(View.INVISIBLE);
                    catBtn.setVisibility(View.INVISIBLE);
                    scBtn.setVisibility(View.INVISIBLE);
                    catImg.setVisibility(View.INVISIBLE);
                    dinoImg.setVisibility(View.INVISIBLE);
                    // 라디오버튼 선택 해제
                    // 라디오그룹의 모든 선택사항 해제 명령으로 처리 가능
                    rg1.clearCheck();
                }
            }
        });

        // 어떤 동물의 사진을 보여줄지는, 위의 어플 요소와는 별개로
        // RadioButton에 뭐가 선택되었나만 가지고 판단해야하기 때문에
        // 따로 지정합니다.
        scBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 공룡을 찍었나 고양이를 찍었나 확인
                // RadioGroup 내부의 RadioButton을 감지할때는
                // RadioGroup변수.getCheckedRadioButtonId()를 쓰면
                // 선택한 버튼의 ID값이 잡혀옵니다.
                int checked = rg1.getCheckedRadioButtonId();
                Log.d("선택된 버튼은?", checked + "");

                if(checked == 2131230873){
                    Log.d("안내","공룡버튼을 클릭했습니다.");
                    // 공룡버튼 클릭시 공룡사진을 VISIBLE로 전환
                    dinoImg.setVisibility(View.VISIBLE);
                    //결함 발견시 보완
                    catImg.setVisibility(View.INVISIBLE);
                }else if(checked == 2131230822){
                    Log.d("안내", "고양이 버튼을 클릭했습니다.");
                    // 고양이버튼 클릭시 고양이사진을 VISIBLE로 전환
                    catImg.setVisibility(View.VISIBLE);
                    //결함 발견시 보완
                    dinoImg.setVisibility(View.INVISIBLE);
                }



            }
        });


    }
}