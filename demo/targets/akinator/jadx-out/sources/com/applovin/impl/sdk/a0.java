package com.applovin.impl.sdk;

import com.applovin.impl.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15320c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15322f;

    public /* synthetic */ a0(Object obj, boolean z10, long j10, int i10) {
        this.f15319b = i10;
        this.f15322f = obj;
        this.f15320c = z10;
        this.f15321e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15319b) {
            case 0:
                ((r) this.f15322f).a(this.f15320c, this.f15321e);
                break;
            default:
                ((z1) this.f15322f).b(this.f15320c, this.f15321e);
                break;
        }
    }
}
