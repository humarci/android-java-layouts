package country.mhuszics.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.btnPopUp:
                showPopUp(view);
                break;
            case R.id.btnAlertDialog:
                showAlertDialog("This is the alert dialog message");
                break;
        }
    }

    private void showPopUp(View view){
        LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        //final View popUpView = layoutInflater.inflate(R.id.popUpTest, null);

    }

    private void showAlertDialog(String msg){

    }
}