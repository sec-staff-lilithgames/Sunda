package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71997c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.a0.q f71998e;

    public /* synthetic */ n(b.a aVar, io.odeeo.internal.a0.q qVar, int i10) {
        this.f71996b = i10;
        this.f71997c = aVar;
        this.f71998e = qVar;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71996b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onUpstreamDiscarded(this.f71997c, this.f71998e);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onDownstreamFormatChanged(this.f71997c, this.f71998e);
                break;
        }
    }
}
