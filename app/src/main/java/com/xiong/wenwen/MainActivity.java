package com.xiong.wenwen;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv)
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        SpannableStringBuilder stringBuilder = new SpannableStringBuilder("中国人民站起来了！！！");
        stringBuilder.append("美国人民趴下了！！");

        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#f00fdd"));
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.parseColor("#c00dfe");)
        AbsoluteSizeSpan sizeSpan = new AbsoluteSizeSpan(61);
        StyleSpan styleSpan1 = new StyleSpan(Typeface.BOLD);
        ImageSpan imageSpan = new ImageSpan(this,R.mipmap.ic_launcher);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                tv.setText("玉溪香烟");
            }
        };
        stringBuilder.setSpan(colorSpan,2,8, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        stringBuilder.setSpan(backgroundColorSpan,3,7,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        stringBuilder.setSpan(sizeSpan,10,16,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        stringBuilder.setSpan(styleSpan1,1,6,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stringBuilder.setSpan(imageSpan,5,6,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stringBuilder.setSpan(clickableSpan,10,16,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        tv.setText(stringBuilder);
        tv.setMovementMethod(LinkMovementMethod.getInstance());

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });



    }


}
