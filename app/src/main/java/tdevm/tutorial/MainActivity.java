package tdevm.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    public static final String TAG = "MERA ACTIVITYYYYYYY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate was Called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onStart was Called");
        super.onStart();
     }


    @Override
    protected void onResume() {
        Log.d(TAG,"onResume was Called");

        super.onResume();
    }


    @Override
    protected void onPause() {
        Log.d(TAG,"onPause was Called");

        super.onPause();
    }

    @Override
    protected void onStop() {

        Log.d(TAG,"onPause was Called");

        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Log.d(TAG,"onDestroy was Called");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {

        Log.d(TAG,"onRestart was Called");
        super.onRestart();
    }
}
