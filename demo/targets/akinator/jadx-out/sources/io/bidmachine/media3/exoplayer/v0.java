package io.bidmachine.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public long f61573a = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    public float f61574b = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public long f61575c = C.TIME_UNSET;

    public w0 build() {
        return new w0(this);
    }

    public v0 setLastRebufferRealtimeMs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0 || j10 == C.TIME_UNSET);
        this.f61575c = j10;
        return this;
    }

    public v0 setPlaybackPositionUs(long j10) {
        this.f61573a = j10;
        return this;
    }

    public v0 setPlaybackSpeed(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 > 0.0f || f10 == -3.4028235E38f);
        this.f61574b = f10;
        return this;
    }
}
