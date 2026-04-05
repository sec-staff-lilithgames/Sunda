package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class uh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3162cb f39081c;

    public /* synthetic */ uh(C3162cb c3162cb, int i10) {
        this.f39080b = i10;
        this.f39081c = c3162cb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39080b) {
            case 0:
                C3162cb.d(this.f39081c);
                break;
            case 1:
                C3162cb.c(this.f39081c);
                break;
            case 2:
                C3162cb.b(this.f39081c);
                break;
            default:
                C3162cb.e(this.f39081c);
                break;
        }
    }
}
