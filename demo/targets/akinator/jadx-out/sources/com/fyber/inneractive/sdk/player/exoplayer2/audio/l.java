package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends k {

    /* renamed from: j, reason: collision with root package name */
    public final AudioTimestamp f24522j = new AudioTimestamp();

    /* renamed from: k, reason: collision with root package name */
    public long f24523k;

    /* renamed from: l, reason: collision with root package name */
    public long f24524l;

    /* renamed from: m, reason: collision with root package name */
    public long f24525m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final void a(AudioTrack audioTrack, boolean z10) {
        super.a(audioTrack, z10);
        this.f24523k = 0L;
        this.f24524l = 0L;
        this.f24525m = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long b() {
        return this.f24525m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long c() {
        return this.f24522j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final boolean e() {
        boolean timestamp = this.f24513a.getTimestamp(this.f24522j);
        if (timestamp) {
            long j10 = this.f24522j.framePosition;
            if (this.f24524l > j10) {
                this.f24523k++;
            }
            this.f24524l = j10;
            this.f24525m = j10 + (this.f24523k << 32);
        }
        return timestamp;
    }
}
