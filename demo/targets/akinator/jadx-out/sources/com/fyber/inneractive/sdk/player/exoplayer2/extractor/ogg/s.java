package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s {
    public static r a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        a(1, nVar, false);
        nVar.e();
        int iJ = nVar.j();
        long jE = nVar.e();
        nVar.d();
        int iD = nVar.d();
        nVar.d();
        int iJ2 = nVar.j();
        int iPow = (int) Math.pow(2.0d, iJ2 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iJ2 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
        nVar.j();
        return new r(iJ, jE, iD, iPow, iPow2, Arrays.copyOf(nVar.f26042a, nVar.f26044c));
    }

    public static boolean a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        if (nVar.f26044c - nVar.f26043b < 7) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("too short header: " + (nVar.f26044c - nVar.f26043b));
        }
        if (nVar.j() != i10) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(w0.i.b(i10, new StringBuilder("expected header type ")));
        }
        if (nVar.j() == 118 && nVar.j() == 111 && nVar.j() == 114 && nVar.j() == 98 && nVar.j() == 105 && nVar.j() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected characters 'vorbis'");
    }
}
