package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class rh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uf f38299c;

    public /* synthetic */ rh(Uf uf2, int i10) {
        this.f38298b = i10;
        this.f38299c = uf2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38298b) {
            case 0:
                Uf.a(this.f38299c);
                break;
            default:
                Uf.b(this.f38299c);
                break;
        }
    }
}
