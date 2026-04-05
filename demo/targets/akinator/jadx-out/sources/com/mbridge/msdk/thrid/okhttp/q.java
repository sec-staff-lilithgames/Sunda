package com.mbridge.msdk.thrid.okhttp;

import ao.kwoC.zAQQWzBxnS;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f43675j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    final String f43676a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43677b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43678c;

    /* renamed from: d, reason: collision with root package name */
    final String f43679d;

    /* renamed from: e, reason: collision with root package name */
    final int f43680e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f43681f;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f43682g;

    /* renamed from: h, reason: collision with root package name */
    private final String f43683h;

    /* renamed from: i, reason: collision with root package name */
    private final String f43684i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f43685a;

        /* renamed from: d, reason: collision with root package name */
        String f43688d;

        /* renamed from: f, reason: collision with root package name */
        final List<String> f43690f;

        /* renamed from: g, reason: collision with root package name */
        List<String> f43691g;

        /* renamed from: h, reason: collision with root package name */
        String f43692h;

        /* renamed from: b, reason: collision with root package name */
        String f43686b = "";

        /* renamed from: c, reason: collision with root package name */
        String f43687c = "";

        /* renamed from: e, reason: collision with root package name */
        int f43689e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f43690f = arrayList;
            arrayList.add("");
        }

        private boolean c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private static int f(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public a a(int i10) {
            if (i10 <= 0 || i10 > 65535) {
                throw new IllegalArgumentException(a.b.e(i10, "unexpected port: "));
            }
            this.f43689e = i10;
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.f43688d = strA;
            return this;
        }

        public a d() {
            int size = this.f43690f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f43690f.set(i10, q.a(this.f43690f.get(i10), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
            }
            List<String> list = this.f43691g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f43691g.get(i11);
                    if (str != null) {
                        this.f43691g.set(i11, q.a(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                    }
                }
            }
            String str2 = this.f43692h;
            if (str2 != null) {
                this.f43692h = q.a(str2, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f43685a = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f43685a = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f43685a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f43686b.isEmpty() || !this.f43687c.isEmpty()) {
                sb2.append(this.f43686b);
                if (!this.f43687c.isEmpty()) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(this.f43687c);
                }
                sb2.append('@');
            }
            String str2 = this.f43688d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(this.f43688d);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb2.append(this.f43688d);
                }
            }
            if (this.f43689e != -1 || this.f43685a != null) {
                int iB = b();
                String str3 = this.f43685a;
                if (str3 == null || iB != q.a(str3)) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(iB);
                }
            }
            q.b(sb2, this.f43690f);
            if (this.f43691g != null) {
                sb2.append('?');
                q.a(sb2, this.f43691g);
            }
            if (this.f43692h != null) {
                sb2.append('#');
                sb2.append(this.f43692h);
            }
            return sb2.toString();
        }

        private void c() {
            if (!this.f43690f.remove(r0.size() - 1).isEmpty() || this.f43690f.isEmpty()) {
                this.f43690f.add("");
            } else {
                this.f43690f.set(r0.size() - 1, "");
            }
        }

        public int b() {
            int i10 = this.f43689e;
            return i10 != -1 ? i10 : q.a(this.f43685a);
        }

        private static int b(String str, int i10, int i11) throws NumberFormatException {
            int i12;
            try {
                i12 = Integer.parseInt(q.a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        private static int c(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public a a(String str) {
            this.f43691g = str != null ? q.d(q.a(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public q a() {
            if (this.f43685a != null) {
                if (this.f43688d != null) {
                    return new q(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private void d(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f43690f;
                list.set(list.size() - 1, "");
            } else {
                this.f43690f.clear();
                this.f43690f.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i12, i11, "/\\");
                boolean z10 = iA < i11;
                String str2 = str;
                a(str2, i12, iA, z10, true);
                if (z10) {
                    i12 = iA + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iA;
                }
            }
        }

        public a a(q qVar, String str) throws NumberFormatException {
            int iA;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iB = com.mbridge.msdk.thrid.okhttp.internal.c.b(str4, 0, str4.length());
            int iC = com.mbridge.msdk.thrid.okhttp.internal.c.c(str4, iB, str4.length());
            int iE = e(str4, iB, iC);
            if (iE != -1) {
                if (str4.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f43685a = HttpRequest.DEFAULT_SCHEME;
                    iB += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iB, "http:", 0, 5)) {
                        this.f43685a = "http";
                        iB += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, iE) + "'");
                    }
                }
            } else if (qVar != null) {
                this.f43685a = qVar.f43676a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iF = f(str4, iB, iC);
            char c10 = '#';
            if (iF < 2 && qVar != null && qVar.f43676a.equals(this.f43685a)) {
                this.f43686b = qVar.f();
                this.f43687c = qVar.b();
                this.f43688d = qVar.f43679d;
                this.f43689e = qVar.f43680e;
                this.f43690f.clear();
                this.f43690f.addAll(qVar.d());
                if (iB == iC || str4.charAt(iB) == '#') {
                    a(qVar.e());
                }
                str2 = str4;
            } else {
                int i11 = iB + iF;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iC, "@/\\?#");
                    char cCharAt = iA != iC ? str4.charAt(iA) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c10 || cCharAt == '/' || cCharAt == '\\' || cCharAt == '?') {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z10) {
                            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iA, AbstractJsonLexerKt.COLON);
                            String strA = q.a(str, i11, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strA = a.b.o(new StringBuilder(), this.f43686b, "%40", strA);
                            }
                            this.f43686b = strA;
                            if (iA2 != iA) {
                                i10 = iA;
                                this.f43687c = q.a(str, iA2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iA;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iA;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f43687c);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(q.a(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f43687c = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iC2 = c(str2, i12, iA);
                int i13 = iC2 + 1;
                if (i13 < iA) {
                    this.f43688d = a(str2, i12, iC2);
                    int iB2 = b(str2, i13, iA);
                    this.f43689e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i13, iA) + AbstractJsonLexerKt.STRING);
                    }
                } else {
                    this.f43688d = a(str2, i12, iC2);
                    this.f43689e = q.a(this.f43685a);
                }
                if (this.f43688d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i12, iC2) + AbstractJsonLexerKt.STRING);
                }
                iB = iA;
            }
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iB, iC, "?#");
            d(str2, iB, iA3);
            if (iA3 < iC && str2.charAt(iA3) == '?') {
                int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iA3, iC, '#');
                this.f43691g = q.d(q.a(str2, iA3 + 1, iA4, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str2.charAt(iA3) == '#') {
                this.f43692h = q.a(str2, iA3 + 1, iC, "", true, false, false, false, null);
            }
            return this;
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String strA = q.a(str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, true, null);
            if (c(strA)) {
                return;
            }
            if (d(strA)) {
                c();
                return;
            }
            if (((String) o2.g(1, this.f43690f)).isEmpty()) {
                List<String> list = this.f43690f;
                list.set(list.size() - 1, strA);
            } else {
                this.f43690f.add(strA);
            }
            if (z10) {
                this.f43690f.add("");
            }
        }

        private static String a(String str, int i10, int i11) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(q.a(str, i10, i11, false));
        }
    }

    public q(a aVar) {
        this.f43676a = aVar.f43685a;
        this.f43677b = a(aVar.f43686b, false);
        this.f43678c = a(aVar.f43687c, false);
        this.f43679d = aVar.f43688d;
        this.f43680e = aVar.b();
        this.f43681f = a(aVar.f43690f, false);
        List<String> list = aVar.f43691g;
        this.f43682g = list != null ? a(list, true) : null;
        String str = aVar.f43692h;
        this.f43683h = str != null ? a(str, false) : null;
        this.f43684i = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public String b() {
        if (this.f43678c.isEmpty()) {
            return "";
        }
        return this.f43684i.substring(this.f43684i.indexOf(58, this.f43676a.length() + 3) + 1, this.f43684i.indexOf(64));
    }

    public String c() {
        int iIndexOf = this.f43684i.indexOf(47, this.f43676a.length() + 3);
        String str = this.f43684i;
        return this.f43684i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int iIndexOf = this.f43684i.indexOf(47, this.f43676a.length() + 3);
        String str = this.f43684i;
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43684i, i10, iA, '/');
            arrayList.add(this.f43684i.substring(i10, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    public String e() {
        if (this.f43682g == null) {
            return null;
        }
        int iIndexOf = this.f43684i.indexOf(63) + 1;
        String str = this.f43684i;
        return this.f43684i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && ((q) obj).f43684i.equals(this.f43684i);
    }

    public String f() {
        if (this.f43677b.isEmpty()) {
            return "";
        }
        int length = this.f43676a.length() + 3;
        String str = this.f43684i;
        return this.f43684i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f43679d;
    }

    public boolean h() {
        return this.f43676a.equals(HttpRequest.DEFAULT_SCHEME);
    }

    public int hashCode() {
        return this.f43684i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f43685a = this.f43676a;
        aVar.f43686b = f();
        aVar.f43687c = b();
        aVar.f43688d = this.f43679d;
        aVar.f43689e = this.f43680e != a(this.f43676a) ? this.f43680e : -1;
        aVar.f43690f.clear();
        aVar.f43690f.addAll(d());
        aVar.a(e());
        aVar.f43692h = a();
        return aVar;
    }

    public int j() {
        return this.f43680e;
    }

    public String k() {
        if (this.f43682g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        a(sb2, this.f43682g);
        return sb2.toString();
    }

    public String l() {
        return this.f43676a;
    }

    public String toString() {
        return this.f43684i;
    }

    public static void a(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append(G5.T);
                sb2.append(str2);
            }
        }
    }

    public URI m() {
        String string = i().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll(zAQQWzBxnS.HrAQrNeLtcMVYkQ, ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public q e(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    public static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static q b(String str) {
        return new a().a(null, str).a();
    }

    public String a() {
        if (this.f43683h == null) {
            return null;
        }
        return this.f43684i.substring(this.f43684i.indexOf(35) + 1);
    }

    public static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, i12);
                a(cVar, str, i12, i11, z10);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.mbridge.msdk.thrid.okio.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.writeByte(r1)
            goto L3c
        L39:
            r5.f(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.q.a(com.mbridge.msdk.thrid.okio.c, java.lang.String, int, int, boolean):void");
    }

    public static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12)) != -1;
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || a(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, iCharCount);
                a(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    public static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    cVar.a(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || a(str, i10, i11)))))) {
                    cVar.f(iCodePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset != null && !charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.f43296j)) {
                        cVar2.a(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        cVar2.f(iCodePointAt);
                    }
                    while (!cVar2.f()) {
                        byte b10 = cVar2.readByte();
                        int i12 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        cVar.writeByte(37);
                        char[] cArr = f43675j;
                        cVar.writeByte((int) cArr[(i12 >> 4) & 15]);
                        cVar.writeByte((int) cArr[b10 & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
