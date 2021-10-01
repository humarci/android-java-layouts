# This is a Layout demo app

# 👉 Step 1:

Create a Linear layout with 2 buttons.

Add some string values:

```XML
<resources>
    <string name="app_name">LayoutDemo</string>
    <string name="btn_popup">PopUp</string>
    <string name="btn_alert">AlertDialog</string>
</resources>
```

`Activity main:`
```XML
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    xmlns:android="http://schemas.android.com/apk/res/android">

    <Button
        android:id="@+id/btnPopUp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/btn_popup" />

    <Button
        android:id="@+id/btnAlertDialog"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/btn_alert" />
</LinearLayout>
```

# 👉 Step 2:

Create onClick on UI:
```XML
android:onClick="onClick"
```

Use onClick in `MainActivity.java`:
```JAVA
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
```

Create the methods:
```JAVA
private void showPopUp(View view){
        LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        //final View popUpView = layoutInflater.inflate(R.id.popUpTest, null);

    }

    private void showAlertDialog(String msg){

    }
```