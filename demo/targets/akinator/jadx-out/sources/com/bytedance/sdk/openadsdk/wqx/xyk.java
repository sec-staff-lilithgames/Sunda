package com.bytedance.sdk.openadsdk.wqx;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.wqx.yd;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends ViewGroup implements yd.wqx {
    private final yd jpo;

    public xyk(Context context, yd ydVar) {
        super(context);
        this.jpo = ydVar;
        ydVar.jpo(this);
    }

    private View jd(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iJd = va.jd(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iJd;
        marginLayoutParams.bottomMargin = iJd;
        textView.setTextColor(jpo());
        textView.setText(filterWord.getName());
        textView.setPadding(iJd, iJd, iJd, iJd);
        textView.setBackground(jd());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.wqx.xyk.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (xyk.this.jpo != null) {
                    if (view.isSelected()) {
                        xyk.this.jpo.jpo(yd.jpo);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag instanceof FilterWord) {
                        xyk.this.jpo.jpo((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int childCount = getChildCount();
        int i15 = i12 - i10;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i19 = i16 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i19 + i17 < i15) {
                i14 = i17 + i19;
            } else {
                i18 += marginLayoutParams.bottomMargin + measuredHeight;
                i14 = 0;
            }
            childAt.layout(i14, marginLayoutParams.topMargin + i18, i14 + measuredWidth, measuredHeight + i18);
            i17 = i14 + measuredWidth + marginLayoutParams.rightMargin;
            i16++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < getChildCount()) {
            View childAt = getChildAt(i12);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i10, i11);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i15 = i12 != 0 ? marginLayoutParams.leftMargin : 0;
            int i16 = (measuredWidth + i15) + i14 < size ? i14 + i15 : 0;
            if (i16 == 0) {
                i13 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i14 = i16 + measuredWidth + marginLayoutParams.rightMargin;
            i12++;
        }
        setMeasuredDimension(size, i13);
    }

    public void jpo(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                addView(jd(filterWord));
            }
        }
    }

    private ColorStateList jpo() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), -16777216});
    }

    @Override // com.bytedance.sdk.openadsdk.wqx.yd.wqx
    public void jpo(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                if (yd.jpo.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    private Drawable jd() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fJd = va.jd(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fJd);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(va.jd(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fJd);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}
