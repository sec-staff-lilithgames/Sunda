package io.odeeo.internal.d;

import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.b.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f63311a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f63312b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f63313a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63314b;

        /* renamed from: c, reason: collision with root package name */
        public final String f63315c;

        public b(int i10, int i11, String str) {
            this.f63313a = i10;
            this.f63314b = i11;
            this.f63315c = str;
        }
    }

    public static int a(io.odeeo.internal.q0.w wVar) {
        int bits = wVar.readBits(5);
        return bits == 31 ? wVar.readBits(6) + 32 : bits;
    }

    public static int b(io.odeeo.internal.q0.w wVar) throws g0 {
        int bits = wVar.readBits(4);
        if (bits == 15) {
            return wVar.readBits(24);
        }
        if (bits < 13) {
            return f63311a[bits];
        }
        throw g0.createForMalformedContainer(null, null);
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f63311a;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f63312b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 == -1 || i15 == -1) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "Invalid sample rate or number of channels: ", ", "));
        }
        return buildAudioSpecificConfig(2, i13, i15);
    }

    public static byte[] buildAudioSpecificConfig(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL))};
    }

    public static b parseAudioSpecificConfig(byte[] bArr) throws g0 {
        return parseAudioSpecificConfig(new io.odeeo.internal.q0.w(bArr), false);
    }

    public static b parseAudioSpecificConfig(io.odeeo.internal.q0.w wVar, boolean z10) throws g0 {
        int iA = a(wVar);
        int iB = b(wVar);
        int bits = wVar.readBits(4);
        String strE = a.b.e(iA, "mp4a.40.");
        if (iA == 5 || iA == 29) {
            iB = b(wVar);
            iA = a(wVar);
            if (iA == 22) {
                bits = wVar.readBits(4);
            }
        }
        if (z10) {
            if (iA != 6 && iA != 7 && iA != 17 && iA != 1 && iA != 2 && iA != 3 && iA != 4) {
                switch (iA) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw g0.createForUnsupportedContainerFeature("Unsupported audio object type: " + iA);
                }
            }
            a(wVar, iA, bits);
            switch (iA) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int bits2 = wVar.readBits(2);
                    if (bits2 == 2 || bits2 == 3) {
                        throw g0.createForUnsupportedContainerFeature("Unsupported epConfig: " + bits2);
                    }
            }
        }
        int i10 = f63312b[bits];
        if (i10 != -1) {
            return new b(iB, i10, strE);
        }
        throw g0.createForMalformedContainer(null, null);
    }

    public static void a(io.odeeo.internal.q0.w wVar, int i10, int i11) {
        if (wVar.readBit()) {
            io.odeeo.internal.q0.p.w("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (wVar.readBit()) {
            wVar.skipBits(14);
        }
        boolean bit = wVar.readBit();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            wVar.skipBits(3);
        }
        if (bit) {
            if (i10 == 22) {
                wVar.skipBits(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                wVar.skipBits(3);
            }
            wVar.skipBits(1);
        }
    }
}
