package twolinetextview.keith.com.twolinetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cd.keith.twolinetextview.TwoLineTextView;

public class MainActivity extends AppCompatActivity {

    TwoLineTextView twoLineTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twoLineTextView = (TwoLineTextView)findViewById(R.id.tv_four);
        //twoLineTextView.setSecondLineText("BBBB");设置第二行文本内容
        //twoLineTextView.setFirstLineText("AAAA");//设置第一行文本内容
        twoLineTextView.setText("AAA", "BBBB");//设置第一行和第二行的文本内容
    }
}
