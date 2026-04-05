package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class m implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71994c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f71995e;

    public /* synthetic */ m(b.a aVar, boolean z10, int i10) {
        this.f71993b = i10;
        this.f71994c = aVar;
        this.f71995e = z10;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71993b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onSkipSilenceEnabledChanged(this.f71994c, this.f71995e);
                break;
            case 1:
                ((io.odeeo.internal.c.b) obj).onIsPlayingChanged(this.f71994c, this.f71995e);
                break;
            case 2:
                io.odeeo.internal.c.a.a(this.f71994c, this.f71995e, (io.odeeo.internal.c.b) obj);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onShuffleModeChanged(this.f71994c, this.f71995e);
                break;
        }
    }
}
