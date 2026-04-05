package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public n(int i10, int i11, int i12, int i13) {
        StringBuilder sbF = w0.i.f(i10, i11, "AudioTrack init failed: ", ", Config(", ", ");
        sbF.append(i12);
        sbF.append(", ");
        sbF.append(i13);
        sbF.append(")");
        super(sbF.toString());
    }
}
