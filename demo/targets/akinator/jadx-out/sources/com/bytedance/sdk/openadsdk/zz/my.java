package com.bytedance.sdk.openadsdk.zz;

import com.bytedance.sdk.component.my.jr;
import com.bytedance.sdk.component.my.zz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements jr {
    private static int jpo;

    /* renamed from: cm, reason: collision with root package name */
    private boolean f21674cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f21675jd = 0;
    private final String my;
    private long wqx;

    public my() {
        jpo++;
        this.my = "image_request_" + jpo;
    }

    @Override // com.bytedance.sdk.component.my.jr
    public void jd(String str, zz zzVar) {
        this.wqx += System.currentTimeMillis() - this.f21675jd;
        wqx(str, zzVar);
    }

    @Override // com.bytedance.sdk.component.my.jr
    public void jpo(String str, zz zzVar) {
        if (!this.f21674cm) {
            zzVar.jpo();
            zzVar.jd();
            zzVar.wqx();
            this.f21674cm = true;
        }
        this.f21675jd = System.currentTimeMillis();
        wqx(str, zzVar);
    }

    private String wqx(String str, zz zzVar) {
        return str;
    }
}
