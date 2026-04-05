package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class j implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71985c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f71986e;

    public /* synthetic */ j(b.a aVar, int i10, long j10) {
        this.f71984b = i10;
        this.f71985c = aVar;
        this.f71986e = j10;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71984b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onMaxSeekToPreviousPositionChanged(this.f71985c, this.f71986e);
                break;
            case 1:
                ((io.odeeo.internal.c.b) obj).onSeekBackIncrementChanged(this.f71985c, this.f71986e);
                break;
            case 2:
                ((io.odeeo.internal.c.b) obj).onAudioPositionAdvancing(this.f71985c, this.f71986e);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onSeekForwardIncrementChanged(this.f71985c, this.f71986e);
                break;
        }
    }
}
