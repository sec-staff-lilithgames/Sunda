package xr;

import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ha implements wr.f3 {

    /* renamed from: a, reason: collision with root package name */
    public wr.g0 f92588a = wr.g0.forNonError(wr.f0.f90915f);

    /* renamed from: b, reason: collision with root package name */
    public ma f92589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ na f92590c;

    public ha(na naVar) {
        this.f92590c = naVar;
    }

    @Override // wr.f3
    public void onSubchannelState(wr.g0 g0Var) {
        na.f92815o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{g0Var, this.f92589b.f92794a});
        this.f92588a = g0Var;
        na naVar = this.f92590c;
        if (naVar.f92818h.isValid() && ((ma) naVar.f92817g.get(naVar.f92818h.getCurrentAddress())).f92796c == this) {
            naVar.d(this.f92589b);
        }
    }
}
