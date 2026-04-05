package com.bytedance.sdk.component.my.jd;

import com.bytedance.sdk.component.my.my;
import com.bytedance.sdk.component.my.oya;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements my {

    /* renamed from: cm, reason: collision with root package name */
    private oya f18874cm;

    /* renamed from: jd, reason: collision with root package name */
    private boolean f18875jd;
    private String jpo;
    private boolean wqx;

    public jd(String str, boolean z10, boolean z11, oya oyaVar) {
        this.jpo = str;
        this.f18875jd = z10;
        this.wqx = z11;
        this.f18874cm = oyaVar;
    }

    @Override // com.bytedance.sdk.component.my.my
    public boolean jd() {
        return this.f18875jd;
    }

    @Override // com.bytedance.sdk.component.my.my
    public String jpo() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.my.my
    public boolean wqx() {
        return this.wqx;
    }
}
