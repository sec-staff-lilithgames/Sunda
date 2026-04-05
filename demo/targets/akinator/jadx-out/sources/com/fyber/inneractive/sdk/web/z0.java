package com.fyber.inneractive.sdk.web;

import android.util.LruCache;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z0 extends LruCache {
    public z0() {
        super(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        String str;
        c1 c1Var = (c1) obj2;
        int iC = 0;
        for (String str2 : c1Var.f26845b.keySet()) {
            if (str2 != null && (str = (String) c1Var.f26845b.get(str2)) != null) {
                iC = o2.C(str2.length(), iC, str);
            }
        }
        return iC + c1Var.f26844a.length;
    }
}
