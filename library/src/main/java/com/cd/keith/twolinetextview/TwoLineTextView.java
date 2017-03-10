package com.cd.keith.twolinetextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by keith wang on 2017/3/10.
 */
public class TwoLineTextView extends TextView {
    private static final String LINE_BR = "\n";
    private static final int MAX_LINES = 2;
    private CharSequence mFirstLineText;
    private CharSequence mSecondLineText;
    private int mFirstLineTextColor = Color.BLACK;
    private int mDefaultTextSize = 14;
    private float mFirstLineTextSize;
    private float mLineSpaceHeight = 14;
    private float mTwoLineTextSize = 14;
    private  int mTwoLineTextColor = Color.BLACK;

    private SpannableStringBuilder textSpannableBuilder;

    public TwoLineTextView(Context context) {
        super(context);
        init(null, 0);
    }

    public TwoLineTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public TwoLineTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    protected void init(AttributeSet attrs, int defStyle) {
        setMaxLines(MAX_LINES);
        final TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.TwoLineTextView, defStyle, 0);
        mFirstLineText = a.getString(R.styleable.TwoLineTextView_firstLineText);
        mFirstLineTextColor = a.getColor(R.styleable.TwoLineTextView_firstLineTextColor, mFirstLineTextColor);
        mFirstLineTextSize = a.getDimension(R.styleable.TwoLineTextView_firstLineTextSize, mDefaultTextSize);
        mLineSpaceHeight = a.getDimension(R.styleable.TwoLineTextView_lineSpaceHeight, mLineSpaceHeight);
        mSecondLineText = a.getString(R.styleable.TwoLineTextView_secondLineText);
        mTwoLineTextColor = a.getColor(R.styleable.TwoLineTextView_secondLineTextColor, mTwoLineTextColor);
        mTwoLineTextSize = a.getDimension(R.styleable.TwoLineTextView_secondLineTextSize, mDefaultTextSize);
        a.recycle();
        setText(getText());
    }

    public CharSequence getText(){
        if(TextUtils.isEmpty(mFirstLineText)){
            return "";
        }
        int firstLength = mFirstLineText.length();
        if(textSpannableBuilder == null){
            textSpannableBuilder = new SpannableStringBuilder();
        }else{
            textSpannableBuilder.clear();
        }
        textSpannableBuilder.append(mFirstLineText);
        textSpannableBuilder.setSpan(new AbsoluteSizeSpan((int) mFirstLineTextSize), 0, firstLength, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textSpannableBuilder.setSpan(new ForegroundColorSpan(mFirstLineTextColor), 0, firstLength, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

        if(!TextUtils.isEmpty(mSecondLineText)){
            textSpannableBuilder.append(LINE_BR).append(mSecondLineText);
            int sumLength = firstLength + LINE_BR.length() + mSecondLineText.length();
            textSpannableBuilder.setSpan(new AbsoluteSizeSpan((int) mTwoLineTextSize), firstLength + LINE_BR.length(), sumLength, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            textSpannableBuilder.setSpan(new ForegroundColorSpan(mTwoLineTextColor), firstLength + LINE_BR.length(), sumLength, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        }
        return textSpannableBuilder;
    }

    public void setFirstLineText(String text){
        this.mFirstLineText = text;
        setText(getText());
    }

    public void setSecondLineText(String text){
        this.mSecondLineText = text;
        setText(getText());
    }

    public void setText(String firstText, String secondText){
        this.mFirstLineText = firstText;
        this.mSecondLineText = secondText;
        setText(getText());
    }
}
