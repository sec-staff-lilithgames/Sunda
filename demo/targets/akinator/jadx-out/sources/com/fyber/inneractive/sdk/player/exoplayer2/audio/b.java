package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i10, int i11, int i12) {
        StringBuilder sbF = w0.i.f(i10, i11, "Unhandled format: ", " Hz, ", " channels in encoding ");
        sbF.append(i12);
        super(sbF.toString());
    }
}
