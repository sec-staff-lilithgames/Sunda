package cc;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f12051a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f12052b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f12053c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f12054d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f12055e;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f12056f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f12057g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f12058h;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f12059i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f12060j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f12061k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f12062l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f12063m;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f12051a = charArray;
        f12052b = "0123456789abcdef".toCharArray();
        int length = charArray.length;
        f12053c = new byte[length];
        f12054d = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            f12053c[i10] = (byte) f12051a[i10];
            f12054d[i10] = (byte) f12052b[i10];
        }
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i11 = 0; i11 < 32; i11++) {
            iArr[i11] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f12055e = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i12 = 128; i12 < 256; i12++) {
            iArr2[i12] = (i12 & 224) == 192 ? 2 : (i12 & PsExtractor.VIDEO_STREAM_MASK) == 224 ? 3 : (i12 & 248) == 240 ? 4 : -1;
        }
        f12056f = iArr2;
        int[] iArr3 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        Arrays.fill(iArr3, -1);
        for (int i13 = 33; i13 < 256; i13++) {
            if (Character.isJavaIdentifierPart((char) i13)) {
                iArr3[i13] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f12057g = iArr3;
        int[] iArr4 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        System.arraycopy(iArr3, 0, iArr4, 0, NotificationCompat.FLAG_LOCAL_ONLY);
        Arrays.fill(iArr4, 128, 128, 0);
        f12058h = iArr4;
        int[] iArr5 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        int[] iArr6 = f12056f;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f12059i = iArr5;
        int[] iArr7 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f12060j = iArr7;
        int[] iArr8 = new int[128];
        for (int i14 = 0; i14 < 32; i14++) {
            iArr8[i14] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f12061k = iArr8;
        int[] iArrCopyOf = Arrays.copyOf(iArr8, iArr8.length);
        f12062l = iArrCopyOf;
        iArrCopyOf[47] = 47;
        int[] iArr9 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        f12063m = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i15 = 0; i15 < 10; i15++) {
            f12063m[i15 + 48] = i15;
        }
        for (int i16 = 0; i16 < 6; i16++) {
            int[] iArr10 = f12063m;
            int i17 = i16 + 10;
            iArr10[i16 + 97] = i17;
            iArr10[i16 + 65] = i17;
        }
    }

    public static void appendQuoted(StringBuilder sb2, String str) {
        int[] iArr = f12061k;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb2.append(cCharAt);
            } else {
                sb2.append(AbstractJsonLexerKt.STRING_ESC);
                int i11 = iArr[cCharAt];
                if (i11 < 0) {
                    sb2.append(AbstractJsonLexerKt.UNICODE_ESC);
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = f12051a;
                    sb2.append(cArr[cCharAt >> 4]);
                    sb2.append(cArr[cCharAt & 15]);
                } else {
                    sb2.append((char) i11);
                }
            }
        }
    }

    public static int charToHex(int i10) {
        return f12063m[i10 & 255];
    }

    @Deprecated
    public static byte[] copyHexBytes() {
        return copyHexBytes(true);
    }

    @Deprecated
    public static char[] copyHexChars() {
        return copyHexChars(true);
    }

    public static int[] get7BitOutputEscapes() {
        return f12061k;
    }

    public static int[] getInputCodeComment() {
        return f12059i;
    }

    public static int[] getInputCodeLatin1() {
        return f12055e;
    }

    public static int[] getInputCodeLatin1JsNames() {
        return f12057g;
    }

    public static int[] getInputCodeUtf8() {
        return f12056f;
    }

    public static int[] getInputCodeUtf8JsNames() {
        return f12058h;
    }

    public static int[] getInputCodeWS() {
        return f12060j;
    }

    public static char hexToChar(int i10) {
        return f12051a[i10];
    }

    public static byte[] copyHexBytes(boolean z10) {
        return (byte[]) (z10 ? f12053c.clone() : f12054d.clone());
    }

    public static char[] copyHexChars(boolean z10) {
        return (char[]) (z10 ? f12051a.clone() : f12052b.clone());
    }

    public static int[] get7BitOutputEscapes(int i10) {
        return i10 == 34 ? f12061k : c.f12048c.escapesFor(i10);
    }

    public static int[] get7BitOutputEscapes(int i10, boolean z10) {
        if (i10 != 34) {
            return c.f12048c.escapesFor(i10, z10);
        }
        if (z10) {
            return f12062l;
        }
        return f12061k;
    }
}
