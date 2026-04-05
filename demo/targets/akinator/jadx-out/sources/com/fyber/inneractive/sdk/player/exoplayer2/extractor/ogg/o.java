package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o extends l {

    /* renamed from: n, reason: collision with root package name */
    public n f25279n;

    /* renamed from: o, reason: collision with root package name */
    public int f25280o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25281p;

    /* renamed from: q, reason: collision with root package name */
    public r f25282q;

    /* renamed from: r, reason: collision with root package name */
    public p f25283r;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f25279n = null;
            this.f25282q = null;
            this.f25283r = null;
        }
        this.f25280o = 0;
        this.f25281p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        byte b10 = nVar.f26042a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        n nVar2 = this.f25279n;
        if (!nVar2.f25277c[(b10 >> 1) & (255 >>> (8 - nVar2.f25278d))].f25284a) {
            i10 = nVar2.f25275a.f25288d;
        } else {
            i10 = nVar2.f25275a.f25289e;
        }
        long j10 = this.f25281p ? (this.f25280o + i10) / 4 : 0;
        nVar.d(nVar.f26044c + 4);
        byte[] bArr = nVar.f26042a;
        int i11 = nVar.f26044c;
        bArr[i11 - 4] = (byte) (j10 & 255);
        bArr[i11 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr[i11 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr[i11 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f25281p = true;
        this.f25280o = i10;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int i10;
        int i11;
        long jFloor;
        int i12;
        if (this.f25279n != null) {
            return false;
        }
        n nVar2 = null;
        int i13 = 1;
        if (this.f25282q == null) {
            this.f25282q = s.a(nVar);
        } else if (this.f25283r == null) {
            s.a(3, nVar, false);
            nVar.b((int) nVar.e());
            long jE = nVar.e();
            String[] strArr = new String[(int) jE];
            for (int i14 = 0; i14 < jE; i14++) {
                strArr[i14] = nVar.b((int) nVar.e());
            }
            if ((nVar.j() & 1) != 0) {
                this.f25283r = new p();
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("framing bit expected to be set");
            }
        } else {
            int i15 = nVar.f26044c;
            byte[] bArr = new byte[i15];
            System.arraycopy(nVar.f26042a, 0, bArr, 0, i15);
            int i16 = this.f25282q.f25285a;
            int i17 = 5;
            s.a(5, nVar, false);
            int iJ = nVar.j() + 1;
            m mVar = new m(nVar.f26042a);
            int i18 = 8;
            mVar.b(nVar.f26043b * 8);
            int i19 = 0;
            while (true) {
                int i20 = 4;
                int i21 = 16;
                if (i19 < iJ) {
                    if (mVar.a(24) == 5653314) {
                        int iA = mVar.a(16);
                        int iA2 = mVar.a(24);
                        long[] jArr = new long[iA2];
                        long j11 = 0;
                        if (!mVar.a()) {
                            boolean zA = mVar.a();
                            i11 = i18;
                            int i22 = 0;
                            while (i22 < iA2) {
                                if (zA) {
                                    if (mVar.a()) {
                                        i12 = i13;
                                        jArr[i22] = mVar.a(i17) + 1;
                                    } else {
                                        i12 = i13;
                                        jArr[i22] = 0;
                                    }
                                } else {
                                    i12 = i13;
                                    jArr[i22] = mVar.a(i17) + 1;
                                }
                                i22++;
                                i13 = i12;
                            }
                            i10 = i13;
                        } else {
                            i10 = i13;
                            i11 = i18;
                            int iA3 = mVar.a(i17) + 1;
                            int i23 = 0;
                            while (i23 < iA2) {
                                int i24 = 0;
                                for (int i25 = iA2 - i23; i25 > 0; i25 >>>= 1) {
                                    i24++;
                                }
                                int iA4 = mVar.a(i24);
                                int i26 = 0;
                                while (i26 < iA4 && i23 < iA2) {
                                    jArr[i23] = iA3;
                                    i23++;
                                    i26++;
                                    iJ = iJ;
                                }
                                iA3++;
                                iJ = iJ;
                            }
                        }
                        int i27 = iJ;
                        int iA5 = mVar.a(4);
                        if (iA5 > 2) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("lookup type greater than 2 not decodable: ", iA5));
                        }
                        int i28 = i10;
                        if (iA5 == i28 || iA5 == 2) {
                            mVar.b(32);
                            mVar.b(32);
                            int iA6 = mVar.a(4) + i28;
                            mVar.b(i28);
                            if (iA5 == i28) {
                                if (iA != 0) {
                                    jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / iA));
                                }
                                mVar.b((int) (iA6 * j11));
                            } else {
                                jFloor = iA2 * iA;
                            }
                            j11 = jFloor;
                            mVar.b((int) (iA6 * j11));
                        }
                        i19++;
                        i18 = i11;
                        iJ = i27;
                        i13 = 1;
                        i17 = 5;
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected code book to start with [0x56, 0x43, 0x42] at " + ((mVar.f25273c * 8) + mVar.f25274d));
                    }
                } else {
                    int i29 = i18;
                    int i30 = 6;
                    int iA7 = mVar.a(6) + 1;
                    for (int i31 = 0; i31 < iA7; i31++) {
                        if (mVar.a(16) != 0) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int i32 = 1;
                    int iA8 = mVar.a(6) + 1;
                    int i33 = 0;
                    while (i33 < iA8) {
                        int iA9 = mVar.a(i21);
                        if (iA9 == 0) {
                            int i34 = i29;
                            mVar.b(i34);
                            mVar.b(16);
                            mVar.b(16);
                            mVar.b(6);
                            mVar.b(i34);
                            int iA10 = mVar.a(4) + 1;
                            int i35 = 0;
                            while (i35 < iA10) {
                                mVar.b(i34);
                                i35++;
                                i34 = 8;
                            }
                        } else if (iA9 == i32) {
                            int iA11 = mVar.a(5);
                            int[] iArr = new int[iA11];
                            int i36 = -1;
                            for (int i37 = 0; i37 < iA11; i37++) {
                                int iA12 = mVar.a(i20);
                                iArr[i37] = iA12;
                                if (iA12 > i36) {
                                    i36 = iA12;
                                }
                            }
                            int i38 = i36 + 1;
                            int[] iArr2 = new int[i38];
                            int i39 = 0;
                            while (i39 < i38) {
                                iArr2[i39] = mVar.a(3) + 1;
                                int iA13 = mVar.a(2);
                                int i40 = i29;
                                if (iA13 > 0) {
                                    mVar.b(i40);
                                }
                                int i41 = 0;
                                for (int i42 = 1; i41 < (i42 << iA13); i42 = 1) {
                                    mVar.b(i40);
                                    i41++;
                                    i40 = 8;
                                }
                                i39++;
                                i29 = 8;
                            }
                            mVar.b(2);
                            int iA14 = mVar.a(4);
                            int i43 = 0;
                            int i44 = 0;
                            for (int i45 = 0; i45 < iA11; i45++) {
                                i43 += iArr2[iArr[i45]];
                                while (i44 < i43) {
                                    mVar.b(iA14);
                                    i44++;
                                }
                            }
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("floor type greater than 1 not decodable: ", iA9));
                        }
                        i33++;
                        i29 = 8;
                        i30 = 6;
                        i32 = 1;
                        i20 = 4;
                        i21 = 16;
                    }
                    int i46 = i30;
                    int iA15 = mVar.a(i46) + 1;
                    int i47 = 0;
                    while (i47 < iA15) {
                        if (mVar.a(16) <= 2) {
                            mVar.b(24);
                            mVar.b(24);
                            mVar.b(24);
                            int iA16 = mVar.a(i46) + 1;
                            int i48 = 8;
                            mVar.b(8);
                            int[] iArr3 = new int[iA16];
                            for (int i49 = 0; i49 < iA16; i49++) {
                                iArr3[i49] = ((mVar.a() ? mVar.a(5) : 0) * 8) + mVar.a(3);
                            }
                            int i50 = 0;
                            while (i50 < iA16) {
                                int i51 = 0;
                                while (i51 < i48) {
                                    if ((iArr3[i50] & (1 << i51)) != 0) {
                                        mVar.b(i48);
                                    }
                                    i51++;
                                    i48 = 8;
                                }
                                i50++;
                                i48 = 8;
                            }
                            i47++;
                            i46 = 6;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("residueType greater than 2 is not decodable");
                        }
                    }
                    int iA17 = mVar.a(i46) + 1;
                    for (int i52 = 0; i52 < iA17; i52++) {
                        int iA18 = mVar.a(16);
                        if (iA18 != 0) {
                            Log.e("VorbisUtil", "mapping type other than 0 not supported: " + iA18);
                        } else {
                            int iA19 = mVar.a() ? mVar.a(4) + 1 : 1;
                            if (mVar.a()) {
                                int iA20 = mVar.a(8) + 1;
                                for (int i53 = 0; i53 < iA20; i53++) {
                                    int i54 = i16 - 1;
                                    int i55 = 0;
                                    for (int i56 = i54; i56 > 0; i56 >>>= 1) {
                                        i55++;
                                    }
                                    mVar.b(i55);
                                    int i57 = 0;
                                    while (i54 > 0) {
                                        i57++;
                                        i54 >>>= 1;
                                    }
                                    mVar.b(i57);
                                }
                            }
                            if (mVar.a(2) != 0) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("to reserved bits must be zero after mapping coupling steps");
                            }
                            if (iA19 > 1) {
                                for (int i58 = 0; i58 < i16; i58++) {
                                    mVar.b(4);
                                }
                            }
                            for (int i59 = 0; i59 < iA19; i59++) {
                                mVar.b(8);
                                mVar.b(8);
                                mVar.b(8);
                            }
                        }
                    }
                    int iA21 = mVar.a(6);
                    int i60 = iA21 + 1;
                    q[] qVarArr = new q[i60];
                    for (int i61 = 0; i61 < i60; i61++) {
                        boolean zA2 = mVar.a();
                        mVar.a(16);
                        mVar.a(16);
                        mVar.a(8);
                        qVarArr[i61] = new q(zA2);
                    }
                    if (mVar.a()) {
                        int i62 = 0;
                        while (iA21 > 0) {
                            i62++;
                            iA21 >>>= 1;
                        }
                        nVar2 = new n(this.f25282q, bArr, qVarArr, i62);
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("framing bit after modes not set as expected");
                    }
                }
            }
        }
        this.f25279n = nVar2;
        if (nVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f25279n.f25275a.f25290f);
        arrayList.add(this.f25279n.f25276b);
        r rVar = this.f25279n.f25275a;
        jVar.f25256a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, MimeTypes.AUDIO_VORBIS, rVar.f25287c, -1, rVar.f25285a, (int) rVar.f25286b, arrayList, null, null);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(long j10) {
        this.f25264g = j10;
        this.f25281p = j10 != 0;
        r rVar = this.f25282q;
        this.f25280o = rVar != null ? rVar.f25288d : 0;
    }
}
