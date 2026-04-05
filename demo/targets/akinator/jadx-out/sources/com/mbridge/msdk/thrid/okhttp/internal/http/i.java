package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.w;
import java.net.Proxy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i {
    public static String a(w wVar, Proxy.Type type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wVar.e());
        sb2.append(' ');
        if (b(wVar, type)) {
            sb2.append(wVar.g());
        } else {
            sb2.append(a(wVar.g()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    private static boolean b(w wVar, Proxy.Type type) {
        return !wVar.d() && type == Proxy.Type.HTTP;
    }

    public static String a(q qVar) {
        String strC = qVar.c();
        String strE = qVar.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }
}
