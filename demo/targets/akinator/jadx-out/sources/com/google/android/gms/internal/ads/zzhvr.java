package com.google.android.gms.internal.ads;

import b0.e2;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhvr extends IOException {
    public zzhvr() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzhvr(long j10, long j11, int i10, Throwable th2) {
        Locale locale = Locale.US;
        StringBuilder sbR = e2.r(j10, "Pos: ", ", limit: ");
        sbR.append(j11);
        sbR.append(duhsDlGWdBkekB.teMUjsch);
        sbR.append(i10);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbR.toString()), th2);
    }

    public zzhvr(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
