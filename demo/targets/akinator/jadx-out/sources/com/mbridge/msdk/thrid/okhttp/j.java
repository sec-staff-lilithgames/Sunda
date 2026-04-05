package com.mbridge.msdk.thrid.okhttp;

import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import io.ktor.client.utils.CacheControl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f43645j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f43646k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f43647l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f43648m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    private final String f43649a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43650b;

    /* renamed from: c, reason: collision with root package name */
    private final long f43651c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43652d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43653e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f43654f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f43655g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f43656h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f43657i;

    private j(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f43649a = str;
        this.f43650b = str2;
        this.f43651c = j10;
        this.f43652d = str3;
        this.f43653e = str4;
        this.f43654f = z10;
        this.f43655g = z11;
        this.f43657i = z12;
        this.f43656h = z13;
    }

    public String a() {
        return this.f43649a;
    }

    public String b() {
        return this.f43650b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f43649a.equals(this.f43649a) && jVar.f43650b.equals(this.f43650b) && jVar.f43652d.equals(this.f43652d) && jVar.f43653e.equals(this.f43653e) && jVar.f43651c == this.f43651c && jVar.f43654f == this.f43654f && jVar.f43655g == this.f43655g && jVar.f43656h == this.f43656h && jVar.f43657i == this.f43657i;
    }

    public int hashCode() {
        int iE = o2.e(o2.e(o2.e(o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f43649a), 31, this.f43650b), 31, this.f43652d), 31, this.f43653e);
        long j10 = this.f43651c;
        return ((((((((iE + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f43654f ? 1 : 0)) * 31) + (!this.f43655g ? 1 : 0)) * 31) + (!this.f43656h ? 1 : 0)) * 31) + (!this.f43657i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.mbridge.msdk.thrid.okhttp.internal.c.d(str);
    }

    private static long b(String str) throws NumberFormatException {
        try {
            long j10 = Long.parseLong(str);
            if (j10 <= 0) {
                return Long.MIN_VALUE;
            }
            return j10;
        } catch (NumberFormatException e10) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    public static j a(q qVar, String str) {
        return a(System.currentTimeMillis(), qVar, str);
    }

    public static j a(long j10, q qVar, String str) throws NumberFormatException {
        long j11;
        String str2;
        String str3;
        int length = str.length();
        char c10 = ';';
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, length, ';');
        int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, iA, G5.T);
        String strA = null;
        if (iA2 == iA) {
            return null;
        }
        String strD = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, 0, iA2);
        if (strD.isEmpty() || com.mbridge.msdk.thrid.okhttp.internal.c.c(strD) != -1) {
            return null;
        }
        String strD2 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA2 + 1, iA);
        if (com.mbridge.msdk.thrid.okhttp.internal.c.c(strD2) != -1) {
            return null;
        }
        int i10 = iA + 1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        long jA = 253402300799999L;
        long jB = -1;
        String strSubstring = null;
        while (i10 < length) {
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i10, length, c10);
            int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i10, iA3, G5.T);
            String strD3 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, i10, iA4);
            String strD4 = iA4 < iA3 ? com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA4 + 1, iA3) : "";
            if (strD3.equalsIgnoreCase("expires")) {
                try {
                    jA = a(strD4, 0, strD4.length());
                    z10 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strD3.equalsIgnoreCase(CacheControl.MAX_AGE)) {
                jB = b(strD4);
                z10 = true;
            } else if (strD3.equalsIgnoreCase(C3191e4.i.D)) {
                strA = a(strD4);
                z13 = false;
            } else if (strD3.equalsIgnoreCase("path")) {
                strSubstring = strD4;
            } else if (strD3.equalsIgnoreCase("secure")) {
                z11 = true;
            } else if (strD3.equalsIgnoreCase("httponly")) {
                z12 = true;
            }
            i10 = iA3 + 1;
            c10 = ';';
        }
        if (jB == Long.MIN_VALUE) {
            j11 = Long.MIN_VALUE;
        } else if (jB != -1) {
            long j12 = j10 + (jB <= 9223372036854775L ? jB * 1000 : Long.MAX_VALUE);
            j11 = (j12 < j10 || j12 > DatesKt.MAX_DATE) ? 253402300799999L : j12;
        } else {
            j11 = jA;
        }
        String strG = qVar.g();
        if (strA == null) {
            str2 = strG;
        } else {
            if (!a(strG, strA)) {
                return null;
            }
            str2 = strA;
        }
        if (strG.length() != str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
            return null;
        }
        if (strSubstring == null || !strSubstring.startsWith("/")) {
            String strC = qVar.c();
            int iLastIndexOf = strC.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strC.substring(0, iLastIndexOf);
                str3 = strSubstring;
            } else {
                str3 = "/";
            }
        } else {
            str3 = strSubstring;
        }
        return new j(strD, strD2, j11, str2, str3, z11, z12, z13, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(java.lang.String r12, int r13, int r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.j.a(java.lang.String, int, int):long");
    }

    private static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static String a(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String strA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str);
            if (strA != null) {
                return strA;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<j> a(q qVar, p pVar) {
        List<String> listC = pVar.c("Set-Cookie");
        int size = listC.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            j jVarA = a(qVar, listC.get(i10));
            if (jVarA != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVarA);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public String a(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43649a);
        sb2.append(G5.T);
        sb2.append(this.f43650b);
        if (this.f43656h) {
            if (this.f43651c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(com.mbridge.msdk.thrid.okhttp.internal.http.d.a(new Date(this.f43651c)));
            }
        }
        if (!this.f43657i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f43652d);
        }
        sb2.append("; path=");
        sb2.append(this.f43653e);
        if (this.f43654f) {
            sb2.append("; secure");
        }
        if (this.f43655g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}
