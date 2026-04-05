package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jj.se;
import com.bytedance.sdk.component.utils.dt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr implements qk<se> {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.cm.qk f18337cm;

    /* renamed from: jd, reason: collision with root package name */
    private Context f18338jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.cm.yd f18339jj;
    private se jpo;
    private String my;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my wqx;

    public jr(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar, String str, com.bytedance.sdk.component.adexpress.dynamic.cm.yd ydVar) {
        this.f18338jd = context;
        this.wqx = myVar;
        this.f18337cm = qkVar;
        this.my = str;
        this.f18339jj = ydVar;
        my();
    }

    private void my() {
        int iFy = this.f18337cm.fy();
        final com.bytedance.sdk.component.adexpress.dynamic.jj.jpo dynamicClickListener = this.wqx.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.my)) {
            Context context = this.f18338jd;
            se seVar = new se(context, com.bytedance.sdk.component.adexpress.wqx.jpo.zz(context), this.f18339jj);
            this.jpo = seVar;
            if (seVar.getWriggleLayout() != null) {
                this.jpo.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.jpo.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.f18337cm.ree())) {
                    this.jpo.getTopTextView().setText(dt.jd(this.f18338jd, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.jpo.getTopTextView().setText(this.f18337cm.ree());
                }
            }
        } else {
            Context context2 = this.f18338jd;
            this.jpo = new se(context2, com.bytedance.sdk.component.adexpress.wqx.jpo.zz(context2), this.f18339jj);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.jpo.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18338jd, iFy)));
        this.jpo.setLayoutParams(layoutParams);
        this.jpo.setShakeText(this.f18337cm.dn());
        this.jpo.setClipChildren(false);
        final View wriggleProgressIv = this.jpo.getWriggleProgressIv();
        this.jpo.setOnShakeViewListener(new se.jpo() { // from class: com.bytedance.sdk.component.adexpress.dynamic.wqx.jr.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public se wqx() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jd() {
        this.jpo.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jpo() {
        this.jpo.jpo();
    }
}
