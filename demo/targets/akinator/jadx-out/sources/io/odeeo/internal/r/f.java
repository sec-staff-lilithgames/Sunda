package io.odeeo.internal.r;

import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.t;
import io.odeeo.internal.r.a;
import io.odeeo.internal.r.h;
import io.odeeo.internal.r.n;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements h.b {

    /* renamed from: c, reason: collision with root package name */
    public boolean f66039c;

    /* renamed from: b, reason: collision with root package name */
    public int f66038b = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66040d = true;

    @Override // io.odeeo.internal.r.h.b
    public h createAdapter(h.a aVar) throws IOException {
        int i10 = this.f66038b;
        if ((i10 != 1 || g0.f65861a < 23) && (i10 != 0 || g0.f65861a < 31)) {
            return new n.c().createAdapter(aVar);
        }
        int trackType = t.getTrackType(aVar.f66048c.f62971l);
        p.i("DefaultMediaCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + g0.getTrackTypeString(trackType));
        return new a.b(trackType, this.f66039c, this.f66040d).createAdapter(aVar);
    }

    public void experimentalSetImmediateCodecStartAfterFlushEnabled(boolean z10) {
        this.f66040d = z10;
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z10) {
        this.f66039c = z10;
    }

    public f forceDisableAsynchronous() {
        this.f66038b = 2;
        return this;
    }

    public f forceEnableAsynchronous() {
        this.f66038b = 1;
        return this;
    }
}
