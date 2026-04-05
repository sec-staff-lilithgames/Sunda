package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.charset.StandardCharsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f41057a;

    /* renamed from: b, reason: collision with root package name */
    public int f41058b;

    /* renamed from: c, reason: collision with root package name */
    private char[] f41059c;

    public a0(int i10) {
        this(new byte[i10], 0);
    }

    public static int b(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                i11++;
            } else if (cCharAt < 2048) {
                i11 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i11 += 3;
            } else {
                i10 += 2;
                i11 += 4;
            }
            i10 = i12;
        }
        return i11;
    }

    public static int f(int i10) {
        if ((i10 >> 7) == 0) {
            return 1;
        }
        if ((i10 >> 14) == 0) {
            return 2;
        }
        if ((i10 >> 21) == 0) {
            return 3;
        }
        return (i10 >> 28) == 0 ? 4 : 5;
    }

    public byte a() {
        byte[] bArr = this.f41057a;
        int i10 = this.f41058b;
        this.f41058b = i10 + 1;
        return bArr[i10];
    }

    public float c() {
        return Float.intBitsToFloat(d());
    }

    public long d(int i10) {
        byte[] bArr = this.f41057a;
        int i11 = i10 + 6;
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i11] & 255) << 48) | (bArr[i10 + 7] << 56);
    }

    public long e() {
        long jD = d(this.f41058b);
        this.f41058b += 8;
        return jD;
    }

    public int g() {
        byte[] bArr = this.f41057a;
        int i10 = this.f41058b;
        int i11 = i10 + 1;
        this.f41058b = i11;
        byte b10 = bArr[i10];
        if ((b10 >> 7) == 0) {
            return b10;
        }
        int i12 = b10 & AbstractJsonLexerKt.TC_INVALID;
        int i13 = i10 + 2;
        this.f41058b = i13;
        int i14 = (bArr[i11] << 7) | i12;
        if ((i14 >> 14) == 0) {
            return i14;
        }
        int i15 = i10 + 3;
        this.f41058b = i15;
        int i16 = (i14 & 16383) | (bArr[i13] << 14);
        if ((i16 >> 21) == 0) {
            return i16;
        }
        int i17 = i10 + 4;
        this.f41058b = i17;
        int i18 = (i16 & 2097151) | (bArr[i15] << 21);
        if ((i18 >> 28) == 0) {
            return i18;
        }
        this.f41058b = i10 + 5;
        return (bArr[i17] << 28) | (i18 & 268435455);
    }

    public void h(int i10) {
        this.f41058b = c(this.f41058b, i10);
    }

    public a0(byte[] bArr, int i10) {
        this.f41059c = null;
        this.f41057a = bArr;
        this.f41058b = i10;
    }

    private char[] c(int i10) {
        char[] cArr = this.f41059c;
        if (cArr == null) {
            if (i10 <= 256) {
                this.f41059c = new char[NotificationCompat.FLAG_LOCAL_ONLY];
            } else {
                this.f41059c = new char[2048];
            }
        } else if (cArr.length < i10) {
            this.f41059c = new char[2048];
        }
        return this.f41059c;
    }

    public long a(int i10, int i11) {
        long jD = 0;
        if (i11 <= 0) {
            return 0L;
        }
        int i12 = i11 >> 3;
        int i13 = i11 & 7;
        int i14 = 0;
        int i15 = i10;
        for (int i16 = 0; i16 < i12; i16++) {
            jD ^= d(i15);
            i15 += 8;
        }
        while (i14 < (i13 << 3)) {
            jD ^= (this.f41057a[i15] & 255) << i14;
            i14 += 8;
            i15++;
        }
        int i17 = (i10 & 7) << 3;
        return (jD >>> (64 - i17)) | (jD << i17);
    }

    public int d() {
        byte[] bArr = this.f41057a;
        int i10 = this.f41058b;
        int i11 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f41058b = i10 + 4;
        return (bArr[i12] << 24) | i13;
    }

    public short f() {
        byte[] bArr = this.f41057a;
        int i10 = this.f41058b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f41058b = i10 + 2;
        return (short) ((bArr[i11] << 8) | i12);
    }

    public byte[] b(int i10) {
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f41057a, this.f41058b, bArr, 0, i10);
        this.f41058b += i10;
        return bArr;
    }

    public String e(int i10) {
        if (i10 < 0) {
            return null;
        }
        if (i10 == 0) {
            return "";
        }
        String strA = a(i10);
        this.f41058b += i10;
        return strA;
    }

    private String a(int i10) {
        if (i10 > 2048) {
            return new String(this.f41057a, this.f41058b, i10, StandardCharsets.UTF_8);
        }
        char[] cArrC = c(i10);
        byte[] bArr = this.f41057a;
        int i11 = this.f41058b;
        int i12 = i10 + i11;
        int i13 = 0;
        while (i11 < i12) {
            int i14 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 > 0) {
                cArrC[i13] = (char) b10;
                i13++;
                i11 = i14;
            } else if (b10 < -32) {
                i11 += 2;
                cArrC[i13] = (char) ((bArr[i14] & Utf8.REPLACEMENT_BYTE) | ((b10 & 31) << 6));
                i13++;
            } else if (b10 < -16) {
                int i15 = i11 + 2;
                i11 += 3;
                cArrC[i13] = (char) (((bArr[i14] & Utf8.REPLACEMENT_BYTE) << 6) | ((b10 & 15) << 12) | (bArr[i15] & Utf8.REPLACEMENT_BYTE));
                i13++;
            } else {
                byte b11 = bArr[i14];
                int i16 = i11 + 3;
                byte b12 = bArr[i11 + 2];
                i11 += 4;
                int i17 = ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b10 & 7) << 18) | ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i16] & Utf8.REPLACEMENT_BYTE);
                int i18 = i13 + 1;
                cArrC[i13] = (char) ((i17 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                i13 += 2;
                cArrC[i18] = (char) ((i17 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
            }
        }
        if (i11 <= i12) {
            return new String(cArrC, 0, i13);
        }
        throw new IllegalArgumentException("Invalid String");
    }

    public a0(byte[] bArr) {
        this(bArr, 0);
    }

    public double b() {
        return Double.longBitsToDouble(e());
    }

    public void g(int i10) {
        byte[] bArr = this.f41057a;
        int i11 = this.f41058b;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        this.f41058b = i11 + 4;
        bArr[i11 + 3] = (byte) (i10 >> 24);
    }

    public void b(int i10, int i11) {
        byte[] bArr = this.f41057a;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
    }

    public void c(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        a(str);
    }

    public int c(int i10, int i11) {
        while ((i11 & (-128)) != 0) {
            this.f41057a[i10] = (byte) ((i11 & 127) | 128);
            i11 >>>= 7;
            i10++;
        }
        int i12 = i10 + 1;
        this.f41057a[i10] = (byte) i11;
        return i12;
    }

    public final void a(byte b10) {
        byte[] bArr = this.f41057a;
        int i10 = this.f41058b;
        this.f41058b = i10 + 1;
        bArr[i10] = b10;
    }

    public void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f41057a, this.f41058b, length);
            this.f41058b += length;
        }
    }

    public void a(long j10) {
        a(this.f41058b, j10);
        this.f41058b += 8;
    }

    public void a(int i10, long j10) {
        byte[] bArr = this.f41057a;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
    }

    public void a(short s10) {
        byte[] bArr = this.f41057a;
        int i10 = this.f41058b;
        bArr[i10] = (byte) s10;
        this.f41058b = i10 + 2;
        bArr[i10 + 1] = (byte) (s10 >> 8);
    }

    private void a(String str) {
        byte[] bArr = this.f41057a;
        int i10 = this.f41058b;
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                bArr[i10] = (byte) cCharAt;
                i10++;
            } else if (cCharAt < 2048) {
                int i13 = i10 + 1;
                bArr[i10] = (byte) ((cCharAt >>> 6) | PsExtractor.AUDIO_STREAM);
                i10 += 2;
                bArr[i13] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                i11 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i12)) - 56613888;
                bArr[i10] = (byte) ((iCharAt >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i10 + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i14 = i10 + 3;
                bArr[i10 + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i10 += 4;
                bArr[i14] = (byte) ((iCharAt & 63) | 128);
            } else {
                bArr[i10] = (byte) ((cCharAt >>> '\f') | 224);
                int i15 = i10 + 2;
                bArr[i10 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i10 += 3;
                bArr[i15] = (byte) ((cCharAt & '?') | 128);
            }
            i11 = i12;
        }
        this.f41058b = i10;
    }
}
