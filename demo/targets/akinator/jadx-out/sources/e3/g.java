package e3;

import a2.w3;
import a2.z4;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.explorestack.protobuf.StringValue;
import com.google.android.exoplayer2.util.f0;
import io.bidmachine.media3.common.util.b0;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.utils.io.charsets.UTFKt;
import io.ktor.utils.io.core.StringsKt;
import io.ktor.utils.io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static void A(String str, String str2, String str3) {
        b0.w(str3, str + str2);
    }

    public static int B(int i10, int i11, int i12, int i13) {
        return i13 - ((i10 + i11) * i12);
    }

    public static /* synthetic */ int a(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static /* synthetic */ boolean b(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) * f13;
    }

    public static int d(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) + i12) / i13;
    }

    public static long f(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        byteBuffer.position(byteBuffer.position() - i10);
        return UTFKt.decodeUtf8Result(i11 - i12, i13);
    }

    public static z4 g(float f10, z4 z4Var, String str, w3 w3Var) {
        z4Var.set(str, s2.i.m6815boximpl(f10));
        return w3Var.getProperties();
    }

    public static StringValue h(StringValue stringValue, StringValue stringValue2) {
        return StringValue.newBuilder(stringValue).mergeFrom(stringValue2).buildPartial();
    }

    public static HttpRequestBuilder i(String str, kv.l lVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        lVar.invoke(httpRequestBuilder);
        return httpRequestBuilder;
    }

    public static HttpRequestBuilder j(kv.l lVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        lVar.invoke(httpRequestBuilder);
        return httpRequestBuilder;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, long j10, char c10) {
        sb2.append(j10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder o(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static ArrayList p(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static tu.k q(int i10) {
        StringsKt.prematureEndOfStream(i10);
        return new tu.k();
    }

    public static tu.k r(long j10, String str) {
        NumbersKt.failLongToIntConversion(j10, str);
        return new tu.k();
    }

    public static void s(int i10, SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13) {
        spannableStringBuilder.setSpan(new StyleSpan(i10), i11, i12, i13);
    }

    public static void t(int i10, String str, String str2) {
        b0.w(str2, str + i10);
    }

    public static void u(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, i12);
    }

    public static void v(HttpRequestBuilder httpRequestBuilder, Url url, kv.l lVar, HttpRequestBuilder httpRequestBuilder2) {
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        lVar.invoke(httpRequestBuilder2);
    }

    public static void w(String str, String str2, String str3) {
        f0.w(str3, str + str2);
    }

    public static int x(int i10, int i11, int i12, int i13) {
        return ((i10 + i11) - i12) % i13;
    }

    public static long y(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        byteBuffer.position(i10 - byteBuffer.arrayOffset());
        return UTFKt.decodeUtf8Result(i11 - i12, i13);
    }

    public static void z(int i10, String str, String str2) {
        io.odeeo.internal.q0.p.w(str2, str + i10);
    }
}
