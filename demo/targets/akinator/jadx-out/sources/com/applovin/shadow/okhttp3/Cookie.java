package com.applovin.shadow.okhttp3;

import a.b;
import b0.e2;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import com.google.android.gms.internal.play_billing.a;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import sv.k0;
import sv.n0;
import sv.x;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Builder domain(String domain) {
            e0.checkNotNullParameter(domain, "domain");
            return domain(domain, false);
        }

        public final Builder expiresAt(long j10) {
            if (j10 <= 0) {
                j10 = Long.MIN_VALUE;
            }
            if (j10 > DatesKt.MAX_DATE) {
                j10 = 253402300799999L;
            }
            this.expiresAt = j10;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            e0.checkNotNullParameter(domain, "domain");
            return domain(domain, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String name) {
            e0.checkNotNullParameter(name, "name");
            if (!e0.areEqual(n0.trim(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.name = name;
            return this;
        }

        public final Builder path(String path) {
            e0.checkNotNullParameter(path, "path");
            if (!k0.startsWith$default(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.path = path;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String value) {
            e0.checkNotNullParameter(value, "value");
            if (!e0.areEqual(n0.trim(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.value = value;
            return this;
        }

        private final Builder domain(String str, boolean z10) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(b.k("unexpected domain: ", str));
            }
            this.domain = canonicalHost;
            this.hostOnly = z10;
            return this;
        }

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException(KGUkpTlXZlJLy.cUgKbLWLTuBOIhh);
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j10, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException("builder.domain == null");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final int dateCharacterOffset(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (e0.areEqual(str, str2)) {
                return true;
            }
            return k0.endsWith$default(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            if (k0.endsWith$default(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(n0.removePrefix(str, (CharSequence) "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i10, int i11) throws NumberFormatException {
            int iDateCharacterOffset = dateCharacterOffset(str, i10, i11, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iIndexOf$default = -1;
            int i15 = -1;
            int i16 = -1;
            while (iDateCharacterOffset < i11) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i11, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i13 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    e0.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    e0.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    e0.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    e0.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    e0.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    String strP = e2.p(locale, "US", strGroup5, locale, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    e0.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = n0.indexOf$default((CharSequence) strPattern, strP, 0, false, 6, (Object) null) / 4;
                } else if (i12 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    e0.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) throws NumberFormatException {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new x("-?\\d+").matches(str)) {
                    return k0.startsWith$default(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String strEncodedPath = httpUrl.encodedPath();
            if (e0.areEqual(strEncodedPath, str)) {
                return true;
            }
            return k0.startsWith$default(strEncodedPath, str, false, 2, null) && (k0.endsWith$default(str, "/", false, 2, null) || strEncodedPath.charAt(str.length()) == '/');
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            e0.checkNotNullParameter(url, "url");
            e0.checkNotNullParameter(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        public final Cookie parse$okhttp(long j10, HttpUrl url, String setCookie) throws NumberFormatException {
            long j11;
            e0.checkNotNullParameter(url, "url");
            e0.checkNotNullParameter(setCookie, "setCookie");
            int iDelimiterOffset$default = Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = Util.delimiterOffset$default(setCookie, G5.T, 0, iDelimiterOffset$default, 2, (Object) null);
            Cookie cookie = null;
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            String strTrimSubstring$default = Util.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
            if (strTrimSubstring$default.length() == 0 || Util.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = Util.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (Util.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i10 = iDelimiterOffset$default + 1;
            int length = setCookie.length();
            String domain = null;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long maxAge = -1;
            long expires = DatesKt.MAX_DATE;
            while (i10 < length) {
                int iDelimiterOffset = Util.delimiterOffset(setCookie, ';', i10, length);
                int iDelimiterOffset2 = Util.delimiterOffset(setCookie, G5.T, i10, iDelimiterOffset);
                String strTrimSubstring2 = Util.trimSubstring(setCookie, i10, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                Cookie cookie2 = cookie;
                if (k0.equals(strTrimSubstring2, "expires", true)) {
                    try {
                        expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (k0.equals(strTrimSubstring2, io.ktor.client.utils.CacheControl.MAX_AGE, true)) {
                    maxAge = parseMaxAge(strTrimSubstring3);
                    z11 = true;
                } else if (k0.equals(strTrimSubstring2, C3191e4.i.D, true)) {
                    domain = parseDomain(strTrimSubstring3);
                    z13 = false;
                } else if (k0.equals(strTrimSubstring2, "path", true)) {
                    str = strTrimSubstring3;
                } else if (k0.equals(strTrimSubstring2, "secure", true)) {
                    z12 = true;
                } else if (k0.equals(strTrimSubstring2, "httponly", true)) {
                    z10 = true;
                }
                i10 = iDelimiterOffset + 1;
                cookie = cookie2;
            }
            Cookie cookie3 = cookie;
            if (maxAge == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (maxAge != -1) {
                long j12 = j10 + (maxAge <= 9223372036854775L ? maxAge * 1000 : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > DatesKt.MAX_DATE) ? 253402300799999L : j12;
            } else {
                j11 = expires;
            }
            String strHost = url.host();
            if (domain == null) {
                domain = strHost;
            } else if (!domainMatch(strHost, domain)) {
                return cookie3;
            }
            if (strHost.length() != domain.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(domain) == null) {
                return cookie3;
            }
            String strSubstring = "/";
            if (str == null || !k0.startsWith$default(str, "/", false, 2, cookie3)) {
                String strEncodedPath = url.encodedPath();
                int iLastIndexOf$default = n0.lastIndexOf$default((CharSequence) strEncodedPath, '/', 0, false, 6, (Object) null);
                if (iLastIndexOf$default != 0) {
                    strSubstring = strEncodedPath.substring(0, iLastIndexOf$default);
                    e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new Cookie(strTrimSubstring$default, strTrimSubstring, j11, domain, str, z12, z10, z11, z13, null);
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            e0.checkNotNullParameter(url, "url");
            e0.checkNotNullParameter(headers, "headers");
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                Cookie cookie = parse(url, listValues.get(i10));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList == null) {
                return p0.emptyList();
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            e0.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, u uVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @f
    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m241deprecated_domain() {
        return this.domain;
    }

    @f
    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m242deprecated_expiresAt() {
        return this.expiresAt;
    }

    @f
    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m243deprecated_hostOnly() {
        return this.hostOnly;
    }

    @f
    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m244deprecated_httpOnly() {
        return this.httpOnly;
    }

    @f
    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m245deprecated_name() {
        return this.name;
    }

    @f
    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m246deprecated_path() {
        return this.path;
    }

    @f
    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m247deprecated_persistent() {
        return this.persistent;
    }

    @f
    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m248deprecated_secure() {
        return this.secure;
    }

    @f
    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m249deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return e0.areEqual(cookie.name, this.name) && e0.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && e0.areEqual(cookie.domain, this.domain) && e0.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hostOnly) + a.c(a.c(a.c(o2.e(o2.e(o2.d(o2.e(o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.name), 31, this.value), 31, this.expiresAt), 31, this.domain), 31, this.path), 31, this.secure), 31, this.httpOnly), 31, this.persistent);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        e0.checkNotNullParameter(url, "url");
        if ((this.hostOnly ? e0.areEqual(url.host(), this.domain) : Companion.domainMatch(url.host(), this.domain)) && Companion.pathMatch(url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j10;
        this.domain = str3;
        this.path = str4;
        this.secure = z10;
        this.httpOnly = z11;
        this.persistent = z12;
        this.hostOnly = z13;
    }

    public final String toString$okhttp(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append(G5.T);
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, wHkgq.RAQTtGeLnvyS);
        return string;
    }
}
