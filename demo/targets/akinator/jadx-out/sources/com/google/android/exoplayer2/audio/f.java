package com.google.android.exoplayer2.audio;

import com.amazon.device.ads.DtbConstants;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f27120a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, DtbConstants.DEFAULT_PLAYER_HEIGHT, 400, 400, 2048};

    public static void getAc4SampleHeader(int i10, com.google.android.exoplayer2.util.v0 v0Var) {
        v0Var.reset(7);
        byte[] data = v0Var.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i10 >> 16) & 255);
        data[5] = (byte) ((i10 >> 8) & 255);
        data[6] = (byte) (i10 & 255);
    }

    public static com.google.android.exoplayer2.z0 parseAc4AnnexEFormat(com.google.android.exoplayer2.util.v0 v0Var, String str, String str2, DrmInitData drmInitData) {
        v0Var.skipBytes(1);
        return new com.google.android.exoplayer2.y0().setId(str).setSampleMimeType("audio/ac4").setChannelCount(2).setSampleRate(((v0Var.readUnsignedByte() & 32) >> 5) == 1 ? 48000 : 44100).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new com.google.android.exoplayer2.util.u0(bArr)).f27113c;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.audio.e parseAc4SyncframeInfo(com.google.android.exoplayer2.util.u0 r9) {
        /*
            r0 = 16
            int r1 = r9.readBits(r0)
            int r0 = r9.readBits(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.readBits(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.readBits(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.readBits(r1)
            boolean r2 = r9.readBit()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.readBits(r2)
            boolean r5 = r9.readBit()
            if (r5 == 0) goto L47
            int r5 = r9.readBits(r4)
            if (r5 <= 0) goto L47
            r9.skipBits(r1)
        L47:
            boolean r5 = r9.readBit()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.readBits(r3)
            int[] r8 = com.google.android.exoplayer2.audio.f.f27120a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            com.google.android.exoplayer2.audio.e r1 = new com.google.android.exoplayer2.audio.e
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.f.parseAc4SyncframeInfo(com.google.android.exoplayer2.util.u0):com.google.android.exoplayer2.audio.e");
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        if (i12 == 65535) {
            i12 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }
}
