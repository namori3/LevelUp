package na.mo.ri.levelup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class GuraMainActivity extends AppCompatActivity implements Button.OnClickListener {

    Toolbar myToolbar;
    UserData uData;
    ProgressBar pgb;
    Button btnSin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gura_main);

        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        pgb = (ProgressBar) findViewById(R.id.progressBar);
        //pgb.setVisibility(ProgressBar.VISIBLE);

        //main Login page
        btnSin = findViewById(R.id.SignInBtn);
        btnSin.setOnClickListener(this);
        Button btnSup = findViewById(R.id.SignUpBtn);
        btnSup.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    //추가된 소스, ToolBar에 추가된 항목의 select 이벤트를 처리하는 함수
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                Toast.makeText(getApplicationContext(), "나의 정보 버튼 클릭됨", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), UserdataActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_settings2:
                // User chose the "Settings" item, show the app settings UI...
                Toast.makeText(getApplicationContext(), "수행현황 버튼 클릭됨", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getApplicationContext(), MyInfoActivity.class);
                startActivity(intent1);
                return true;
            case R.id.action_settings3:
                // User chose the "Settings" item, show the app settings UI...
                Toast.makeText(getApplicationContext(), "로그아웃 버튼 클릭됨", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(intent2);
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                Toast.makeText(getApplicationContext(), "나머지 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.SignInBtn:
                pgb.setVisibility(ProgressBar.VISIBLE);
                //pgb.setIndeterminate(true);
                btnSin.setText("로그인중..");
                final EditText editID = findViewById(R.id.editText);
                final EditText editPS = findViewById(R.id.editText2);

//                String mailad = editID.getText().toString().trim();
//                String passwd = editPS.getText().toString().trim();
                String mailad = "na@mo.ri";
                String passwd = "namori";
                uData = new UserData(mailad);
                Intent it33 = new Intent(GuraMainActivity.this, MyCommunityActivity.class);
                startActivity(it33);
                btnSin.setText("로그인");
                pgb.setVisibility(ProgressBar.INVISIBLE);

                break;
            case R.id.SignUpBtn:
                //
                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(intent);
                break;
        }
    }
}
