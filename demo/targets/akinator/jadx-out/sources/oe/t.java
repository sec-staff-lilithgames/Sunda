package oe;

import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t implements z {

    /* renamed from: a, reason: collision with root package name */
    public z0 f79282a;

    /* renamed from: b, reason: collision with root package name */
    public h1 f79283b;

    /* renamed from: c, reason: collision with root package name */
    public ee.l0 f79284c;

    public t(String str) {
        this.f79282a = new y0().setSampleMimeType(str).build();
    }

    @Override // oe.z
    public void consume(v0 v0Var) {
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f79283b);
        n1.castNonNull(this.f79284c);
        long lastAdjustedTimestampUs = this.f79283b.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.f79283b.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == C.TIME_UNSET || timestampOffsetUs == C.TIME_UNSET) {
            return;
        }
        z0 z0Var = this.f79282a;
        if (timestampOffsetUs != z0Var.f28806r) {
            z0 z0VarBuild = z0Var.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.f79282a = z0VarBuild;
            this.f79284c.format(z0VarBuild);
        }
        int iBytesLeft = v0Var.bytesLeft();
        this.f79284c.sampleData(v0Var, iBytesLeft);
        this.f79284c.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @Override // oe.z
    public void init(h1 h1Var, ee.s sVar, i0 i0Var) {
        this.f79283b = h1Var;
        i0Var.generateNewId();
        ee.l0 l0VarTrack = sVar.track(i0Var.getTrackId(), 5);
        this.f79284c = l0VarTrack;
        l0VarTrack.format(this.f79282a);
    }
}
