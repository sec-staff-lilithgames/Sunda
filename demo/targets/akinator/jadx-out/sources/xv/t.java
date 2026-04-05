package xv;

import b0.e2;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.ktor.client.utils.CacheControl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t {

    /* renamed from: k, reason: collision with root package name */
    public static final b f93833k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f93834l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f93835m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f93836n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f93837o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f93838a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93839b;

    /* renamed from: c, reason: collision with root package name */
    public final long f93840c;

    /* renamed from: d, reason: collision with root package name */
    public final String f93841d;

    /* renamed from: e, reason: collision with root package name */
    public final String f93842e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f93843f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93844g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f93845h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f93846i;

    /* renamed from: j, reason: collision with root package name */
    public final String f93847j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public static int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        public static final /* synthetic */ boolean access$domainMatch(b bVar, String str, String str2) {
            bVar.getClass();
            return b(str, str2);
        }

        public static final boolean access$pathMatch(b bVar, g0 g0Var, String str) {
            bVar.getClass();
            String strEncodedPath = g0Var.encodedPath();
            if (kotlin.jvm.internal.e0.areEqual(strEncodedPath, str)) {
                return true;
            }
            return sv.k0.startsWith$default(strEncodedPath, str, false, 2, null) && (sv.k0.endsWith$default(str, "/", false, 2, null) || strEncodedPath.charAt(str.length()) == '/');
        }

        public static boolean b(String str, String str2) {
            return kotlin.jvm.internal.e0.areEqual(str, str2) || (sv.k0.endsWith$default(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !yv.f.canParseAsIpAddress(str));
        }

        public static long c(int i10, String str) throws NumberFormatException {
            int iA = a(str, 0, i10, false);
            Matcher matcher = t.f93837o.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iIndexOf$default = -1;
            int i14 = -1;
            int i15 = -1;
            while (iA < i10) {
                int iA2 = a(str, iA + 1, i10, true);
                matcher.region(iA, iA2);
                if (i12 == -1 && matcher.usePattern(t.f93837o).matches()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strGroup, "group(...)");
                    i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strGroup2, "group(...)");
                    i14 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strGroup3, "group(...)");
                    i15 = Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(t.f93836n).matches()) {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strGroup4, "group(...)");
                    i13 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(t.f93835m).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strGroup5, "group(...)");
                    Locale locale = Locale.US;
                    String strP = e2.p(locale, "US", strGroup5, locale, "toLowerCase(...)");
                    String strPattern = t.f93835m.pattern();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strPattern, "pattern(...)");
                    iIndexOf$default = sv.n0.indexOf$default((CharSequence) strPattern, strP, 0, false, 6, (Object) null) / 4;
                } else if (i11 == -1 && matcher.usePattern(t.f93834l).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strGroup6, "group(...)");
                    i11 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i10, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (i11 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i13 || i13 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i12 < 0 || i12 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(yv.i.f96667a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final t parse(g0 url, String setCookie) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.e0.checkNotNullParameter(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        public final t parse$okhttp(long j10, g0 url, String setCookie) throws NumberFormatException {
            boolean z10;
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.e0.checkNotNullParameter(setCookie, "setCookie");
            int iDelimiterOffset$default = yv.h.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = yv.h.delimiterOffset$default(setCookie, G5.T, 0, iDelimiterOffset$default, 2, (Object) null);
            Object obj = null;
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            boolean z11 = true;
            String strTrimSubstring$default = yv.h.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
            if (strTrimSubstring$default.length() == 0 || yv.h.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = yv.h.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (yv.h.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i10 = iDelimiterOffset$default + 1;
            int length = setCookie.length();
            String str = null;
            String str2 = null;
            String str3 = null;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = true;
            long j11 = -1;
            long jC = DatesKt.MAX_DATE;
            while (true) {
                long j12 = Long.MIN_VALUE;
                if (i10 >= length) {
                    if (j11 != Long.MIN_VALUE) {
                        if (j11 != -1) {
                            long j13 = j10 + (j11 <= 9223372036854775L ? j11 * 1000 : Long.MAX_VALUE);
                            j12 = (j13 < j10 || j13 > DatesKt.MAX_DATE) ? 253402300799999L : j13;
                        } else {
                            j12 = jC;
                        }
                    }
                    String strHost = url.host();
                    if (str2 != null) {
                        if (b(strHost, str2)) {
                        }
                        return null;
                    }
                    str2 = strHost;
                    if (strHost.length() == str2.length() || lw.c.f73631b.get().getEffectiveTldPlusOne(str2) != null) {
                        String strSubstring = "/";
                        if (str == null || !sv.k0.startsWith$default(str, "/", false, 2, null)) {
                            String strEncodedPath = url.encodedPath();
                            int iLastIndexOf$default = sv.n0.lastIndexOf$default((CharSequence) strEncodedPath, '/', 0, false, 6, (Object) null);
                            if (iLastIndexOf$default != 0) {
                                strSubstring = strEncodedPath.substring(0, iLastIndexOf$default);
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            }
                            str = strSubstring;
                        }
                        return new t(strTrimSubstring$default, strTrimSubstring, j12, str2, str, z14, z12, z13, z15, str3, null);
                    }
                    return null;
                }
                int iDelimiterOffset = yv.h.delimiterOffset(setCookie, ';', i10, length);
                int iDelimiterOffset2 = yv.h.delimiterOffset(setCookie, G5.T, i10, iDelimiterOffset);
                String strTrimSubstring2 = yv.h.trimSubstring(setCookie, i10, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? yv.h.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                if (sv.k0.equals(strTrimSubstring2, "expires", z11)) {
                    try {
                        jC = c(strTrimSubstring3.length(), strTrimSubstring3);
                        z10 = z11;
                        z13 = z10;
                    } catch (IllegalArgumentException unused) {
                        z10 = z11;
                    }
                } else if (sv.k0.equals(strTrimSubstring2, CacheControl.MAX_AGE, z11)) {
                    try {
                        j11 = Long.parseLong(strTrimSubstring3);
                        if (j11 <= 0) {
                            j11 = Long.MIN_VALUE;
                        }
                    } catch (NumberFormatException e10) {
                        try {
                            if (!new sv.x("-?\\d+").matches(strTrimSubstring3)) {
                                throw e10;
                            }
                            j11 = sv.k0.startsWith$default(strTrimSubstring3, "-", false, 2, obj) ? Long.MIN_VALUE : Long.MAX_VALUE;
                        } catch (NumberFormatException | IllegalArgumentException unused2) {
                        }
                    }
                    z10 = true;
                    z13 = true;
                } else if (!sv.k0.equals(strTrimSubstring2, C3191e4.i.D, true)) {
                    z10 = true;
                    if (sv.k0.equals(strTrimSubstring2, "path", true)) {
                        str = strTrimSubstring3;
                    } else if (sv.k0.equals(strTrimSubstring2, "secure", true)) {
                        z14 = true;
                    } else if (sv.k0.equals(strTrimSubstring2, "httponly", true)) {
                        z12 = true;
                    } else if (sv.k0.equals(strTrimSubstring2, "samesite", true)) {
                        str3 = strTrimSubstring3;
                    }
                } else {
                    if (sv.k0.endsWith$default(strTrimSubstring3, ".", false, 2, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    String canonicalHost = yv.f.toCanonicalHost(sv.n0.removePrefix(strTrimSubstring3, (CharSequence) "."));
                    if (canonicalHost == null) {
                        throw new IllegalArgumentException();
                    }
                    str2 = canonicalHost;
                    z15 = false;
                    z10 = true;
                }
                i10 = iDelimiterOffset + 1;
                z11 = z10;
                obj = null;
            }
        }

        public final List<t> parseAll(g0 url, f0 headers) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            List<t> listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                t tVar = parse(url, listValues.get(i10));
                if (tVar != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tVar);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
            }
            return listUnmodifiableList == null ? uu.p0.emptyList() : listUnmodifiableList;
        }
    }

    public t(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, kotlin.jvm.internal.u uVar) {
        this.f93838a = str;
        this.f93839b = str2;
        this.f93840c = j10;
        this.f93841d = str3;
        this.f93842e = str4;
        this.f93843f = z10;
        this.f93844g = z11;
        this.f93845h = z12;
        this.f93846i = z13;
        this.f93847j = str5;
    }

    public static final t parse(g0 g0Var, String str) {
        return f93833k.parse(g0Var, str);
    }

    public static final List<t> parseAll(g0 g0Var, f0 f0Var) {
        return f93833k.parseAll(g0Var, f0Var);
    }

    @tu.f
    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m7987deprecated_domain() {
        return this.f93841d;
    }

    @tu.f
    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m7988deprecated_expiresAt() {
        return this.f93840c;
    }

    @tu.f
    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m7989deprecated_hostOnly() {
        return this.f93846i;
    }

    @tu.f
    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m7990deprecated_httpOnly() {
        return this.f93844g;
    }

    @tu.f
    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m7991deprecated_name() {
        return this.f93838a;
    }

    @tu.f
    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m7992deprecated_path() {
        return this.f93842e;
    }

    @tu.f
    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m7993deprecated_persistent() {
        return this.f93845h;
    }

    @tu.f
    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m7994deprecated_secure() {
        return this.f93843f;
    }

    @tu.f
    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m7995deprecated_value() {
        return this.f93839b;
    }

    public final String domain() {
        return this.f93841d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.e0.areEqual(tVar.f93838a, this.f93838a) && kotlin.jvm.internal.e0.areEqual(tVar.f93839b, this.f93839b) && tVar.f93840c == this.f93840c && kotlin.jvm.internal.e0.areEqual(tVar.f93841d, this.f93841d) && kotlin.jvm.internal.e0.areEqual(tVar.f93842e, this.f93842e) && tVar.f93843f == this.f93843f && tVar.f93844g == this.f93844g && tVar.f93845h == this.f93845h && tVar.f93846i == this.f93846i && kotlin.jvm.internal.e0.areEqual(tVar.f93847j, this.f93847j);
    }

    public final long expiresAt() {
        return this.f93840c;
    }

    public int hashCode() {
        int iC = com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c(o2.e(o2.e(o2.d(o2.e(o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f93838a), 31, this.f93839b), 31, this.f93840c), 31, this.f93841d), 31, this.f93842e), 31, this.f93843f), 31, this.f93844g), 31, this.f93845h), 31, this.f93846i);
        String str = this.f93847j;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public final boolean hostOnly() {
        return this.f93846i;
    }

    public final boolean httpOnly() {
        return this.f93844g;
    }

    public final boolean matches(g0 url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        boolean z10 = this.f93846i;
        b bVar = f93833k;
        String str = this.f93841d;
        if ((z10 ? kotlin.jvm.internal.e0.areEqual(url.host(), str) : b.access$domainMatch(bVar, url.host(), str)) && b.access$pathMatch(bVar, url, this.f93842e)) {
            return !this.f93843f || url.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.f93838a;
    }

    public final a newBuilder() {
        return new a(this);
    }

    public final String path() {
        return this.f93842e;
    }

    public final boolean persistent() {
        return this.f93845h;
    }

    public final String sameSite() {
        return this.f93847j;
    }

    public final boolean secure() {
        return this.f93843f;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f93838a);
        sb2.append(G5.T);
        sb2.append(this.f93839b);
        if (this.f93845h) {
            long j10 = this.f93840c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(dw.e.toHttpDateString(new Date(j10)));
            }
        }
        if (!this.f93846i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f93841d);
        }
        sb2.append("; path=");
        sb2.append(this.f93842e);
        if (this.f93843f) {
            sb2.append("; secure");
        }
        if (this.f93844g) {
            sb2.append("; httponly");
        }
        String str = this.f93847j;
        if (str != null) {
            sb2.append("; samesite=");
            sb2.append(str);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String value() {
        return this.f93839b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f93848a;

        /* renamed from: b, reason: collision with root package name */
        public String f93849b;

        /* renamed from: c, reason: collision with root package name */
        public long f93850c;

        /* renamed from: d, reason: collision with root package name */
        public String f93851d;

        /* renamed from: e, reason: collision with root package name */
        public String f93852e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f93853f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f93854g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f93855h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f93856i;

        /* renamed from: j, reason: collision with root package name */
        public String f93857j;

        public a() {
            this.f93850c = DatesKt.MAX_DATE;
            this.f93852e = "/";
        }

        public final t build() {
            String str = this.f93848a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f93849b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.f93850c;
            String str3 = this.f93851d;
            if (str3 != null) {
                return new t(str, str2, j10, str3, this.f93852e, this.f93853f, this.f93854g, this.f93855h, this.f93856i, this.f93857j, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final a domain(String domain) {
            kotlin.jvm.internal.e0.checkNotNullParameter(domain, "domain");
            String canonicalHost = yv.f.toCanonicalHost(domain);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(a.b.k("unexpected domain: ", domain));
            }
            this.f93851d = canonicalHost;
            this.f93856i = false;
            return this;
        }

        public final a expiresAt(long j10) {
            if (j10 <= 0) {
                j10 = Long.MIN_VALUE;
            }
            if (j10 > DatesKt.MAX_DATE) {
                j10 = 253402300799999L;
            }
            this.f93850c = j10;
            this.f93855h = true;
            return this;
        }

        public final a hostOnlyDomain(String domain) {
            kotlin.jvm.internal.e0.checkNotNullParameter(domain, "domain");
            String canonicalHost = yv.f.toCanonicalHost(domain);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(a.b.k("unexpected domain: ", domain));
            }
            this.f93851d = canonicalHost;
            this.f93856i = true;
            return this;
        }

        public final a httpOnly() {
            this.f93854g = true;
            return this;
        }

        public final a name(String name) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            if (!kotlin.jvm.internal.e0.areEqual(sv.n0.trim(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f93848a = name;
            return this;
        }

        public final a path(String path) {
            kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
            if (!sv.k0.startsWith$default(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.f93852e = path;
            return this;
        }

        public final a sameSite(String sameSite) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sameSite, "sameSite");
            if (!kotlin.jvm.internal.e0.areEqual(sv.n0.trim(sameSite).toString(), sameSite)) {
                throw new IllegalArgumentException("sameSite is not trimmed");
            }
            this.f93857j = sameSite;
            return this;
        }

        public final a secure() {
            this.f93853f = true;
            return this;
        }

        public final a value(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            if (!kotlin.jvm.internal.e0.areEqual(sv.n0.trim(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f93849b = value;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(t cookie) {
            this();
            kotlin.jvm.internal.e0.checkNotNullParameter(cookie, "cookie");
            this.f93848a = cookie.name();
            this.f93849b = cookie.value();
            this.f93850c = cookie.expiresAt();
            this.f93851d = cookie.domain();
            this.f93852e = cookie.path();
            this.f93853f = cookie.secure();
            this.f93854g = cookie.httpOnly();
            this.f93855h = cookie.persistent();
            this.f93856i = cookie.hostOnly();
            this.f93857j = cookie.sameSite();
        }
    }
}
