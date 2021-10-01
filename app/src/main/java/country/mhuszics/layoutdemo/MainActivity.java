package country.mhuszics.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

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
                showAlertDialog(getResources().getString(R.string.alert_dlg_msg));
                break;
        }
    }

    private void showPopUp(View view){
        LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        final View popUpView = layoutInflater.inflate(R.layout.popuptest, null);
        final PopupWindow popupWindow = new PopupWindow(popUpView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        Button button = (Button) popUpView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });

        popupWindow.showAsDropDown(view, 50, 50);
    }

    private void showAlertDialog(String msg){
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setTitle(getResources().getString(R.string.alert_dlg_title));
        alertBuilder.setMessage(msg);
        alertBuilder.setNeutralButton(getResources().getString(R.string.alert_neutral_btn_text),
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, getResources().getString(R.string.alert_toast_msg), Toast.LENGTH_LONG).show();
                    }
                });
        alertBuilder.show();
    }
}