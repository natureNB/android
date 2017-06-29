package zhenqi.com.intentlearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import zhenqi.com.androidlearn.R;
public class Activity2 extends Activity {
	private static final String TAG = "Activity2";

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text_view);
		Log.i(TAG, "Activity2 onCreate");
		
		Intent i = getIntent();
		Log.i(TAG,"Activity2 Intent action is: " + i.getAction());
	}
}
