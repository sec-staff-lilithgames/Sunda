package com.ironsource;

import com.ironsource.X2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class sh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f38868c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f38869e;

    public /* synthetic */ sh(V0 v02, long j10, int i10) {
        this.f38867b = i10;
        this.f38868c = v02;
        this.f38869e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38867b) {
            case 0:
                X2.a.d(this.f38868c, this.f38869e);
                break;
            case 1:
                X2.a.a(this.f38868c, this.f38869e);
                break;
            case 2:
                X2.a.b(this.f38868c, this.f38869e);
                break;
            default:
                X2.a.c(this.f38868c, this.f38869e);
                break;
        }
    }
}
