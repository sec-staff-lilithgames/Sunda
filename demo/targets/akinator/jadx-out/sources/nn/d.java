package nn;

import android.media.MediaCodec;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f77068a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f77069b;

    /* renamed from: c, reason: collision with root package name */
    public int f77070c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f77071d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f77072e;

    /* renamed from: f, reason: collision with root package name */
    public int f77073f;

    /* renamed from: g, reason: collision with root package name */
    public int f77074g;

    /* renamed from: h, reason: collision with root package name */
    public int f77075h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f77076i;

    /* renamed from: j, reason: collision with root package name */
    public final c f77077j;

    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f77076i = cryptoInfo;
        this.f77077j = a1.f60679a >= 24 ? new c(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.f77076i;
    }

    public void increaseClearDataFirstSubSampleBy(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f77071d == null) {
            int[] iArr = new int[1];
            this.f77071d = iArr;
            this.f77076i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f77071d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void set(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f77073f = i10;
        this.f77071d = iArr;
        this.f77072e = iArr2;
        this.f77069b = bArr;
        this.f77068a = bArr2;
        this.f77070c = i11;
        this.f77074g = i12;
        this.f77075h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f77076i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (a1.f60679a >= 24) {
            c cVar = (c) io.bidmachine.media3.common.util.a.checkNotNull(this.f77077j);
            MediaCodec.CryptoInfo.Pattern pattern = cVar.f77067b;
            pattern.set(i12, i13);
            cVar.f77066a.setPattern(pattern);
        }
    }
}
