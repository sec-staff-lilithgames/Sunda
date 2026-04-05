package io.odeeo.internal.e;

import android.media.MediaCodec;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f63681a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f63682b;

    /* renamed from: c, reason: collision with root package name */
    public int f63683c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f63684d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f63685e;

    /* renamed from: f, reason: collision with root package name */
    public int f63686f;

    /* renamed from: g, reason: collision with root package name */
    public int f63687g;

    /* renamed from: h, reason: collision with root package name */
    public int f63688h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f63689i;

    /* renamed from: j, reason: collision with root package name */
    public final b f63690j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f63691a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f63692b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f63691a = cryptoInfo;
            this.f63692b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public final void a(int i10, int i11) {
            this.f63692b.set(i10, i11);
            this.f63691a.setPattern(this.f63692b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f63689i = cryptoInfo;
        this.f63690j = g0.f65861a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.f63689i;
    }

    public void increaseClearDataFirstSubSampleBy(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f63684d == null) {
            int[] iArr = new int[1];
            this.f63684d = iArr;
            this.f63689i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f63684d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void set(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f63686f = i10;
        this.f63684d = iArr;
        this.f63685e = iArr2;
        this.f63682b = bArr;
        this.f63681a = bArr2;
        this.f63683c = i11;
        this.f63687g = i12;
        this.f63688h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f63689i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (g0.f65861a >= 24) {
            ((b) io.odeeo.internal.q0.a.checkNotNull(this.f63690j)).a(i12, i13);
        }
    }
}
