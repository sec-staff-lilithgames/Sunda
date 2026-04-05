package ce;

import android.media.MediaCodec;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12214a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12215b;

    /* renamed from: c, reason: collision with root package name */
    public int f12216c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f12217d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f12218e;

    /* renamed from: f, reason: collision with root package name */
    public int f12219f;

    /* renamed from: g, reason: collision with root package name */
    public int f12220g;

    /* renamed from: h, reason: collision with root package name */
    public int f12221h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f12222i;

    /* renamed from: j, reason: collision with root package name */
    public final c f12223j;

    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f12222i = cryptoInfo;
        this.f12223j = n1.f28506a >= 24 ? new c(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.f12222i;
    }

    public void increaseClearDataFirstSubSampleBy(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f12217d == null) {
            int[] iArr = new int[1];
            this.f12217d = iArr;
            this.f12222i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f12217d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void set(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f12219f = i10;
        this.f12217d = iArr;
        this.f12218e = iArr2;
        this.f12215b = bArr;
        this.f12214a = bArr2;
        this.f12216c = i11;
        this.f12220g = i12;
        this.f12221h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f12222i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (n1.f28506a >= 24) {
            c cVar = (c) com.google.android.exoplayer2.util.a.checkNotNull(this.f12223j);
            MediaCodec.CryptoInfo.Pattern pattern = cVar.f12213b;
            pattern.set(i12, i13);
            cVar.f12212a.setPattern(pattern);
        }
    }
}
