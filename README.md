# RotateView

![ezgif com-resize](https://cloud.githubusercontent.com/assets/4836122/19432615/03ade198-947b-11e6-9f2f-35818a10b30f.gif)

###Introduction
Rotate view is an UI component that let you have a interactive interface to rotate an image from one of the end.

###Getting started
For integrating this UI in your app you need three files.
 - ``` RotateView.java``` : Main class containing all the implementation.
 - ``` view_rotate.xml``` : View Layout file.
 - ``` attrs.xml```       : Custom defined attributes.
 
###Attributes
Rotate view gives you two attribues.
 - ```app:image="@drawable/ic_rotate"``` : You can change the image for the rotation view.
 - ```app:angle="30"``` : You can mention the initial angle at which you want your view to be at start.

```sh
<com.rotateview.RotateView
    android:id="@+id/rotateView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:angle="30"
    app:image="@drawable/ic_rotate"/>
```

###Interface
Rotate view give you an interface to get the rotation in runtime.

```sh
rotateView.setOnRotationChangeListener(new RotateView.OnRotationChangeListener() {
            @Override
            public void rotationChange(double angle) {
                Log.i(TAG,"Angle : "+angle);
            }
        });
```

###Setup in main class
```sh
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
```
