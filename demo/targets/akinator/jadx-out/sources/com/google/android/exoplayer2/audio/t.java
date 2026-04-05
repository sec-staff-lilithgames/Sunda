package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends Exception {
    public t(s sVar) {
        this("Unhandled input format:", sVar);
    }

    public t(String str, s sVar) {
        super(str + " " + sVar);
    }
}
