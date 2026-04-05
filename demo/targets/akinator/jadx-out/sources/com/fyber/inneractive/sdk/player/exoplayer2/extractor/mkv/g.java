package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f24969d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24970a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f24971b;

    /* renamed from: c, reason: collision with root package name */
    public int f24972c;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10, boolean z11, int i10) throws InterruptedException, EOFException {
        int i11;
        if (this.f24971b == 0) {
            if (!bVar.b(this.f24970a, 0, 1, z10)) {
                return -1L;
            }
            int i12 = this.f24970a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i13 = 0;
            while (true) {
                long[] jArr = f24969d;
                if (i13 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((i12 & jArr[i13]) != 0) {
                    i11 = i13 + 1;
                    break;
                }
                i13++;
            }
            this.f24972c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f24971b = 1;
        }
        int i14 = this.f24972c;
        if (i14 > i10) {
            this.f24971b = 0;
            return -2L;
        }
        if (i14 != 1) {
            bVar.b(this.f24970a, 1, i14 - 1, false);
        }
        this.f24971b = 0;
        return a(this.f24970a, this.f24972c, z11);
    }

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f24969d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
