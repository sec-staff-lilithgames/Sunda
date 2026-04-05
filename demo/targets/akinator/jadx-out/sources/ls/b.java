package ls;

import io.odeeo.internal.d.g;
import io.odeeo.internal.e.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.a f73618c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f73619e;

    public /* synthetic */ b(g.a aVar, e eVar, int i10) {
        this.f73617b = i10;
        this.f73618c = aVar;
        this.f73619e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73617b) {
            case 0:
                this.f73618c.a(this.f73619e);
                break;
            default:
                this.f73618c.b(this.f73619e);
                break;
        }
    }
}
