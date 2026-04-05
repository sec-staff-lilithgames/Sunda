package xv;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.ironsource.G5;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f93628j = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f93629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93630b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93631c;

    /* renamed from: d, reason: collision with root package name */
    public final String f93632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93633e;

    /* renamed from: f, reason: collision with root package name */
    public final List f93634f;

    /* renamed from: g, reason: collision with root package name */
    public final List f93635g;

    /* renamed from: h, reason: collision with root package name */
    public final String f93636h;

    /* renamed from: i, reason: collision with root package name */
    public final String f93637i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f93638a;

        /* renamed from: d, reason: collision with root package name */
        public String f93641d;

        /* renamed from: g, reason: collision with root package name */
        public List f93644g;

        /* renamed from: h, reason: collision with root package name */
        public String f93645h;

        /* renamed from: b, reason: collision with root package name */
        public String f93639b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f93640c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f93642e = -1;

        /* renamed from: f, reason: collision with root package name */
        public final List f93643f = uu.p0.mutableListOf("");

        public static boolean b(String str) {
            return kotlin.jvm.internal.e0.areEqual(str, ".") || sv.k0.equals(str, "%2e", true);
        }

        public static boolean c(String str) {
            return kotlin.jvm.internal.e0.areEqual(str, "..") || sv.k0.equals(str, "%2e.", true) || sv.k0.equals(str, ".%2e", true) || sv.k0.equals(str, "%2e%2e", true);
        }

        public static ArrayList g(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iIndexOf$default = sv.n0.indexOf$default((CharSequence) str2, '&', i10, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str2.length();
                }
                int iIndexOf$default2 = sv.n0.indexOf$default((CharSequence) str2, G5.T, i10, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > iIndexOf$default) {
                    String strSubstring = str2.substring(i10, iIndexOf$default);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iIndexOf$default2);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iIndexOf$default2 + 1, iIndexOf$default);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i10 = iIndexOf$default + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void a(String str, boolean z10) {
            boolean z11;
            a aVar;
            String str2;
            boolean z12;
            int i10 = 0;
            while (true) {
                int iDelimiterOffset = yv.h.delimiterOffset(str, "/\\", i10, str.length());
                if (iDelimiterOffset < str.length()) {
                    z11 = true;
                    str2 = str;
                    z12 = z10;
                    aVar = this;
                } else {
                    z11 = false;
                    aVar = this;
                    str2 = str;
                    z12 = z10;
                }
                aVar.d(str2, i10, iDelimiterOffset, z11, z12);
                i10 = iDelimiterOffset + 1;
                if (i10 > str2.length()) {
                    return;
                }
                str = str2;
                z10 = z12;
            }
        }

        public final a addEncodedPathSegment(String encodedPathSegment) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            d(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final a addEncodedPathSegments(String encodedPathSegments) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedPathSegments, "encodedPathSegments");
            a(encodedPathSegments, true);
            return this;
        }

        public final a addEncodedQueryParameter(String encodedName, String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedName, "encodedName");
            if (this.f93644g == null) {
                this.f93644g = new ArrayList();
            }
            List list = this.f93644g;
            kotlin.jvm.internal.e0.checkNotNull(list);
            list.add(nw.a.canonicalize$default(encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            List list2 = this.f93644g;
            kotlin.jvm.internal.e0.checkNotNull(list2);
            list2.add(str != null ? nw.a.canonicalize$default(str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null) : null);
            return this;
        }

        public final a addPathSegment(String pathSegment) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pathSegment, "pathSegment");
            d(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final a addPathSegments(String pathSegments) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pathSegments, "pathSegments");
            a(pathSegments, false);
            return this;
        }

        public final a addQueryParameter(String name, String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            if (this.f93644g == null) {
                this.f93644g = new ArrayList();
            }
            List list = this.f93644g;
            kotlin.jvm.internal.e0.checkNotNull(list);
            list.add(nw.a.canonicalize$default(name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            List list2 = this.f93644g;
            kotlin.jvm.internal.e0.checkNotNull(list2);
            list2.add(str != null ? nw.a.canonicalize$default(str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null) : null);
            return this;
        }

        public final g0 build() {
            ArrayList arrayList;
            String str = this.f93638a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strPercentDecode$default = nw.a.percentDecode$default(this.f93639b, 0, 0, false, 7, null);
            String strPercentDecode$default2 = nw.a.percentDecode$default(this.f93640c, 0, 0, false, 7, null);
            String str2 = this.f93641d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iDefaultPort = this.f93642e;
            if (iDefaultPort == -1) {
                b bVar = g0.f93628j;
                String str3 = this.f93638a;
                kotlin.jvm.internal.e0.checkNotNull(str3);
                iDefaultPort = bVar.defaultPort(str3);
            }
            int i10 = iDefaultPort;
            List list = this.f93643f;
            ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(nw.a.percentDecode$default((String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.f93644g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(uu.q0.collectionSizeOrDefault(list3, 10));
                for (String str4 : list3) {
                    arrayList3.add(str4 != null ? nw.a.percentDecode$default(str4, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str5 = this.f93645h;
            return new g0(str, strPercentDecode$default, strPercentDecode$default2, str2, i10, arrayList2, arrayList, str5 != null ? nw.a.percentDecode$default(str5, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final void d(String str, int i10, int i11, boolean z10, boolean z11) {
            String strCanonicalize$default = nw.a.canonicalize$default(str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, false, 112, null);
            if (b(strCanonicalize$default)) {
                return;
            }
            boolean zC = c(strCanonicalize$default);
            List list = this.f93643f;
            if (zC) {
                if (((String) list.remove(list.size() - 1)).length() != 0 || list.isEmpty()) {
                    list.add("");
                    return;
                } else {
                    list.set(list.size() - 1, "");
                    return;
                }
            }
            if (((CharSequence) o2.g(1, list)).length() == 0) {
                list.set(list.size() - 1, strCanonicalize$default);
            } else {
                list.add(strCanonicalize$default);
            }
            if (z10) {
                list.add("");
            }
        }

        public final void e(String str) {
            List list = this.f93644g;
            kotlin.jvm.internal.e0.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = dv.d.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                List list2 = this.f93644g;
                kotlin.jvm.internal.e0.checkNotNull(list2);
                if (kotlin.jvm.internal.e0.areEqual(str, list2.get(size))) {
                    List list3 = this.f93644g;
                    kotlin.jvm.internal.e0.checkNotNull(list3);
                    list3.remove(size + 1);
                    List list4 = this.f93644g;
                    kotlin.jvm.internal.e0.checkNotNull(list4);
                    list4.remove(size);
                    List list5 = this.f93644g;
                    kotlin.jvm.internal.e0.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.f93644g = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final a encodedFragment(String str) {
            this.f93645h = str != null ? nw.a.canonicalize$default(str, 0, 0, "", true, false, false, true, 51, null) : null;
            return this;
        }

        public final a encodedPassword(String encodedPassword) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedPassword, "encodedPassword");
            this.f93640c = nw.a.canonicalize$default(encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final a encodedPath(String encodedPath) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedPath, "encodedPath");
            if (!sv.k0.startsWith$default(encodedPath, "/", false, 2, null)) {
                throw new IllegalArgumentException(a.b.k("unexpected encodedPath: ", encodedPath).toString());
            }
            f(encodedPath, 0, encodedPath.length());
            return this;
        }

        public final a encodedQuery(String str) {
            String strCanonicalize$default;
            this.f93644g = (str == null || (strCanonicalize$default = nw.a.canonicalize$default(str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, 83, null)) == null) ? null : g(strCanonicalize$default);
            return this;
        }

        public final a encodedUsername(String encodedUsername) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedUsername, "encodedUsername");
            this.f93639b = nw.a.canonicalize$default(encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final void f(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            List list = this.f93643f;
            if (cCharAt == '/' || cCharAt == '\\') {
                list.clear();
                list.add("");
                i10++;
            } else {
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iDelimiterOffset = yv.h.delimiterOffset(str, "/\\", i12, i11);
                boolean z10 = iDelimiterOffset < i11;
                String str2 = str;
                d(str2, i12, iDelimiterOffset, z10, true);
                if (z10) {
                    i12 = iDelimiterOffset + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iDelimiterOffset;
                }
            }
        }

        public final a fragment(String str) {
            this.f93645h = str != null ? nw.a.canonicalize$default(str, 0, 0, "", false, false, false, true, 59, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.f93645h;
        }

        public final String getEncodedPassword$okhttp() {
            return this.f93640c;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.f93643f;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.f93644g;
        }

        public final String getEncodedUsername$okhttp() {
            return this.f93639b;
        }

        public final String getHost$okhttp() {
            return this.f93641d;
        }

        public final int getPort$okhttp() {
            return this.f93642e;
        }

        public final String getScheme$okhttp() {
            return this.f93638a;
        }

        public final a host(String host) {
            kotlin.jvm.internal.e0.checkNotNullParameter(host, "host");
            String canonicalHost = yv.f.toCanonicalHost(nw.a.percentDecode$default(host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException(a.b.k("unexpected host: ", host));
            }
            this.f93641d = canonicalHost;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final xv.g0.a parse$okhttp(xv.g0 r26, java.lang.String r27) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 799
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xv.g0.a.parse$okhttp(xv.g0, java.lang.String):xv.g0$a");
        }

        public final a password(String password) {
            kotlin.jvm.internal.e0.checkNotNullParameter(password, "password");
            this.f93640c = nw.a.canonicalize$default(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
            return this;
        }

        public final a port(int i10) {
            if (1 > i10 || i10 >= 65536) {
                throw new IllegalArgumentException(a.b.e(i10, "unexpected port: ").toString());
            }
            this.f93642e = i10;
            return this;
        }

        public final a query(String str) {
            String strCanonicalize$default;
            this.f93644g = (str == null || (strCanonicalize$default = nw.a.canonicalize$default(str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, 91, null)) == null) ? null : g(strCanonicalize$default);
            return this;
        }

        public final a reencodeForUri$okhttp() {
            String str = this.f93641d;
            this.f93641d = str != null ? new sv.x("[\"<>^`{|}]").replace(str, "") : null;
            List list = this.f93643f;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.set(i10, nw.a.canonicalize$default((String) list.get(i10), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 99, null));
            }
            List list2 = this.f93644g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? nw.a.canonicalize$default(str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.f93645h;
            this.f93645h = str3 != null ? nw.a.canonicalize$default(str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 35, null) : null;
            return this;
        }

        public final a removeAllEncodedQueryParameters(String encodedName) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedName, "encodedName");
            if (this.f93644g == null) {
                return this;
            }
            e(nw.a.canonicalize$default(encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            return this;
        }

        public final a removeAllQueryParameters(String name) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            if (this.f93644g == null) {
                return this;
            }
            e(nw.a.canonicalize$default(name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            return this;
        }

        public final a removePathSegment(int i10) {
            List list = this.f93643f;
            list.remove(i10);
            if (list.isEmpty()) {
                list.add("");
            }
            return this;
        }

        public final a scheme(String scheme) {
            kotlin.jvm.internal.e0.checkNotNullParameter(scheme, "scheme");
            if (sv.k0.equals(scheme, "http", true)) {
                this.f93638a = "http";
                return this;
            }
            if (!sv.k0.equals(scheme, HttpRequest.DEFAULT_SCHEME, true)) {
                throw new IllegalArgumentException(a.b.k("unexpected scheme: ", scheme));
            }
            this.f93638a = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.f93645h = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f93640c = str;
        }

        public final a setEncodedPathSegment(int i10, String encodedPathSegment) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            String strCanonicalize$default = nw.a.canonicalize$default(encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 115, null);
            this.f93643f.set(i10, strCanonicalize$default);
            if (b(strCanonicalize$default) || c(strCanonicalize$default)) {
                throw new IllegalArgumentException(a.b.k("unexpected path segment: ", encodedPathSegment).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.f93644g = list;
        }

        public final a setEncodedQueryParameter(String encodedName, String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f93639b = str;
        }

        public final void setHost$okhttp(String str) {
            this.f93641d = str;
        }

        public final a setPathSegment(int i10, String pathSegment) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pathSegment, "pathSegment");
            String strCanonicalize$default = nw.a.canonicalize$default(pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
            if (b(strCanonicalize$default) || c(strCanonicalize$default)) {
                throw new IllegalArgumentException(a.b.k("unexpected path segment: ", pathSegment).toString());
            }
            this.f93643f.set(i10, strCanonicalize$default);
            return this;
        }

        public final void setPort$okhttp(int i10) {
            this.f93642e = i10;
        }

        public final a setQueryParameter(String name, String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.f93638a = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f93638a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f93639b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f93640c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f93639b
                r0.append(r1)
                java.lang.String r1 = r6.f93640c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f93640c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f93641d
                r3 = 0
                if (r1 == 0) goto L69
                kotlin.jvm.internal.e0.checkNotNull(r1)
                r4 = 2
                r5 = 0
                boolean r1 = sv.n0.contains$default(r1, r2, r3, r4, r5)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f93641d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f93641d
                r0.append(r1)
            L69:
                int r1 = r6.f93642e
                r4 = -1
                if (r1 != r4) goto L72
                java.lang.String r5 = r6.f93638a
                if (r5 == 0) goto L95
            L72:
                if (r1 == r4) goto L75
                goto L80
            L75:
                xv.g0$b r1 = xv.g0.f93628j
                java.lang.String r4 = r6.f93638a
                kotlin.jvm.internal.e0.checkNotNull(r4)
                int r1 = r1.defaultPort(r4)
            L80:
                java.lang.String r4 = r6.f93638a
                if (r4 == 0) goto L8f
                xv.g0$b r5 = xv.g0.f93628j
                kotlin.jvm.internal.e0.checkNotNull(r4)
                int r4 = r5.defaultPort(r4)
                if (r1 == r4) goto L95
            L8f:
                r0.append(r2)
                r0.append(r1)
            L95:
                java.util.List r1 = r6.f93643f
                int r2 = r1.size()
            L9b:
                if (r3 >= r2) goto Lae
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r1.get(r3)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r3 = r3 + 1
                goto L9b
            Lae:
                java.util.List r1 = r6.f93644g
                if (r1 == 0) goto Lc1
                r1 = 63
                r0.append(r1)
                xv.g0$b r1 = xv.g0.f93628j
                java.util.List r2 = r6.f93644g
                kotlin.jvm.internal.e0.checkNotNull(r2)
                xv.g0.b.access$toQueryString(r1, r2, r0)
            Lc1:
                java.lang.String r1 = r6.f93645h
                if (r1 == 0) goto Lcf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f93645h
                r0.append(r1)
            Lcf:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: xv.g0.a.toString():java.lang.String");
        }

        public final a username(String username) {
            kotlin.jvm.internal.e0.checkNotNullParameter(username, "username");
            this.f93639b = nw.a.canonicalize$default(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public static final void access$toQueryString(b bVar, List list, StringBuilder sb2) {
            bVar.getClass();
            qv.k kVarStep = qv.v.step(qv.v.until(0, list.size()), 2);
            int first = kVarStep.getFirst();
            int last = kVarStep.getLast();
            int step = kVarStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = (String) list.get(first);
                String str2 = (String) list.get(first + 1);
                if (first > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append(G5.T);
                    sb2.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        @tu.f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final g0 m7913deprecated_get(String url) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            return get(url);
        }

        @tu.f
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final g0 m7916deprecated_parse(String url) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            return parse(url);
        }

        public final int defaultPort(String scheme) {
            kotlin.jvm.internal.e0.checkNotNullParameter(scheme, "scheme");
            if (kotlin.jvm.internal.e0.areEqual(scheme, "http")) {
                return 80;
            }
            return kotlin.jvm.internal.e0.areEqual(scheme, HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        }

        public final g0 get(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            return new a().parse$okhttp(null, str).build();
        }

        public final g0 parse(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @tu.f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final g0 m7915deprecated_get(URL url) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            return get(url);
        }

        public final g0 get(URL url) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "<this>");
            String string = url.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return parse(string);
        }

        @tu.f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final g0 m7914deprecated_get(URI uri) {
            kotlin.jvm.internal.e0.checkNotNullParameter(uri, "uri");
            return get(uri);
        }

        public final g0 get(URI uri) {
            kotlin.jvm.internal.e0.checkNotNullParameter(uri, "<this>");
            String string = uri.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return parse(string);
        }
    }

    public g0(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, kotlin.jvm.internal.u uVar) {
        this.f93629a = str;
        this.f93630b = str2;
        this.f93631c = str3;
        this.f93632d = str4;
        this.f93633e = i10;
        this.f93634f = list;
        this.f93635g = list2;
        this.f93636h = str5;
        this.f93637i = str6;
    }

    public static final int defaultPort(String str) {
        return f93628j.defaultPort(str);
    }

    public static final g0 get(String str) {
        return f93628j.get(str);
    }

    public static final g0 parse(String str) {
        return f93628j.parse(str);
    }

    @tu.f
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m7894deprecated_encodedFragment() {
        return encodedFragment();
    }

    @tu.f
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m7895deprecated_encodedPassword() {
        return encodedPassword();
    }

    @tu.f
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m7896deprecated_encodedPath() {
        return encodedPath();
    }

    @tu.f
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m7897deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @tu.f
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m7898deprecated_encodedQuery() {
        return encodedQuery();
    }

    @tu.f
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m7899deprecated_encodedUsername() {
        return encodedUsername();
    }

    @tu.f
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m7900deprecated_fragment() {
        return this.f93636h;
    }

    @tu.f
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m7901deprecated_host() {
        return this.f93632d;
    }

    @tu.f
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m7902deprecated_password() {
        return this.f93631c;
    }

    @tu.f
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m7903deprecated_pathSegments() {
        return this.f93634f;
    }

    @tu.f
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m7904deprecated_pathSize() {
        return pathSize();
    }

    @tu.f
    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m7905deprecated_port() {
        return this.f93633e;
    }

    @tu.f
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m7906deprecated_query() {
        return query();
    }

    @tu.f
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m7907deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @tu.f
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m7908deprecated_querySize() {
        return querySize();
    }

    @tu.f
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m7909deprecated_scheme() {
        return this.f93629a;
    }

    @tu.f
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m7910deprecated_uri() {
        return uri();
    }

    @tu.f
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m7911deprecated_url() {
        return url();
    }

    @tu.f
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m7912deprecated_username() {
        return this.f93630b;
    }

    public final String encodedFragment() {
        if (this.f93636h == null) {
            return null;
        }
        String strSubstring = this.f93637i.substring(sv.n0.indexOf$default((CharSequence) this.f93637i, '#', 0, false, 6, (Object) null) + 1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.f93631c.length() == 0) {
            return "";
        }
        String strSubstring = this.f93637i.substring(sv.n0.indexOf$default((CharSequence) this.f93637i, AbstractJsonLexerKt.COLON, this.f93629a.length() + 3, false, 4, (Object) null) + 1, sv.n0.indexOf$default((CharSequence) this.f93637i, '@', 0, false, 6, (Object) null));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String encodedPath() {
        int iIndexOf$default = sv.n0.indexOf$default((CharSequence) this.f93637i, '/', this.f93629a.length() + 3, false, 4, (Object) null);
        String str = this.f93637i;
        String strSubstring = str.substring(iIndexOf$default, yv.h.delimiterOffset(str, "?#", iIndexOf$default, str.length()));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iIndexOf$default = sv.n0.indexOf$default((CharSequence) this.f93637i, '/', this.f93629a.length() + 3, false, 4, (Object) null);
        String str = this.f93637i;
        int iDelimiterOffset = yv.h.delimiterOffset(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iDelimiterOffset) {
            int i10 = iIndexOf$default + 1;
            int iDelimiterOffset2 = yv.h.delimiterOffset(str, '/', i10, iDelimiterOffset);
            String strSubstring = str.substring(i10, iDelimiterOffset2);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iIndexOf$default = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.f93635g == null) {
            return null;
        }
        int iIndexOf$default = sv.n0.indexOf$default((CharSequence) this.f93637i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f93637i;
        String strSubstring = str.substring(iIndexOf$default, yv.h.delimiterOffset(str, '#', iIndexOf$default, str.length()));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g0) && kotlin.jvm.internal.e0.areEqual(((g0) obj).f93637i, this.f93637i);
    }

    public final String fragment() {
        return this.f93636h;
    }

    public int hashCode() {
        return this.f93637i.hashCode();
    }

    public final String host() {
        return this.f93632d;
    }

    public final boolean isHttps() {
        return kotlin.jvm.internal.e0.areEqual(this.f93629a, HttpRequest.DEFAULT_SCHEME);
    }

    public final a newBuilder() {
        a aVar = new a();
        String str = this.f93629a;
        aVar.setScheme$okhttp(str);
        aVar.setEncodedUsername$okhttp(encodedUsername());
        aVar.setEncodedPassword$okhttp(encodedPassword());
        aVar.setHost$okhttp(this.f93632d);
        int iDefaultPort = f93628j.defaultPort(str);
        int i10 = this.f93633e;
        if (i10 == iDefaultPort) {
            i10 = -1;
        }
        aVar.setPort$okhttp(i10);
        aVar.getEncodedPathSegments$okhttp().clear();
        aVar.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        aVar.encodedQuery(encodedQuery());
        aVar.setEncodedFragment$okhttp(encodedFragment());
        return aVar;
    }

    public final String password() {
        return this.f93631c;
    }

    public final List<String> pathSegments() {
        return this.f93634f;
    }

    public final int pathSize() {
        return this.f93634f.size();
    }

    public final int port() {
        return this.f93633e;
    }

    public final String query() {
        List list = this.f93635g;
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        b.access$toQueryString(f93628j, list, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        List list = this.f93635g;
        if (list == null) {
            return null;
        }
        qv.k kVarStep = qv.v.step(qv.v.until(0, list.size()), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!kotlin.jvm.internal.e0.areEqual(name, list.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return (String) list.get(first + 1);
        }
        return null;
    }

    public final String queryParameterName(int i10) {
        List list = this.f93635g;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        Object obj = list.get(i10 * 2);
        kotlin.jvm.internal.e0.checkNotNull(obj);
        return (String) obj;
    }

    public final Set<String> queryParameterNames() {
        List list = this.f93635g;
        if (list == null) {
            return c2.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() / 2, 1.0f);
        qv.k kVarStep = qv.v.step(qv.v.until(0, list.size()), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                Object obj = list.get(first);
                kotlin.jvm.internal.e0.checkNotNull(obj);
                linkedHashSet.add(obj);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i10) {
        List list = this.f93635g;
        if (list != null) {
            return (String) list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int querySize() {
        List list = this.f93635g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        a aVarNewBuilder = newBuilder("/...");
        kotlin.jvm.internal.e0.checkNotNull(aVarNewBuilder);
        return aVarNewBuilder.username("").password("").build().toString();
    }

    public final g0 resolve(String link) {
        kotlin.jvm.internal.e0.checkNotNullParameter(link, "link");
        a aVarNewBuilder = newBuilder(link);
        if (aVarNewBuilder != null) {
            return aVarNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.f93629a;
    }

    public String toString() {
        return this.f93637i;
    }

    public final String topPrivateDomain() {
        String str = this.f93632d;
        if (yv.f.canParseAsIpAddress(str)) {
            return null;
        }
        return lw.c.f73631b.get().getEffectiveTldPlusOne(str);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new sv.x("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                kotlin.jvm.internal.e0.checkNotNull(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.f93637i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String username() {
        return this.f93630b;
    }

    public static final g0 get(URI uri) {
        return f93628j.get(uri);
    }

    public final String encodedUsername() {
        if (this.f93630b.length() == 0) {
            return "";
        }
        int length = this.f93629a.length() + 3;
        String str = KGUkpTlXZlJLy.AIuTeYgolrPw;
        String str2 = this.f93637i;
        String strSubstring = str2.substring(length, yv.h.delimiterOffset(str2, str, length, str2.length()));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final List<String> queryParameterValues(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, QGjYBESwAiCc.sqZmEMaC);
        List list = this.f93635g;
        if (list == null) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(4);
        qv.k kVarStep = qv.v.step(qv.v.until(0, list.size()), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (kotlin.jvm.internal.e0.areEqual(str, list.get(first))) {
                    arrayList.add(list.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final g0 get(URL url) {
        return f93628j.get(url);
    }

    public final a newBuilder(String link) {
        kotlin.jvm.internal.e0.checkNotNullParameter(link, "link");
        try {
            return new a().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
