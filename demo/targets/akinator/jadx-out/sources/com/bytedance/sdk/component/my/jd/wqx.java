package com.bytedance.sdk.component.my.jd;

import com.bytedance.sdk.component.my.jj;
import com.bytedance.sdk.component.my.qk;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx<T> implements jj {

    /* renamed from: cm, reason: collision with root package name */
    private String f18876cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18877jd;
    Map<String, String> jpo;
    private qk my;
    private T wqx;

    public wqx(int i10, T t10, String str) {
        this.f18877jd = i10;
        this.wqx = t10;
        this.f18876cm = str;
    }

    @Override // com.bytedance.sdk.component.my.jj
    public String cm() {
        return this.f18876cm;
    }

    @Override // com.bytedance.sdk.component.my.jj
    public int jd() {
        return this.f18877jd;
    }

    @Override // com.bytedance.sdk.component.my.jj
    public qk jpo() {
        return this.my;
    }

    @Override // com.bytedance.sdk.component.my.jj
    public Map<String, String> my() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.my.jj
    public T wqx() {
        return this.wqx;
    }

    public void jpo(qk qkVar) {
        this.my = qkVar;
    }

    public wqx(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.jpo = map;
    }
}
