package com.maximus.tipcalculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {
    final String tag = "Saurav";
    @BindView(R.id.BillAmt)
    EditText BillAmt;
    @BindView(R.id.TvTippercent)
    TextView TvTippercent;
    @BindView(R.id.TvTipAmount)
    TextView TvTipAmount;
    @BindView(R.id.billtotalamount)
    TextView billtotalamount;

      float percentage=0;
      float finalbillamount=0;
      float tiptotal=0;
      float totalbillamount=0;

      float default_tippercent=15;
      float reular_tippercent=10;
      float excellent_tippercent=20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getValues();

    }

    private void getValues() {
        TvTippercent.setText(getString(R.string.main_msg_tippercent,percentage));
        TvTipAmount.setText(getString(R.string.main_msg_tiptotal,tiptotal));
        billtotalamount.setText(getString(R.string.main_msg_billtotalresult,finalbillamount));
    }

    @OnClick({R.id.Imagebutton1, R.id.Imagebutton2, R.id.Imagebutton3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Imagebutton1:
                percentage = reular_tippercent;
                break;
            case R.id.Imagebutton2:
                percentage = default_tippercent;
                break;
            case R.id.Imagebutton3:
                percentage = excellent_tippercent;
                break;

        }
        calculate();
        getValues();
    }
     @OnTextChanged({R.id.BillAmt})
        public void onTextChanged() {

            calculate();
            getValues();
        


        }


    public void calculate() {
        if(percentage==0)
        {
            percentage=default_tippercent;
        }
        if(!BillAmt.getText().toString().equals("")&&!BillAmt.getText().toString().equals("."))
        {

           totalbillamount=Float.valueOf(BillAmt.getText().toString());
        }
        else
            totalbillamount=0;

        tiptotal=totalbillamount*percentage/100;
        finalbillamount=totalbillamount+tiptotal;
    }
}
