package com.example.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

public class MyButton extends AppCompatButton {

    private Paint mButtonColor;
    Context myContext;

    public MyButton(Context context) {
        super(context);
        init(context);

    }

    public MyButton(Context context, AttributeSet attrs) {

        super(context, attrs);
        init(context);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {

        myContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        if (isPressed()) {

            setBackgroundDrawable(myContext.getResources().getDrawable(R.drawable.mybutton_pressed, null));

        } else {

            setBackgroundDrawable(myContext.getResources().getDrawable(R.drawable.mybutton, null));
        }

        setTextColor(Color.parseColor("#eceff1"));

        super.onDraw(canvas);
    }
}
