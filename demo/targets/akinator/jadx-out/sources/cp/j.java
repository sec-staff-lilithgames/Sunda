package cp;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import ko.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f50866d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50867a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f50868b;

    /* renamed from: c, reason: collision with root package name */
    public int f50869c;

    public static long assembleVarint(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f50866d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int parseUnsignedVarintLength(int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            if ((f50866d[i11] & i10) != 0) {
                return i11 + 1;
            }
        }
        return -1;
    }

    public int getLastLength() {
        return this.f50869c;
    }

    public long readUnsignedVarint(a0 a0Var, boolean z10, boolean z11, int i10) throws IOException {
        int i11 = this.f50868b;
        byte[] bArr = this.f50867a;
        if (i11 == 0) {
            if (!a0Var.readFully(bArr, 0, 1, z10)) {
                return -1L;
            }
            int unsignedVarintLength = parseUnsignedVarintLength(bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f50869c = unsignedVarintLength;
            if (unsignedVarintLength == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f50868b = 1;
        }
        int i12 = this.f50869c;
        if (i12 > i10) {
            this.f50868b = 0;
            return -2L;
        }
        if (i12 != 1) {
            a0Var.readFully(bArr, 1, i12 - 1);
        }
        this.f50868b = 0;
        return assembleVarint(bArr, this.f50869c, z11);
    }

    public void reset() {
        this.f50868b = 0;
        this.f50869c = 0;
    }
}
