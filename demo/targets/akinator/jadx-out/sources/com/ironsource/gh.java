package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class gh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Da f36821c;

    public /* synthetic */ gh(Da da2, int i10) {
        this.f36820b = i10;
        this.f36821c = da2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36820b) {
            case 0:
                Da.a(this.f36821c);
                break;
            case 1:
                Da.b(this.f36821c);
                break;
            default:
                Da.c(this.f36821c);
                break;
        }
    }
}
