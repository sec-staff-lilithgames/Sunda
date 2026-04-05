package le;

import com.google.android.exoplayer2.audio.j1;
import ee.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends j implements f {
    public a(long j10, long j11, j1 j1Var, boolean z10) {
        super(j10, j11, j1Var.f27150f, j1Var.f27147c, z10);
    }

    @Override // le.f
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // le.f
    public long getTimeUs(long j10) {
        return getTimeUsAtPosition(j10);
    }
}
