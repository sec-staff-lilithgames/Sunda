package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;
import io.odeeo.internal.q0.g0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public io.odeeo.internal.b.t f65528a;

    /* renamed from: b, reason: collision with root package name */
    public io.odeeo.internal.q0.e0 f65529b;

    /* renamed from: c, reason: collision with root package name */
    public io.odeeo.internal.g.x f65530c;

    public s(String str) {
        this.f65528a = new t.b().setSampleMimeType(str).build();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    public final void a() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65529b);
        g0.castNonNull(this.f65530c);
    }

    @Override // io.odeeo.internal.p.x
    public void consume(io.odeeo.internal.q0.x xVar) {
        a();
        long lastAdjustedTimestampUs = this.f65529b.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.f65529b.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == C.TIME_UNSET || timestampOffsetUs == C.TIME_UNSET) {
            return;
        }
        io.odeeo.internal.b.t tVar = this.f65528a;
        if (timestampOffsetUs != tVar.f62975p) {
            io.odeeo.internal.b.t tVarBuild = tVar.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.f65528a = tVarBuild;
            this.f65530c.format(tVarBuild);
        }
        int iBytesLeft = xVar.bytesLeft();
        this.f65530c.sampleData(xVar, iBytesLeft);
        this.f65530c.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @Override // io.odeeo.internal.p.x
    public void init(io.odeeo.internal.q0.e0 e0Var, io.odeeo.internal.g.j jVar, d0.d dVar) {
        this.f65529b = e0Var;
        dVar.generateNewId();
        io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 5);
        this.f65530c = xVarTrack;
        xVarTrack.format(this.f65528a);
    }
}
