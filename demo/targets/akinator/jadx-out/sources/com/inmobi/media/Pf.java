package com.inmobi.media;

import android.webkit.WebResourceResponse;
import java.net.URLDecoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Pf {
    public static WebResourceResponse a(String urlRaw, F5 f52) {
        String url;
        kotlin.jvm.internal.e0.checkNotNullParameter(urlRaw, "urlRaw");
        if (f52 != null) {
            ((G5) f52).c("IMResourceCacheManager", AbstractC2811i0.a("shouldInterceptRequest ", urlRaw));
        }
        try {
            url = URLDecoder.decode(sv.n0.trim(urlRaw).toString(), com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        } catch (Exception unused) {
            url = null;
        }
        if (url == null) {
            return null;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        if (sv.n0.contains$default((CharSequence) url, (CharSequence) "inmobicache=true", false, 2, (Object) null)) {
            return Rf.f32220a.a(url, f52);
        }
        if (f52 != null) {
            ((G5) f52).a("IMResourceCacheManager", "Cache is not enabled for URL: ".concat(url));
        }
        return null;
    }
}
