package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class oi implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3553z f38051c;

    public /* synthetic */ oi(AbstractC3553z abstractC3553z, int i10) {
        this.f38050b = i10;
        this.f38051c = abstractC3553z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38050b) {
            case 0:
                AbstractC3553z.b(this.f38051c);
                break;
            case 1:
                AbstractC3553z.d(this.f38051c);
                break;
            default:
                AbstractC3553z.c(this.f38051c);
                break;
        }
    }
}
