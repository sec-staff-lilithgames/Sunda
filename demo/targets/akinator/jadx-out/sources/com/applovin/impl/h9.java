package com.applovin.impl;

import com.applovin.impl.h2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class h9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14089c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14090e;

    public /* synthetic */ h9(Object obj, int i10, int i11) {
        this.f14088b = i11;
        this.f14090e = obj;
        this.f14089c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14088b) {
            case 0:
                ((h2.b) this.f14090e).a(this.f14089c);
                break;
            default:
                ((m2) this.f14090e).a(this.f14089c);
                break;
        }
    }
}
