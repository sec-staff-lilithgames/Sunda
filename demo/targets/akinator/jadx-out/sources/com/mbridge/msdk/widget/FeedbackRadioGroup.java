package com.mbridge.msdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class FeedbackRadioGroup extends RadioGroup {
    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iMax = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (getPaddingRight() + childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + paddingLeft + marginLayoutParams.rightMargin > i12 - i10) {
                paddingLeft = getPaddingLeft();
                paddingTop += iMax;
                iMax = getChildAt(i14).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i15 = marginLayoutParams.leftMargin + paddingLeft;
            int i16 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i15, i16, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + i16);
            paddingLeft += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iMax;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        measureChildren(i10, i11);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        int iMax3 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i15 = i14 + measuredWidth;
            if (getPaddingRight() + getPaddingLeft() + i15 > size) {
                iMax = Math.max(i14, iMax2);
                i13 += iMax3;
                iMax3 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v("FeedbackRadioGroup", "maxHeight:" + i13 + "---maxWidth:" + iMax);
            } else {
                iMax3 = Math.max(iMax3, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                measuredWidth = i15;
                iMax = iMax2;
            }
            if (i12 == childCount - 1) {
                i13 += iMax3;
                iMax2 = Math.max(measuredWidth, iMax2);
            } else {
                iMax2 = iMax;
            }
            i12++;
            i14 = measuredWidth;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i13;
        if (mode != 1073741824) {
            size = paddingRight;
        }
        if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public FeedbackRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
