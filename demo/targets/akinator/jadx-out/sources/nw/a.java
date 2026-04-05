package nw;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import pw.g;
import sv.n0;
import yv.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f77218a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final String canonicalize(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(encodeSet, "encodeSet");
        return canonicalizeWithCharset$default(str, i10, i11, encodeSet, z10, z11, z12, z13, null, 128, null);
    }

    public static /* synthetic */ String canonicalize$default(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        return canonicalize(str, i10, i11, str2, z10, z11, z12, z13);
    }

    public static final String canonicalizeWithCharset(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(encodeSet, "encodeSet");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || n0.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z10 || (z11 && !isPercentEncoded(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                g gVar = new g();
                gVar.writeUtf8(str, i10, iCharCount);
                writeCanonicalized(gVar, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return gVar.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, i11);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String canonicalizeWithCharset$default(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        if ((i12 & 128) != 0) {
            charset = null;
        }
        return canonicalizeWithCharset(str, i10, i11, str2, z10, z11, z12, z13, charset);
    }

    public static final char[] getHEX_DIGITS() {
        return f77218a;
    }

    public static final boolean isPercentEncoded(String str, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && h.parseHexDigit(str.charAt(i10 + 1)) != -1 && h.parseHexDigit(str.charAt(i12)) != -1;
    }

    public static final String percentDecode(String str, int i10, int i11, boolean z10) {
        e0.checkNotNullParameter(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                g gVar = new g();
                gVar.writeUtf8(str, i10, i12);
                writePercentDecoded(gVar, str, i12, i11, z10);
                return gVar.readUtf8();
            }
        }
        String strSubstring = str.substring(i10, i11);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String percentDecode$default(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return percentDecode(str, i10, i11, z10);
    }

    public static final void writeCanonicalized(g gVar, String input, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(encodeSet, "encodeSet");
        g gVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = input.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    gVar.writeUtf8("+");
                } else if (iCodePointAt == 43 && z12) {
                    gVar.writeUtf8(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || n0.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null) || (iCodePointAt == 37 && (!z10 || (z11 && !isPercentEncoded(input, i10, i11)))))) {
                    if (gVar2 == null) {
                        gVar2 = new g();
                    }
                    if (charset == null || e0.areEqual(charset, sv.g.f86134b)) {
                        gVar2.writeUtf8CodePoint(iCodePointAt);
                    } else {
                        gVar2.writeString(input, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!gVar2.exhausted()) {
                        byte b10 = gVar2.readByte();
                        int i12 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        gVar.writeByte(37);
                        char[] cArr = f77218a;
                        gVar.writeByte((int) cArr[(i12 >> 4) & 15]);
                        gVar.writeByte((int) cArr[b10 & 15]);
                    }
                } else {
                    gVar.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static final void writePercentDecoded(g gVar, String encoded, int i10, int i11, boolean z10) {
        int i12;
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(encoded, "encoded");
        while (i10 < i11) {
            int iCodePointAt = encoded.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int hexDigit = h.parseHexDigit(encoded.charAt(i10 + 1));
                int hexDigit2 = h.parseHexDigit(encoded.charAt(i12));
                if (hexDigit == -1 || hexDigit2 == -1) {
                    gVar.writeUtf8CodePoint(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                } else {
                    gVar.writeByte((hexDigit << 4) + hexDigit2);
                    i10 = Character.charCount(iCodePointAt) + i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                gVar.writeByte(32);
                i10++;
            } else {
                gVar.writeUtf8CodePoint(iCodePointAt);
                i10 += Character.charCount(iCodePointAt);
            }
        }
    }
}
