package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr extends com.bytedance.sdk.openadsdk.core.jj.qk {
    public prr(Context context) {
        this(context, null);
    }

    private void jpo(Context context) {
        setId(hna.f21541oo);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        int i10 = hna.hd;
        xykVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        xykVar.setLayoutParams(layoutParams);
        xykVar.setIncludeFontPadding(false);
        xykVar.setText(dt.jpo(context, "tt_video_without_wifi_tips"));
        xykVar.setTextColor(Color.parseColor("#cacaca"));
        xykVar.setTextSize(2, 14.0f);
        addView(xykVar);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        qkVar.setId(hna.xur);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        qkVar.setLayoutParams(layoutParams2);
        addView(qkVar);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setId(hna.cnl);
        int iJd = va.jd(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iJd, iJd);
        layoutParams3.addRule(15);
        cmVar.setLayoutParams(layoutParams3);
        cmVar.setImageDrawable(dt.wqx(context, "tt_new_play_video"));
        cmVar.setScaleType(ImageView.ScaleType.FIT_XY);
        qkVar.addView(cmVar);
    }

    public prr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public prr(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jpo(context);
    }
}
