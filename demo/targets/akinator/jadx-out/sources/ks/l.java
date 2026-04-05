package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class l implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71992c;

    public /* synthetic */ l(b.a aVar, int i10) {
        this.f71991b = i10;
        this.f71992c = aVar;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71991b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onDrmSessionReleased(this.f71992c);
                break;
            case 1:
                ((io.odeeo.internal.c.b) obj).onDrmKeysLoaded(this.f71992c);
                break;
            case 2:
                ((io.odeeo.internal.c.b) obj).onDrmKeysRemoved(this.f71992c);
                break;
            case 3:
                ((io.odeeo.internal.c.b) obj).onSeekStarted(this.f71992c);
                break;
            case 4:
                ((io.odeeo.internal.c.b) obj).onDrmKeysRestored(this.f71992c);
                break;
            case 5:
                ((io.odeeo.internal.c.b) obj).onSeekProcessed(this.f71992c);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onPlayerReleased(this.f71992c);
                break;
        }
    }
}
