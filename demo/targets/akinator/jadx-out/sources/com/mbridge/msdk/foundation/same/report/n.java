package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.w;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n extends w {
    @Override // com.mbridge.msdk.tracker.w
    public v<String> a(q qVar) {
        String str;
        try {
            str = new String(qVar.f44002b, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar.f44003c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(qVar.f44002b);
        }
        return v.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
    }
}
