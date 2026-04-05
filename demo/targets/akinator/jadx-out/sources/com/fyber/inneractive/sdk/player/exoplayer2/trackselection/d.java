package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends g {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f25839c = new AtomicReference(new c());

    public static boolean a(int i10, boolean z10) {
        int i11 = i10 & 3;
        if (i11 != 3) {
            return z10 && i11 == 2;
        }
        return true;
    }
}
