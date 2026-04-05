package com.google.android.exoplayer2.audio;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f27097a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f27098b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f27099c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f27100d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f27101e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f27102f = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f27098b[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f27102f[i12]) * 2;
        }
        int i14 = f27101e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((com.google.android.exoplayer2.util.n1.getBigEndianInt(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static com.google.android.exoplayer2.z0 parseAc3AnnexFFormat(com.google.android.exoplayer2.util.v0 v0Var, String str, String str2, DrmInitData drmInitData) {
        com.google.android.exoplayer2.util.u0 u0Var = new com.google.android.exoplayer2.util.u0();
        u0Var.reset(v0Var);
        int i10 = f27098b[u0Var.readBits(2)];
        u0Var.skipBits(8);
        int i11 = f27100d[u0Var.readBits(3)];
        if (u0Var.readBits(1) != 0) {
            i11++;
        }
        int i12 = f27101e[u0Var.readBits(5)] * 1000;
        u0Var.byteAlign();
        v0Var.setPosition(u0Var.getBytePosition());
        return new com.google.android.exoplayer2.y0().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC3).setChannelCount(i11).setSampleRate(i10).setDrmInitData(drmInitData).setLanguage(str2).setAverageBitrate(i12).setPeakBitrate(i12).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f27097a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.audio.c parseAc3SyncframeInfo(com.google.android.exoplayer2.util.u0 r21) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.d.parseAc3SyncframeInfo(com.google.android.exoplayer2.util.u0):com.google.android.exoplayer2.audio.c");
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
    public static com.google.android.exoplayer2.z0 parseEAc3AnnexFFormat(com.google.android.exoplayer2.util.v0 r7, java.lang.String r8, java.lang.String r9, com.google.android.exoplayer2.drm.DrmInitData r10) {
        /*
            com.google.android.exoplayer2.util.u0 r0 = new com.google.android.exoplayer2.util.u0
            r0.<init>()
            r0.reset(r7)
            r1 = 13
            int r1 = r0.readBits(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.skipBits(r2)
            r3 = 2
            int r3 = r0.readBits(r3)
            int[] r4 = com.google.android.exoplayer2.audio.d.f27098b
            r3 = r4[r3]
            r4 = 10
            r0.skipBits(r4)
            int[] r4 = com.google.android.exoplayer2.audio.d.f27100d
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
            com.google.android.exoplayer2.y0 r7 = new com.google.android.exoplayer2.y0
            r7.<init>()
            com.google.android.exoplayer2.y0 r7 = r7.setId(r8)
            com.google.android.exoplayer2.y0 r7 = r7.setSampleMimeType(r2)
            com.google.android.exoplayer2.y0 r7 = r7.setChannelCount(r4)
            com.google.android.exoplayer2.y0 r7 = r7.setSampleRate(r3)
            com.google.android.exoplayer2.y0 r7 = r7.setDrmInitData(r10)
            com.google.android.exoplayer2.y0 r7 = r7.setLanguage(r9)
            com.google.android.exoplayer2.y0 r7 = r7.setPeakBitrate(r1)
            com.google.android.exoplayer2.z0 r7 = r7.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.d.parseEAc3AnnexFFormat(com.google.android.exoplayer2.util.v0, java.lang.String, java.lang.String, com.google.android.exoplayer2.drm.DrmInitData):com.google.android.exoplayer2.z0");
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
