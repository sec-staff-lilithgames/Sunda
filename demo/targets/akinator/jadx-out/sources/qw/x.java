package qw;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class x {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i10;
        char cCharAt;
        e0.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (e0.compare((int) cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i12 = i11;
                while (i11 < length2) {
                    char cCharAt3 = str.charAt(i11);
                    if (e0.compare((int) cCharAt3, 128) < 0) {
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) cCharAt3;
                        i11++;
                        while (true) {
                            i12 = i13;
                            if (i11 >= length2 || e0.compare((int) str.charAt(i11), 128) >= 0) {
                                break;
                            }
                            i13 = i12 + 1;
                            bArr[i12] = (byte) str.charAt(i11);
                            i11++;
                        }
                    } else {
                        if (e0.compare((int) cCharAt3, 2048) < 0) {
                            bArr[i12] = (byte) ((cCharAt3 >> 6) | PsExtractor.AUDIO_STREAM);
                            i12 += 2;
                            bArr[i12 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i12] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i12 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i12 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (e0.compare((int) cCharAt3, 56319) > 0 || length2 <= (i10 = i11 + 1) || 56320 > (cCharAt = str.charAt(i10)) || cCharAt >= 57344) {
                            bArr[i12] = Utf8.REPLACEMENT_BYTE;
                            i11++;
                            i12++;
                        } else {
                            int iCharAt = (str.charAt(i10) + (cCharAt3 << '\n')) - 56613888;
                            bArr[i12] = (byte) ((iCharAt >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr[i12 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i12 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i12 + 3] = (byte) ((iCharAt & 63) | 128);
                            i11 += 2;
                        }
                        i11++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
                e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i11] = (byte) cCharAt2;
            i11++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        e0.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    public static final String commonToUtf8String(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        e0.checkNotNullParameter(bArr, "<this>");
        if (i17 < 0 || i11 > bArr.length || i17 > i11) {
            StringBuilder sb2 = new StringBuilder("size=");
            a.b.x(bArr.length, i17, " beginIndex=", " endIndex=", sb2);
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        char[] cArr = new char[i11 - i17];
        int i18 = 0;
        while (i17 < i11) {
            byte b10 = bArr[i17];
            if (b10 >= 0) {
                i12 = i18 + 1;
                cArr[i18] = (char) b10;
                i17++;
                while (i17 < i11) {
                    byte b11 = bArr[i17];
                    if (b11 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
            } else {
                if ((b10 >> 5) == -2) {
                    int i19 = i17 + 1;
                    if (i11 <= i19) {
                        i12 = i18 + 1;
                        cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b12 = bArr[i19];
                        if ((b12 & 192) == 128) {
                            int i20 = (b10 << 6) ^ (b12 ^ 3968);
                            if (i20 < 128) {
                                i12 = i18 + 1;
                                cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) i20;
                            }
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                } else if ((b10 >> 4) == -2) {
                    int i21 = i17 + 2;
                    if (i11 <= i21) {
                        i12 = i18 + 1;
                        cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        int i22 = i17 + 1;
                        i13 = (i11 <= i22 || (bArr[i22] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b13 = bArr[i17 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i21];
                            if ((b14 & 192) == 128) {
                                int i23 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i23 < 2048) {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i23 || i23 >= 57344) {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) i23;
                                } else {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                i13 = 3;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            }
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                } else {
                    if ((b10 >> 3) == -2) {
                        int i24 = i17 + 3;
                        if (i11 <= i24) {
                            i14 = i18 + 1;
                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                            int i25 = i17 + 1;
                            if (i11 > i25 && (bArr[i25] & 192) == 128) {
                                int i26 = i17 + 2;
                                i16 = (i11 <= i26 || (bArr[i26] & 192) != 128) ? 2 : 3;
                            }
                            i16 = 1;
                        } else {
                            byte b15 = bArr[i17 + 1];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i17 + 2];
                                if ((b16 & 192) == 128) {
                                    byte b17 = bArr[i24];
                                    if ((b17 & 192) == 128) {
                                        int i27 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                        if (i27 > 1114111) {
                                            i14 = i18 + 1;
                                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i27 || i27 >= 57344) && i27 >= 65536) {
                                            if (i27 != 65533) {
                                                cArr[i18] = (char) ((i27 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i15 = i18 + 2;
                                                cArr[i18 + 1] = (char) ((i27 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                                i15 = i18 + 1;
                                            }
                                            i14 = i15;
                                        } else {
                                            i14 = i18 + 1;
                                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        i16 = 4;
                                    } else {
                                        i14 = i18 + 1;
                                        cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                    }
                                } else {
                                    i14 = i18 + 1;
                                    cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                }
                            } else {
                                i14 = i18 + 1;
                                cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                i16 = 1;
                            }
                        }
                        i17 += i16;
                    } else {
                        i14 = i18 + 1;
                        cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                        i17++;
                    }
                    i18 = i14;
                }
                i17 += i13;
            }
            i18 = i12;
        }
        return k0.concatToString(cArr, 0, i18);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return commonToUtf8String(bArr, i10, i11);
    }
}
