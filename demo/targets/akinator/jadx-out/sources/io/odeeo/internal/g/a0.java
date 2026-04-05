package io.odeeo.internal.g;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import io.odeeo.internal.b.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64083a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64084b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f64085c;

        /* renamed from: d, reason: collision with root package name */
        public final int f64086d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f64087e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f64083a = i10;
            this.f64084b = i11;
            this.f64085c = jArr;
            this.f64086d = i12;
            this.f64087e = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f64088a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f64089b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64090c;

        public b(String str, String[] strArr, int i10) {
            this.f64088a = str;
            this.f64089b = strArr;
            this.f64090c = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f64091a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64092b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64093c;

        /* renamed from: d, reason: collision with root package name */
        public final int f64094d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f64091a = z10;
            this.f64092b = i10;
            this.f64093c = i11;
            this.f64094d = i12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f64095a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64096b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64097c;

        /* renamed from: d, reason: collision with root package name */
        public final int f64098d;

        /* renamed from: e, reason: collision with root package name */
        public final int f64099e;

        /* renamed from: f, reason: collision with root package name */
        public final int f64100f;

        /* renamed from: g, reason: collision with root package name */
        public final int f64101g;

        /* renamed from: h, reason: collision with root package name */
        public final int f64102h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f64103i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f64104j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f64095a = i10;
            this.f64096b = i11;
            this.f64097c = i12;
            this.f64098d = i13;
            this.f64099e = i14;
            this.f64100f = i15;
            this.f64101g = i16;
            this.f64102h = i17;
            this.f64103i = z10;
            this.f64104j = bArr;
        }
    }

    public static void a(int i10, z zVar) throws g0 {
        int bits = zVar.readBits(6) + 1;
        for (int i11 = 0; i11 < bits; i11++) {
            int bits2 = zVar.readBits(16);
            if (bits2 != 0) {
                io.odeeo.internal.q0.p.e("VorbisUtil", "mapping type other than 0 not supported: " + bits2);
            } else {
                int bits3 = zVar.readBit() ? zVar.readBits(4) + 1 : 1;
                if (zVar.readBit()) {
                    int bits4 = zVar.readBits(8) + 1;
                    for (int i12 = 0; i12 < bits4; i12++) {
                        int i13 = i10 - 1;
                        zVar.skipBits(iLog(i13));
                        zVar.skipBits(iLog(i13));
                    }
                }
                if (zVar.readBits(2) != 0) {
                    throw g0.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (bits3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        zVar.skipBits(4);
                    }
                }
                for (int i15 = 0; i15 < bits3; i15++) {
                    zVar.skipBits(8);
                    zVar.skipBits(8);
                    zVar.skipBits(8);
                }
            }
        }
    }

    public static void b(z zVar) throws g0 {
        int bits = zVar.readBits(6) + 1;
        for (int i10 = 0; i10 < bits; i10++) {
            int bits2 = zVar.readBits(16);
            if (bits2 == 0) {
                zVar.skipBits(8);
                zVar.skipBits(16);
                zVar.skipBits(16);
                zVar.skipBits(6);
                zVar.skipBits(8);
                int bits3 = zVar.readBits(4) + 1;
                for (int i11 = 0; i11 < bits3; i11++) {
                    zVar.skipBits(8);
                }
            } else {
                if (bits2 != 1) {
                    throw g0.createForMalformedContainer("floor type greater than 1 not decodable: " + bits2, null);
                }
                int bits4 = zVar.readBits(5);
                int[] iArr = new int[bits4];
                int i12 = -1;
                for (int i13 = 0; i13 < bits4; i13++) {
                    int bits5 = zVar.readBits(4);
                    iArr[i13] = bits5;
                    if (bits5 > i12) {
                        i12 = bits5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = zVar.readBits(3) + 1;
                    int bits6 = zVar.readBits(2);
                    if (bits6 > 0) {
                        zVar.skipBits(8);
                    }
                    for (int i16 = 0; i16 < (1 << bits6); i16++) {
                        zVar.skipBits(8);
                    }
                }
                zVar.skipBits(2);
                int bits7 = zVar.readBits(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < bits4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        zVar.skipBits(bits7);
                        i18++;
                    }
                }
            }
        }
    }

    public static c[] c(z zVar) {
        int bits = zVar.readBits(6) + 1;
        c[] cVarArr = new c[bits];
        for (int i10 = 0; i10 < bits; i10++) {
            cVarArr[i10] = new c(zVar.readBit(), zVar.readBits(16), zVar.readBits(16), zVar.readBits(8));
        }
        return cVarArr;
    }

    public static void d(z zVar) throws g0 {
        int bits = zVar.readBits(6) + 1;
        for (int i10 = 0; i10 < bits; i10++) {
            if (zVar.readBits(16) > 2) {
                throw g0.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            zVar.skipBits(24);
            zVar.skipBits(24);
            zVar.skipBits(24);
            int bits2 = zVar.readBits(6) + 1;
            zVar.skipBits(8);
            int[] iArr = new int[bits2];
            for (int i11 = 0; i11 < bits2; i11++) {
                iArr[i11] = ((zVar.readBit() ? zVar.readBits(5) : 0) * 8) + zVar.readBits(3);
            }
            for (int i12 = 0; i12 < bits2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        zVar.skipBits(8);
                    }
                }
            }
        }
    }

    public static int iLog(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static b readVorbisCommentHeader(io.odeeo.internal.q0.x xVar) throws g0 {
        return readVorbisCommentHeader(xVar, true, true);
    }

    public static d readVorbisIdentificationHeader(io.odeeo.internal.q0.x xVar) throws g0 {
        verifyVorbisHeaderCapturePattern(1, xVar, false);
        int littleEndianUnsignedIntToInt = xVar.readLittleEndianUnsignedIntToInt();
        int unsignedByte = xVar.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = xVar.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = xVar.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = xVar.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = xVar.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = xVar.readUnsignedByte();
        return new d(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) Math.pow(2.0d, unsignedByte2 & 15), (int) Math.pow(2.0d, (unsignedByte2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (xVar.readUnsignedByte() & 1) > 0, Arrays.copyOf(xVar.getData(), xVar.limit()));
    }

    public static c[] readVorbisModes(io.odeeo.internal.q0.x xVar, int i10) throws g0 {
        verifyVorbisHeaderCapturePattern(5, xVar, false);
        int unsignedByte = xVar.readUnsignedByte() + 1;
        z zVar = new z(xVar.getData());
        zVar.skipBits(xVar.getPosition() * 8);
        for (int i11 = 0; i11 < unsignedByte; i11++) {
            a(zVar);
        }
        int bits = zVar.readBits(6) + 1;
        for (int i12 = 0; i12 < bits; i12++) {
            if (zVar.readBits(16) != 0) {
                throw g0.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        b(zVar);
        d(zVar);
        a(i10, zVar);
        c[] cVarArrC = c(zVar);
        if (zVar.readBit()) {
            return cVarArrC;
        }
        throw g0.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i10, io.odeeo.internal.q0.x xVar, boolean z10) throws g0 {
        if (xVar.bytesLeft() < 7) {
            if (z10) {
                return false;
            }
            throw g0.createForMalformedContainer("too short header: " + xVar.bytesLeft(), null);
        }
        if (xVar.readUnsignedByte() != i10) {
            if (z10) {
                return false;
            }
            throw g0.createForMalformedContainer("expected header type " + Integer.toHexString(i10), null);
        }
        if (xVar.readUnsignedByte() == 118 && xVar.readUnsignedByte() == 111 && xVar.readUnsignedByte() == 114 && xVar.readUnsignedByte() == 98 && xVar.readUnsignedByte() == 105 && xVar.readUnsignedByte() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw g0.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static b readVorbisCommentHeader(io.odeeo.internal.q0.x xVar, boolean z10, boolean z11) throws g0 {
        if (z10) {
            verifyVorbisHeaderCapturePattern(3, xVar, false);
        }
        String string = xVar.readString((int) xVar.readLittleEndianUnsignedInt());
        int length = string.length();
        long littleEndianUnsignedInt = xVar.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) littleEndianUnsignedInt];
        int length2 = length + 15;
        for (int i10 = 0; i10 < littleEndianUnsignedInt; i10++) {
            String string2 = xVar.readString((int) xVar.readLittleEndianUnsignedInt());
            strArr[i10] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z11 && (xVar.readUnsignedByte() & 1) == 0) {
            throw g0.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new b(string, strArr, length2 + 1);
    }

    public static a a(z zVar) throws g0 {
        if (zVar.readBits(24) == 5653314) {
            int bits = zVar.readBits(16);
            int bits2 = zVar.readBits(24);
            long[] jArr = new long[bits2];
            boolean bit = zVar.readBit();
            long jA = 0;
            if (!bit) {
                boolean bit2 = zVar.readBit();
                for (int i10 = 0; i10 < bits2; i10++) {
                    if (bit2) {
                        if (zVar.readBit()) {
                            jArr[i10] = zVar.readBits(5) + 1;
                        } else {
                            jArr[i10] = 0;
                        }
                    } else {
                        jArr[i10] = zVar.readBits(5) + 1;
                    }
                }
            } else {
                int bits3 = zVar.readBits(5) + 1;
                int i11 = 0;
                while (i11 < bits2) {
                    int bits4 = zVar.readBits(iLog(bits2 - i11));
                    for (int i12 = 0; i12 < bits4 && i11 < bits2; i12++) {
                        jArr[i11] = bits3;
                        i11++;
                    }
                    bits3++;
                }
            }
            int bits5 = zVar.readBits(4);
            if (bits5 <= 2) {
                if (bits5 == 1 || bits5 == 2) {
                    zVar.skipBits(32);
                    zVar.skipBits(32);
                    int bits6 = zVar.readBits(4) + 1;
                    zVar.skipBits(1);
                    if (bits5 != 1) {
                        jA = bits2 * bits;
                    } else if (bits != 0) {
                        jA = a(bits2, bits);
                    }
                    zVar.skipBits((int) (jA * bits6));
                }
                return new a(bits, bits2, jArr, bits5, bit);
            }
            throw g0.createForMalformedContainer("lookup type greater than 2 not decodable: " + bits5, null);
        }
        throw g0.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + zVar.getPosition(), null);
    }

    public static long a(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }
}
