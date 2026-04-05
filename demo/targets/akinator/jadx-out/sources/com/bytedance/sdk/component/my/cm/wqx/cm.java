package com.bytedance.sdk.component.my.cm.wqx;

import com.bytedance.sdk.component.my.ju;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm<T> implements ju {

    /* renamed from: cm, reason: collision with root package name */
    private T f18799cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f18800jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18801jj;
    private String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f18802ju;
    private int my;

    /* renamed from: qk, reason: collision with root package name */
    private Map<String, String> f18803qk;
    private T wqx;
    private boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.component.my.qk f18804yd;
    private boolean zz;

    @Override // com.bytedance.sdk.component.my.ju
    public Map<String, String> cm() {
        return this.f18803qk;
    }

    @Override // com.bytedance.sdk.component.my.ju
    public T jd() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.component.my.ju
    public boolean jj() {
        return this.zz;
    }

    public cm jpo(wqx wqxVar, T t10) {
        this.wqx = t10;
        this.jpo = wqxVar.yd();
        this.f18800jd = wqxVar.jpo();
        this.my = wqxVar.jd();
        this.f18801jj = wqxVar.wqx();
        this.zz = wqxVar.au();
        this.f18804yd = wqxVar.prr();
        this.f18802ju = wqxVar.hna();
        return this;
    }

    @Override // com.bytedance.sdk.component.my.ju
    public boolean my() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.my.ju
    public int qk() {
        return this.f18802ju;
    }

    @Override // com.bytedance.sdk.component.my.ju
    public T wqx() {
        return this.f18799cm;
    }

    public cm jpo(wqx wqxVar, T t10, Map<String, String> map, boolean z10) {
        this.f18803qk = map;
        this.xyk = z10;
        return jpo(wqxVar, t10);
    }

    @Override // com.bytedance.sdk.component.my.ju
    public String jpo() {
        return this.f18800jd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.my.ju
    public void jpo(Object obj) {
        this.f18799cm = this.wqx;
        this.wqx = obj;
    }
}
