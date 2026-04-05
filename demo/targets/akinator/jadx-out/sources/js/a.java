package js;

import io.odeeo.internal.b0.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f69948c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.d f69949e;

    public /* synthetic */ a(c cVar, c.d dVar, int i10) {
        this.f69947b = i10;
        this.f69948c = cVar;
        this.f69949e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69947b) {
            case 0:
                this.f69948c.a(this.f69949e);
                break;
            default:
                this.f69948c.b(this.f69949e);
                break;
        }
    }
}
