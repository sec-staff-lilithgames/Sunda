package io.ktor.http;

import androidx.core.app.NotificationCompat;
import e3.g;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Cookie {
    private final String domain;
    private final CookieEncoding encoding;
    private final GMTDate expires;
    private final Map<String, String> extensions;
    private final boolean httpOnly;
    private final int maxAge;
    private final String name;
    private final String path;
    private final boolean secure;
    private final String value;

    public Cookie(String name, String value, CookieEncoding encoding, int i10, GMTDate gMTDate, String str, String str2, boolean z10, boolean z11, Map<String, String> extensions) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(encoding, "encoding");
        e0.checkNotNullParameter(extensions, "extensions");
        this.name = name;
        this.value = value;
        this.encoding = encoding;
        this.maxAge = i10;
        this.expires = gMTDate;
        this.domain = str;
        this.path = str2;
        this.secure = z10;
        this.httpOnly = z11;
        this.extensions = extensions;
    }

    public static /* synthetic */ Cookie copy$default(Cookie cookie, String str, String str2, CookieEncoding cookieEncoding, int i10, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cookie.name;
        }
        if ((i11 & 2) != 0) {
            str2 = cookie.value;
        }
        if ((i11 & 4) != 0) {
            cookieEncoding = cookie.encoding;
        }
        if ((i11 & 8) != 0) {
            i10 = cookie.maxAge;
        }
        if ((i11 & 16) != 0) {
            gMTDate = cookie.expires;
        }
        if ((i11 & 32) != 0) {
            str3 = cookie.domain;
        }
        if ((i11 & 64) != 0) {
            str4 = cookie.path;
        }
        if ((i11 & 128) != 0) {
            z10 = cookie.secure;
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z11 = cookie.httpOnly;
        }
        if ((i11 & 512) != 0) {
            map = cookie.extensions;
        }
        boolean z12 = z11;
        Map map2 = map;
        String str5 = str4;
        boolean z13 = z10;
        GMTDate gMTDate2 = gMTDate;
        String str6 = str3;
        return cookie.copy(str, str2, cookieEncoding, i10, gMTDate2, str6, str5, z13, z12, map2);
    }

    public final String component1() {
        return this.name;
    }

    public final Map<String, String> component10() {
        return this.extensions;
    }

    public final String component2() {
        return this.value;
    }

    public final CookieEncoding component3() {
        return this.encoding;
    }

    public final int component4() {
        return this.maxAge;
    }

    public final GMTDate component5() {
        return this.expires;
    }

    public final String component6() {
        return this.domain;
    }

    public final String component7() {
        return this.path;
    }

    public final boolean component8() {
        return this.secure;
    }

    public final boolean component9() {
        return this.httpOnly;
    }

    public final Cookie copy(String name, String value, CookieEncoding encoding, int i10, GMTDate gMTDate, String str, String str2, boolean z10, boolean z11, Map<String, String> extensions) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(encoding, "encoding");
        e0.checkNotNullParameter(extensions, "extensions");
        return new Cookie(name, value, encoding, i10, gMTDate, str, str2, z10, z11, extensions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return e0.areEqual(this.name, cookie.name) && e0.areEqual(this.value, cookie.value) && this.encoding == cookie.encoding && this.maxAge == cookie.maxAge && e0.areEqual(this.expires, cookie.expires) && e0.areEqual(this.domain, cookie.domain) && e0.areEqual(this.path, cookie.path) && this.secure == cookie.secure && this.httpOnly == cookie.httpOnly && e0.areEqual(this.extensions, cookie.extensions);
    }

    public final String getDomain() {
        return this.domain;
    }

    public final CookieEncoding getEncoding() {
        return this.encoding;
    }

    public final GMTDate getExpires() {
        return this.expires;
    }

    public final Map<String, String> getExtensions() {
        return this.extensions;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final int getMaxAgeInt() {
        return this.maxAge;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iD = g.d(this.maxAge, (this.encoding.hashCode() + o2.e(this.name.hashCode() * 31, 31, this.value)) * 31, 31);
        GMTDate gMTDate = this.expires;
        int iHashCode = (iD + (gMTDate == null ? 0 : gMTDate.hashCode())) * 31;
        String str = this.domain;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.path;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z10 = this.secure;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode3 + i10) * 31;
        boolean z11 = this.httpOnly;
        return this.extensions.hashCode() + ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Cookie(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", encoding=");
        sb2.append(this.encoding);
        sb2.append(", maxAge=");
        sb2.append(this.maxAge);
        sb2.append(", expires=");
        sb2.append(this.expires);
        sb2.append(", domain=");
        sb2.append(this.domain);
        sb2.append(", path=");
        sb2.append(this.path);
        sb2.append(", secure=");
        sb2.append(this.secure);
        sb2.append(", httpOnly=");
        sb2.append(this.httpOnly);
        sb2.append(", extensions=");
        return j1.o2.q(sb2, this.extensions, ')');
    }

    public /* synthetic */ Cookie(String str, String str2, CookieEncoding cookieEncoding, int i10, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, int i11, u uVar) {
        this(str, str2, (i11 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? null : gMTDate, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? false : z10, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z11, (i11 & 512) != 0 ? p1.emptyMap() : map);
    }
}
