package tw.com.pcschool.dd2018010301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView)findViewById(R.id.imageView);

    }
    public void click1(View v)
    {
        iv1.setImageResource(R.drawable.bridge);
    }
    public void click2(View v)
    {
        Picasso.with(MainActivity.this).load("https://pic.pimg.tw/adgsfh1745/1488335524-1981823002_l.jpg?v=1488335570").into(iv1);
    }
    public void click3(View v)
    {
        iv1.setImageResource(R.drawable.boom);
    }
}
