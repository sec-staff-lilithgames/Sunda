package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f24620a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f24621b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f24620a = cryptoInfo;
    }

    public static void a(a aVar) {
        aVar.f24621b.set(0, 0);
        aVar.f24620a.setPattern(aVar.f24621b);
    }
}
