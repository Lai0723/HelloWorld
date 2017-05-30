package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Module level variable
    private TextView textViewMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // create and display UI , R= resource class

        textViewMessage = (TextView) findViewById(R.id.textViewMsg); // link variable to UI component


    }

    public void showMsg(View v){
        textViewMessage.setText("Sushi King");
    }

    public void clearMsg(View v){
        textViewMessage.setText("");
    }

    public void restoreMsg(View v){
        textViewMessage.setText(getString(R.string.app_name));
    }

}
