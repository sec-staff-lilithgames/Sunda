package is;

import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.p;
import io.odeeo.internal.b.q;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class k implements o.a, q.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f68393c;

    public /* synthetic */ k(p pVar, int i10) {
        this.f68392b = i10;
        this.f68393c = pVar;
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f68392b) {
            case 0:
                this.f68393c.d((l0.c) obj);
                break;
            case 1:
            default:
                this.f68393c.a((l0.c) obj);
                break;
            case 2:
                this.f68393c.c((l0.c) obj);
                break;
        }
    }

    @Override // io.odeeo.internal.b.q.f
    public void onPlaybackInfoUpdate(q.e eVar) {
        this.f68393c.c(eVar);
    }
}
