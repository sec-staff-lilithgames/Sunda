package ks;

import io.odeeo.internal.b.t;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class h implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71978c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f71979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.e.i f71980f;

    public /* synthetic */ h(b.a aVar, t tVar, io.odeeo.internal.e.i iVar, int i10) {
        this.f71977b = i10;
        this.f71978c = aVar;
        this.f71979e = tVar;
        this.f71980f = iVar;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71977b) {
            case 0:
                io.odeeo.internal.c.a.a(this.f71978c, this.f71979e, this.f71980f, (io.odeeo.internal.c.b) obj);
                break;
            default:
                io.odeeo.internal.c.a.b(this.f71978c, this.f71979e, this.f71980f, (io.odeeo.internal.c.b) obj);
                break;
        }
    }
}
