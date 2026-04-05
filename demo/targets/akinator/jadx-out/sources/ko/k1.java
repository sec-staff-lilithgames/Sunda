package ko;

import android.util.Base64;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k1 {
    public static int[] getVorbisToAndroidChannelLayoutMapping(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int iLog(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static gn.u0 parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrSplitAtFirst = io.bidmachine.media3.common.util.a1.splitAtFirst(str, C3191e4.i.f36525b);
            if (strArrSplitAtFirst.length != 2) {
                e3.g.A("Failed to parse Vorbis comment: ", str, "VorbisUtil");
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(wo.a.fromPictureBlock(new io.bidmachine.media3.common.util.m0(Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (RuntimeException e10) {
                    io.bidmachine.media3.common.util.b0.w("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new bp.a(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new gn.u0(arrayList);
    }

    public static b5 parseVorbisCsdFromEsdsInitializationData(byte[] bArr) {
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(bArr);
        m0Var.skipBytes(1);
        int i10 = 0;
        while (m0Var.bytesLeft() > 0 && m0Var.peekUnsignedByte() == 255) {
            i10 += 255;
            m0Var.skipBytes(1);
        }
        int unsignedByte = m0Var.readUnsignedByte() + i10;
        int i11 = 0;
        while (m0Var.bytesLeft() > 0 && m0Var.peekUnsignedByte() == 255) {
            i11 += 255;
            m0Var.skipBytes(1);
        }
        int unsignedByte2 = m0Var.readUnsignedByte() + i11;
        byte[] bArr2 = new byte[unsignedByte];
        int position = m0Var.getPosition();
        System.arraycopy(bArr, position, bArr2, 0, unsignedByte);
        int i12 = position + unsignedByte + unsignedByte2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return b5.of(bArr2, bArr3);
    }

    public static h1 readVorbisCommentHeader(io.bidmachine.media3.common.util.m0 m0Var) throws gn.z0 {
        return readVorbisCommentHeader(m0Var, true, true);
    }

    public static j1 readVorbisIdentificationHeader(io.bidmachine.media3.common.util.m0 m0Var) throws gn.z0 {
        verifyVorbisHeaderCapturePattern(1, m0Var, false);
        int littleEndianUnsignedIntToInt = m0Var.readLittleEndianUnsignedIntToInt();
        int unsignedByte = m0Var.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = m0Var.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = m0Var.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = m0Var.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = m0Var.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = m0Var.readUnsignedByte();
        return new j1(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) Math.pow(2.0d, unsignedByte2 & 15), (int) Math.pow(2.0d, (unsignedByte2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (m0Var.readUnsignedByte() & 1) > 0, Arrays.copyOf(m0Var.getData(), m0Var.limit()));
    }

    public static i1[] readVorbisModes(io.bidmachine.media3.common.util.m0 m0Var, int i10) throws gn.z0 {
        int i11;
        int i12 = 5;
        verifyVorbisHeaderCapturePattern(5, m0Var, false);
        int i13 = 1;
        int unsignedByte = m0Var.readUnsignedByte() + 1;
        g1 g1Var = new g1(m0Var.getData());
        g1Var.skipBits(m0Var.getPosition() * 8);
        for (int i14 = 0; i14 < unsignedByte; i14++) {
            if (g1Var.readBits(24) != 5653314) {
                throw gn.z0.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + g1Var.getPosition(), null);
            }
            int bits = g1Var.readBits(16);
            int bits2 = g1Var.readBits(24);
            if (g1Var.readBit()) {
                g1Var.skipBits(5);
                for (int bits3 = 0; bits3 < bits2; bits3 += g1Var.readBits(iLog(bits2 - bits3))) {
                }
            } else {
                boolean bit = g1Var.readBit();
                for (int i15 = 0; i15 < bits2; i15++) {
                    if (!bit) {
                        g1Var.skipBits(5);
                    } else if (g1Var.readBit()) {
                        g1Var.skipBits(5);
                    }
                }
            }
            int bits4 = g1Var.readBits(4);
            if (bits4 > 2) {
                throw gn.z0.createForMalformedContainer("lookup type greater than 2 not decodable: " + bits4, null);
            }
            if (bits4 == 1 || bits4 == 2) {
                g1Var.skipBits(32);
                g1Var.skipBits(32);
                int bits5 = g1Var.readBits(4) + 1;
                g1Var.skipBits(1);
                g1Var.skipBits((int) ((bits4 == 1 ? bits != 0 ? (long) Math.floor(Math.pow(bits2, 1.0d / bits)) : 0L : bits * bits2) * bits5));
            }
        }
        int i16 = 6;
        int bits6 = g1Var.readBits(6) + 1;
        for (int i17 = 0; i17 < bits6; i17++) {
            if (g1Var.readBits(16) != 0) {
                throw gn.z0.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        int bits7 = g1Var.readBits(6) + 1;
        int i18 = 0;
        while (true) {
            int i19 = 3;
            if (i18 >= bits7) {
                int i20 = i16;
                int i21 = i13;
                int bits8 = g1Var.readBits(i20) + 1;
                int i22 = 0;
                while (i22 < bits8) {
                    if (g1Var.readBits(16) > 2) {
                        throw gn.z0.createForMalformedContainer("residueType greater than 2 is not decodable", null);
                    }
                    g1Var.skipBits(24);
                    g1Var.skipBits(24);
                    g1Var.skipBits(24);
                    int bits9 = g1Var.readBits(i20) + 1;
                    g1Var.skipBits(8);
                    int[] iArr = new int[bits9];
                    for (int i23 = 0; i23 < bits9; i23++) {
                        iArr[i23] = ((g1Var.readBit() ? g1Var.readBits(5) : 0) * 8) + g1Var.readBits(3);
                    }
                    for (int i24 = 0; i24 < bits9; i24++) {
                        for (int i25 = 0; i25 < 8; i25++) {
                            if ((iArr[i24] & (i21 << i25)) != 0) {
                                g1Var.skipBits(8);
                            }
                        }
                    }
                    i22++;
                    i20 = 6;
                }
                int bits10 = g1Var.readBits(i20) + 1;
                int i26 = 0;
                while (i26 < bits10) {
                    int bits11 = g1Var.readBits(16);
                    if (bits11 != 0) {
                        io.bidmachine.media3.common.util.b0.e("VorbisUtil", "mapping type other than 0 not supported: " + bits11);
                    } else {
                        int bits12 = g1Var.readBit() ? g1Var.readBits(4) + 1 : i21;
                        if (g1Var.readBit()) {
                            int bits13 = g1Var.readBits(8) + 1;
                            for (int i27 = 0; i27 < bits13; i27++) {
                                int i28 = i10 - 1;
                                g1Var.skipBits(iLog(i28));
                                g1Var.skipBits(iLog(i28));
                            }
                        }
                        if (g1Var.readBits(2) != 0) {
                            throw gn.z0.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                        }
                        if (bits12 > i21) {
                            for (int i29 = 0; i29 < i10; i29++) {
                                g1Var.skipBits(4);
                            }
                        }
                        for (int i30 = 0; i30 < bits12; i30++) {
                            g1Var.skipBits(8);
                            g1Var.skipBits(8);
                            g1Var.skipBits(8);
                        }
                    }
                    i26++;
                    i21 = 1;
                }
                int bits14 = g1Var.readBits(6) + 1;
                i1[] i1VarArr = new i1[bits14];
                for (int i31 = 0; i31 < bits14; i31++) {
                    i1VarArr[i31] = new i1(g1Var.readBit(), g1Var.readBits(16), g1Var.readBits(16), g1Var.readBits(8));
                }
                if (g1Var.readBit()) {
                    return i1VarArr;
                }
                throw gn.z0.createForMalformedContainer("framing bit after modes not set as expected", null);
            }
            int bits15 = g1Var.readBits(16);
            if (bits15 == 0) {
                i11 = i13;
                g1Var.skipBits(8);
                g1Var.skipBits(16);
                g1Var.skipBits(16);
                g1Var.skipBits(6);
                g1Var.skipBits(8);
                int bits16 = g1Var.readBits(4) + 1;
                for (int i32 = 0; i32 < bits16; i32++) {
                    g1Var.skipBits(8);
                }
            } else {
                if (bits15 != i13) {
                    throw gn.z0.createForMalformedContainer("floor type greater than 1 not decodable: " + bits15, null);
                }
                int bits17 = g1Var.readBits(i12);
                int[] iArr2 = new int[bits17];
                i11 = i13;
                int i33 = -1;
                for (int i34 = 0; i34 < bits17; i34++) {
                    int bits18 = g1Var.readBits(4);
                    iArr2[i34] = bits18;
                    if (bits18 > i33) {
                        i33 = bits18;
                    }
                }
                int i35 = i33 + 1;
                int[] iArr3 = new int[i35];
                int i36 = 0;
                while (i36 < i35) {
                    iArr3[i36] = g1Var.readBits(i19) + 1;
                    int bits19 = g1Var.readBits(2);
                    if (bits19 > 0) {
                        g1Var.skipBits(8);
                    }
                    for (int i37 = 0; i37 < (i11 << bits19); i37++) {
                        g1Var.skipBits(8);
                    }
                    i36++;
                    i19 = 3;
                }
                g1Var.skipBits(2);
                int bits20 = g1Var.readBits(4);
                int i38 = 0;
                int i39 = 0;
                for (int i40 = 0; i40 < bits17; i40++) {
                    i38 += iArr3[iArr2[i40]];
                    while (i39 < i38) {
                        g1Var.skipBits(bits20);
                        i39++;
                    }
                }
            }
            i18++;
            i13 = i11;
            i12 = 5;
            i16 = 6;
        }
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i10, io.bidmachine.media3.common.util.m0 m0Var, boolean z10) throws gn.z0 {
        if (m0Var.bytesLeft() < 7) {
            if (z10) {
                return false;
            }
            throw gn.z0.createForMalformedContainer("too short header: " + m0Var.bytesLeft(), null);
        }
        if (m0Var.readUnsignedByte() != i10) {
            if (z10) {
                return false;
            }
            throw gn.z0.createForMalformedContainer("expected header type " + Integer.toHexString(i10), null);
        }
        if (m0Var.readUnsignedByte() == 118 && m0Var.readUnsignedByte() == 111 && m0Var.readUnsignedByte() == 114 && m0Var.readUnsignedByte() == 98 && m0Var.readUnsignedByte() == 105 && m0Var.readUnsignedByte() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw gn.z0.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static h1 readVorbisCommentHeader(io.bidmachine.media3.common.util.m0 m0Var, boolean z10, boolean z11) throws gn.z0 {
        if (z10) {
            verifyVorbisHeaderCapturePattern(3, m0Var, false);
        }
        String string = m0Var.readString((int) m0Var.readLittleEndianUnsignedInt());
        int length = string.length();
        long littleEndianUnsignedInt = m0Var.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) littleEndianUnsignedInt];
        int length2 = length + 15;
        for (int i10 = 0; i10 < littleEndianUnsignedInt; i10++) {
            String string2 = m0Var.readString((int) m0Var.readLittleEndianUnsignedInt());
            strArr[i10] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z11 && (m0Var.readUnsignedByte() & 1) == 0) {
            throw gn.z0.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new h1(string, strArr, length2 + 1);
    }
}
