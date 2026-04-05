package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends RelativeLayout {
    public zz(Context context) {
        super(context);
        jpo();
    }

    private void jpo() {
        setId(com.bytedance.sdk.openadsdk.utils.hna.cql);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, va.jd(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.hna.ota;
        cmVar.setId(i10);
        cmVar.setClickable(true);
        cmVar.setFocusable(true);
        cmVar.setPadding(va.jd(context, 12.0f), va.jd(context, 14.0f), va.jd(context, 12.0f), va.jd(context, 14.0f));
        cmVar.setImageResource(dt.cm(context, "tt_ad_xmark"));
        addView(cmVar, new RelativeLayout.LayoutParams(va.jd(context, 40.0f), va.jd(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        int i11 = com.bytedance.sdk.openadsdk.utils.hna.ree;
        cmVar2.setId(i11);
        cmVar2.setPadding(va.jd(context, 8.0f), va.jd(context, 10.0f), va.jd(context, 8.0f), va.jd(context, 10.0f));
        cmVar2.setImageResource(dt.cm(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(va.jd(context, 40.0f), va.jd(context, 44.0f));
        layoutParams.addRule(11);
        addView(cmVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setId(com.bytedance.sdk.openadsdk.utils.hna.wad);
        xykVar.setSingleLine(true);
        xykVar.setEllipsize(TextUtils.TruncateAt.END);
        xykVar.setGravity(17);
        xykVar.setTextColor(Color.parseColor("#222222"));
        xykVar.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(va.jd(context, 191.0f), va.jd(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i11);
        layoutParams2.addRule(1, i10);
        int iJd = va.jd(context, 10.0f);
        layoutParams2.leftMargin = iJd;
        layoutParams2.rightMargin = iJd;
        addView(xykVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.jj jjVar = new com.bytedance.sdk.openadsdk.core.jj.jj(context, null, R.style.Widget.ProgressBar.Horizontal);
        jjVar.setId(com.bytedance.sdk.openadsdk.utils.hna.voc);
        jjVar.setProgress(1);
        jjVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, va.jd(context, 2.0f));
        layoutParams3.addRule(12);
        addView(jjVar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, va.jd(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
