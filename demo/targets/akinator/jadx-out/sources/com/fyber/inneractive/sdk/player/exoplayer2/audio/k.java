package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public AudioTrack f24513a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24514b;

    /* renamed from: c, reason: collision with root package name */
    public int f24515c;

    /* renamed from: d, reason: collision with root package name */
    public long f24516d;

    /* renamed from: e, reason: collision with root package name */
    public long f24517e;

    /* renamed from: f, reason: collision with root package name */
    public long f24518f;

    /* renamed from: g, reason: collision with root package name */
    public long f24519g;

    /* renamed from: h, reason: collision with root package name */
    public long f24520h;

    /* renamed from: i, reason: collision with root package name */
    public long f24521i;

    public void a(AudioTrack audioTrack, boolean z10) {
        this.f24513a = audioTrack;
        this.f24514b = z10;
        this.f24519g = C.TIME_UNSET;
        this.f24516d = 0L;
        this.f24517e = 0L;
        this.f24518f = 0L;
        if (audioTrack != null) {
            this.f24515c = audioTrack.getSampleRate();
        }
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public final void d() throws IllegalStateException {
        if (this.f24519g != C.TIME_UNSET) {
            return;
        }
        this.f24513a.pause();
    }

    public boolean e() {
        return false;
    }

    public final void a(long j10) throws IllegalStateException {
        this.f24520h = a();
        this.f24519g = SystemClock.elapsedRealtime() * 1000;
        this.f24521i = j10;
        this.f24513a.stop();
    }

    public final long a() {
        if (this.f24519g != C.TIME_UNSET) {
            return Math.min(this.f24521i, this.f24520h + ((((SystemClock.elapsedRealtime() * 1000) - this.f24519g) * this.f24515c) / 1000000));
        }
        int playState = this.f24513a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f24513a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f24514b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f24518f = this.f24516d;
            }
            playbackHeadPosition += this.f24518f;
        }
        if (this.f24516d > playbackHeadPosition) {
            this.f24517e++;
        }
        this.f24516d = playbackHeadPosition;
        return playbackHeadPosition + (this.f24517e << 32);
    }
}
