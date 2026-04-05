package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class jh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ka f37045c;

    public /* synthetic */ jh(Ka ka2, int i10) {
        this.f37044b = i10;
        this.f37045c = ka2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37044b) {
            case 0:
                Ka.c(this.f37045c);
                break;
            default:
                Ka.d(this.f37045c);
                break;
        }
    }
}
