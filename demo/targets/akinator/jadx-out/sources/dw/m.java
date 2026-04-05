package dw;

import java.net.Proxy;
import kotlin.jvm.internal.e0;
import xv.g0;
import xv.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f52928a = new m();

    public final String get(o0 request, Proxy.Type proxyType) {
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.method());
        sb2.append(' ');
        if (request.isHttps() || proxyType != Proxy.Type.HTTP) {
            sb2.append(f52928a.requestPath(request.url()));
        } else {
            sb2.append(request.url());
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    public final String requestPath(g0 url) {
        e0.checkNotNullParameter(url, "url");
        String strEncodedPath = url.encodedPath();
        String strEncodedQuery = url.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + strEncodedQuery;
    }
}
