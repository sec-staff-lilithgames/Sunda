package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class e implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71967c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f71968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71969f;

    public /* synthetic */ e(b.a aVar, boolean z10, int i10, int i11) {
        this.f71966b = i11;
        this.f71967c = aVar;
        this.f71968e = z10;
        this.f71969f = i10;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71966b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onPlayerStateChanged(this.f71967c, this.f71968e, this.f71969f);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onPlayWhenReadyChanged(this.f71967c, this.f71968e, this.f71969f);
                break;
        }
    }
}
