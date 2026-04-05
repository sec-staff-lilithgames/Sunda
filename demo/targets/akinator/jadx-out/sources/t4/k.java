package t4;

import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends i {
    public static String decodeUtf8Array(byte[] bArr, int i10, int i11) {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = bArr[i17];
                    if (b12 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i10 += 2;
                d0.u(b11, bArr[i15], cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = i10 + 2;
                i10 += 3;
                d0.t(b11, bArr[i15], bArr[i18], cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b13 = bArr[i15];
                int i19 = i10 + 3;
                byte b14 = bArr[i10 + 2];
                i10 += 4;
                d0.s(b11, b13, b14, bArr[i19], cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i10, int i11) {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (b11 >= 0) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = byteBuffer.get(i17);
                    if (b12 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i10 += 2;
                d0.u(b11, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = i10 + 2;
                i10 += 3;
                d0.t(b11, byteBuffer.get(i15), byteBuffer.get(i18), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b13 = byteBuffer.get(i15);
                int i19 = i10 + 3;
                byte b14 = byteBuffer.get(i10 + 2);
                i10 += 4;
                d0.s(b11, b13, b14, byteBuffer.get(i19), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    @Override // t4.i
    public String decodeUtf8(ByteBuffer byteBuffer, int i10, int i11) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11) : decodeUtf8Buffer(byteBuffer, i10, i11);
    }

    @Override // t4.i
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        int i11;
        char cCharAt;
        char c10 = 2048;
        int i12 = 0;
        char c11 = 57343;
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byte[] bArrArray = byteBuffer.array();
            int iPosition = byteBuffer.position() + iArrayOffset;
            int iRemaining = byteBuffer.remaining();
            int length = charSequence.length();
            int i13 = iRemaining + iPosition;
            while (i12 < length) {
                int i14 = i12 + iPosition;
                if (i14 >= i13 || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                bArrArray[i14] = (byte) cCharAt;
                i12++;
            }
            if (i12 == length) {
                i10 = iPosition + length;
            } else {
                i10 = iPosition + i12;
                while (i12 < length) {
                    char cCharAt2 = charSequence.charAt(i12);
                    if (cCharAt2 < 128 && i10 < i13) {
                        bArrArray[i10] = (byte) cCharAt2;
                        i10++;
                    } else if (cCharAt2 < c10 && i10 <= i13 - 2) {
                        int i15 = i10 + 1;
                        bArrArray[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                        i10 += 2;
                        bArrArray[i15] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && c11 >= cCharAt2) || i10 > i13 - 3) {
                            if (i10 > i13 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                    throw new j(i12, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
                            }
                            int i16 = i12 + 1;
                            if (i16 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    bArrArray[i10] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    bArrArray[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i17 = i10 + 3;
                                    bArrArray[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArrArray[i17] = (byte) ((codePoint & 63) | 128);
                                    i12 = i16;
                                } else {
                                    i12 = i16;
                                }
                            }
                            throw new j(i12 - 1, length);
                        }
                        bArrArray[i10] = (byte) ((cCharAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT);
                        int i18 = i10 + 2;
                        bArrArray[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i10 += 3;
                        bArrArray[i18] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i12++;
                    c10 = 2048;
                    c11 = 57343;
                }
            }
            byteBuffer.position(i10 - iArrayOffset);
            return;
        }
        int length2 = charSequence.length();
        int iPosition2 = byteBuffer.position();
        while (i12 < length2) {
            try {
                char cCharAt4 = charSequence.charAt(i12);
                if (cCharAt4 >= 128) {
                    break;
                }
                byteBuffer.put(iPosition2 + i12, (byte) cCharAt4);
                i12++;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        if (i12 == length2) {
            byteBuffer.position(iPosition2 + i12);
            return;
        }
        iPosition2 += i12;
        while (i12 < length2) {
            char cCharAt5 = charSequence.charAt(i12);
            if (cCharAt5 >= 128) {
                if (cCharAt5 < 2048) {
                    int i19 = iPosition2 + 1;
                    try {
                        byteBuffer.put(iPosition2, (byte) ((cCharAt5 >>> 6) | PsExtractor.AUDIO_STREAM));
                        byteBuffer.put(i19, (byte) ((cCharAt5 & '?') | 128));
                        iPosition2 = i19;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition2 = i19;
                    }
                } else {
                    if (cCharAt5 >= 55296 && 57343 >= cCharAt5) {
                        int i20 = i12 + 1;
                        if (i20 != length2) {
                            try {
                                char cCharAt6 = charSequence.charAt(i20);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    int i21 = iPosition2 + 1;
                                    try {
                                        byteBuffer.put(iPosition2, (byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        int i22 = iPosition2 + 2;
                                        try {
                                            byteBuffer.put(i21, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            iPosition2 += 3;
                                            byteBuffer.put(i22, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            byteBuffer.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                            i12 = i20;
                                            i12++;
                                            iPosition2++;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i12 = i20;
                                            iPosition2 = i22;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition2 = i21;
                                        i12 = i20;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i12) + " at index " + (Math.max(i12, (iPosition2 - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } else {
                                    i12 = i20;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new j(i12, length2);
                    }
                    int i23 = iPosition2 + 1;
                    try {
                        byteBuffer.put(iPosition2, (byte) ((cCharAt5 >>> '\f') | 224));
                        iPosition2 += 2;
                        byteBuffer.put(i23, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        byteBuffer.put(iPosition2, (byte) ((cCharAt5 & '?') | 128));
                        i12++;
                        iPosition2++;
                    } catch (IndexOutOfBoundsException unused6) {
                        iPosition2 = i23;
                    }
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i12) + " at index " + (Math.max(i12, (iPosition2 - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
            byteBuffer.put(iPosition2, (byte) cCharAt5);
            i12++;
            iPosition2++;
        }
        byteBuffer.position(iPosition2);
    }

    @Override // t4.i
    public int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new j(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }
}
