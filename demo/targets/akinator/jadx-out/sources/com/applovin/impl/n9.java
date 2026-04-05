package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class n9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.k f14876c;

    public /* synthetic */ n9(int i10, com.applovin.impl.sdk.k kVar) {
        this.f14875b = i10;
        this.f14876c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14875b) {
            case 0:
                j2.a(this.f14876c);
                break;
            default:
                k8.d(this.f14876c);
                break;
        }
    }
}
