package sv;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f86133a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f86134b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f86135c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f86136d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f86137e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile Charset f86138f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile Charset f86139g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Charset f86140h;

    static {
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f86134b = charsetForName;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Charset.forName(C.UTF16_NAME), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        f86135c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(charsetForName3, "forName(...)");
        f86136d = charsetForName3;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Charset.forName(C.ASCII_NAME), "forName(...)");
        Charset charsetForName4 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(charsetForName4, "forName(...)");
        f86137e = charsetForName4;
    }

    public final Charset UTF32() {
        Charset charset = f86138f;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f86138f = charsetForName;
        return charsetForName;
    }

    public final Charset UTF32_BE() {
        Charset charset = f86140h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f86140h = charsetForName;
        return charsetForName;
    }

    public final Charset UTF32_LE() {
        Charset charset = f86139g;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f86139g = charsetForName;
        return charsetForName;
    }
}
