package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class q implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f72007c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f72008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f72009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f72010g;

    public /* synthetic */ q(b.a aVar, int i10, long j10, long j11, int i11) {
        this.f72006b = i11;
        this.f72007c = aVar;
        this.f72008e = i10;
        this.f72009f = j10;
        this.f72010g = j11;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f72006b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onAudioUnderrun(this.f72007c, this.f72008e, this.f72009f, this.f72010g);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onBandwidthEstimate(this.f72007c, this.f72008e, this.f72009f, this.f72010g);
                break;
        }
    }
}
