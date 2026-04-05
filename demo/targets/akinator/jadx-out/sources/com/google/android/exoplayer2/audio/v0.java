package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.z0 f27300a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27301b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27302c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27304e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27305f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27306g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27307h;

    /* renamed from: i, reason: collision with root package name */
    public final r f27308i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27309j;

    public v0(com.google.android.exoplayer2.z0 z0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, r rVar, boolean z10) {
        this.f27300a = z0Var;
        this.f27301b = i10;
        this.f27302c = i11;
        this.f27303d = i12;
        this.f27304e = i13;
        this.f27305f = i14;
        this.f27306g = i15;
        this.f27307h = i16;
        this.f27308i = rVar;
        this.f27309j = z10;
    }

    public static AudioAttributes b(k kVar, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : kVar.getAudioAttributesV21().f27128a;
    }

    public final AudioTrack a(boolean z10, k kVar, int i10) {
        int i11 = com.google.android.exoplayer2.util.n1.f28506a;
        int i12 = this.f27306g;
        int i13 = this.f27305f;
        int i14 = this.f27304e;
        if (i11 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(b(kVar, z10)).setAudioFormat(c1.e(i14, i13, i12)).setTransferMode(1).setBufferSizeInBytes(this.f27307h).setSessionId(i10).setOffloadedPlayback(this.f27302c == 1).build();
        }
        if (i11 >= 21) {
            return new AudioTrack(b(kVar, z10), c1.e(i14, i13, i12), this.f27307h, 1, i10);
        }
        int streamTypeForAudioUsage = com.google.android.exoplayer2.util.n1.getStreamTypeForAudioUsage(kVar.f27160e);
        if (i10 == 0) {
            return new AudioTrack(streamTypeForAudioUsage, this.f27304e, this.f27305f, this.f27306g, this.f27307h, 1);
        }
        return new AudioTrack(streamTypeForAudioUsage, this.f27304e, this.f27305f, this.f27306g, this.f27307h, 1, i10);
    }

    public AudioTrack buildAudioTrack(boolean z10, k kVar, int i10) throws d0 {
        try {
            AudioTrack audioTrackA = a(z10, kVar, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new d0(state, this.f27304e, this.f27305f, this.f27307h, this.f27300a, outputModeIsOffload(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new d0(0, this.f27304e, this.f27305f, this.f27307h, this.f27300a, outputModeIsOffload(), e10);
        }
    }

    public boolean canReuseAudioTrack(v0 v0Var) {
        return v0Var.f27302c == this.f27302c && v0Var.f27306g == this.f27306g && v0Var.f27304e == this.f27304e && v0Var.f27305f == this.f27305f && v0Var.f27303d == this.f27303d && v0Var.f27309j == this.f27309j;
    }

    public v0 copyWithBufferSize(int i10) {
        return new v0(this.f27300a, this.f27301b, this.f27302c, this.f27303d, this.f27304e, this.f27305f, this.f27306g, i10, this.f27308i, this.f27309j);
    }

    public long framesToDurationUs(long j10) {
        return com.google.android.exoplayer2.util.n1.sampleCountToDurationUs(j10, this.f27304e);
    }

    public long inputFramesToDurationUs(long j10) {
        return com.google.android.exoplayer2.util.n1.sampleCountToDurationUs(j10, this.f27300a.B);
    }

    public boolean outputModeIsOffload() {
        return this.f27302c == 1;
    }
}
