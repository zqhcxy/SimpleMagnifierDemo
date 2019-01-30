package com.zqh.simplemagnifier;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Magnifier;
import android.widget.TextView;

public class SimpleMagnifigerActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_magnifiger_layout);

        mTextView = findViewById(R.id.magnifiger_text_tv);

        showTextMagnifier();
    }

    private void showTextMagnifier() {
        if (Build.VERSION.SDK_INT >= 28) {
            final Magnifier magnifier = new Magnifier(mTextView);
            mTextView.setOnTouchListener(new View.OnTouchListener() {
                @RequiresApi(api = 28)
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    switch (event.getActionMasked()) {
                        case MotionEvent.ACTION_DOWN:
                            magnifier.show(event.getX(), event.getY());
                        case MotionEvent.ACTION_MOVE:
                            magnifier.show(event.getX(), event.getY());
                        case MotionEvent.ACTION_UP:
                            magnifier.dismiss();
                            break;
                    }

                    return false;
                }
            });
        }
    }
}
