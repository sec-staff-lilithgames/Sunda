package com.ironsource;

import com.ironsource.C3568ze;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class qi implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3364ne f38245c;

    public /* synthetic */ qi(C3364ne c3364ne, int i10) {
        this.f38244b = i10;
        this.f38245c = c3364ne;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38244b) {
            case 0:
                C3568ze.c(this.f38245c);
                break;
            default:
                C3568ze.b.b(this.f38245c);
                break;
        }
    }
}
