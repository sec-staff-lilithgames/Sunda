package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class ki implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3514wb f37113c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f37114e;

    public /* synthetic */ ki(C3514wb c3514wb, Runnable runnable, int i10) {
        this.f37112b = i10;
        this.f37113c = c3514wb;
        this.f37114e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37112b) {
            case 0:
                C3514wb.a(this.f37113c, this.f37114e);
                break;
            default:
                C3514wb.b(this.f37113c, this.f37114e);
                break;
        }
    }
}
