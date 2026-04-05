package io.odeeo.internal.q0;

import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f65926a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f65927b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f65928c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f65929d = new int[10];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f65930a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65931b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65932c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65933d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f65934e;

        /* renamed from: f, reason: collision with root package name */
        public final int f65935f;

        /* renamed from: g, reason: collision with root package name */
        public final int f65936g;

        /* renamed from: h, reason: collision with root package name */
        public final int f65937h;

        /* renamed from: i, reason: collision with root package name */
        public final int f65938i;

        /* renamed from: j, reason: collision with root package name */
        public final float f65939j;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10) {
            this.f65930a = i10;
            this.f65931b = z10;
            this.f65932c = i11;
            this.f65933d = i12;
            this.f65934e = iArr;
            this.f65935f = i13;
            this.f65936g = i14;
            this.f65937h = i15;
            this.f65938i = i16;
            this.f65939j = f10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f65940a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65941b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65942c;

        public b(int i10, int i11, boolean z10) {
            this.f65940a = i10;
            this.f65941b = i11;
            this.f65942c = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f65943a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65944b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65945c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65946d;

        /* renamed from: e, reason: collision with root package name */
        public final int f65947e;

        /* renamed from: f, reason: collision with root package name */
        public final int f65948f;

        /* renamed from: g, reason: collision with root package name */
        public final float f65949g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f65950h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f65951i;

        /* renamed from: j, reason: collision with root package name */
        public final int f65952j;

        /* renamed from: k, reason: collision with root package name */
        public final int f65953k;

        /* renamed from: l, reason: collision with root package name */
        public final int f65954l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f65955m;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f65943a = i10;
            this.f65944b = i11;
            this.f65945c = i12;
            this.f65946d = i13;
            this.f65947e = i14;
            this.f65948f = i15;
            this.f65949g = f10;
            this.f65950h = z10;
            this.f65951i = z11;
            this.f65952j = i16;
            this.f65953k = i17;
            this.f65954l = i18;
            this.f65955m = z12;
        }
    }

    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static void b(y yVar) {
        int unsignedExpGolombCodedInt = yVar.readUnsignedExpGolombCodedInt();
        boolean bit = false;
        int i10 = 0;
        for (int i11 = 0; i11 < unsignedExpGolombCodedInt; i11++) {
            if (i11 != 0) {
                bit = yVar.readBit();
            }
            if (bit) {
                yVar.skipBit();
                yVar.readUnsignedExpGolombCodedInt();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (yVar.readBit()) {
                        yVar.skipBit();
                    }
                }
            } else {
                int unsignedExpGolombCodedInt2 = yVar.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = yVar.readUnsignedExpGolombCodedInt();
                int i13 = unsignedExpGolombCodedInt2 + unsignedExpGolombCodedInt3;
                for (int i14 = 0; i14 < unsignedExpGolombCodedInt2; i14++) {
                    yVar.readUnsignedExpGolombCodedInt();
                    yVar.skipBit();
                }
                for (int i15 = 0; i15 < unsignedExpGolombCodedInt3; i15++) {
                    yVar.readUnsignedExpGolombCodedInt();
                    yVar.skipBit();
                }
                i10 = i13;
            }
        }
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static int findNalUnit(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        io.odeeo.internal.q0.a.checkState(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            clearPrefixFlags(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    clearPrefixFlags(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static int getH265NalUnitType(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean isNalUnitSei(String str, byte b10) {
        return ("video/avc".equals(str) && (b10 & 31) == 6) || ("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39);
    }

    public static a parseH265SpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseH265SpsNalUnitPayload(bArr, i10 + 2, i11);
    }

    public static a parseH265SpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        int i12;
        boolean z10;
        y yVar = new y(bArr, i10, i11);
        yVar.skipBits(4);
        int bits = yVar.readBits(3);
        yVar.skipBit();
        int bits2 = yVar.readBits(2);
        boolean bit = yVar.readBit();
        int bits3 = yVar.readBits(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (yVar.readBit()) {
                i13 |= 1 << i14;
            }
        }
        int[] iArr = new int[6];
        for (int i15 = 0; i15 < 6; i15++) {
            iArr[i15] = yVar.readBits(8);
        }
        int bits4 = yVar.readBits(8);
        int i16 = 0;
        for (int i17 = 0; i17 < bits; i17++) {
            if (yVar.readBit()) {
                i16 += 89;
            }
            if (yVar.readBit()) {
                i16 += 8;
            }
        }
        yVar.skipBits(i16);
        if (bits > 0) {
            yVar.skipBits((8 - bits) * 2);
        }
        int unsignedExpGolombCodedInt = yVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = yVar.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt2 == 3) {
            yVar.skipBit();
        }
        int unsignedExpGolombCodedInt3 = yVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt4 = yVar.readUnsignedExpGolombCodedInt();
        if (yVar.readBit()) {
            int unsignedExpGolombCodedInt5 = yVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = yVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt7 = yVar.readUnsignedExpGolombCodedInt();
            i12 = bits2;
            int unsignedExpGolombCodedInt8 = yVar.readUnsignedExpGolombCodedInt();
            int i18 = (unsignedExpGolombCodedInt2 == 1 || unsignedExpGolombCodedInt2 == 2) ? 2 : 1;
            z10 = bit;
            int i19 = unsignedExpGolombCodedInt2 == 1 ? 2 : 1;
            unsignedExpGolombCodedInt3 = e3.g.B(unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt6, i18, unsignedExpGolombCodedInt3);
            unsignedExpGolombCodedInt4 = e3.g.B(unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt8, i19, unsignedExpGolombCodedInt4);
        } else {
            i12 = bits2;
            z10 = bit;
        }
        int i20 = unsignedExpGolombCodedInt3;
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt9 = yVar.readUnsignedExpGolombCodedInt();
        for (int i21 = yVar.readBit() ? 0 : bits; i21 <= bits; i21++) {
            yVar.readUnsignedExpGolombCodedInt();
            yVar.readUnsignedExpGolombCodedInt();
            yVar.readUnsignedExpGolombCodedInt();
        }
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        if (yVar.readBit() && yVar.readBit()) {
            a(yVar);
        }
        yVar.skipBits(2);
        if (yVar.readBit()) {
            yVar.skipBits(8);
            yVar.readUnsignedExpGolombCodedInt();
            yVar.readUnsignedExpGolombCodedInt();
            yVar.skipBit();
        }
        b(yVar);
        if (yVar.readBit()) {
            for (int i22 = 0; i22 < yVar.readUnsignedExpGolombCodedInt(); i22++) {
                yVar.skipBits(unsignedExpGolombCodedInt9 + 5);
            }
        }
        yVar.skipBits(2);
        float f10 = 1.0f;
        if (yVar.readBit()) {
            if (yVar.readBit()) {
                int bits5 = yVar.readBits(8);
                if (bits5 == 255) {
                    int bits6 = yVar.readBits(16);
                    int bits7 = yVar.readBits(16);
                    if (bits6 != 0 && bits7 != 0) {
                        f10 = bits6 / bits7;
                    }
                } else {
                    float[] fArr = f65927b;
                    if (bits5 < fArr.length) {
                        f10 = fArr[bits5];
                    } else {
                        e3.g.z(bits5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
            }
            if (yVar.readBit()) {
                yVar.skipBit();
            }
            if (yVar.readBit()) {
                yVar.skipBits(4);
                if (yVar.readBit()) {
                    yVar.skipBits(24);
                }
            }
            if (yVar.readBit()) {
                yVar.readUnsignedExpGolombCodedInt();
                yVar.readUnsignedExpGolombCodedInt();
            }
            yVar.skipBit();
            if (yVar.readBit()) {
                unsignedExpGolombCodedInt4 *= 2;
            }
        }
        return new a(i12, z10, bits3, i13, iArr, bits4, unsignedExpGolombCodedInt, i20, unsignedExpGolombCodedInt4, f10);
    }

    public static b parsePpsNalUnit(byte[] bArr, int i10, int i11) {
        return parsePpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    public static b parsePpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        y yVar = new y(bArr, i10, i11);
        int unsignedExpGolombCodedInt = yVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = yVar.readUnsignedExpGolombCodedInt();
        yVar.skipBit();
        return new b(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, yVar.readBit());
    }

    public static c parseSpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseSpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.q0.u.c parseSpsNalUnitPayload(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.q0.u.parseSpsNalUnitPayload(byte[], int, int):io.odeeo.internal.q0.u$c");
    }

    public static int unescapeStream(byte[] bArr, int i10) {
        int i11;
        synchronized (f65928c) {
            int iA = 0;
            int i12 = 0;
            while (iA < i10) {
                try {
                    iA = a(bArr, iA, i10);
                    if (iA < i10) {
                        int[] iArr = f65929d;
                        if (iArr.length <= i12) {
                            f65929d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f65929d[i12] = iA;
                        iA += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f65929d[i15] - i13;
                System.arraycopy(bArr, i13, bArr, i14, i16);
                int i17 = i14 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i14 = i17 + 2;
                bArr[i18] = 0;
                i13 += i16 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static void a(y yVar, int i10) {
        int signedExpGolombCodedInt = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((yVar.readSignedExpGolombCodedInt() + i11) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (signedExpGolombCodedInt != 0) {
                i11 = signedExpGolombCodedInt;
            }
        }
    }

    public static void a(y yVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!yVar.readBit()) {
                    yVar.readUnsignedExpGolombCodedInt();
                } else {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        yVar.readSignedExpGolombCodedInt();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        yVar.readSignedExpGolombCodedInt();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }
}
