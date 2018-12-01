package na.mo.ri.levelup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;


public class Reenter extends AppCompatActivity implements View.OnClickListener {

    private String reenter_title;
    private String reenter_content;
    private EditText reentertextview;
    private EditText reentercontentview;
    private Button reenter_button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        reentertextview=(EditText) findViewById(R.id.reenter_title);
        reentercontentview=(EditText)findViewById(R.id.reenter_content);
        reenter_button=(Button)findViewById(R.id.reenter_button);
        reenter_button.setOnClickListener(this);
    }
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.reenter_button :
                EditText editText = (EditText)findViewById(R.id.reenter_title);
                reenter_title=editText.getText().toString();
                editText=(EditText)findViewById(R.id.reenter_content);
                reenter_content=editText.getText().toString();
                break;
        }
    }








}