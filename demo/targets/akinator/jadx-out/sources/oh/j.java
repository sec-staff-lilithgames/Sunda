package oh;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.Serializable;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends m implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f79394c;

    public j(byte[] bArr) {
        this.f79394c = (byte[]) p1.checkNotNull(bArr);
    }

    @Override // oh.m
    public byte[] asBytes() {
        return (byte[]) this.f79394c.clone();
    }

    @Override // oh.m
    public int asInt() {
        byte[] bArr = this.f79394c;
        p1.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
        return ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // oh.m
    public long asLong() {
        byte[] bArr = this.f79394c;
        p1.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
        return padToLong();
    }

    @Override // oh.m
    public final boolean b(m mVar) {
        byte[] bArr = this.f79394c;
        if (bArr.length != mVar.c().length) {
            return false;
        }
        boolean z10 = true;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            z10 &= bArr[i10] == mVar.c()[i10];
        }
        return z10;
    }

    @Override // oh.m
    public int bits() {
        return this.f79394c.length * 8;
    }

    @Override // oh.m
    public final byte[] c() {
        return this.f79394c;
    }

    @Override // oh.m
    public final void d(int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f79394c, 0, bArr, i10, i11);
    }

    @Override // oh.m
    public long padToLong() {
        byte[] bArr = this.f79394c;
        long j10 = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i10 = 1; i10 < Math.min(bArr.length, 8); i10++) {
            j10 |= (bArr[i10] & 255) << (i10 * 8);
        }
        return j10;
    }
}
