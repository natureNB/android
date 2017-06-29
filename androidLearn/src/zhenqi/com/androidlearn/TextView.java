package zhenqi.com.androidlearn;

import android.app.Activity;
import android.os.Bundle; 
import android.util.Log;
public class TextView extends Activity {
	private static final String TAG = "TextView";
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intent);
		Log.i(TAG, "call onCreate function");
	}
	@Override
	protected void onStart(){
		super.onStart();
		Log.i(TAG, "call onStart function");
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		Log.i(TAG, "call onPause function");
	}
	@Override
	protected void onResume(){
		super.onResume();
		Log.i(TAG, "call onResume function");
	}
	@Override
	protected void onStop(){
		super.onStop();
		Log.i(TAG, "call onStop function");
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.i(TAG,"call onDestroy function");
	}
}
