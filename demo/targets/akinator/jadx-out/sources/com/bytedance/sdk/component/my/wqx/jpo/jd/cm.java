package com.bytedance.sdk.component.my.wqx.jpo.jd;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.my.sq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements sq {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.component.my.wqx.jpo.jd f18902jd;
    private final sq jpo;

    public cm(sq sqVar) {
        this(sqVar, null);
    }

    public cm(sq sqVar, com.bytedance.sdk.component.my.wqx.jpo.jd jdVar) {
        this.jpo = sqVar;
        this.f18902jd = jdVar;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jd(String str) {
        return this.jpo.jd(str);
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jpo(String str, Bitmap bitmap) {
        return this.jpo.jpo(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public Bitmap jpo(String str) {
        return this.jpo.jpo(str);
    }
}
