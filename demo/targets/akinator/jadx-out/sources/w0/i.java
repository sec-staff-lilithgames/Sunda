package w0;

import java.util.UUID;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static String a(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String b(int i10, StringBuilder sb2) {
        sb2.append(Integer.toHexString(i10));
        return sb2.toString();
    }

    public static String c(String str) {
        String string = UUID.randomUUID().toString();
        e0.checkNotNullExpressionValue(string, str);
        return string;
    }

    public static String d(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String e(StringBuilder sb2, Object obj, String str) {
        sb2.append(obj);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder f(int i10, int i11, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder g(CharSequence charSequence, String str, kv.l lVar, String str2, CharSequence charSequence2) {
        e0.checkNotNullParameter(charSequence, str);
        e0.checkNotNullParameter(lVar, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        return sb2;
    }

    public static void h(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static /* synthetic */ String i(int i10) {
        return i10 != 1 ? i10 != 2 ? AbstractJsonLexerKt.NULL : "PLAINTEXT" : "TLS";
    }
}
