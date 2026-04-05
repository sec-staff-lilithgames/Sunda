package com.bytedance.sdk.openadsdk.wqx;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.wqx.yd;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends com.bytedance.sdk.openadsdk.core.jj.wqx implements yd.cm, yd.jd, yd.jpo, yd.wqx {

    /* renamed from: au, reason: collision with root package name */
    private int f21657au;

    /* renamed from: cm, reason: collision with root package name */
    private final yd f21658cm;

    /* renamed from: if, reason: not valid java name */
    private int f170if;

    /* renamed from: jd, reason: collision with root package name */
    private int f21659jd;

    /* renamed from: jj, reason: collision with root package name */
    private TextView f21660jj;
    jj jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f21661ju;
    private com.bytedance.sdk.openadsdk.core.jj.xyk my;
    private FilterWord oya;

    /* renamed from: qk, reason: collision with root package name */
    private ju f21662qk;
    private int wqx;
    private View xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.cm f21663yd;
    private View zz;

    public zz(Context context, yd ydVar) {
        this(context, ydVar, null);
    }

    private boolean cm() {
        if (this.f170if == 0) {
            wqx();
        }
        return this.f170if < this.f21657au;
    }

    private com.bytedance.sdk.openadsdk.core.jj.xyk jd(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = cm() ? this.f21659jd : va.jd(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.wqx);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.wqx);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i10 = this.wqx;
        xykVar.setPadding(0, i10, 0, i10);
        xykVar.setGravity(17);
        xykVar.setBackground(stateListDrawable);
        xykVar.setTextColor(-1);
        xykVar.setTextSize(16.0f);
        xykVar.setText(dt.jpo(context, "tt_suggestion_commit"));
        xykVar.setEnabled(false);
        xykVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.wqx.zz.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                zz.this.f21658cm.cm();
            }
        });
        xykVar.setLayoutParams(layoutParams);
        return xykVar;
    }

    private void wqx() {
        if (this.f170if > 0) {
            return;
        }
        this.f170if = va.wqx(getContext());
        int iMy = va.my(getContext());
        this.f21657au = iMy;
        this.f21658cm.jpo(this.f170if, iMy);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj.wqx, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.f170if == 0) {
                wqx();
            }
            layoutParams.width = Math.min(this.f170if, this.f21657au) - (va.jd(getContext(), 16.0f) * 2);
        }
    }

    public zz(Context context, yd ydVar, List<FilterWord> list) {
        super(context);
        this.f21658cm = ydVar;
        ydVar.jpo((yd.wqx) this);
        ydVar.jpo((yd.jd) this);
        ydVar.jpo((yd.cm) this);
        ydVar.jpo((yd.jpo) this);
        wqx();
        jpo(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        jd(list);
    }

    private void jpo(Context context) {
        this.wqx = va.jd(context, 8.0f);
        this.f21659jd = va.jd(context, 20.0f);
        int iJd = va.jd(context, 56.0f);
        int iJd2 = va.jd(context, 30.0f);
        int iJd3 = va.jd(context, 12.0f);
        if (cm()) {
            iJd3 = this.f21659jd;
        }
        if (!cm()) {
            iJd = iJd2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, va.jd(getContext(), 98.0f));
        view.setBackground(dt.wqx(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.wqx);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        int iJd4 = va.jd(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iJd4, iJd4);
        layoutParams3.setMargins(0, iJd3, iJd3, 0);
        layoutParams3.gravity = 8388661;
        cmVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_titlebar_close_seletor"));
        addView(cmVar, layoutParams3);
        cmVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.wqx.zz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                zz.this.f21658cm.my();
            }
        });
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        this.f21663yd = cmVar2;
        cmVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.wqx.zz.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                zz.this.jd();
            }
        });
        this.f21663yd.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iJd4, iJd4);
        layoutParams4.setMargins(iJd3, iJd3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableJpo = com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_leftbackicon_selector");
        drawableJpo.setAutoMirrored(true);
        this.f21663yd.setImageDrawable(drawableJpo);
        addView(this.f21663yd, layoutParams4);
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iJd3, iJd, iJd3, iJd3);
        myVar.setOrientation(1);
        addView(myVar, layoutParams5);
        View viewWqx = wqx(context);
        this.xyk = viewWqx;
        myVar.addView(viewWqx);
        View viewCm = cm(context);
        this.zz = viewCm;
        myVar.addView(viewCm);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarJd = jd(context);
        this.my = xykVarJd;
        myVar.addView(xykVarJd);
    }

    private View cm(Context context) {
        int iJd;
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setOrientation(1);
        if (!cm()) {
            iJd = va.jd(context, 200.0f);
        } else {
            iJd = va.jd(context, 358.0f);
        }
        myVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iJd));
        TextView textView = new TextView(context);
        textView.setText(dt.jpo(context, "tt_select_reason"));
        textView.setTextSize(cm() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = va.jd(context, cm() ? 24.0f : 4.0f);
        myVar.addView(textView, layoutParams);
        jj jjVar = new jj(context, this.f21658cm);
        this.jpo = jjVar;
        myVar.addView(jjVar);
        if (au.jrx().roc()) {
            com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
            this.f21661ju = xykVar;
            xykVar.setId(hna.gdx);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = cm() ? this.f21659jd : va.jd(context, 6.0f);
            layoutParams2.gravity = 17;
            this.f21661ju.setLayoutParams(layoutParams2);
            this.f21661ju.setFocusable(false);
            this.f21661ju.setHint(dt.jpo(context, "tt_add_bad_reason"));
            this.f21661ju.setHintTextColor(Color.parseColor("#57000000"));
            this.f21661ju.setTextColor(Color.rgb(22, 24, 35));
            this.f21661ju.setTextSize(15.0f);
            this.f21661ju.setGravity(8388615);
            this.f21661ju.setVisibility(0);
            this.f21661ju.setPadding(0, va.jd(context, 15.0f), 0, va.jd(context, 14.0f));
            this.f21661ju.setEllipsize(TextUtils.TruncateAt.END);
            this.f21661ju.setSingleLine();
            this.f21661ju.setMaxLines(1);
            this.f21661ju.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.wqx.zz.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    zz.this.f21658cm.jj();
                }
            });
            myVar.addView(this.f21661ju, layoutParams2);
            myVar.addView(new ju(context, Color.argb(128, 0, 0, 0)));
        }
        myVar.setVisibility(8);
        return myVar;
    }

    private View wqx(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        myVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(dt.jpo(context, "tt_like_this_ad"));
        textView.setTextSize(cm() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        myVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(dt.jpo(context, "tt_feel_hint"));
        textView2.setTextSize(cm() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (cm()) {
            layoutParams2.topMargin = va.jd(context, 4.0f);
        }
        myVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iJd = va.jd(context, 16.0f);
        int iJd2 = va.jd(context, 12.0f);
        int iJd3 = va.jd(context, 8.0f);
        if (cm()) {
            layoutParams3.topMargin = iJd;
            layoutParams3.bottomMargin = iJd;
        } else {
            layoutParams3.topMargin = iJd2;
            layoutParams3.bottomMargin = iJd3;
        }
        myVar.addView(myVar2, layoutParams3);
        myVar2.addView(new my(context, 1, this.f21658cm));
        my myVar3 = new my(context, 2, this.f21658cm);
        ViewGroup.LayoutParams layoutParams4 = myVar3.getLayoutParams();
        boolean z10 = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z10) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iJd;
        layoutParams7.rightMargin = iJd;
        myVar2.addView(myVar3, layoutParams5);
        myVar2.addView(new my(context, 3, this.f21658cm));
        ju juVar = new ju(context);
        this.f21662qk = juVar;
        myVar.addView(juVar);
        this.f21660jj = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!cm()) {
            iJd = iJd3;
        }
        layoutParams8.topMargin = iJd;
        this.f21660jj.setTextColor(-16777216);
        this.f21660jj.setPadding(iJd2, iJd3, iJd2, iJd3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iJd3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.f21660jj.setBackground(gradientDrawable);
        this.f21660jj.setText(dt.jpo(context, "tt_report_this_ad"));
        this.f21660jj.setTextSize(cm() ? 14 : 12);
        Drawable drawableWqx = dt.wqx(context, "tt_report_ad_arrow");
        drawableWqx.setBounds(0, 0, iJd2, iJd2);
        this.f21660jj.setCompoundDrawables(null, null, drawableWqx, null);
        this.f21660jj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.wqx.zz.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                zz.this.jpo();
            }
        });
        myVar.addView(this.f21660jj, layoutParams8);
        return myVar;
    }

    private void jd(List<FilterWord> list) {
        this.jpo.jpo(list);
    }

    public void jd() {
        View view = this.zz;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.xyk;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = this.f21663yd;
        if (cmVar != null) {
            cmVar.setVisibility(8);
        }
        yd ydVar = this.f21658cm;
        if (ydVar != null) {
            FilterWord filterWord = this.oya;
            if (filterWord != null) {
                ydVar.jpo(filterWord);
            } else {
                ydVar.jpo(yd.jpo);
            }
            this.f21658cm.wqx(null);
        }
    }

    public void jpo() {
        View view = this.zz;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.xyk;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = this.f21663yd;
        if (cmVar != null) {
            cmVar.setVisibility(0);
        }
        yd ydVar = this.f21658cm;
        if (ydVar == null || !ydVar.wqx()) {
            return;
        }
        this.oya = this.f21658cm.jd();
    }

    @Override // com.bytedance.sdk.openadsdk.wqx.yd.wqx
    public void jpo(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.my != null && TextUtils.isEmpty(this.f21658cm.qk())) {
            this.my.setEnabled(!yd.jpo.equals(filterWord));
        }
        if (my.jpo.equals(filterWord) || my.f21638jd.equals(filterWord)) {
            this.f21660jj.setVisibility(8);
            this.f21662qk.setVisibility(8);
        }
        if (my.wqx.equals(filterWord) || yd.jpo.equals(filterWord)) {
            this.f21660jj.setVisibility(0);
            this.f21662qk.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wqx.yd.jd
    public void jpo(int i10) {
        if (yd.wqx == i10) {
            this.oya = null;
            jd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wqx.yd.cm
    public void jpo(String str) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar;
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = this.f21661ju;
        if (xykVar2 != null) {
            xykVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            yd ydVar = this.f21658cm;
            if (ydVar == null || (xykVar = this.my) == null) {
                return;
            }
            xykVar.setEnabled(ydVar.wqx());
            return;
        }
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = this.my;
        if (xykVar3 != null) {
            xykVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wqx.yd.jpo
    public void jpo(List<FilterWord> list) {
        jd(list);
    }
}
