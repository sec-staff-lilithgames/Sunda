package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends RelativeLayout {
    public yd(Context context) {
        super(context);
        jpo();
    }

    private void jpo() {
        Context context = getContext();
        int iJd = va.jd(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, va.jd(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setId(520093720);
        cmVar.setClickable(true);
        cmVar.setFocusable(true);
        cmVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_leftbackicon_selector"));
        int iJd2 = va.jd(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iJd2, iJd2);
        layoutParams.leftMargin = iJd;
        layoutParams.addRule(15);
        addView(cmVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar2.setId(520093716);
        cmVar2.setClickable(true);
        cmVar2.setFocusable(true);
        cmVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iJd2, iJd2);
        layoutParams2.leftMargin = iJd;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(cmVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar3 = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.hna.f21558wu;
        cmVar3.setId(i10);
        cmVar3.setImageDrawable(dt.wqx(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iJd2, iJd2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iJd;
        addView(cmVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setId(com.bytedance.sdk.openadsdk.utils.hna.f21549sg);
        xykVar.setSingleLine(true);
        xykVar.setEllipsize(TextUtils.TruncateAt.END);
        xykVar.setGravity(17);
        xykVar.setTextColor(-16777216);
        xykVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(va.jd(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i10);
        int iJd3 = va.jd(context, 25.0f);
        layoutParams4.rightMargin = iJd3;
        layoutParams4.leftMargin = iJd3;
        addView(xykVar, layoutParams4);
    }
}
