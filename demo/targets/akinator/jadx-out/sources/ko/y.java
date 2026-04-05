package ko;

import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.bidmachine.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f71801a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f71802b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f71803c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f71804d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f71805e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f71806f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f71807g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f71808h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f71809i = {5, 8, 10, 12};

    public static io.bidmachine.media3.common.util.l0 a(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new io.bidmachine.media3.common.util.l0(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        io.bidmachine.media3.common.util.l0 l0Var = new io.bidmachine.media3.common.util.l0(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            io.bidmachine.media3.common.util.l0 l0Var2 = new io.bidmachine.media3.common.util.l0(bArrCopyOf);
            while (l0Var2.bitsLeft() >= 16) {
                l0Var2.skipBits(2);
                l0Var.putInt(l0Var2.readBits(14), 14);
            }
        }
        l0Var.reset(bArrCopyOf);
        return l0Var;
    }

    public static int b(io.bidmachine.media3.common.util.l0 l0Var, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && l0Var.readBit(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return l0Var.readBits(iArr[i10]) + i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getDtsFrameSize(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.y.getDtsFrameSize(byte[]):int");
    }

    public static int getFrameType(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static io.bidmachine.media3.common.b parseDtsFormat(byte[] bArr, String str, String str2, int i10, String str3, DrmInitData drmInitData) {
        io.bidmachine.media3.common.util.l0 l0VarA = a(bArr);
        l0VarA.skipBits(60);
        int i11 = f71801a[l0VarA.readBits(6)];
        int i12 = f71802b[l0VarA.readBits(4)];
        int bits = l0VarA.readBits(5);
        int i13 = bits >= 29 ? -1 : (f71803c[bits] * 1000) / 2;
        l0VarA.skipBits(10);
        return new gn.w().setId(str).setContainerMimeType(str3).setSampleMimeType(MimeTypes.AUDIO_DTS).setAverageBitrate(i13).setChannelCount(i11 + (l0VarA.readBits(2) > 0 ? 1 : 0)).setSampleRate(i12).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i10).build();
    }

    public static x parseDtsHdHeader(byte[] bArr) throws gn.z0 {
        int i10;
        int i11;
        int bits;
        int i12;
        long jScaleLargeTimestamp;
        int i13;
        io.bidmachine.media3.common.util.l0 l0VarA = a(bArr);
        l0VarA.skipBits(40);
        int bits2 = l0VarA.readBits(2);
        if (l0VarA.readBit()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        l0VarA.skipBits(i11);
        int bits3 = l0VarA.readBits(i10) + 1;
        boolean bit = l0VarA.readBit();
        int bits4 = -1;
        int i14 = 0;
        if (bit) {
            bits = l0VarA.readBits(2);
            int bits5 = (l0VarA.readBits(3) + 1) * 512;
            if (l0VarA.readBit()) {
                l0VarA.skipBits(36);
            }
            int bits6 = l0VarA.readBits(3) + 1;
            int bits7 = l0VarA.readBits(3) + 1;
            if (bits6 != 1 || bits7 != 1) {
                throw gn.z0.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
            int i15 = bits2 + 1;
            int bits8 = l0VarA.readBits(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((bits8 >> i16) & 1) == 1) {
                    l0VarA.skipBits(8);
                }
            }
            if (l0VarA.readBit()) {
                l0VarA.skipBits(2);
                int bits9 = (l0VarA.readBits(2) + 1) << 2;
                int bits10 = l0VarA.readBits(2) + 1;
                while (i14 < bits10) {
                    l0VarA.skipBits(bits9);
                    i14++;
                }
            }
            i14 = bits5;
        } else {
            bits = -1;
        }
        l0VarA.skipBits(i10);
        l0VarA.skipBits(12);
        if (bit) {
            if (l0VarA.readBit()) {
                l0VarA.skipBits(4);
            }
            if (l0VarA.readBit()) {
                l0VarA.skipBits(24);
            }
            if (l0VarA.readBit()) {
                l0VarA.skipBytes(l0VarA.readBits(10) + 1);
            }
            l0VarA.skipBits(5);
            i12 = f71804d[l0VarA.readBits(4)];
            bits4 = l0VarA.readBits(8) + 1;
        } else {
            i12 = -2147483647;
        }
        int i17 = i12;
        if (bit) {
            if (bits == 0) {
                i13 = 32000;
            } else if (bits == 1) {
                i13 = 44100;
            } else {
                if (bits != 2) {
                    throw gn.z0.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + bits, null);
                }
                i13 = 48000;
            }
            jScaleLargeTimestamp = io.bidmachine.media3.common.util.a1.scaleLargeTimestamp(i14, 1000000L, i13);
        } else {
            jScaleLargeTimestamp = C.TIME_UNSET;
        }
        return new x(MimeTypes.AUDIO_DTS_EXPRESS, bits4, i17, bits3, jScaleLargeTimestamp);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        io.bidmachine.media3.common.util.l0 l0VarA = a(bArr);
        l0VarA.skipBits(42);
        return l0VarA.readBits(l0VarA.readBit() ? 12 : 8) + 1;
    }

    public static x parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) throws gn.z0 {
        int bits;
        long jScaleLargeTimestamp;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        io.bidmachine.media3.common.util.l0 l0VarA = a(bArr);
        int i12 = l0VarA.readBits(32) == 1078008818 ? 1 : 0;
        int iB = b(l0VarA, f71805e);
        int i13 = iB + 1;
        if (i12 == 0) {
            bits = -2147483647;
            jScaleLargeTimestamp = C.TIME_UNSET;
        } else {
            if (!l0VarA.readBit()) {
                throw gn.z0.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
            int i14 = iB - 1;
            if (((bArr[iB] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i14] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != io.bidmachine.media3.common.util.a1.crc16(bArr, 0, i14, Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
                throw gn.z0.createForMalformedContainer("CRC check failed", null);
            }
            int bits2 = l0VarA.readBits(2);
            if (bits2 == 0) {
                i10 = 512;
            } else if (bits2 == 1) {
                i10 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
            } else {
                if (bits2 != 2) {
                    throw gn.z0.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + bits2, null);
                }
                i10 = 384;
            }
            int bits3 = (l0VarA.readBits(3) + 1) * i10;
            int bits4 = l0VarA.readBits(2);
            if (bits4 == 0) {
                i11 = 32000;
            } else if (bits4 == 1) {
                i11 = 44100;
            } else {
                if (bits4 != 2) {
                    throw gn.z0.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + bits4, null);
                }
                i11 = 48000;
            }
            if (l0VarA.readBit()) {
                l0VarA.skipBits(36);
            }
            bits = (1 << l0VarA.readBits(2)) * i11;
            jScaleLargeTimestamp = io.bidmachine.media3.common.util.a1.scaleLargeTimestamp(bits3, 1000000L, i11);
        }
        int i15 = bits;
        long j10 = jScaleLargeTimestamp;
        int iB2 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            iB2 += b(l0VarA, f71806f);
        }
        if (i12 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(b(l0VarA, f71807g));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new x("audio/vnd.dts.uhd;profile=p2", 2, i15, iB2 + (atomicInteger2.get() != 0 ? b(l0VarA, f71808h) : 0) + i13, j10);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        io.bidmachine.media3.common.util.l0 l0VarA = a(bArr);
        l0VarA.skipBits(32);
        return b(l0VarA, f71809i) + 1;
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }
}
