package io.odeeo.internal.b;

import io.odeeo.internal.b.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface x {
    float getAdjustedPlaybackSpeed(long j10, long j11);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(z.g gVar);

    void setTargetLiveOffsetOverrideUs(long j10);
}
