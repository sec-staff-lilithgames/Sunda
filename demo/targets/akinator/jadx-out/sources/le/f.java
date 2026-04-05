package le;

import ee.g0;
import ee.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface f extends i0 {
    long getDataEndPosition();

    @Override // ee.i0
    /* synthetic */ long getDurationUs();

    @Override // ee.i0
    /* synthetic */ g0 getSeekPoints(long j10);

    long getTimeUs(long j10);

    @Override // ee.i0
    /* synthetic */ boolean isSeekable();
}
