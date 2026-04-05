package pw;

import com.applovin.shadow.okio.Utf8;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f1 {
    public static final boolean isIsoControl(int i10) {
        if (i10 < 0 || i10 >= 32) {
            return 127 <= i10 && i10 < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i10, int i11, kv.l yield) {
        Integer numValueOf = Integer.valueOf(Utf8.REPLACEMENT_CODE_POINT);
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 1;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i10, int i11, kv.l yield) {
        Integer numValueOf = Integer.valueOf(Utf8.REPLACEMENT_CODE_POINT);
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 2;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            return (i11 <= i13 || (bArr[i13] & 192) != 128) ? 1 : 2;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i12];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i14 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 > i14 || i14 >= 57344) {
            yield.invoke(Integer.valueOf(i14));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i10, int i11, kv.l yield) {
        Integer numValueOf = Integer.valueOf(Utf8.REPLACEMENT_CODE_POINT);
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 3;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            if (i11 <= i13 || (bArr[i13] & 192) != 128) {
                return 1;
            }
            int i14 = i10 + 2;
            return (i11 <= i14 || (bArr[i14] & 192) != 128) ? 2 : 3;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b13 = bArr[i12];
        if ((b13 & 192) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
        if (i15 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i15 && i15 < 57344) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i15 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i15));
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processUtf16Chars(byte[] r12, int r13, int r14, kv.l r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.f1.processUtf16Chars(byte[], int, int, kv.l):void");
    }

    public static final void processUtf8Bytes(String str, int i10, int i11, kv.l yield) {
        int i12;
        char cCharAt;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(yield, "yield");
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (kotlin.jvm.internal.e0.compare((int) cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i10++;
                while (i10 < i11 && kotlin.jvm.internal.e0.compare((int) str.charAt(i10), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i10)));
                    i10++;
                }
            } else {
                if (kotlin.jvm.internal.e0.compare((int) cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (kotlin.jvm.internal.e0.compare((int) cCharAt2, 56319) > 0 || i11 <= (i12 = i10 + 1) || 56320 > (cCharAt = str.charAt(i12)) || cCharAt >= 57344) {
                    yield.invoke(Byte.valueOf(Utf8.REPLACEMENT_BYTE));
                } else {
                    int iCharAt = (str.charAt(i12) + (cCharAt2 << '\n')) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | PsExtractor.VIDEO_STREAM_MASK)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i10 += 2;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processUtf8CodePoints(byte[] r11, int r12, int r13, kv.l r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.f1.processUtf8CodePoints(byte[], int, int, kv.l):void");
    }

    public static final long size(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return size(str, i10, i11);
    }

    public static final long size(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return size$default(str, i10, 0, 2, null);
    }

    public static final long size(String str, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
                sbT.append(str.length());
                throw new IllegalArgumentException(sbT.toString().toString());
            }
            long j10 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt < 128) {
                    j10++;
                } else {
                    if (cCharAt < 2048) {
                        i12 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i12 = 3;
                    } else {
                        int i13 = i10 + 1;
                        char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j10++;
                            i10 = i13;
                        } else {
                            j10 += 4;
                            i10 += 2;
                        }
                    }
                    j10 += i12;
                }
                i10++;
            }
            return j10;
        }
        throw new IllegalArgumentException(w0.i.a(i11, i10, "endIndex < beginIndex: ", " < ").toString());
    }
}
