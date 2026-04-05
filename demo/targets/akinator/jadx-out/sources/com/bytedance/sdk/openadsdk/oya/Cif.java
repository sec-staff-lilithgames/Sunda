package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.oya.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends com.bytedance.sdk.openadsdk.core.jj.qk {
    public Cif(Context context) {
        this(context, null);
    }

    private void jpo(Context context) {
        setId(hna.uhu);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(getContext());
        cmVar.setId(hna.f21513as);
        cmVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        cmVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        cmVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        cmVar.setBackgroundColor(Color.parseColor("#7f000000"));
        cmVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(cmVar);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        qkVar.setId(hna.f21559ww);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        qkVar.setLayoutParams(layoutParams);
        addView(qkVar);
        int iJd = va.jd(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.widget.jpo(context);
        int i10 = hna.f21555va;
        jpoVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iJd, iJd);
        layoutParams2.addRule(14);
        jpoVar.setLayoutParams(layoutParams2);
        jpoVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        qkVar.addView(jpoVar);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setId(hna.vrc);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iJd, iJd);
        layoutParams3.addRule(8, i10);
        layoutParams3.addRule(19, i10);
        layoutParams3.addRule(5, i10);
        layoutParams3.addRule(7, i10);
        layoutParams3.addRule(18, i10);
        layoutParams3.addRule(6, i10);
        layoutParams3.addRule(14);
        xykVar.setLayoutParams(layoutParams3);
        xykVar.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_circle_solid_mian"));
        xykVar.setGravity(17);
        xykVar.setTextColor(-1);
        xykVar.setTextSize(2, 19.0f);
        xykVar.setTypeface(Typeface.defaultFromStyle(1));
        xykVar.setVisibility(8);
        qkVar.addView(xykVar);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        int i11 = hna.roc;
        xykVar2.setId(i11);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i10);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = va.jd(context, 6.0f);
        xykVar2.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar2.setEllipsize(truncateAt);
        xykVar2.setMaxLines(1);
        xykVar2.setTextColor(-1);
        xykVar2.setTextSize(2, 12.0f);
        qkVar.addView(xykVar2);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar3.setId(hna.f21543pe);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(va.jd(context, 100.0f), va.jd(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i11);
        layoutParams5.topMargin = va.jd(context, 20.0f);
        xykVar3.setLayoutParams(layoutParams5);
        xykVar3.setMinWidth(va.jd(context, 72.0f));
        xykVar3.setMaxLines(1);
        xykVar3.setEllipsize(truncateAt);
        xykVar3.setTextColor(-1);
        xykVar3.setTextSize(2, 14.0f);
        xykVar3.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_ad_cover_btn_begin_bg"));
        xykVar3.setGravity(17);
        int iJd2 = va.jd(context, 10.0f);
        int iJd3 = va.jd(context, 2.0f);
        xykVar3.setPadding(iJd2, iJd3, iJd2, iJd3);
        xykVar3.setVisibility(8);
        qkVar.addView(xykVar3);
    }

    public Cif(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Cif(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jpo(context);
    }
}
