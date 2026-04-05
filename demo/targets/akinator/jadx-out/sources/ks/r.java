package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class r implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f72012c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f72013e;

    public /* synthetic */ r(b.a aVar, Exception exc, int i10) {
        this.f72011b = i10;
        this.f72012c = aVar;
        this.f72013e = exc;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f72011b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onVideoCodecError(this.f72012c, this.f72013e);
                break;
            case 1:
                ((io.odeeo.internal.c.b) obj).onDrmSessionManagerError(this.f72012c, this.f72013e);
                break;
            case 2:
                ((io.odeeo.internal.c.b) obj).onAudioSinkError(this.f72012c, this.f72013e);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onAudioCodecError(this.f72012c, this.f72013e);
                break;
        }
    }
}
