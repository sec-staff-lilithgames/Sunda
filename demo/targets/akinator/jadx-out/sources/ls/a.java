package ls;

import io.odeeo.internal.d.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.a f73615c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f73616e;

    public /* synthetic */ a(g.a aVar, Exception exc, int i10) {
        this.f73614b = i10;
        this.f73615c = aVar;
        this.f73616e = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73614b) {
            case 0:
                this.f73615c.b(this.f73616e);
                break;
            default:
                this.f73615c.a(this.f73616e);
                break;
        }
    }
}
