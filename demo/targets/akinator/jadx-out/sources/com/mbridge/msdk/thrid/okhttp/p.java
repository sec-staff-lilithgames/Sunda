package com.mbridge.msdk.thrid.okhttp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f43673a;

    public p(a aVar) {
        List<String> list = aVar.f43674a;
        this.f43673a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(int i10) {
        return this.f43673a[i10 * 2];
    }

    public String b(String str) {
        return a(this.f43673a, str);
    }

    public List<String> c(String str) {
        int iB = b();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < iB; i10++) {
            if (str.equalsIgnoreCase(a(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i10));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && Arrays.equals(((p) obj).f43673a, this.f43673a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f43673a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iB = b();
        for (int i10 = 0; i10 < iB; i10++) {
            sb2.append(a(i10));
            sb2.append(": ");
            sb2.append(b(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List<String> f43674a = new ArrayList(20);

        public a a(String str) {
            int iIndexOf = str.indexOf(":", 1);
            return iIndexOf != -1 ? b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : str.startsWith(":") ? b("", str.substring(1)) : b("", str);
        }

        public a b(String str, String str2) {
            this.f43674a.add(str);
            this.f43674a.add(str2.trim());
            return this;
        }

        public a c(String str, String str2) {
            p.a(str);
            p.a(str2, str);
            b(str);
            b(str, str2);
            return this;
        }

        public a b(String str) {
            int i10 = 0;
            while (i10 < this.f43674a.size()) {
                if (str.equalsIgnoreCase(this.f43674a.get(i10))) {
                    this.f43674a.remove(i10);
                    this.f43674a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public a a(String str, String str2) {
            p.a(str);
            p.a(str2, str);
            return b(str, str2);
        }

        public p a() {
            return new p(this);
        }
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.f43674a, this.f43673a);
        return aVar;
    }

    public int b() {
        return this.f43673a.length / 2;
    }

    public String b(int i10) {
        return this.f43673a[(i10 * 2) + 1];
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static void a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    public static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(a.b.l("value for name ", str2, " == null"));
    }
}
