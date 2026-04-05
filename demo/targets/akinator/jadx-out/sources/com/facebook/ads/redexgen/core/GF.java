package com.facebook.ads.redexgen.core;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public abstract class GF {
    public static byte[] A00;
    public static String[] A01 = {"Jtf4c9GAOgAJpDK2mVqEjBHHHDeO7jol", "kDsThcfbWymyo7SA47OqEnjsA64Naf4x", "cJoAWc4I2qPJ3tdp2oEUxn8HL8nWEytb", "qFOfekTrSk46i", "58lsU6cH4CrpheTwcdx0E4dGrWTfnMIv", "Xoqjc4jVEqoArq5wHw2izr92BVYhns54", "K2bZ7AvhLOnhV8b3rnKBJIfNWJInr7Ql", "H1rRYQzsJBGjD"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{100, 112, 97, 108, 106, 42, 100, 102, 54, 107, AbstractJsonLexerKt.TC_INVALID, 110, 99, 101, 37, 111, 107, 105, 57, 39, 51, 34, 47, 41, 105, 35, 39, 37, 117, 107, 44, 41, 37};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00(int i10, int i11) {
        int sampleRate = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int halfFrmsizecod = A05.length;
        if (i10 >= halfFrmsizecod || i11 < 0) {
            return -1;
        }
        int halfFrmsizecod2 = A07.length;
        if (sampleRate >= halfFrmsizecod2) {
            return -1;
        }
        int i12 = A05[i10];
        if (i12 == 44100) {
            int halfFrmsizecod3 = i11 % 2;
            return (A07[sampleRate] + halfFrmsizecod3) * 2;
        }
        int i13 = A02[sampleRate];
        String[] strArr = A01;
        String str = strArr[5];
        String str2 = strArr[0];
        int sampleRate2 = str.charAt(4);
        int halfFrmsizecod4 = str2.charAt(4);
        if (sampleRate2 != halfFrmsizecod4) {
            throw new RuntimeException();
        }
        A01[2] = "CpIhzBdts1JRjCy6aRe02MLhvkoBTutu";
        if (i12 == 32000) {
            int halfFrmsizecod5 = i13 * 6;
            return halfFrmsizecod5;
        }
        int halfFrmsizecod6 = i13 * 4;
        return halfFrmsizecod6;
    }

    public static int A01(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int A02(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i10 = startIndex - 10;
        for (int i11 = iPosition; i11 <= i10; i11++) {
            int startIndex2 = i11 + 4;
            int endIndex = AbstractC09264a.A0F(byteBuffer, startIndex2) & (-2);
            if (endIndex == -126718022) {
                return i11 - iPosition;
            }
        }
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        boolean isEac3 = ((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10;
        if (isEac3) {
            int numblkscod = ((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3;
            return A03[numblkscod] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    public static int A04(ByteBuffer byteBuffer, int i10) {
        boolean z10 = (byteBuffer.get((byteBuffer.position() + i10) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187;
        int iPosition = byteBuffer.position() + i10;
        if (A01[2].charAt(30) != 't') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "2LNqrJlwnzIqb";
        strArr[3] = "f1x5AMhp2hTyk";
        return 40 << ((byteBuffer.get(iPosition + (z10 ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        boolean isEac3 = ((bArr[5] & 248) >> 3) > 10;
        if (isEac3) {
            return (((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        int fscod = (bArr[4] & 192) >> 6;
        return A00(fscod, bArr[4] & Utf8.REPLACEMENT_BYTE);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static C2614or A07(C4J c4j, String str, String str2, DrmInitData drmInitData) {
        C4I c4i = new C4I();
        c4i.A0C(c4j);
        int fscod = c4i.A04(2);
        int constantBitrate = A05[fscod];
        c4i.A09(8);
        int i10 = A04[c4i.A04(3)];
        if (c4i.A04(1) != 0) {
            i10++;
        }
        int fscod2 = c4i.A04(5);
        int halfFrmsizecod = A02[fscod2] * 1000;
        c4i.A06();
        c4j.A0f(c4i.A02());
        return new C2D().A0y(str).A11(A0A(0, 9, 4)).A0b(i10).A0m(constantBitrate).A0u(drmInitData).A10(str2).A0a(halfFrmsizecod).A0j(halfFrmsizecod).A14();
    }

    public static C2614or A08(C4J c4j, String str, String str2, DrmInitData drmInitData) {
        C4I c4i = new C4I();
        c4i.A0C(c4j);
        int fscod = c4i.A04(13) * 1000;
        c4i.A09(3);
        int peakBitrate = c4i.A04(2);
        int sampleRate = A05[peakBitrate];
        c4i.A09(10);
        int channelCount = A04[c4i.A04(3)];
        if (c4i.A04(1) != 0) {
            channelCount++;
        }
        c4i.A09(3);
        int iA04 = c4i.A04(4);
        c4i.A09(1);
        String[] strArr = A01;
        String str3 = strArr[5];
        String str4 = strArr[0];
        int peakBitrate2 = str3.charAt(4);
        if (peakBitrate2 != str4.charAt(4)) {
            throw new RuntimeException();
        }
        A01[6] = "mDbBoGQY4vpPxfXnFDb06caCJn7GdJsS";
        if (iA04 > 0) {
            c4i.A0A(6);
            if (c4i.A04(1) != 0) {
                channelCount += 2;
            }
            c4i.A09(1);
        }
        String strA0A = A0A(9, 10, 11);
        int peakBitrate3 = c4i.A01();
        if (peakBitrate3 > 7) {
            c4i.A09(7);
            if (c4i.A04(1) != 0) {
                strA0A = A0A(19, 14, 71);
            }
        }
        c4i.A06();
        c4j.A0f(c4i.A02());
        return new C2D().A0y(str).A11(strA0A).A0b(channelCount).A0m(sampleRate).A0u(drmInitData).A10(str2).A0j(fscod).A14();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.GE A09(com.facebook.ads.redexgen.core.C4I r24) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.GF.A09(com.facebook.ads.redexgen.X.4I):com.facebook.ads.redexgen.X.GE");
    }
}
