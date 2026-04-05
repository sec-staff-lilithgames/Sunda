package p0;

import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o2 {
    public static void A(String str, String str2, String str3) {
        io.odeeo.internal.q0.p.w(str3, str + str2);
    }

    public static int B(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) + i12) * i13;
    }

    public static int C(int i10, int i11, String str) {
        return str.length() + i10 + i11;
    }

    public static /* synthetic */ String D(int i10) {
        switch (i10) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return AbstractJsonLexerKt.NULL;
        }
    }

    public static long a(int i10, long j10, long j11) {
        if (i10 == 1) {
            return (j10 * j10) % j11;
        }
        long j12 = j10 >>> 32;
        long j13 = j10 & 4294967295L;
        long jB = b(j12 * j12, j11);
        long jRemainder = j12 * j13 * 2;
        if (jRemainder < 0) {
            jRemainder = rh.j0.remainder(jRemainder, j11);
        }
        long jB2 = b(jB + jRemainder, j11);
        long jRemainder2 = rh.j0.remainder(j13 * j13, j11);
        long j14 = jB2 + jRemainder2;
        return jB2 >= j11 - jRemainder2 ? j14 - j11 : j14;
    }

    public static long b(long j10, long j11) {
        int i10 = 32;
        do {
            int iMin = Math.min(i10, Long.numberOfLeadingZeros(j10));
            j10 = rh.j0.remainder(j10 << iMin, j11);
            i10 -= iMin;
        } while (i10 > 0);
        return j10;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return i10 + i11 + i12 + i13;
    }

    public static int d(int i10, int i11, long j10) {
        return (Long.hashCode(j10) + i10) * i11;
    }

    public static int e(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static int f(Map map, int i10, int i11) {
        return (map.hashCode() + i10) * i11;
    }

    public static Object g(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static Object h(CharSequence charSequence, int i10, kv.l lVar) {
        return lVar.invoke(Character.valueOf(charSequence.charAt(i10)));
    }

    public static String i(int i10, int i11, String str, String str2, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static String j(int i10, String str) {
        return i10 + str;
    }

    public static String k(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String l(int i10, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String m(long j10, String str) {
        return str + j10;
    }

    public static String n(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String o(Object obj, String str) {
        return (str + obj).toString();
    }

    public static String p(String str, Uri uri) {
        return str + uri;
    }

    public static String q(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String s(pw.n0 n0Var, String str) {
        return str + n0Var;
    }

    public static StringBuilder t(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder u(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static ArrayList v(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static Iterator w(rv.t tVar, String str, kv.l lVar, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, str);
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, str2);
        return tVar.iterator();
    }

    public static tu.k x(int i10, String str) {
        x5.a.throwSQLiteException(i10, str);
        return new tu.k();
    }

    public static tu.k y(String str) {
        v5.c.keyOrValueNotFoundError(str);
        return new tu.k();
    }

    public static void z(int i10, String str, String str2) {
        Log.d(str2, str + i10);
    }
}
