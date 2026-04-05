package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.r;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f26110a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26111b;

    public d(int i10, List list) {
        this.f26110a = list;
        this.f26111b = i10;
    }

    public static d a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) throws r {
        try {
            nVar.e(nVar.f26043b + 21);
            int iJ = nVar.j() & 3;
            int iJ2 = nVar.j();
            int i10 = nVar.f26043b;
            int i11 = 0;
            for (int i12 = 0; i12 < iJ2; i12++) {
                nVar.e(nVar.f26043b + 1);
                int iO = nVar.o();
                for (int i13 = 0; i13 < iO; i13++) {
                    int iO2 = nVar.o();
                    i11 += iO2 + 4;
                    nVar.e(nVar.f26043b + iO2);
                }
            }
            nVar.e(i10);
            byte[] bArr = new byte[i11];
            int i14 = 0;
            for (int i15 = 0; i15 < iJ2; i15++) {
                nVar.e(nVar.f26043b + 1);
                int iO3 = nVar.o();
                for (int i16 = 0; i16 < iO3; i16++) {
                    int iO4 = nVar.o();
                    System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f26034a, 0, bArr, i14, 4);
                    int i17 = i14 + 4;
                    System.arraycopy(nVar.f26042a, nVar.f26043b, bArr, i17, iO4);
                    i14 = i17 + iO4;
                    nVar.e(nVar.f26043b + iO4);
                }
            }
            return new d(iJ + 1, i11 == 0 ? null : Collections.singletonList(bArr));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new r("Error parsing HEVC config", e10);
        }
    }
}
