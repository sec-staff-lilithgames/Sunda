package ko;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.DrmInitData;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f71618a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f71619b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f71620c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f71621d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f71622e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f71623f = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f71619b[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f71623f[i12]) * 2;
        }
        int i14 = f71622e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((io.bidmachine.media3.common.util.a1.getBigEndianInt(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static io.bidmachine.media3.common.b parseAc3AnnexFFormat(io.bidmachine.media3.common.util.m0 m0Var, String str, String str2, DrmInitData drmInitData) {
        io.bidmachine.media3.common.util.l0 l0Var = new io.bidmachine.media3.common.util.l0();
        l0Var.reset(m0Var);
        int i10 = f71619b[l0Var.readBits(2)];
        l0Var.skipBits(8);
        int i11 = f71621d[l0Var.readBits(3)];
        if (l0Var.readBits(1) != 0) {
            i11++;
        }
        int i12 = f71622e[l0Var.readBits(5)] * 1000;
        l0Var.byteAlign();
        m0Var.setPosition(l0Var.getBytePosition());
        return new gn.w().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC3).setChannelCount(i11).setSampleRate(i10).setDrmInitData(drmInitData).setLanguage(str2).setAverageBitrate(i12).setPeakBitrate(i12).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f71618a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ko.c parseAc3SyncframeInfo(io.bidmachine.media3.common.util.l0 r21) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.d.parseAc3SyncframeInfo(io.bidmachine.media3.common.util.l0):ko.c");
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return a((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.bidmachine.media3.common.b parseEAc3AnnexFFormat(io.bidmachine.media3.common.util.m0 r7, java.lang.String r8, java.lang.String r9, io.bidmachine.media3.common.DrmInitData r10) {
        /*
            io.bidmachine.media3.common.util.l0 r0 = new io.bidmachine.media3.common.util.l0
            r0.<init>()
            r0.reset(r7)
            r1 = 13
            int r1 = r0.readBits(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.skipBits(r2)
            r3 = 2
            int r3 = r0.readBits(r3)
            int[] r4 = ko.d.f71619b
            r3 = r4[r3]
            r4 = 10
            r0.skipBits(r4)
            int[] r4 = ko.d.f71621d
            int r5 = r0.readBits(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.readBits(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.skipBits(r2)
            r2 = 4
            int r2 = r0.readBits(r2)
            r0.skipBits(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.skipBits(r2)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.skipBits(r5)
        L4f:
            int r2 = r0.bitsLeft()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.skipBits(r6)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.byteAlign()
            int r0 = r0.getBytePosition()
            r7.setPosition(r0)
            gn.w r7 = new gn.w
            r7.<init>()
            gn.w r7 = r7.setId(r8)
            gn.w r7 = r7.setSampleMimeType(r2)
            gn.w r7 = r7.setChannelCount(r4)
            gn.w r7 = r7.setSampleRate(r3)
            gn.w r7 = r7.setDrmInitData(r10)
            gn.w r7 = r7.setLanguage(r9)
            gn.w r7 = r7.setPeakBitrate(r1)
            io.bidmachine.media3.common.b r7 = r7.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.d.parseEAc3AnnexFFormat(io.bidmachine.media3.common.util.m0, java.lang.String, java.lang.String, io.bidmachine.media3.common.DrmInitData):io.bidmachine.media3.common.b");
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
