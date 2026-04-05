package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f25652a;

    /* renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f25653b;

    public i(boolean z10) {
        this.f25652a = z10 ? 1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final int a() {
        if (this.f25653b == null) {
            this.f25653b = new MediaCodecList(this.f25652a).getCodecInfos();
        }
        return this.f25653b.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final MediaCodecInfo a(int i10) {
        if (this.f25653b == null) {
            this.f25653b = new MediaCodecList(this.f25652a).getCodecInfos();
        }
        return this.f25653b[i10];
    }
}
