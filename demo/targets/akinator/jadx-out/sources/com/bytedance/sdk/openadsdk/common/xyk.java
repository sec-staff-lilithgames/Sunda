package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends LinearLayout {
    public xyk(Context context) {
        super(context);
        jpo();
    }

    private static ImageView jpo(Context context, float f10, float f11, float f12, float f13) {
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setClickable(true);
        cmVar.setFocusable(true);
        cmVar.setPadding(va.jd(context, f12), va.jd(context, f13), va.jd(context, f12), va.jd(context, f13));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(va.jd(context, 40.0f), va.jd(context, 44.0f));
        if (f10 > 0.0f) {
            layoutParams.leftMargin = va.jd(context, f10);
        }
        if (f11 > 0.0f) {
            layoutParams.rightMargin = va.jd(context, f11);
        }
        cmVar.setLayoutParams(layoutParams);
        return cmVar;
    }

    private void jpo() {
        Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.hna.aix);
        setLayoutParams(new ViewGroup.LayoutParams(-1, va.jd(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, va.jd(context, 0.5f)));
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setOrientation(0);
        addView(myVar, new LinearLayout.LayoutParams(-1, va.jd(context, 44.0f)));
        ImageView imageViewJpo = jpo(context, 16.0f, 0.0f, 14.75f, 12.5f);
        imageViewJpo.setId(com.bytedance.sdk.openadsdk.utils.hna.f21552tl);
        imageViewJpo.setImageResource(dt.cm(context, "tt_ad_arrow_backward"));
        myVar.addView(imageViewJpo);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        myVar.addView(view2, layoutParams);
        ImageView imageViewJpo2 = jpo(context, 8.0f, 0.0f, 14.75f, 12.5f);
        imageViewJpo2.setId(com.bytedance.sdk.openadsdk.utils.hna.erj);
        imageViewJpo2.setImageResource(dt.cm(context, "tt_ad_arrow_forward"));
        myVar.addView(imageViewJpo2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        myVar.addView(view3, layoutParams2);
        ImageView imageViewJpo3 = jpo(context, 8.0f, 0.0f, 10.0f, 12.0f);
        imageViewJpo3.setId(com.bytedance.sdk.openadsdk.utils.hna.f21556vk);
        imageViewJpo3.setImageResource(dt.cm(context, "tt_ad_refresh"));
        myVar.addView(imageViewJpo3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        myVar.addView(view4, layoutParams3);
        ImageView imageViewJpo4 = jpo(context, 0.0f, 16.0f, 9.0f, 11.0f);
        imageViewJpo4.setId(com.bytedance.sdk.openadsdk.utils.hna.f21534kb);
        imageViewJpo4.setImageResource(dt.cm(context, "tt_ad_link"));
        myVar.addView(imageViewJpo4);
    }
}
