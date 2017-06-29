package zhenqi.com.intentlearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import zhenqi.com.androidlearn.R;

public class Activity1 extends Activity {
	private static final String TAG = "activity1";

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text_view);
		TextView tv=(TextView)findViewById(R.id.tv1);
		Intent i=getIntent();
		String name=i.getStringExtra("name");
		int age=i.getIntExtra("age", 0);
		Bundle b=i.getBundleExtra("b");
		String name2=b.getString("name2");
		int age2=b.getInt("age2");
		String outInfo=String.format("activity1: name:%s, age:%d, name2:%s, age2: %d", name, age, name2, age2);
		tv.setText(outInfo);
		Log.i(TAG, outInfo);
		Log.i(TAG,"activity1 onCreate");
	}
	@Override
	public void onNewIntent(Intent intent){
		super.onNewIntent(intent);
		setIntent(intent);
	}
	@Override
	protected void onStart(){
		super.onStart();
		Log.i(TAG, "activit1 onStart");
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		Log.i(TAG, "activity1 onPause");
	}
	@Override
	protected void onResume(){
		super.onResume();
		Log.i(TAG, "activity1 onResume");
		
	}
	@Override
	protected void onStop(){
		super.onStop();
		Log.i(TAG, "activity1 onStop");
	}
	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.i(TAG,"activity1 onDestroy");
	}
}
