package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.h2;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f27049a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f27050b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int a(com.google.android.exoplayer2.util.u0 u0Var) throws h2 {
        int bits = u0Var.readBits(4);
        if (bits == 15) {
            if (u0Var.bitsLeft() >= 24) {
                return u0Var.readBits(24);
            }
            throw h2.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (bits < 13) {
            return f27049a[bits];
        }
        throw h2.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i10, int i11) {
        int i12 = -1;
        for (int i13 = 0; i13 < 13; i13++) {
            if (i10 == f27049a[i13]) {
                i12 = i13;
            }
        }
        int i14 = -1;
        for (int i15 = 0; i15 < 16; i15++) {
            if (i11 == f27050b[i15]) {
                i14 = i15;
            }
        }
        if (i10 == -1 || i14 == -1) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "Invalid sample rate or number of channels: ", ", "));
        }
        return buildAudioSpecificConfig(2, i12, i14);
    }

    public static byte[] buildAudioSpecificConfig(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL))};
    }

    public static a parseAudioSpecificConfig(byte[] bArr) throws h2 {
        return parseAudioSpecificConfig(new com.google.android.exoplayer2.util.u0(bArr), false);
    }

    public static a parseAudioSpecificConfig(com.google.android.exoplayer2.util.u0 u0Var, boolean z10) throws h2 {
        int bits = u0Var.readBits(5);
        if (bits == 31) {
            bits = u0Var.readBits(6) + 32;
        }
        int iA = a(u0Var);
        int bits2 = u0Var.readBits(4);
        String strE = a.b.e(bits, "mp4a.40.");
        if (bits == 5 || bits == 29) {
            iA = a(u0Var);
            int bits3 = u0Var.readBits(5);
            if (bits3 == 31) {
                bits3 = u0Var.readBits(6) + 32;
            }
            bits = bits3;
            if (bits == 22) {
                bits2 = u0Var.readBits(4);
            }
        }
        if (z10) {
            if (bits != 1 && bits != 2 && bits != 3 && bits != 4 && bits != 6 && bits != 7 && bits != 17) {
                switch (bits) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw h2.createForUnsupportedContainerFeature("Unsupported audio object type: " + bits);
                }
            }
            if (u0Var.readBit()) {
                com.google.android.exoplayer2.util.f0.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (u0Var.readBit()) {
                u0Var.skipBits(14);
            }
            boolean bit = u0Var.readBit();
            if (bits2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (bits == 6 || bits == 20) {
                u0Var.skipBits(3);
            }
            if (bit) {
                if (bits == 22) {
                    u0Var.skipBits(16);
                }
                if (bits == 17 || bits == 19 || bits == 20 || bits == 23) {
                    u0Var.skipBits(3);
                }
                u0Var.skipBits(1);
            }
            switch (bits) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int bits4 = u0Var.readBits(2);
                    if (bits4 == 2 || bits4 == 3) {
                        throw h2.createForUnsupportedContainerFeature("Unsupported epConfig: " + bits4);
                    }
            }
        }
        int i10 = f27050b[bits2];
        if (i10 != -1) {
            return new a(iA, i10, strE);
        }
        throw h2.createForMalformedContainer(null, null);
    }
}
