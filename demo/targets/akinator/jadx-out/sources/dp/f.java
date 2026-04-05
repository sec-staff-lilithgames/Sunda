package dp;

import ko.w0;
import ko.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface f extends y0 {
    int getAverageBitrate();

    long getDataEndPosition();

    @Override // ko.y0
    /* synthetic */ long getDurationUs();

    @Override // ko.y0
    /* synthetic */ w0 getSeekPoints(long j10);

    long getTimeUs(long j10);

    @Override // ko.y0
    /* synthetic */ boolean isSeekable();
}
