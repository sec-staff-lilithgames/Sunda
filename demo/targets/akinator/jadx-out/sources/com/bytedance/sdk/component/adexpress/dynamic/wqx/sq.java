package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jj.tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq<E extends tu> implements qk<E> {

    /* renamed from: cm, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.cm.qk f18347cm;

    /* renamed from: jd, reason: collision with root package name */
    protected Context f18348jd;
    protected tu jpo;
    protected int my;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my wqx;

    public sq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar, int i10) {
        this.my = i10;
        this.f18348jd = context;
        this.wqx = myVar;
        this.f18347cm = qkVar;
        cm();
    }

    public void cm() {
        this.jpo = new tu(this.f18348jd, this.f18347cm.roc());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18348jd, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18348jd, 100 - this.my);
        this.jpo.setLayoutParams(layoutParams);
        try {
            this.jpo.setGuideText(this.f18347cm.dn());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jd() {
        this.jpo.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jpo() {
        this.jpo.jpo();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    /* renamed from: my, reason: merged with bridge method [inline-methods] */
    public E wqx() {
        return (E) this.jpo;
    }

    public sq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        this(context, myVar, qkVar, 0);
    }
}
