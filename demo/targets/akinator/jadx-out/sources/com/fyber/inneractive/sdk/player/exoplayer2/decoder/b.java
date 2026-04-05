package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f24622a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f24623b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f24624c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f24625d;

    /* renamed from: e, reason: collision with root package name */
    public final a f24626e;

    public b() {
        int i10 = z.f26070a;
        MediaCodec.CryptoInfo cryptoInfo = i10 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f24625d = cryptoInfo;
        this.f24626e = i10 >= 24 ? new a(cryptoInfo) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.f24623b = iArr;
        this.f24624c = iArr2;
        this.f24622a = bArr2;
        int i11 = z.f26070a;
        if (i11 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f24625d;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i11 >= 24) {
                a.a(this.f24626e);
            }
        }
    }
}
