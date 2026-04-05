package com.inmobi.media;

import com.ironsource.C3191e4;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class T9 {
    public static final boolean a(Oc oc2) {
        String str;
        kotlin.jvm.internal.e0.checkNotNullParameter(oc2, "<this>");
        HashMap map = oc2.f32102c;
        return (map == null || (str = (String) map.get("Content-Encoding")) == null || !sv.n0.contains$default((CharSequence) str, (CharSequence) "gzip", false, 2, (Object) null)) ? false : true;
    }

    public static final String a(String url, Map map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        if (map == null) {
            return url;
        }
        C2736da.a(map);
        String strA = C2736da.a(C3191e4.i.f36527c, map);
        StringBuilder sb2 = new StringBuilder(url);
        int length = strA.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) strA.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (strA.subSequence(i10, length + 1).toString().length() > 0) {
            if (!sv.n0.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null)) {
                sb2.append("?");
            }
            if (!sv.k0.endsWith$default(url, C3191e4.i.f36527c, false, 2, null) && !sv.k0.endsWith$default(url, "?", false, 2, null)) {
                sb2.append(C3191e4.i.f36527c);
            }
            sb2.append(strA);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return new String(bArr, sv.g.f86134b);
            } catch (UnsupportedEncodingException | Exception unused) {
            }
        }
        return "";
    }
}
