package com.rotateview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Initialize RotateView object.
         */
        RotateView rotateView = (RotateView) findViewById(R.id.rotateView);
        /**
         * Optional : You can set the initial angle at which it should be.
         */
        rotateView.setRotateViewAngle(60);
        /**
         * Optional : You can change the image at runtime.
         */
        rotateView.setRotateViewImage(R.drawable.ic_rotate);
        /**
         * Listener for getting rotation angle.
         */
        rotateView.setOnRotationChangeListener(new RotateView.OnRotationChangeListener() {
            @Override
            public void rotationChange(double angle) {
                Log.i(TAG,"Angle : "+angle);
            }
        });
    }
}
