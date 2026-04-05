package sv;

import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import p0.o2;
import sv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f86151a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f86152b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f86153c;

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f86154d;

    static {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f86151a = iArr;
        int[] iArr2 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f86152b = iArr2;
        int[] iArr3 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f86153c = iArr3;
        long[] jArr = new long[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f86154d = jArr;
    }

    public static final long a(int i10, int i11, long j10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i10;
        return ((j11 - 1) * i11) + (j10 * j11);
    }

    public static final int b(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) tu.o0.m7085toStringimpl(tu.o0.m7081constructorimpl(j10))));
    }

    public static final void c(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            k(i10, i11, 1, str, "at least");
            throw null;
        }
        if (i13 > i12) {
            int i14 = (i13 + i10) - i12;
            while (i10 < i14) {
                if (str.charAt(i10) != '0') {
                    StringBuilder sbT = o2.t(i10, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbT.append(str.charAt(i10));
                    sbT.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbT.toString());
                }
                i10++;
            }
        }
    }

    public static final void d(String str, String str2, String str3, boolean z10, int i10, int i11, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            kotlin.jvm.internal.e0.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            StringBuilder sbB = b3.h.b("Expected a hexadecimal number with prefix \"", str2, "\" and suffix \"", str3, "\", but was ");
            sbB.append(strSubstring);
            throw new NumberFormatException(sbB.toString());
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!f.equals(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    l(i10, i11, str, str2, "prefix");
                    throw null;
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!f.equals(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    l(length2, i11, str, str3, "suffix");
                    throw null;
                }
            }
        }
        c(str, i10, length2, i12);
    }

    public static final int e(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    public static final int f(String str, int i10, int i11, l lVar, int i12) {
        uu.g.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        l.c number = lVar.getNumber();
        if (number.isDigitsOnly$kotlin_stdlib()) {
            c(str, i10, i11, i12);
            return h(i10, i11, str);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        d(str, prefix, suffix, number.getIgnoreCase$kotlin_stdlib(), i10, i11, i12);
        return h(prefix.length() + i10, i11 - suffix.length(), str);
    }

    public static final int formattedStringLength(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        return b(((i15 + 2 + i16) * i10) + (((i17 - i18) - i21) * i14) + (i21 * i13) + i18);
    }

    public static final byte g(int i10, String str) {
        int[] iArr;
        int i11;
        int i12;
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') != 0 || (i11 = (iArr = f86153c)[cCharAt]) < 0) {
            j(i10, str);
            throw null;
        }
        int i13 = i10 + 1;
        char cCharAt2 = str.charAt(i13);
        if ((cCharAt2 >>> '\b') == 0 && (i12 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i11 << 4) | i12);
        }
        j(i13, str);
        throw null;
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return f86151a;
    }

    public static final int h(int i10, int i11, String str) {
        int i12;
        int i13 = 0;
        while (i10 < i11) {
            int i14 = i13 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') != 0 || (i12 = f86153c[cCharAt]) < 0) {
                j(i10, str);
                throw null;
            }
            i13 = i14 | i12;
            i10++;
        }
        return i13;
    }

    public static final byte hexToByte(String str, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        return (byte) f(str, 0, str.length(), format, 2);
    }

    public static /* synthetic */ byte hexToByte$default(String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return hexToByte(str, lVar);
    }

    public static final byte[] hexToByteArray(String str, l format) throws Throwable {
        l.a aVar;
        int i10;
        Throwable th2;
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        int length;
        byte[] bArr;
        l.a aVar2;
        int i15;
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        int length2 = str.length();
        int i16 = 0;
        uu.g.Companion.checkBoundsIndexes$kotlin_stdlib(0, length2, str.length());
        if (length2 == 0) {
            return new byte[0];
        }
        l.a bytes = format.getBytes();
        int i17 = 2;
        boolean z11 = true;
        if (bytes.getNoLineAndGroupSeparator$kotlin_stdlib()) {
            if (bytes.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib()) {
                int length3 = bytes.getByteSeparator().length();
                if (length3 > 1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (length3 == 0) {
                    if ((length2 & 1) == 0) {
                        int i18 = length2 >> 1;
                        bArr = new byte[i18];
                        int i19 = 0;
                        for (int i20 = 0; i20 < i18; i20++) {
                            bArr[i20] = g(i19, str);
                            i19 += 2;
                        }
                        aVar = bytes;
                        i10 = i17;
                    }
                    aVar = bytes;
                    i10 = 2;
                    bArr = null;
                } else {
                    if (length2 % 3 == 2) {
                        int i21 = (length2 / 3) + 1;
                        bArr = new byte[i21];
                        char cCharAt = bytes.getByteSeparator().charAt(0);
                        bArr[0] = g(0, str);
                        int i22 = 2;
                        int i23 = 1;
                        while (i23 < i21) {
                            if (str.charAt(i22) != cCharAt) {
                                String byteSeparator = bytes.getByteSeparator();
                                z10 = z11;
                                boolean ignoreCase$kotlin_stdlib = bytes.getIgnoreCase$kotlin_stdlib();
                                if (byteSeparator.length() == 0) {
                                    aVar2 = bytes;
                                    i15 = i17;
                                } else {
                                    int length4 = byteSeparator.length();
                                    i15 = i17;
                                    int i24 = i16;
                                    while (i24 < length4) {
                                        l.a aVar3 = bytes;
                                        if (!f.equals(byteSeparator.charAt(i24), str.charAt(i22 + i24), ignoreCase$kotlin_stdlib)) {
                                            l(i22, length2, str, byteSeparator, "byte separator");
                                            throw null;
                                        }
                                        i24++;
                                        bytes = aVar3;
                                    }
                                    aVar2 = bytes;
                                    bArr[i23] = g(i22 + 1, str);
                                    i22 += 3;
                                    i23++;
                                    z11 = z10;
                                    i17 = i15;
                                    bytes = aVar2;
                                    i16 = 0;
                                }
                            } else {
                                aVar2 = bytes;
                                i15 = i17;
                                z10 = z11;
                            }
                            bArr[i23] = g(i22 + 1, str);
                            i22 += 3;
                            i23++;
                            z11 = z10;
                            i17 = i15;
                            bytes = aVar2;
                            i16 = 0;
                        }
                        aVar = bytes;
                        i10 = i17;
                    }
                    aVar = bytes;
                    i10 = 2;
                    bArr = null;
                }
                th2 = null;
            } else {
                aVar = bytes;
                i10 = 2;
                th2 = null;
                String bytePrefix = aVar.getBytePrefix();
                String byteSuffix = aVar.getByteSuffix();
                String byteSeparator2 = aVar.getByteSeparator();
                long length5 = byteSeparator2.length();
                long length6 = bytePrefix.length() + 2 + byteSuffix.length() + length5;
                long j10 = length2;
                int i25 = (int) ((j10 + length5) / length6);
                if ((i25 * length6) - length5 != j10) {
                    bArr = null;
                } else {
                    boolean ignoreCase$kotlin_stdlib2 = aVar.getIgnoreCase$kotlin_stdlib();
                    byte[] bArr2 = new byte[i25];
                    if (bytePrefix.length() == 0) {
                        length = 0;
                        i14 = 0;
                    } else {
                        int length7 = bytePrefix.length();
                        for (int i26 = 0; i26 < length7; i26++) {
                            if (!f.equals(bytePrefix.charAt(i26), str.charAt(i26), ignoreCase$kotlin_stdlib2)) {
                                l(0, length2, str, bytePrefix, "byte prefix");
                                throw null;
                            }
                        }
                        i14 = 0;
                        length = bytePrefix.length();
                    }
                    String strD = w0.i.d(byteSuffix, byteSeparator2, bytePrefix);
                    int i27 = i25 - 1;
                    int i28 = i14;
                    while (i28 < i27) {
                        bArr2[i28] = g(length, str);
                        length += 2;
                        if (strD.length() != 0) {
                            int length8 = strD.length();
                            for (int i29 = i14; i29 < length8; i29++) {
                                if (!f.equals(strD.charAt(i29), str.charAt(length + i29), ignoreCase$kotlin_stdlib2)) {
                                    l(length, length2, str, strD, "byte suffix + byte separator + byte prefix");
                                    throw null;
                                }
                            }
                            length = strD.length() + length;
                        }
                        i28++;
                        i14 = 0;
                    }
                    bArr2[i27] = g(length, str);
                    int i30 = length + 2;
                    if (byteSuffix.length() != 0) {
                        int length9 = byteSuffix.length();
                        for (int i31 = 0; i31 < length9; i31++) {
                            if (!f.equals(byteSuffix.charAt(i31), str.charAt(i30 + i31), ignoreCase$kotlin_stdlib2)) {
                                l(i30, length2, str, byteSuffix, "byte suffix");
                                throw null;
                            }
                        }
                    }
                    bArr = bArr2;
                }
            }
            if (bArr != null) {
                return bArr;
            }
        } else {
            aVar = bytes;
            i10 = 2;
            th2 = null;
        }
        int bytesPerLine = aVar.getBytesPerLine();
        int bytesPerGroup = aVar.getBytesPerGroup();
        String bytePrefix2 = aVar.getBytePrefix();
        String byteSuffix2 = aVar.getByteSuffix();
        String byteSeparator3 = aVar.getByteSeparator();
        String groupSeparator = aVar.getGroupSeparator();
        boolean ignoreCase$kotlin_stdlib3 = aVar.getIgnoreCase$kotlin_stdlib();
        int i32 = parsedByteArrayMaxSize(length2, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator3.length(), bytePrefix2.length(), byteSuffix2.length());
        byte[] bArr3 = new byte[i32];
        int i33 = 0;
        int i34 = 0;
        int length10 = 0;
        int i35 = 0;
        while (length10 < length2) {
            if (i34 == bytesPerLine) {
                i11 = bytesPerLine;
                if (str.charAt(length10) == '\r') {
                    int i36 = length10 + 1;
                    length10 = (i36 >= length2 || str.charAt(i36) != '\n') ? i36 : length10 + 2;
                } else {
                    if (str.charAt(length10) != '\n') {
                        StringBuilder sbT = o2.t(length10, "Expected a new line at index ", ", but was ");
                        sbT.append(str.charAt(length10));
                        throw new NumberFormatException(sbT.toString());
                    }
                    length10++;
                }
                i12 = bytesPerGroup;
                i33 = 0;
                i34 = 0;
            } else {
                i11 = bytesPerLine;
                if (i33 == bytesPerGroup) {
                    if (groupSeparator.length() == 0) {
                        i12 = bytesPerGroup;
                    } else {
                        int length11 = groupSeparator.length();
                        int i37 = 0;
                        while (i37 < length11) {
                            int i38 = length11;
                            int i39 = bytesPerGroup;
                            if (!f.equals(groupSeparator.charAt(i37), str.charAt(length10 + i37), ignoreCase$kotlin_stdlib3)) {
                                l(length10, length2, str, groupSeparator, "group separator");
                                throw th2;
                            }
                            i37++;
                            length11 = i38;
                            bytesPerGroup = i39;
                        }
                        i12 = bytesPerGroup;
                        length10 += groupSeparator.length();
                    }
                    i33 = 0;
                } else {
                    i12 = bytesPerGroup;
                    if (i33 != 0 && byteSeparator3.length() != 0) {
                        int length12 = byteSeparator3.length();
                        int i40 = 0;
                        while (i40 < length12) {
                            int i41 = length12;
                            int i42 = i40;
                            if (!f.equals(byteSeparator3.charAt(i40), str.charAt(length10 + i42), ignoreCase$kotlin_stdlib3)) {
                                l(length10, length2, str, byteSeparator3, "byte separator");
                                throw th2;
                            }
                            i40 = i42 + 1;
                            length12 = i41;
                        }
                        length10 += byteSeparator3.length();
                    }
                }
            }
            i34++;
            i33++;
            if (bytePrefix2.length() != 0) {
                int length13 = bytePrefix2.length();
                int i43 = 0;
                while (i43 < length13) {
                    int i44 = length13;
                    int i45 = i43;
                    if (!f.equals(bytePrefix2.charAt(i43), str.charAt(length10 + i45), ignoreCase$kotlin_stdlib3)) {
                        l(length10, length2, str, bytePrefix2, "byte prefix");
                        throw th2;
                    }
                    i43 = i45 + 1;
                    length13 = i44;
                }
                length10 += bytePrefix2.length();
            }
            if (length2 - 2 < length10) {
                k(length10, length2, i10, str, "exactly");
                throw th2;
            }
            int i46 = i35 + 1;
            bArr3[i35] = g(length10, str);
            length10 += 2;
            if (byteSuffix2.length() == 0) {
                str2 = bytePrefix2;
                i13 = i46;
            } else {
                int length14 = byteSuffix2.length();
                int i47 = 0;
                while (i47 < length14) {
                    String str3 = bytePrefix2;
                    int i48 = i46;
                    if (!f.equals(byteSuffix2.charAt(i47), str.charAt(length10 + i47), ignoreCase$kotlin_stdlib3)) {
                        l(length10, length2, str, byteSuffix2, "byte suffix");
                        throw th2;
                    }
                    i47++;
                    bytePrefix2 = str3;
                    i46 = i48;
                }
                str2 = bytePrefix2;
                i13 = i46;
                length10 = byteSuffix2.length() + length10;
            }
            bytesPerLine = i11;
            bytePrefix2 = str2;
            bytesPerGroup = i12;
            i35 = i13;
        }
        if (i35 == i32) {
            return bArr3;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i35);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return hexToByteArray(str, lVar);
    }

    public static final int hexToInt(String str, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return hexToInt(str, lVar);
    }

    public static final long hexToLong(String str, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return hexToLong(str, lVar);
    }

    public static final short hexToShort(String str, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        return (short) f(str, 0, str.length(), format, 4);
    }

    public static /* synthetic */ short hexToShort$default(String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return hexToShort(str, lVar);
    }

    public static final long i(int i10, int i11, String str) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f86154d[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            j(i10, str);
            throw null;
        }
        return j10;
    }

    public static final void j(int i10, String str) {
        StringBuilder sbT = o2.t(i10, "Expected a hexadecimal digit at index ", ", but was ");
        sbT.append(str.charAt(i10));
        throw new NumberFormatException(sbT.toString());
    }

    public static final void k(int i10, int i11, int i12, String str, String str2) {
        kotlin.jvm.internal.e0.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    public static final void l(int i10, int i11, String str, String str2, String str3) {
        int iCoerceAtMost = qv.v.coerceAtMost(str2.length() + i10, i11);
        kotlin.jvm.internal.e0.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iCoerceAtMost);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        StringBuilder sbB = b3.h.b("Expected ", str3, " \"", str2, "\" at index ");
        sbB.append(i10);
        sbB.append(", but was ");
        sbB.append(strSubstring);
        throw new NumberFormatException(sbB.toString());
    }

    public static final int m(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                kotlin.jvm.internal.e0.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return str.length() + i10;
    }

    public static final String n(long j10, l.c cVar, String str, int i10) {
        int i11 = i10 >> 2;
        int minLength = cVar.getMinLength();
        int iCoerceAtLeast = qv.v.coerceAtLeast(minLength - i11, 0);
        String prefix = cVar.getPrefix();
        String suffix = cVar.getSuffix();
        boolean removeLeadingZeros = cVar.getRemoveLeadingZeros();
        int iB = b(prefix.length() + iCoerceAtLeast + i11 + suffix.length());
        char[] cArr = new char[iB];
        int iM = m(prefix, cArr, 0);
        if (iCoerceAtLeast > 0) {
            int i12 = iCoerceAtLeast + iM;
            uu.f0.fill(cArr, str.charAt(0), iM, i12);
            iM = i12;
        }
        int i13 = i10;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 -= 4;
            int i15 = (int) ((j10 >> i13) & 15);
            removeLeadingZeros = removeLeadingZeros && i15 == 0 && (i13 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[iM] = str.charAt(i15);
                iM++;
            }
        }
        int iM2 = m(suffix, cArr, iM);
        return iM2 == iB ? k0.concatToString(cArr) : k0.concatToString$default(cArr, 0, iM2, 1, null);
    }

    public static final long o(int i10, long j10, long j11) {
        if (j10 <= 0 || j11 <= 0) {
            return 0L;
        }
        long j12 = i10;
        return (j10 + j12) / (j11 + j12);
    }

    public static final int parsedByteArrayMaxSize(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long jA;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i15 + 2 + i16;
        long jA2 = a(i12, i14, j10);
        if (i11 <= i12) {
            jA = a(i11, i14, j10);
        } else {
            jA = a(i11 / i12, i13, jA2);
            int i17 = i11 % i12;
            if (i17 != 0) {
                jA = a(i17, i14, j10) + jA + i13;
            }
        }
        long j11 = i10;
        long jO = o(1, j11, jA);
        long j12 = j11 - ((jA + 1) * jO);
        long jO2 = o(i13, j12, jA2);
        long j13 = j12 - ((jA2 + i13) * jO2);
        long jO3 = o(i14, j13, j10);
        return (int) ((jO2 * i12) + (jO * i11) + jO3 + (j13 - ((j10 + ((long) i14)) * jO3) > 0 ? 1 : 0));
    }

    public static final String toHexString(byte[] bArr, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return toHexString(bArr, lVar);
    }

    public static final int hexToInt(String str, int i10, int i11, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        return f(str, i10, i11, format, 8);
    }

    public static final long hexToLong(String str, int i10, int i11, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        uu.g.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        l.c number = format.getNumber();
        if (number.isDigitsOnly$kotlin_stdlib()) {
            c(str, i10, i11, 16);
            return i(i10, i11, str);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        d(str, prefix, suffix, number.getIgnoreCase$kotlin_stdlib(), i10, i11, 16);
        return i(prefix.length() + i10, i11 - suffix.length(), str);
    }

    public static final String toHexString(byte[] bArr, int i10, int i11, l format) {
        int i12 = i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        uu.g.Companion.checkBoundsIndexes$kotlin_stdlib(i12, i11, bArr.length);
        if (i12 == i11) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? f86152b : f86151a;
        l.a bytes = format.getBytes();
        int iE = 0;
        if (!bytes.getNoLineAndGroupSeparator$kotlin_stdlib()) {
            int bytesPerLine = bytes.getBytesPerLine();
            int bytesPerGroup = bytes.getBytesPerGroup();
            String bytePrefix = bytes.getBytePrefix();
            String byteSuffix = bytes.getByteSuffix();
            String byteSeparator = bytes.getByteSeparator();
            String groupSeparator = bytes.getGroupSeparator();
            int i13 = formattedStringLength(i11 - i12, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
            char[] cArr = new char[i13];
            int iM = 0;
            int i14 = 0;
            int i15 = 0;
            while (i12 < i11) {
                if (i14 == bytesPerLine) {
                    cArr[iM] = '\n';
                    i15 = 0;
                    iM++;
                    i14 = 0;
                } else if (i15 == bytesPerGroup) {
                    iM = m(groupSeparator, cArr, iM);
                    i15 = 0;
                }
                if (i15 != 0) {
                    iM = m(byteSeparator, cArr, iM);
                }
                iM = m(byteSuffix, cArr, e(bArr, i12, iArr, cArr, m(bytePrefix, cArr, iM)));
                i15++;
                i14++;
                i12++;
            }
            if (iM == i13) {
                return k0.concatToString(cArr);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (!bytes.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib()) {
            String bytePrefix2 = bytes.getBytePrefix();
            String byteSuffix2 = bytes.getByteSuffix();
            String byteSeparator2 = bytes.getByteSeparator();
            int i16 = i11 - i12;
            int length = byteSeparator2.length();
            int length2 = bytePrefix2.length();
            int length3 = byteSuffix2.length();
            if (i16 <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            long j10 = length;
            char[] cArr2 = new char[b((i16 * (((length2 + 2) + length3) + j10)) - j10)];
            int iM2 = m(byteSuffix2, cArr2, e(bArr, i12, iArr, cArr2, m(bytePrefix2, cArr2, 0)));
            for (int i17 = i12 + 1; i17 < i11; i17++) {
                iM2 = m(byteSuffix2, cArr2, e(bArr, i17, iArr, cArr2, m(bytePrefix2, cArr2, m(byteSeparator2, cArr2, iM2))));
            }
            return k0.concatToString(cArr2);
        }
        int length4 = bytes.getByteSeparator().length();
        if (length4 > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i18 = i11 - i12;
        if (length4 == 0) {
            char[] cArr3 = new char[b(i18 * 2)];
            while (i12 < i11) {
                iE = e(bArr, i12, iArr, cArr3, iE);
                i12++;
            }
            return k0.concatToString(cArr3);
        }
        char[] cArr4 = new char[b((i18 * 3) - 1)];
        char cCharAt = bytes.getByteSeparator().charAt(0);
        int iE2 = e(bArr, i12, iArr, cArr4, 0);
        for (int i19 = i12 + 1; i19 < i11; i19++) {
            cArr4[iE2] = cCharAt;
            iE2 = e(bArr, i19, iArr, cArr4, iE2 + 1);
        }
        return k0.concatToString(cArr4);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i10, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return hexToInt(str, i10, i11, lVar);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i10, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return hexToLong(str, i10, i11, lVar);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i10, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return toHexString(bArr, i10, i11, lVar);
    }

    public static /* synthetic */ String toHexString$default(byte b10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return toHexString(b10, lVar);
    }

    public static /* synthetic */ String toHexString$default(short s10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return toHexString(s10, lVar);
    }

    public static /* synthetic */ String toHexString$default(int i10, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return toHexString(i10, lVar);
    }

    public static /* synthetic */ String toHexString$default(long j10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f86155d.getDefault();
        }
        return toHexString(j10, lVar);
    }

    public static final String toHexString(byte b10, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        l.c number = format.getNumber();
        if (number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] cArr = {str.charAt((b10 >> 4) & 15), str.charAt(b10 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return k0.concatToString$default(cArr, qv.v.coerceAtMost((Integer.numberOfLeadingZeros(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 24) >> 2, 1), 0, 2, null);
            }
            return k0.concatToString(cArr);
        }
        return n(b10, number, str, 8);
    }

    public static final String toHexString(short s10, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        l.c number = format.getNumber();
        if (number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] cArr = {str.charAt((s10 >> 12) & 15), str.charAt((s10 >> 8) & 15), str.charAt((s10 >> 4) & 15), str.charAt(s10 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return k0.concatToString$default(cArr, qv.v.coerceAtMost((Integer.numberOfLeadingZeros(s10 & 65535) - 16) >> 2, 3), 0, 2, null);
            }
            return k0.concatToString(cArr);
        }
        return n(s10, number, str, 16);
    }

    public static final String toHexString(int i10, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        l.c number = format.getNumber();
        if (number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] cArr = {str.charAt((i10 >> 28) & 15), str.charAt((i10 >> 24) & 15), str.charAt((i10 >> 20) & 15), str.charAt((i10 >> 16) & 15), str.charAt((i10 >> 12) & 15), str.charAt((i10 >> 8) & 15), str.charAt((i10 >> 4) & 15), str.charAt(i10 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return k0.concatToString$default(cArr, qv.v.coerceAtMost(Integer.numberOfLeadingZeros(i10) >> 2, 7), 0, 2, null);
            }
            return k0.concatToString(cArr);
        }
        return n(i10, number, str, 32);
    }

    public static final String toHexString(long j10, l format) {
        kotlin.jvm.internal.e0.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        l.c number = format.getNumber();
        if (number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] cArr = {str.charAt((int) ((j10 >> 60) & 15)), str.charAt((int) ((j10 >> 56) & 15)), str.charAt((int) ((j10 >> 52) & 15)), str.charAt((int) ((j10 >> 48) & 15)), str.charAt((int) ((j10 >> 44) & 15)), str.charAt((int) ((j10 >> 40) & 15)), str.charAt((int) ((j10 >> 36) & 15)), str.charAt((int) ((j10 >> 32) & 15)), str.charAt((int) ((j10 >> 28) & 15)), str.charAt((int) ((j10 >> 24) & 15)), str.charAt((int) ((j10 >> 20) & 15)), str.charAt((int) ((j10 >> 16) & 15)), str.charAt((int) ((j10 >> 12) & 15)), str.charAt((int) ((j10 >> 8) & 15)), str.charAt((int) ((j10 >> 4) & 15)), str.charAt((int) (j10 & 15))};
            if (number.getRemoveLeadingZeros()) {
                return k0.concatToString$default(cArr, qv.v.coerceAtMost(Long.numberOfLeadingZeros(j10) >> 2, 15), 0, 2, null);
            }
            return k0.concatToString(cArr);
        }
        return n(j10, number, str, 64);
    }
}
