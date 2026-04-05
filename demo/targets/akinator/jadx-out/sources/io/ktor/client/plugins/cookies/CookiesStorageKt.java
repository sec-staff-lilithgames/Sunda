package io.ktor.client.plugins.cookies;

import av.e;
import io.ktor.http.Cookie;
import io.ktor.http.IpParserKt;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.TextKt;
import kotlin.jvm.internal.e0;
import sv.k0;
import sv.n0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CookiesStorageKt {
    public static final Object addCookie(CookiesStorage cookiesStorage, String str, Cookie cookie, d<? super x0> dVar) {
        Object objAddCookie = cookiesStorage.addCookie(URLUtilsKt.Url(str), cookie, dVar);
        return objAddCookie == e.getCOROUTINE_SUSPENDED() ? objAddCookie : x0.f87415a;
    }

    public static final Cookie fillDefaults(Cookie cookie, Url requestUrl) {
        e0.checkNotNullParameter(cookie, "<this>");
        e0.checkNotNullParameter(requestUrl, "requestUrl");
        String path = cookie.getPath();
        Cookie cookieCopy$default = (path == null || !k0.startsWith$default(path, "/", false, 2, null)) ? Cookie.copy$default(cookie, null, null, null, 0, null, null, requestUrl.getEncodedPath(), false, false, null, 959, null) : cookie;
        String domain = cookieCopy$default.getDomain();
        return (domain == null || n0.isBlank(domain)) ? Cookie.copy$default(cookieCopy$default, null, null, null, 0, null, requestUrl.getHost(), null, false, false, null, 991, null) : cookieCopy$default;
    }

    public static final boolean matches(Cookie cookie, Url requestUrl) {
        String lowerCasePreservingASCIIRules;
        String strTrimStart;
        e0.checkNotNullParameter(cookie, "<this>");
        e0.checkNotNullParameter(requestUrl, "requestUrl");
        String domain = cookie.getDomain();
        if (domain == null || (lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(domain)) == null || (strTrimStart = n0.trimStart(lowerCasePreservingASCIIRules, '.')) == null) {
            throw new IllegalStateException("Domain field should have the default value");
        }
        cookie.getPath();
        String path = cookie.getPath();
        if (path == null) {
            throw new IllegalStateException("Path field should have the default value");
        }
        if (!n0.endsWith$default((CharSequence) path, '/', false, 2, (Object) null)) {
            path = cookie.getPath() + '/';
        }
        String lowerCasePreservingASCIIRules2 = TextKt.toLowerCasePreservingASCIIRules(requestUrl.getHost());
        String encodedPath = requestUrl.getEncodedPath();
        if (!n0.endsWith$default((CharSequence) encodedPath, '/', false, 2, (Object) null)) {
            encodedPath = encodedPath + '/';
        }
        return (e0.areEqual(lowerCasePreservingASCIIRules2, strTrimStart) || (!IpParserKt.hostIsIp(lowerCasePreservingASCIIRules2) && k0.endsWith$default(lowerCasePreservingASCIIRules2, ".".concat(strTrimStart), false, 2, null))) && (e0.areEqual(path, "/") || e0.areEqual(encodedPath, path) || k0.startsWith$default(encodedPath, path, false, 2, null)) && (!cookie.getSecure() || URLProtocolKt.isSecure(requestUrl.getProtocol()));
    }
}
