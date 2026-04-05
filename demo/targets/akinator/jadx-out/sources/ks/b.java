package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71956c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71957e;

    public /* synthetic */ b(b.a aVar, int i10, int i11) {
        this.f71955b = i11;
        this.f71956c = aVar;
        this.f71957e = i10;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71955b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onRepeatModeChanged(this.f71956c, this.f71957e);
                break;
            case 1:
                ((io.odeeo.internal.c.b) obj).onAudioSessionIdChanged(this.f71956c, this.f71957e);
                break;
            case 2:
                ((io.odeeo.internal.c.b) obj).onTimelineChanged(this.f71956c, this.f71957e);
                break;
            case 3:
                io.odeeo.internal.c.a.b(this.f71956c, this.f71957e, (io.odeeo.internal.c.b) obj);
                break;
            case 4:
                ((io.odeeo.internal.c.b) obj).onPlaybackSuppressionReasonChanged(this.f71956c, this.f71957e);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onPlaybackStateChanged(this.f71956c, this.f71957e);
                break;
        }
    }
}
