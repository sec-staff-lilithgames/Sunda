package com.bytedance.sdk.component.my.wqx;

import com.bytedance.sdk.component.my.ju;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm<T> implements ju {

    /* renamed from: cm, reason: collision with root package name */
    private T f18886cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f18887jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18888jj;
    private String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f18889ju;
    private int my;

    /* renamed from: qk, reason: collision with root package name */
    private Map<String, String> f18890qk;
    private T wqx;
    private boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.component.my.qk f18891yd;
    private boolean zz;

    @Override // com.bytedance.sdk.component.my.ju
    public Map<String, String> cm() {
        return this.f18890qk;
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
        this.f18887jd = wqxVar.jpo();
        this.my = wqxVar.jd();
        this.f18888jj = wqxVar.wqx();
        this.zz = wqxVar.prr();
        this.f18891yd = wqxVar.hna();
        this.f18889ju = wqxVar.sq();
        return this;
    }

    @Override // com.bytedance.sdk.component.my.ju
    public boolean my() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.my.ju
    public int qk() {
        return this.f18889ju;
    }

    @Override // com.bytedance.sdk.component.my.ju
    public T wqx() {
        return this.f18886cm;
    }

    public cm jpo(wqx wqxVar, T t10, Map<String, String> map, boolean z10) {
        this.f18890qk = map;
        this.xyk = z10;
        return jpo(wqxVar, t10);
    }

    @Override // com.bytedance.sdk.component.my.ju
    public String jpo() {
        return this.f18887jd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.my.ju
    public void jpo(Object obj) {
        this.f18886cm = this.wqx;
        this.wqx = obj;
    }
}
