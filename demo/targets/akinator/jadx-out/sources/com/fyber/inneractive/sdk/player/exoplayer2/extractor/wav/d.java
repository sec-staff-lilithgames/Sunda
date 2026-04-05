package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d {
    public static b a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, r, EOFException {
        n nVar = new n(16);
        if (c.a(bVar, nVar).f25548a != z.a("RIFF")) {
            return null;
        }
        bVar.a(nVar.f26042a, 0, 4, false);
        nVar.e(0);
        int iB = nVar.b();
        if (iB != z.a("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + iB);
            return null;
        }
        c cVarA = c.a(bVar, nVar);
        while (cVarA.f25548a != z.a("fmt ")) {
            bVar.a((int) cVarA.f25549b, false);
            cVarA = c.a(bVar, nVar);
        }
        if (cVarA.f25549b < 16) {
            throw new IllegalStateException();
        }
        bVar.a(nVar.f26042a, 0, 16, false);
        nVar.e(0);
        int iF = nVar.f();
        int iF2 = nVar.f();
        int iD = nVar.d();
        if (iD < 0) {
            throw new IllegalStateException(m.a("Top bit not zero: ", iD));
        }
        int iD2 = nVar.d();
        if (iD2 < 0) {
            throw new IllegalStateException(m.a("Top bit not zero: ", iD2));
        }
        int iF3 = nVar.f();
        int iF4 = nVar.f();
        int i10 = (iF2 * iF4) / 8;
        if (iF3 != i10) {
            throw new r(i.a(i10, iF3, "Expected block alignment: ", "; got: "));
        }
        int iA = z.a(iF4);
        if (iA == 0) {
            Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + iF4);
            return null;
        }
        if (iF == 1 || iF == 65534) {
            bVar.a(((int) cVarA.f25549b) - 16, false);
            return new b(iF2, iD, iD2, iF3, iF4, iA);
        }
        Log.e("WavHeaderReader", "Unsupported WAV format type: " + iF);
        return null;
    }
}
