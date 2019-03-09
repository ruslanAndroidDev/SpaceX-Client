package com.rdev.spacexclient.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rdev.spacexclient.R;

public class DoubledTextView extends LinearLayout {
    public DoubledTextView(Context context) {
        super(context);
    }

    TextView bottomTv;
    TextView topTv;
    View line;
    View rootView;

    public DoubledTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOrientation(VERTICAL);
        LayoutInflater inflater = LayoutInflater.from(context);
        rootView = inflater.inflate(R.layout.doubled_text_view, this);
        bottomTv = rootView.findViewById(R.id.custom_bottom_tv);
        topTv = rootView.findViewById(R.id.custom_top_tv);
        line = rootView.findViewById(R.id.custom_divider_view);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.DoubledTextView);

        int bottomTextColor = a.getColor(R.styleable.DoubledTextView_bottom_text_color, Color.BLACK);
        int topTextColor = a.getColor(R.styleable.DoubledTextView_top_text_color, Color.BLACK);
        int dividerColor = a.getColor(R.styleable.DoubledTextView_line_color, Color.BLACK);

        String topText = a.getString(R.styleable.DoubledTextView_top_text);
        String bottomText = a.getString(R.styleable.DoubledTextView_bottom_text);

        topTv.setText(topText);
        bottomTv.setText(bottomText);
        topTv.setTextColor(topTextColor);
        line.setBackgroundColor(dividerColor);
        bottomTv.setTextColor(bottomTextColor);
    }
}
