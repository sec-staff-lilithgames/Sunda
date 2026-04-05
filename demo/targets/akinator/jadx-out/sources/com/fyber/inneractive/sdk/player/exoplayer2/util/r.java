package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f10 = ((s) obj).f26052c;
        float f11 = ((s) obj2).f26052c;
        if (f10 < f11) {
            return -1;
        }
        return f11 < f10 ? 1 : 0;
    }
}
