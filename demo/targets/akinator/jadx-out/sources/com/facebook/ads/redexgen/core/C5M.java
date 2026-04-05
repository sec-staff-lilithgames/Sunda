package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;

/* renamed from: com.facebook.ads.redexgen.X.5M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5M {
    public final MediaCodec.CryptoInfo.Pattern A00;
    public final MediaCodec.CryptoInfo A01;

    public C5M(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
        this.A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i10, int i11) {
        this.A00.set(i10, i11);
        this.A01.setPattern(this.A00);
    }
}
