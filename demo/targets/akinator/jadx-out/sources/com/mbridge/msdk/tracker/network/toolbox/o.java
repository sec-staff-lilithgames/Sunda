package com.mbridge.msdk.tracker.network.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class o {
    public static u a(com.mbridge.msdk.tracker.network.m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        if (mVar == null) {
            mVar = new b(new h());
        }
        if (wVar == null) {
            wVar = new com.mbridge.msdk.tracker.network.f(new Handler(Looper.getMainLooper()));
        }
        if (i10 <= 0) {
            i10 = 4;
        }
        if (bVar == null) {
            bVar = new l();
        }
        return new u(mVar, wVar, i10, bVar);
    }
}
