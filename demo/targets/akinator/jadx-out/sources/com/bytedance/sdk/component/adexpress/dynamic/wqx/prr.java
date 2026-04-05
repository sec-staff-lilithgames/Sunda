package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jj.jr;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr implements qk<com.bytedance.sdk.component.adexpress.jj.jr> {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.cm.qk f18342cm;

    /* renamed from: jd, reason: collision with root package name */
    private Context f18343jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18344jj;
    private com.bytedance.sdk.component.adexpress.jj.jr jpo;
    private String my;

    /* renamed from: qk, reason: collision with root package name */
    private int f18345qk;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my wqx;
    private int xyk;
    private JSONObject zz;

    public prr(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar, String str, int i10, int i11, int i12, JSONObject jSONObject) {
        this.f18343jd = context;
        this.wqx = myVar;
        this.f18342cm = qkVar;
        this.my = str;
        this.f18344jj = i10;
        this.f18345qk = i11;
        this.xyk = i12;
        this.zz = jSONObject;
        my();
    }

    private void my() {
        final com.bytedance.sdk.component.adexpress.dynamic.jj.jpo dynamicClickListener = this.wqx.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.my)) {
            Context context = this.f18343jd;
            com.bytedance.sdk.component.adexpress.jj.jr jrVar = new com.bytedance.sdk.component.adexpress.jj.jr(context, com.bytedance.sdk.component.adexpress.wqx.jpo.xyk(context), this.f18344jj, this.f18345qk, this.xyk, this.zz);
            this.jpo = jrVar;
            if (jrVar.getShakeLayout() != null) {
                this.jpo.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.f18343jd;
            this.jpo = new com.bytedance.sdk.component.adexpress.jj.jr(context2, com.bytedance.sdk.component.adexpress.wqx.jpo.qk(context2), this.f18344jj, this.f18345qk, this.xyk, this.zz);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.jpo.setGravity(17);
        layoutParams.gravity = 17;
        this.jpo.setLayoutParams(layoutParams);
        this.jpo.setTranslationY(com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18343jd, this.f18342cm.wad()));
        this.jpo.setShakeText(this.f18342cm.dn());
        this.jpo.setClipChildren(false);
        this.jpo.setOnShakeViewListener(new jr.jpo() { // from class: com.bytedance.sdk.component.adexpress.dynamic.wqx.prr.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.jj.jr wqx() {
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
