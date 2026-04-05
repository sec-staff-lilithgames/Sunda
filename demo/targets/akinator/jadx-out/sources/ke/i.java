package ke;

import com.inmobi.commons.core.configs.AdConfig;
import ee.q;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f70894d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f70895a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f70896b;

    /* renamed from: c, reason: collision with root package name */
    public int f70897c;

    public static long assembleVarint(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f70894d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int parseUnsignedVarintLength(int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            if ((f70894d[i11] & i10) != 0) {
                return i11 + 1;
            }
        }
        return -1;
    }

    public int getLastLength() {
        return this.f70897c;
    }

    public long readUnsignedVarint(q qVar, boolean z10, boolean z11, int i10) throws IOException {
        int i11 = this.f70896b;
        byte[] bArr = this.f70895a;
        if (i11 == 0) {
            if (!qVar.readFully(bArr, 0, 1, z10)) {
                return -1L;
            }
            int unsignedVarintLength = parseUnsignedVarintLength(bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f70897c = unsignedVarintLength;
            if (unsignedVarintLength == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f70896b = 1;
        }
        int i12 = this.f70897c;
        if (i12 > i10) {
            this.f70896b = 0;
            return -2L;
        }
        if (i12 != 1) {
            qVar.readFully(bArr, 1, i12 - 1);
        }
        this.f70896b = 0;
        return assembleVarint(bArr, this.f70897c, z11);
    }

    public void reset() {
        this.f70896b = 0;
        this.f70897c = 0;
    }
}
