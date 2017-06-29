package zhenqi.com.androidlearn;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import zhenqi.com.intentlearn.Activity1;
public class IntentDemo extends Activity {
	private final static String TAG="IntentDemo";
	public static final String ACTION2="zhenqi.com.intentlearn.UserAction2";
	public static final String ACTION1="zhenqi.com.intentlearn.Service2";
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intent);
		Log.i(TAG, "onCreate start...");

		Button activity1 = (Button)findViewById(R.id.activity1);
		Button service1=(Button)findViewById(R.id.service1);
		Button activity2=(Button)findViewById(R.id.activity2);
		Button service2=(Button)findViewById(R.id.service2);
		activity1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent i = new Intent();
//				i.setAction(Intent.ACTION_VIEW);
//				i.setData(Uri.parse("http://www.baidu.com"));
				i.setClass(getApplicationContext(), zhenqi.com.intentlearn.Activity1.class);
				i.putExtra("name", "zhenqi");
				i.putExtra("age", 26);
				Bundle b=new Bundle();
				b.putString("name2", "zhenqi2");
				b.putInt("age2", 26);
				
				i.putExtra("b", b);
				
				startActivity(i);
			}
			
		});
		activity2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent i=new Intent();
				i.setAction(ACTION2);
				Bundle bd=new Bundle();
				bd.putString("name", "zhenqi");
				bd.putInt("age", 26);
				startActivity(i);
			}
		});
		service1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent i=new Intent();
				i.setClass(getApplicationContext(), zhenqi.com.intentlearn.Service1.class);
				Log.d(TAG, "call startService to start service1");
				startService(i);
			}
		});
		
		service2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent i = new Intent();
//				i.setAction(ACTION1);
				i.setPackage("zhenqi.com.intentlearn");
				startService(i);
			}
		});
		
		
	}
}
