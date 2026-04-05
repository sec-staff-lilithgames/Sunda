package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class c implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71959c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.e.e f71960e;

    public /* synthetic */ c(b.a aVar, int i10, io.odeeo.internal.e.e eVar) {
        this.f71958b = i10;
        this.f71959c = aVar;
        this.f71960e = eVar;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71958b) {
            case 0:
                io.odeeo.internal.c.a.c(this.f71959c, this.f71960e, (io.odeeo.internal.c.b) obj);
                break;
            case 1:
                io.odeeo.internal.c.a.b(this.f71959c, this.f71960e, (io.odeeo.internal.c.b) obj);
                break;
            case 2:
                io.odeeo.internal.c.a.d(this.f71959c, this.f71960e, (io.odeeo.internal.c.b) obj);
                break;
            default:
                io.odeeo.internal.c.a.a(this.f71959c, this.f71960e, (io.odeeo.internal.c.b) obj);
                break;
        }
    }
}
