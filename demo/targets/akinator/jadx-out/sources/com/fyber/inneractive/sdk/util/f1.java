package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f1 {
    public static String a(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder(str);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            sb2.append(z10 ? "?" : C3191e4.i.f36527c);
            sb2.append((String) entry.getKey());
            sb2.append(C3191e4.i.f36525b);
            sb2.append(Uri.encode((String) entry.getValue()));
            z10 = false;
        }
        return sb2.toString();
    }
}
