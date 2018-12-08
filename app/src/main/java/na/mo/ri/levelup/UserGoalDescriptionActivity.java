package na.mo.ri.levelup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import na.mo.ri.levelup.dialog.OnebuttonDialog;


public class UserGoalDescriptionActivity extends AppCompatActivity {
    private TextView mSurvival;
    private TextView mReleation;
    private TextView mGrowth;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usergoal_des_activity);

        mSurvival = (TextView) findViewById(R.id.survival);
        mReleation = (TextView) findViewById(R.id.releation);
        mGrowth = (TextView) findViewById(R.id.growth);

        mSurvival.setOnClickListener(v -> showDialog("존재 욕구:목표 달성을 통해 어떤 자신의 가치를 발전시킬지 쓰쎄요 ex)프로그래밍을 통한 사치 향상"));

        mReleation.setOnClickListener(v -> showDialog("관계 욕구:LEVEL UP을 통해:자신의 인간관계에서 이번 목표 달성을 통해 어떤 부분을 얻고 싶은지 쓰시오. ex)주변사람의 인정"));

        mGrowth.setOnClickListener(v -> showDialog("성장 욕구:LEVEL UP을 통해 어떤 부분에서 발전하고 싶은지 쓰세요. ex) 취업을 위한 스팩 향상"));


    }

    public void showDialog(String context) {
        //팝업창 생성
        final OnebuttonDialog dialog = new OnebuttonDialog(this);
        dialog.setDialogContent(context);
        dialog.setOneButtonDialogClickListener(() -> dialog.releaseDialog());
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.activity_backward_enter, R.anim.activity_backward_exit);
    }
}