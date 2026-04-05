package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25073a = z.a("vide");

    /* renamed from: b, reason: collision with root package name */
    public static final int f25074b = z.a("soun");

    /* renamed from: c, reason: collision with root package name */
    public static final int f25075c = z.a("text");

    /* renamed from: d, reason: collision with root package name */
    public static final int f25076d = z.a("sbtl");

    /* renamed from: e, reason: collision with root package name */
    public static final int f25077e = z.a("subt");

    /* renamed from: f, reason: collision with root package name */
    public static final int f25078f = z.a("clcp");

    /* renamed from: g, reason: collision with root package name */
    public static final int f25079g = z.a(C.CENC_TYPE_cenc);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25080h = z.a("meta");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0529 A[PHI: r10 r25 r36 r37 r54
      0x0529: PHI (r10v21 java.lang.String) = (r10v14 java.lang.String), (r10v15 java.lang.String), (r10v27 java.lang.String) binds: [B:284:0x04f8, B:288:0x0528, B:255:0x0436] A[DONT_GENERATE, DONT_INLINE]
      0x0529: PHI (r25v10 byte[]) = (r25v6 byte[]), (r25v8 byte[]), (r25v6 byte[]) binds: [B:284:0x04f8, B:288:0x0528, B:255:0x0436] A[DONT_GENERATE, DONT_INLINE]
      0x0529: PHI (r36v3 int) = (r36v2 int), (r36v2 int), (r36v8 int) binds: [B:284:0x04f8, B:288:0x0528, B:255:0x0436] A[DONT_GENERATE, DONT_INLINE]
      0x0529: PHI (r37v4 int) = (r37v1 int), (r37v1 int), (r37v9 int) binds: [B:284:0x04f8, B:288:0x0528, B:255:0x0436] A[DONT_GENERATE, DONT_INLINE]
      0x0529: PHI (r54v12 int) = (r54v7 int), (r54v7 int), (r54v15 int) binds: [B:284:0x04f8, B:288:0x0528, B:255:0x0436] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05f8 A[PHI: r26 r27 r30 r32 r33
      0x05f8: PHI (r26v9 java.lang.String) = (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v10 java.lang.String) binds: [B:371:0x06ba, B:373:0x06c7, B:367:0x069f, B:326:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x05f8: PHI (r27v7 int) = (r27v2 int), (r27v2 int), (r27v4 int), (r27v8 int) binds: [B:371:0x06ba, B:373:0x06c7, B:367:0x069f, B:326:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x05f8: PHI (r30v4 java.util.List) = (r30v1 java.util.List), (r30v1 java.util.List), (r30v1 java.util.List), (r30v5 java.util.List) binds: [B:371:0x06ba, B:373:0x06c7, B:367:0x069f, B:326:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x05f8: PHI (r32v4 float) = (r32v1 float), (r32v1 float), (r32v1 float), (r32v5 float) binds: [B:371:0x06ba, B:373:0x06c7, B:367:0x069f, B:326:0x05f6] A[DONT_GENERATE, DONT_INLINE]
      0x05f8: PHI (r33v5 byte[]) = (r33v1 byte[]), (r33v1 byte[]), (r33v3 byte[]), (r33v1 byte[]) binds: [B:371:0x06ba, B:373:0x06c7, B:367:0x069f, B:326:0x05f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a r51, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b r52, long r53, com.fyber.inneractive.sdk.player.exoplayer2.drm.d r55, boolean r56) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instructions count: 2003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b, long, com.fyber.inneractive.sdk.player.exoplayer2.drm.d, boolean):com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s");
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, f fVar, int i12) {
        int i13 = nVar.f26043b;
        while (true) {
            if (i13 - i10 >= i11) {
                return 0;
            }
            nVar.e(i13);
            int iB = nVar.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB > 0, "childAtomSize should be positive");
            if (nVar.b() == c.W) {
                int i14 = i13 + 8;
                Pair pairCreate = null;
                boolean z10 = false;
                Integer numValueOf = null;
                t tVar = null;
                while (i14 - i13 < iB) {
                    nVar.e(i14);
                    int iB2 = nVar.b();
                    int iB3 = nVar.b();
                    if (iB3 == c.f25004c0) {
                        numValueOf = Integer.valueOf(nVar.b());
                    } else if (iB3 == c.X) {
                        nVar.e(nVar.f26043b + 4);
                        z10 = nVar.b() == f25079g;
                    } else if (iB3 == c.Y) {
                        int i15 = i14 + 8;
                        while (true) {
                            if (i15 - i14 >= iB2) {
                                tVar = null;
                                break;
                            }
                            nVar.e(i15);
                            int iB4 = nVar.b();
                            if (nVar.b() == c.Z) {
                                nVar.e(nVar.f26043b + 6);
                                nVar.j();
                                int iJ = nVar.j();
                                byte[] bArr = new byte[16];
                                nVar.a(bArr, 0, 16);
                                tVar = new t(iJ, bArr);
                                break;
                            }
                            i15 += iB4;
                        }
                    }
                    i14 += iB2;
                }
                if (z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(numValueOf != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(tVar != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, tVar);
                }
                if (pairCreate != null) {
                    fVar.f25061a[i12] = (t) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            i13 += iB;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(int r3, com.fyber.inneractive.sdk.player.exoplayer2.util.n r4) {
        /*
            int r3 = r3 + 12
            r4.e(r3)
            int r3 = r4.f26043b
            int r3 = r3 + 1
            r4.e(r3)
            a(r4)
            int r3 = r4.f26043b
            int r3 = r3 + 2
            r4.e(r3)
            int r3 = r4.j()
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L25
            int r0 = r4.f26043b
            int r0 = r0 + 2
            r4.e(r0)
        L25:
            r0 = r3 & 64
            if (r0 == 0) goto L33
            int r0 = r4.o()
            int r1 = r4.f26043b
            int r1 = r1 + r0
            r4.e(r1)
        L33:
            r0 = 32
            r3 = r3 & r0
            if (r3 == 0) goto L3f
            int r3 = r4.f26043b
            int r3 = r3 + 2
            r4.e(r3)
        L3f:
            int r3 = r4.f26043b
            int r3 = r3 + 1
            r4.e(r3)
            a(r4)
            int r3 = r4.j()
            if (r3 == r0) goto L93
            r0 = 33
            if (r3 == r0) goto L90
            r0 = 35
            if (r3 == r0) goto L8d
            r0 = 64
            if (r3 == r0) goto L8a
            r0 = 107(0x6b, float:1.5E-43)
            r1 = 0
            if (r3 == r0) goto L83
            r0 = 165(0xa5, float:2.31E-43)
            if (r3 == r0) goto L80
            r0 = 166(0xa6, float:2.33E-43)
            if (r3 == r0) goto L7d
            switch(r3) {
                case 102: goto L8a;
                case 103: goto L8a;
                case 104: goto L8a;
                default: goto L6b;
            }
        L6b:
            switch(r3) {
                case 169: goto L76;
                case 170: goto L6f;
                case 171: goto L6f;
                case 172: goto L76;
                default: goto L6e;
            }
        L6e:
            goto L95
        L6f:
            java.lang.String r3 = "audio/vnd.dts.hd"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L76:
            java.lang.String r3 = "audio/vnd.dts"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L7d:
            java.lang.String r1 = "audio/eac3"
            goto L95
        L80:
            java.lang.String r1 = "audio/ac3"
            goto L95
        L83:
            java.lang.String r3 = "audio/mpeg"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L8a:
            java.lang.String r1 = "audio/mp4a-latm"
            goto L95
        L8d:
            java.lang.String r1 = "video/hevc"
            goto L95
        L90:
            java.lang.String r1 = "video/avc"
            goto L95
        L93:
            java.lang.String r1 = "video/mp4v-es"
        L95:
            int r3 = r4.f26043b
            int r3 = r3 + 12
            r4.e(r3)
            int r3 = r4.f26043b
            int r3 = r3 + 1
            r4.e(r3)
            int r3 = a(r4)
            byte[] r0 = new byte[r3]
            r2 = 0
            r4.a(r0, r2, r3)
            android.util.Pair r3 = android.util.Pair.create(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i.a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.n):android.util.Pair");
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        int i10 = iJ & 127;
        while ((iJ & 128) == 128) {
            iJ = nVar.j();
            i10 = (i10 << 7) | (iJ & 127);
        }
        return i10;
    }
}
