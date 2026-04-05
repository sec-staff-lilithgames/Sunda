package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.u0;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public io.bidmachine.media3.common.b f84922a;

    /* renamed from: b, reason: collision with root package name */
    public u0 f84923b;

    /* renamed from: c, reason: collision with root package name */
    public e1 f84924c;

    public x(String str, String str2) {
        this.f84922a = new gn.w().setContainerMimeType(str2).setSampleMimeType(str).build();
    }

    @Override // rp.d0
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84923b);
        a1.castNonNull(this.f84924c);
        long lastAdjustedTimestampUs = this.f84923b.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.f84923b.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == C.TIME_UNSET || timestampOffsetUs == C.TIME_UNSET) {
            return;
        }
        io.bidmachine.media3.common.b bVar = this.f84922a;
        if (timestampOffsetUs != bVar.f60670t) {
            io.bidmachine.media3.common.b bVarBuild = bVar.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.f84922a = bVarBuild;
            this.f84924c.format(bVarBuild);
        }
        int iBytesLeft = m0Var.bytesLeft();
        this.f84924c.sampleData(m0Var, iBytesLeft);
        this.f84924c.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @Override // rp.d0
    public void init(u0 u0Var, ko.c0 c0Var, m0 m0Var) {
        this.f84923b = u0Var;
        m0Var.generateNewId();
        e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 5);
        this.f84924c = e1VarTrack;
        e1VarTrack.format(this.f84922a);
    }
}
