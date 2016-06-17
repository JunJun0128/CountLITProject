package android.lifeistech.com.coumt;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView textView;
    int count;
    TextView textView2;
    int count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        count = 0;

        textView2 = (TextView)findViewById(R.id.textView2);
        count2 = 0;
    }

    public void add(View v){
    count = count + 1;

    textView.setText(count + "回ボタンが押されました！");
}

    public void minus(View v){
        count = count - 1;

        textView.setText(count + "回ボタンが押されました！");
    }



    public void add2(View v){
        count2 = count2 + 2;

        textView2.setText(count2 + "回ボタンが押されました！");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
