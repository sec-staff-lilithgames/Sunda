package com.bytedance.sdk.component.jd.jpo;

import a.b;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class qk {

    /* renamed from: cm, reason: collision with root package name */
    private static final char[] f18596cm = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: jd, reason: collision with root package name */
    final String f18597jd;

    /* renamed from: jj, reason: collision with root package name */
    private final String f18598jj;
    final String jpo;
    private final String my;

    /* renamed from: qk, reason: collision with root package name */
    private final List<String> f18599qk;
    final int wqx;
    private final List<String> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final String f18600yd;
    private final String zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo {

        /* renamed from: cm, reason: collision with root package name */
        String f18601cm;

        /* renamed from: jj, reason: collision with root package name */
        final List<String> f18603jj;
        String jpo;

        /* renamed from: qk, reason: collision with root package name */
        List<String> f18604qk;
        String xyk;

        /* renamed from: jd, reason: collision with root package name */
        String f18602jd = "";
        String wqx = "";
        int my = -1;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.bytedance.sdk.component.jd.jpo.qk$jpo$jpo, reason: collision with other inner class name */
        public enum EnumC0082jpo {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public jpo() {
            ArrayList arrayList = new ArrayList();
            this.f18603jj = arrayList;
            arrayList.add("");
        }

        private boolean jj(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean my(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public jpo cm(String str) {
            this.f18604qk = str != null ? qk.jd(qk.jpo(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public jpo jd(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strMy = my(str, 0, str.length());
            if (strMy == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.f18601cm = strMy;
            return this;
        }

        public jpo jpo(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.jpo = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.jpo = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.jpo);
            sb2.append("://");
            if (!this.f18602jd.isEmpty() || !this.wqx.isEmpty()) {
                sb2.append(this.f18602jd);
                if (!this.wqx.isEmpty()) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(this.wqx);
                }
                sb2.append('@');
            }
            if (this.f18601cm.indexOf(58) != -1) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(this.f18601cm);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb2.append(this.f18601cm);
            }
            int iJpo = jpo();
            if (iJpo != qk.jpo(this.jpo)) {
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(iJpo);
            }
            qk.jpo(sb2, this.f18603jj);
            if (this.f18604qk != null) {
                sb2.append('?');
                qk.jd(sb2, this.f18604qk);
            }
            if (this.xyk != null) {
                sb2.append('#');
                sb2.append(this.xyk);
            }
            return sb2.toString();
        }

        public jpo wqx(String str) {
            if (str != null) {
                return jpo(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        private static String my(String str, int i10, int i11) {
            return com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(qk.jpo(str, i10, i11, false));
        }

        private static int cm(String str, int i10, int i11) {
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

        private void wqx() {
            if (this.f18603jj.remove(r0.size() - 1).isEmpty() && !this.f18603jj.isEmpty()) {
                this.f18603jj.set(r0.size() - 1, "");
            } else {
                this.f18603jj.add("");
            }
        }

        private static int jj(String str, int i10, int i11) throws NumberFormatException {
            int i12;
            try {
                i12 = Integer.parseInt(qk.jpo(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        public qk jd() {
            if (this.jpo != null) {
                if (this.f18601cm != null) {
                    return new qk(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int wqx(String str, int i10, int i11) {
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

        public int jpo() {
            int i10 = this.my;
            return i10 != -1 ? i10 : qk.jpo(this.jpo);
        }

        private jpo jpo(String str, boolean z10) {
            boolean z11;
            jpo jpoVar;
            String str2;
            boolean z12;
            int i10 = 0;
            while (true) {
                int iJpo = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str, i10, str.length(), "/\\");
                if (iJpo < str.length()) {
                    z11 = true;
                    str2 = str;
                    z12 = z10;
                    jpoVar = this;
                } else {
                    z11 = false;
                    jpoVar = this;
                    str2 = str;
                    z12 = z10;
                }
                jpoVar.jpo(str2, i10, iJpo, z11, z12);
                i10 = iJpo + 1;
                if (i10 > str2.length()) {
                    return jpoVar;
                }
                str = str2;
                z10 = z12;
            }
        }

        private static int jd(String str, int i10, int i11) {
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

        public jpo jpo(String str, String str2) {
            if (str != null) {
                if (this.f18604qk == null) {
                    this.f18604qk = new ArrayList();
                }
                this.f18604qk.add(qk.jpo(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
                this.f18604qk.add(str2 != null ? qk.jpo(str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0082jpo jpo(qk qkVar, String str) throws NumberFormatException {
            int iJpo;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iJpo2 = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str4, 0, str4.length());
            int iJd = com.bytedance.sdk.component.jd.jpo.jd.zz.jd(str4, iJpo2, str4.length());
            if (jd(str4, iJpo2, iJd) != -1) {
                if (str4.regionMatches(true, iJpo2, "https:", 0, 6)) {
                    this.jpo = HttpRequest.DEFAULT_SCHEME;
                    iJpo2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iJpo2, "http:", 0, 5)) {
                        this.jpo = "http";
                        iJpo2 += 5;
                    } else {
                        return EnumC0082jpo.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (qkVar != null) {
                this.jpo = qkVar.jpo;
            } else {
                return EnumC0082jpo.MISSING_SCHEME;
            }
            int iWqx = wqx(str4, iJpo2, iJd);
            char c10 = '#';
            if (iWqx < 2 && qkVar != null && qkVar.jpo.equals(this.jpo)) {
                this.f18602jd = qkVar.jd();
                this.wqx = qkVar.wqx();
                this.f18601cm = qkVar.f18597jd;
                this.my = qkVar.wqx;
                this.f18603jj.clear();
                this.f18603jj.addAll(qkVar.cm());
                if (iJpo2 == iJd || str4.charAt(iJpo2) == '#') {
                    cm(qkVar.my());
                }
                str2 = str4;
            } else {
                int i11 = iJpo2 + iWqx;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iJpo = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str4, i11, iJd, "@/\\?#");
                    char cCharAt = iJpo != iJd ? str4.charAt(iJpo) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c10 || cCharAt == '/' || cCharAt == '\\' || cCharAt == '?') {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z10) {
                            int iJpo3 = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str4, i11, iJpo, AbstractJsonLexerKt.COLON);
                            String strJpo = qk.jpo(str, i11, iJpo3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strJpo = b.o(new StringBuilder(), this.f18602jd, "%40", strJpo);
                            }
                            this.f18602jd = strJpo;
                            if (iJpo3 != iJpo) {
                                i10 = iJpo;
                                this.wqx = qk.jpo(str, iJpo3 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iJpo;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iJpo;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.wqx);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(qk.jpo(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.wqx = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iCm = cm(str2, i12, iJpo);
                int i13 = iCm + 1;
                if (i13 < iJpo) {
                    this.f18601cm = my(str2, i12, iCm);
                    int iJj = jj(str2, i13, iJpo);
                    this.my = iJj;
                    if (iJj == -1) {
                        return EnumC0082jpo.INVALID_PORT;
                    }
                } else {
                    this.f18601cm = my(str2, i12, iCm);
                    this.my = qk.jpo(this.jpo);
                }
                if (this.f18601cm == null) {
                    return EnumC0082jpo.INVALID_HOST;
                }
                iJpo2 = iJpo;
            }
            int iJpo4 = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str2, iJpo2, iJd, "?#");
            jpo(str2, iJpo2, iJpo4);
            if (iJpo4 < iJd && str2.charAt(iJpo4) == '?') {
                int iJpo5 = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str2, iJpo4, iJd, '#');
                this.f18604qk = qk.jd(qk.jpo(str2, iJpo4 + 1, iJpo5, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iJpo4 = iJpo5;
            }
            if (iJpo4 < iJd && str2.charAt(iJpo4) == '#') {
                this.xyk = qk.jpo(str2, iJpo4 + 1, iJd, "", true, false, false, false, null);
            }
            return EnumC0082jpo.SUCCESS;
        }

        private void jpo(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f18603jj;
                list.set(list.size() - 1, "");
            } else {
                this.f18603jj.clear();
                this.f18603jj.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iJpo = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str, i12, i11, "/\\");
                boolean z10 = iJpo < i11;
                String str2 = str;
                jpo(str2, i12, iJpo, z10, true);
                if (z10) {
                    iJpo++;
                }
                i12 = iJpo;
                str = str2;
            }
        }

        private void jpo(String str, int i10, int i11, boolean z10, boolean z11) {
            String strJpo = qk.jpo(str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, true, null);
            if (my(strJpo)) {
                return;
            }
            if (jj(strJpo)) {
                wqx();
                return;
            }
            if (((String) o2.g(1, this.f18603jj)).isEmpty()) {
                List<String> list = this.f18603jj;
                list.set(list.size() - 1, strJpo);
            } else {
                this.f18603jj.add(strJpo);
            }
            if (z10) {
                this.f18603jj.add("");
            }
        }
    }

    public qk(jpo jpoVar) {
        this.jpo = jpoVar.jpo;
        this.my = jpo(jpoVar.f18602jd, false);
        this.f18598jj = jpo(jpoVar.wqx, false);
        this.f18597jd = jpoVar.f18601cm;
        this.wqx = jpoVar.jpo();
        this.f18599qk = jpo(jpoVar.f18603jj, false);
        List<String> list = jpoVar.f18604qk;
        this.xyk = list != null ? jpo(list, true) : null;
        String str = jpoVar.xyk;
        this.zz = str != null ? jpo(str, false) : null;
        this.f18600yd = jpoVar.toString();
    }

    public List<String> cm() {
        int iIndexOf = this.f18600yd.indexOf(47, this.jpo.length() + 3);
        String str = this.f18600yd;
        int iJpo = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iJpo) {
            int i10 = iIndexOf + 1;
            int iJpo2 = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(this.f18600yd, i10, iJpo, '/');
            arrayList.add(this.f18600yd.substring(i10, iJpo2));
            iIndexOf = iJpo2;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof qk) && ((qk) obj).f18600yd.equals(this.f18600yd);
    }

    public int hashCode() {
        return this.f18600yd.hashCode();
    }

    public String jd() {
        if (this.my.isEmpty()) {
            return "";
        }
        int length = this.jpo.length() + 3;
        String str = this.f18600yd;
        return this.f18600yd.substring(length, com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str, length, str.length(), ":@"));
    }

    public URL jpo() {
        try {
            return new URL(this.f18600yd);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String my() {
        if (this.xyk == null) {
            return null;
        }
        int iIndexOf = this.f18600yd.indexOf(63) + 1;
        String str = this.f18600yd;
        return this.f18600yd.substring(iIndexOf, com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str, iIndexOf, str.length(), '#'));
    }

    public String toString() {
        return this.f18600yd;
    }

    public String wqx() {
        if (this.f18598jj.isEmpty()) {
            return "";
        }
        return this.f18600yd.substring(this.f18600yd.indexOf(58, this.jpo.length() + 3) + 1, this.f18600yd.indexOf(64));
    }

    public static int jpo(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static void jd(StringBuilder sb2, List<String> list) {
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

    public static void jpo(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static qk wqx(String str) {
        jpo jpoVar = new jpo();
        if (jpoVar.jpo((qk) null, str) == jpo.EnumC0082jpo.SUCCESS) {
            return jpoVar.jd();
        }
        return null;
    }

    public static String jpo(String str, boolean z10) {
        return jpo(str, 0, str.length(), z10);
    }

    private List<String> jpo(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? jpo(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> jd(String str) {
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

    public static String jpo(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.bytedance.sdk.component.jd.jpo.jd.jpo jpoVar = new com.bytedance.sdk.component.jd.jpo.jd.jpo();
                jpoVar.jpo(str, i10, i12);
                jpo(jpoVar, str, i12, i11, z10);
                return jpoVar.wqx();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void jpo(com.bytedance.sdk.component.jd.jpo.jd.jpo r5, java.lang.String r6, int r7, int r8, boolean r9) {
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
            int r2 = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.jd(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.jd(r1)
            goto L3c
        L39:
            r5.jpo(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.jd.jpo.qk.jpo(com.bytedance.sdk.component.jd.jpo.jd.jpo, java.lang.String, int, int, boolean):void");
    }

    public static boolean jpo(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.jd.jpo.jd.zz.jpo(str.charAt(i12)) != -1;
    }

    public static String jpo(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || jpo(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.jd.jpo.jd.jpo jpoVar = new com.bytedance.sdk.component.jd.jpo.jd.jpo();
                jpoVar.jpo(str, i10, iCharCount);
                jpo(jpoVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return jpoVar.wqx();
            }
        }
        return str.substring(i10, i11);
    }

    public static void jpo(com.bytedance.sdk.component.jd.jpo.jd.jpo jpoVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.jd.jpo.jd.jpo jpoVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    jpoVar.jpo(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || jpo(str, i10, i11)))))) {
                    jpoVar.jpo(iCodePointAt);
                } else {
                    if (jpoVar2 == null) {
                        jpoVar2 = new com.bytedance.sdk.component.jd.jpo.jd.jpo();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.jd.jpo.jd.zz.jpo)) {
                        jpoVar2.jpo(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        jpoVar2.jpo(iCodePointAt);
                    }
                    while (!jpoVar2.jpo()) {
                        byte bJd = jpoVar2.jd();
                        int i12 = bJd & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        jpoVar.jd(37);
                        char[] cArr = f18596cm;
                        jpoVar.jd((int) cArr[(i12 >> 4) & 15]);
                        jpoVar.jd((int) cArr[bJd & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String jpo(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return jpo(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
