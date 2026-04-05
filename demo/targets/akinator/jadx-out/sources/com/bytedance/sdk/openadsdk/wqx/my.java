package com.bytedance.sdk.openadsdk.wqx;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.wqx.yd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends com.bytedance.sdk.openadsdk.core.jj.my implements View.OnClickListener, yd.wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final yd f21639cm;

    /* renamed from: jj, reason: collision with root package name */
    private StateListDrawable f21640jj;
    private FilterWord my;

    /* renamed from: qk, reason: collision with root package name */
    private final int f21641qk;
    public static FilterWord jpo = new FilterWord("100:1", "GOOD");

    /* renamed from: jd, reason: collision with root package name */
    public static FilterWord f21638jd = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord wqx = new FilterWord("100:3", "BAD");

    public my(Context context, int i10, yd ydVar) {
        super(context);
        this.f21641qk = i10;
        this.f21639cm = ydVar;
        if (ydVar != null) {
            ydVar.jpo(this);
        }
        jpo(i10);
        jpo();
        jd();
    }

    private void jd() {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(getContext());
        xykVar.setTextSize(this.f21639cm.zz() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, va.jd(getContext(), 12.0f), 0, va.jd(getContext(), this.f21639cm.zz() ? 8.0f : 4.0f));
        addView(xykVar, layoutParams);
        jpo jpoVar = new jpo(getContext());
        jpoVar.setTextSize(this.f21639cm.zz() ? 17 : 12);
        jpoVar.setTextColor(-16777216);
        jpoVar.setMaxLines(1);
        jpoVar.setSingleLine();
        jpoVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, va.jd(getContext(), 12.0f));
        addView(jpoVar, layoutParams2);
        int i10 = this.f21641qk;
        if (i10 == 1) {
            xykVar.setText("😍");
            jpoVar.setText(dt.jpo(getContext(), "tt_good"));
        } else if (i10 == 2) {
            jpoVar.setText(dt.jpo(getContext(), "tt_not_bad"));
            xykVar.setText("😐");
        } else {
            if (i10 != 3) {
                return;
            }
            jpoVar.setText(dt.jpo(getContext(), "tt_bad"));
            xykVar.setText("😡");
        }
    }

    private void jpo(int i10) {
        if (i10 == 1) {
            this.my = jpo;
        } else if (i10 == 2) {
            this.my = f21638jd;
        } else {
            if (i10 != 3) {
                return;
            }
            this.my = wqx;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.f21639cm.jpo(yd.jpo);
        } else {
            this.f21639cm.jpo(this.my);
        }
    }

    private void jpo() {
        if (this.f21640jj == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(va.jd(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(va.jd(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(va.jd(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f21640jj = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.f21640jj.addState(new int[0], gradientDrawable);
        }
        setBackground(this.f21640jj);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.wqx.yd.wqx
    public void jpo(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.my) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
