package os;

import io.odeeo.internal.f.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.a f79828c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f79829e;

    public /* synthetic */ a(g.a aVar, g gVar, int i10) {
        this.f79827b = i10;
        this.f79828c = aVar;
        this.f79829e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f79827b) {
            case 0:
                this.f79828c.b(this.f79829e);
                break;
            case 1:
                this.f79828c.d(this.f79829e);
                break;
            case 2:
                this.f79828c.c(this.f79829e);
                break;
            default:
                this.f79828c.a(this.f79829e);
                break;
        }
    }
}
