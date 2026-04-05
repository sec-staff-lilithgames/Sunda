package io.odeeo.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdUnit f68175c;

    public /* synthetic */ o(AdUnit adUnit, int i10) {
        this.f68174b = i10;
        this.f68175c = adUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68174b) {
            case 0:
                AdUnit.d(this.f68175c);
                break;
            case 1:
                AdUnit.b(this.f68175c);
                break;
            case 2:
                AdUnit.e(this.f68175c);
                break;
            case 3:
                AdUnit.a(this.f68175c);
                break;
            case 4:
                AdUnit.c(this.f68175c);
                break;
            case 5:
                AdUnit$getActivityLifecycleListener$1.c(this.f68175c);
                break;
            case 6:
                AdUnit$getActivityLifecycleListener$1.b(this.f68175c);
                break;
            default:
                AdUnit$getActivityLifecycleListener$1.a(this.f68175c);
                break;
        }
    }
}
