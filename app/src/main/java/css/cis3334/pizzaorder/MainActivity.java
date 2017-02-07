package css.cis3334.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rbSmall, rbMedium, rbLarge;
    CheckBox chkbxCheese, chkbxDelivery;
    TextView tvTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbSmall = (RadioButton) findViewById(R.id.rbSmall);
        rbMedium = (RadioButton) findViewById(R.id.rbMedium);
        rbLarge = (RadioButton) findViewById(R.id.rbLarge);

        chkbxCheese = (CheckBox) findViewById(R.id.chkbxCheese);
        chkbxDelivery = (CheckBox) findViewById(R.id.chkbxDelivery);

        tvTotal = (TextView) findViewById(R.id.textViewTotal);

    }

    public void OnButtonClick(View view) {
        Double bill = 0.00;

        if(rbSmall.isChecked()){
            bill = bill + 7.00;
        }
        else if(rbMedium.isChecked()){
            bill = bill + 9.00;
        }
        else if(rbLarge.isChecked()){
            bill = bill + 13.00;
        }

        //Extras
        if(chkbxCheese.isChecked()){
            bill = bill + 1.75;
        }
        if(chkbxDelivery.isChecked()){
            bill = bill + 2.50;
        }
        tvTotal.setText(String.format("Total is $%.2f", bill));
    }

}
