package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e implements com.mbridge.msdk.tracker.network.c {
    @Override // com.mbridge.msdk.tracker.network.c
    public String a(t<?> tVar) {
        String strT = tVar.t();
        int iG = tVar.g();
        if (iG == 0) {
            return strT;
        }
        return Integer.toString(iG) + '-' + strT;
    }
}
