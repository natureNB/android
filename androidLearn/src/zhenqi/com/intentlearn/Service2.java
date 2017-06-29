package zhenqi.com.intentlearn;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class Service2 extends Service {
   private static final String TAG="Service2";
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate(){
		super.onCreate();
		Log.i(TAG,"Service2 onCreate");
	}
}
