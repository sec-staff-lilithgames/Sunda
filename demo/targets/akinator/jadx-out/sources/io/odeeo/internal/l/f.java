package io.odeeo.internal.l;

import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.g.i;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f64581d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f64582a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f64583b;

    /* renamed from: c, reason: collision with root package name */
    public int f64584c;

    public static long assembleVarint(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f64581d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int parseUnsignedVarintLength(int i10) {
        long j10;
        int i11 = 0;
        do {
            long[] jArr = f64581d;
            if (i11 >= jArr.length) {
                return -1;
            }
            j10 = jArr[i11] & i10;
            i11++;
        } while (j10 == 0);
        return i11;
    }

    public int getLastLength() {
        return this.f64584c;
    }

    public long readUnsignedVarint(i iVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f64583b == 0) {
            if (!iVar.readFully(this.f64582a, 0, 1, z10)) {
                return -1L;
            }
            int unsignedVarintLength = parseUnsignedVarintLength(this.f64582a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f64584c = unsignedVarintLength;
            if (unsignedVarintLength == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f64583b = 1;
        }
        int i11 = this.f64584c;
        if (i11 > i10) {
            this.f64583b = 0;
            return -2L;
        }
        if (i11 != 1) {
            iVar.readFully(this.f64582a, 1, i11 - 1);
        }
        this.f64583b = 0;
        return assembleVarint(this.f64582a, this.f64584c, z11);
    }

    public void reset() {
        this.f64583b = 0;
        this.f64584c = 0;
    }
}
