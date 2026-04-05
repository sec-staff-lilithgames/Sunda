package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class kh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Nd f37111c;

    public /* synthetic */ kh(Nd nd2, int i10) {
        this.f37110b = i10;
        this.f37111c = nd2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37110b) {
            case 0:
                Nd.c(this.f37111c);
                break;
            case 1:
                Nd.b(this.f37111c);
                break;
            case 2:
                Nd.d(this.f37111c);
                break;
            case 3:
                Nd.a(this.f37111c);
                break;
            default:
                Nd.e(this.f37111c);
                break;
        }
    }
}
