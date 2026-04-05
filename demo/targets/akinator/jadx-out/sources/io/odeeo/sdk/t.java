package io.odeeo.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f68184c;

    public /* synthetic */ t(l lVar, int i10) {
        this.f68183b = i10;
        this.f68184c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68183b) {
            case 0:
                l.a(this.f68184c);
                break;
            case 1:
                l.b(this.f68184c);
                break;
            default:
                l.c(this.f68184c);
                break;
        }
    }
}
