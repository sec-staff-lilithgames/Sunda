package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class hi implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3478u9 f36879c;

    public /* synthetic */ hi(C3478u9 c3478u9, int i10) {
        this.f36878b = i10;
        this.f36879c = c3478u9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36878b) {
            case 0:
                C3478u9.a(this.f36879c);
                break;
            case 1:
                C3478u9.b(this.f36879c);
                break;
            case 2:
                C3478u9.d(this.f36879c);
                break;
            default:
                C3478u9.c(this.f36879c);
                break;
        }
    }
}
