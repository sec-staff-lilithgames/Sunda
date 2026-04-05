package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends com.bytedance.sdk.openadsdk.core.jj.qk {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.jj.cm f20115jd;
    private final com.bytedance.sdk.openadsdk.core.jj.cm jpo;
    private final com.bytedance.sdk.openadsdk.core.jj.xyk wqx;

    public qk(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iJd = va.jd(context, 12.0f);
        int iJd2 = va.jd(context, 16.0f);
        int iJd3 = va.jd(context, 20.0f);
        int iJd4 = va.jd(context, 24.0f);
        int iJd5 = va.jd(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        this.jpo = cmVar;
        cmVar.setId(520093713);
        int iJd6 = va.jd(getContext(), 5.0f);
        cmVar.setPadding(iJd6, iJd6, iJd6, iJd6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        cmVar.setScaleType(scaleType);
        cmVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jpo());
        cmVar.setImageResource(dt.cm(sq.jpo(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iJd5, iJd5);
        layoutParams.topMargin = iJd3;
        layoutParams.leftMargin = iJd2;
        layoutParams.setMarginStart(iJd2);
        cmVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        this.f20115jd = cmVar2;
        cmVar2.setId(520093714);
        cmVar2.setPadding(iJd6, iJd6, iJd6, iJd6);
        cmVar2.setScaleType(scaleType);
        cmVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jpo());
        cmVar2.setImageResource(dt.cm(sq.jpo(), "tt_close_btn"));
        if (cmVar2.getDrawable() != null) {
            cmVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iJd5, iJd5);
        layoutParams2.topMargin = iJd3;
        layoutParams2.rightMargin = iJd2;
        layoutParams2.setMarginEnd(iJd2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        cmVar2.setLayoutParams(layoutParams2);
        cmVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.wqx = xykVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iJd4);
        layoutParams3.topMargin = iJd3;
        layoutParams3.rightMargin = iJd2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iJd2);
        layoutParams3.addRule(21);
        xykVar.setLayoutParams(layoutParams3);
        xykVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jd());
        xykVar.setGravity(17);
        xykVar.setPadding(iJd, 0, iJd, 0);
        xykVar.setTextColor(-1);
        xykVar.setTextSize(1, 14.0f);
        xykVar.setVisibility(4);
        addView(cmVar);
        addView(xykVar);
        addView(cmVar2);
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk getTopCountDown() {
        return this.wqx;
    }

    public View getTopDislike() {
        return this.jpo;
    }

    public com.bytedance.sdk.openadsdk.core.jj.cm getTopSkip() {
        return this.f20115jd;
    }
}
