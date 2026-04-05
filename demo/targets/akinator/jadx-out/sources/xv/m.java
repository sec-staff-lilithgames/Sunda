package xv;

import b0.e2;
import io.ktor.http.auth.HttpAuthHeader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f93756a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f93757b;

    public m(String scheme, Map<String, String> authParams) {
        String strP;
        kotlin.jvm.internal.e0.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.e0.checkNotNullParameter(authParams, "authParams");
        this.f93756a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                strP = e2.p(locale, "US", key, locale, "toLowerCase(...)");
            } else {
                strP = null;
            }
            linkedHashMap.put(strP, value);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f93757b = mapUnmodifiableMap;
    }

    @tu.f
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m7974deprecated_authParams() {
        return this.f93757b;
    }

    @tu.f
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m7975deprecated_charset() {
        return charset();
    }

    @tu.f
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m7976deprecated_realm() {
        return realm();
    }

    @tu.f
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m7977deprecated_scheme() {
        return this.f93756a;
    }

    public final Map<String, String> authParams() {
        return this.f93757b;
    }

    public final Charset charset() {
        String str = (String) this.f93757b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return sv.g.f86137e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.e0.areEqual(mVar.f93756a, this.f93756a) && kotlin.jvm.internal.e0.areEqual(mVar.f93757b, this.f93757b);
    }

    public int hashCode() {
        return this.f93757b.hashCode() + o2.e(899, 31, this.f93756a);
    }

    public final String realm() {
        return (String) this.f93757b.get(HttpAuthHeader.Parameters.Realm);
    }

    public final String scheme() {
        return this.f93756a;
    }

    public String toString() {
        return this.f93756a + " authParams=" + this.f93757b;
    }

    public final m withCharset(Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        Map mutableMap = p1.toMutableMap(this.f93757b);
        mutableMap.put("charset", charset.name());
        return new m(this.f93756a, (Map<String, String>) mutableMap);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(String scheme, String realm) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.e0.checkNotNullParameter(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap(HttpAuthHeader.Parameters.Realm, realm);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}
