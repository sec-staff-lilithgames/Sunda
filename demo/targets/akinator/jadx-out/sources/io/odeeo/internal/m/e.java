package io.odeeo.internal.m;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface e extends v {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends v.b implements e {
        public a() {
            super(C.TIME_UNSET);
        }

        @Override // io.odeeo.internal.m.e
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // io.odeeo.internal.m.e
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    long getDataEndPosition();

    @Override // io.odeeo.internal.g.v
    /* synthetic */ long getDurationUs();

    @Override // io.odeeo.internal.g.v
    /* synthetic */ v.a getSeekPoints(long j10);

    long getTimeUs(long j10);

    @Override // io.odeeo.internal.g.v
    /* synthetic */ boolean isSeekable();
}
