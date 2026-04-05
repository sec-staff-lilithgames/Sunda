package io.odeeo.internal.b0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.l;
import io.odeeo.internal.b.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends l {

    /* renamed from: d, reason: collision with root package name */
    public final a f63247d;

    public d(y0 y0Var, a aVar) {
        super(y0Var);
        io.odeeo.internal.q0.a.checkState(y0Var.getPeriodCount() == 1);
        io.odeeo.internal.q0.a.checkState(y0Var.getWindowCount() == 1);
        this.f63247d = aVar;
    }

    @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
    public y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
        this.f62398c.getPeriod(i10, bVar, z10);
        long j10 = bVar.f63078d;
        if (j10 == C.TIME_UNSET) {
            j10 = this.f63247d.f63211d;
        }
        bVar.set(bVar.f63075a, bVar.f63076b, bVar.f63077c, j10, bVar.getPositionInWindowUs(), this.f63247d, bVar.f63080f);
        return bVar;
    }
}
