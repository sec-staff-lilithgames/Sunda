package eo;

import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a {
    boolean addCues(hp.c cVar, long j10);

    void clear();

    void discardCuesBeforeTimeUs(long j10);

    b5 getCuesAtTimeUs(long j10);

    long getNextCueChangeTimeUs(long j10);

    long getPreviousCueChangeTimeUs(long j10);
}
