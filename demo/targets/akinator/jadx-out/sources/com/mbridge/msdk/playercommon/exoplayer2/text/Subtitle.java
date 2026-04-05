package com.mbridge.msdk.playercommon.exoplayer2.text;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Subtitle {
    List<Cue> getCues(long j10);

    long getEventTime(int i10);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j10);
}
