package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f25166a = {z.a("isom"), z.a("iso2"), z.a("iso3"), z.a("iso4"), z.a("iso5"), z.a("iso6"), z.a("avc1"), z.a("hvc1"), z.a("hev1"), z.a("mp41"), z.a("mp42"), z.a("3g2a"), z.a("3g2b"), z.a("3gr6"), z.a("3gs6"), z.a("3ge6"), z.a("3gg6"), z.a("M4V "), z.a("M4A "), z.a("f4v "), z.a("kddi"), z.a("M4VP"), z.a("qt  "), z.a("MSNV")};

    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws InterruptedException, EOFException {
        boolean z11;
        int i10;
        long j10 = bVar.f24648b;
        if (j10 == -1 || j10 > 4096) {
            j10 = 4096;
        }
        int i11 = (int) j10;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(64);
        boolean z12 = false;
        int i12 = 0;
        boolean z13 = false;
        while (i12 < i11) {
            nVar.c(8);
            bVar.a(nVar.f26042a, z12 ? 1 : 0, 8, z12);
            long jK = nVar.k();
            int iB = nVar.b();
            if (jK == 1) {
                bVar.a(nVar.f26042a, 8, 8, z12);
                nVar.d(16);
                i10 = 16;
                jK = nVar.n();
            } else {
                i10 = 8;
            }
            long j11 = i10;
            if (jK < j11) {
                return z12;
            }
            i12 += i10;
            if (iB != c.C) {
                if (iB == c.L || iB == c.N) {
                    z11 = true;
                    break;
                }
                long j12 = (i12 + jK) - j11;
                boolean z14 = z12 ? 1 : 0;
                if (j12 >= i11) {
                    break;
                }
                int i13 = (int) (jK - j11);
                i12 += i13;
                z13 = z13;
                if (iB == c.f25001b) {
                    if (i13 < 8) {
                        return z14;
                    }
                    nVar.c(i13);
                    bVar.a(nVar.f26042a, z14 ? 1 : 0, i13, z14);
                    int i14 = i13 / 4;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (i15 != 1) {
                            int iB2 = nVar.b();
                            if ((iB2 >>> 8) != z.a("3gp")) {
                                for (int i16 : f25166a) {
                                    if (i16 != iB2) {
                                    }
                                }
                            }
                            z13 = true;
                            break;
                        }
                        nVar.e(nVar.f26043b + 4);
                    }
                    z13 = z13;
                    if (!z13) {
                        return false;
                    }
                } else if (i13 != 0) {
                    bVar.a(i13, z14);
                    z13 = z13;
                }
                z12 = false;
            }
        }
        z11 = false;
        return z13 && z10 == z11;
    }
}
