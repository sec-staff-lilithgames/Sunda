package com.applovin.shadow.okhttp3;

import b0.e2;
import io.ktor.http.auth.HttpAuthHeader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import p0.o2;
import tu.f;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String scheme, Map<String, String> authParams) {
        String strP;
        e0.checkNotNullParameter(scheme, "scheme");
        e0.checkNotNullParameter(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                strP = e2.p(locale, "US", key, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                strP = null;
            }
            linkedHashMap.put(strP, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        e0.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    @f
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m233deprecated_authParams() {
        return this.authParams;
    }

    @f
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m234deprecated_charset() {
        return charset();
    }

    @f
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m235deprecated_realm() {
        return realm();
    }

    @f
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m236deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                e0.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        e0.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return e0.areEqual(challenge.scheme, this.scheme) && e0.areEqual(challenge.authParams, this.authParams);
    }

    public int hashCode() {
        return this.authParams.hashCode() + o2.e(899, 31, this.scheme);
    }

    public final String realm() {
        return this.authParams.get(HttpAuthHeader.Parameters.Realm);
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        e0.checkNotNullParameter(charset, "charset");
        Map mutableMap = p1.toMutableMap(this.authParams);
        String strName = charset.name();
        e0.checkNotNullExpressionValue(strName, "charset.name()");
        mutableMap.put("charset", strName);
        return new Challenge(this.scheme, (Map<String, String>) mutableMap);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String scheme, String realm) {
        e0.checkNotNullParameter(scheme, "scheme");
        e0.checkNotNullParameter(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap(HttpAuthHeader.Parameters.Realm, realm);
        e0.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}
