package com.why.project.toastcustom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;

import com.why.project.toastcustom.views.ToastCustom;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ToastCustom toastCustom = ToastCustom.makeText(this,"自定义Toast显示风格",Toast.LENGTH_LONG);
		toastCustom.setText(R.string.app_name);
		toastCustom.setGravity(Gravity.CENTER,0,0);
		toastCustom.show();
	}
}
