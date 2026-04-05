package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya extends com.bytedance.sdk.openadsdk.core.jj.qk {
    public oya(Context context) {
        this(context, null);
    }

    private void jpo(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iJd = va.jd(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar.setId(hna.czp);
        wqxVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        wqxVar.setBackgroundColor(0);
        addView(wqxVar);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setId(hna.pzk);
        cmVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cmVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        wqxVar.addView(cmVar);
        com.bytedance.sdk.openadsdk.core.jj.jj jjVar = new com.bytedance.sdk.openadsdk.core.jj.jj(context);
        jjVar.setId(hna.f21550sn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iJd, iJd);
        layoutParams.gravity = 17;
        jjVar.setLayoutParams(layoutParams);
        jjVar.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_video_loading_progress_bar"));
        wqxVar.addView(jjVar);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar2.setId(hna.fgt);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        cmVar2.setLayoutParams(layoutParams2);
        cmVar2.setScaleType(ImageView.ScaleType.CENTER);
        cmVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_play_movebar_textpage"));
        cmVar2.setVisibility(8);
        addView(cmVar2);
        View cif = new Cif(context);
        cif.setId(hna.uhu);
        cif.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(cif);
    }

    public oya(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public oya(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jpo(context);
    }
}
