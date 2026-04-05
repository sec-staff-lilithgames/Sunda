package ks;

import io.odeeo.internal.b.a0;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class f implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71971c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f71972e;

    public /* synthetic */ f(b.a aVar, a0 a0Var, int i10) {
        this.f71970b = i10;
        this.f71971c = aVar;
        this.f71972e = a0Var;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71970b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onPlaylistMetadataChanged(this.f71971c, this.f71972e);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onMediaMetadataChanged(this.f71971c, this.f71972e);
                break;
        }
    }
}
