package ee;

import android.util.Base64;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class r0 {
    public static int iLog(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static Metadata parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrSplitAtFirst = n1.splitAtFirst(str, C3191e4.i.f36525b);
            if (strArrSplitAtFirst.length != 2) {
                e3.g.w("Failed to parse Vorbis comment: ", str, "VorbisUtil");
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new v0(Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (RuntimeException e10) {
                    com.google.android.exoplayer2.util.f0.w("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static o0 readVorbisCommentHeader(v0 v0Var) throws h2 {
        return readVorbisCommentHeader(v0Var, true, true);
    }

    public static q0 readVorbisIdentificationHeader(v0 v0Var) throws h2 {
        verifyVorbisHeaderCapturePattern(1, v0Var, false);
        int littleEndianUnsignedIntToInt = v0Var.readLittleEndianUnsignedIntToInt();
        int unsignedByte = v0Var.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = v0Var.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = v0Var.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = v0Var.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = v0Var.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = v0Var.readUnsignedByte();
        return new q0(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) Math.pow(2.0d, unsignedByte2 & 15), (int) Math.pow(2.0d, (unsignedByte2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (v0Var.readUnsignedByte() & 1) > 0, Arrays.copyOf(v0Var.getData(), v0Var.limit()));
    }

    public static p0[] readVorbisModes(v0 v0Var, int i10) throws h2 {
        int i11;
        int i12 = 5;
        verifyVorbisHeaderCapturePattern(5, v0Var, false);
        int i13 = 1;
        int unsignedByte = v0Var.readUnsignedByte() + 1;
        n0 n0Var = new n0(v0Var.getData());
        n0Var.skipBits(v0Var.getPosition() * 8);
        for (int i14 = 0; i14 < unsignedByte; i14++) {
            if (n0Var.readBits(24) != 5653314) {
                throw h2.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + n0Var.getPosition(), null);
            }
            int bits = n0Var.readBits(16);
            int bits2 = n0Var.readBits(24);
            if (n0Var.readBit()) {
                n0Var.skipBits(5);
                for (int bits3 = 0; bits3 < bits2; bits3 += n0Var.readBits(iLog(bits2 - bits3))) {
                }
            } else {
                boolean bit = n0Var.readBit();
                for (int i15 = 0; i15 < bits2; i15++) {
                    if (!bit) {
                        n0Var.skipBits(5);
                    } else if (n0Var.readBit()) {
                        n0Var.skipBits(5);
                    }
                }
            }
            int bits4 = n0Var.readBits(4);
            if (bits4 > 2) {
                throw h2.createForMalformedContainer("lookup type greater than 2 not decodable: " + bits4, null);
            }
            if (bits4 == 1 || bits4 == 2) {
                n0Var.skipBits(32);
                n0Var.skipBits(32);
                int bits5 = n0Var.readBits(4) + 1;
                n0Var.skipBits(1);
                n0Var.skipBits((int) ((bits4 == 1 ? bits != 0 ? (long) Math.floor(Math.pow(bits2, 1.0d / bits)) : 0L : bits * bits2) * bits5));
            }
        }
        int i16 = 6;
        int bits6 = n0Var.readBits(6) + 1;
        for (int i17 = 0; i17 < bits6; i17++) {
            if (n0Var.readBits(16) != 0) {
                throw h2.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        int bits7 = n0Var.readBits(6) + 1;
        int i18 = 0;
        while (true) {
            int i19 = 3;
            if (i18 >= bits7) {
                int i20 = i16;
                int i21 = i13;
                int bits8 = n0Var.readBits(i20) + 1;
                int i22 = 0;
                while (i22 < bits8) {
                    if (n0Var.readBits(16) > 2) {
                        throw h2.createForMalformedContainer("residueType greater than 2 is not decodable", null);
                    }
                    n0Var.skipBits(24);
                    n0Var.skipBits(24);
                    n0Var.skipBits(24);
                    int bits9 = n0Var.readBits(i20) + 1;
                    n0Var.skipBits(8);
                    int[] iArr = new int[bits9];
                    for (int i23 = 0; i23 < bits9; i23++) {
                        iArr[i23] = ((n0Var.readBit() ? n0Var.readBits(5) : 0) * 8) + n0Var.readBits(3);
                    }
                    for (int i24 = 0; i24 < bits9; i24++) {
                        for (int i25 = 0; i25 < 8; i25++) {
                            if ((iArr[i24] & (i21 << i25)) != 0) {
                                n0Var.skipBits(8);
                            }
                        }
                    }
                    i22++;
                    i20 = 6;
                }
                int bits10 = n0Var.readBits(i20) + 1;
                int i26 = 0;
                while (i26 < bits10) {
                    int bits11 = n0Var.readBits(16);
                    if (bits11 != 0) {
                        com.google.android.exoplayer2.util.f0.e("VorbisUtil", "mapping type other than 0 not supported: " + bits11);
                    } else {
                        int bits12 = n0Var.readBit() ? n0Var.readBits(4) + 1 : i21;
                        if (n0Var.readBit()) {
                            int bits13 = n0Var.readBits(8) + 1;
                            for (int i27 = 0; i27 < bits13; i27++) {
                                int i28 = i10 - 1;
                                n0Var.skipBits(iLog(i28));
                                n0Var.skipBits(iLog(i28));
                            }
                        }
                        if (n0Var.readBits(2) != 0) {
                            throw h2.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                        }
                        if (bits12 > i21) {
                            for (int i29 = 0; i29 < i10; i29++) {
                                n0Var.skipBits(4);
                            }
                        }
                        for (int i30 = 0; i30 < bits12; i30++) {
                            n0Var.skipBits(8);
                            n0Var.skipBits(8);
                            n0Var.skipBits(8);
                        }
                    }
                    i26++;
                    i21 = 1;
                }
                int bits14 = n0Var.readBits(6) + 1;
                p0[] p0VarArr = new p0[bits14];
                for (int i31 = 0; i31 < bits14; i31++) {
                    p0VarArr[i31] = new p0(n0Var.readBit(), n0Var.readBits(16), n0Var.readBits(16), n0Var.readBits(8));
                }
                if (n0Var.readBit()) {
                    return p0VarArr;
                }
                throw h2.createForMalformedContainer("framing bit after modes not set as expected", null);
            }
            int bits15 = n0Var.readBits(16);
            if (bits15 == 0) {
                i11 = i13;
                n0Var.skipBits(8);
                n0Var.skipBits(16);
                n0Var.skipBits(16);
                n0Var.skipBits(6);
                n0Var.skipBits(8);
                int bits16 = n0Var.readBits(4) + 1;
                for (int i32 = 0; i32 < bits16; i32++) {
                    n0Var.skipBits(8);
                }
            } else {
                if (bits15 != i13) {
                    throw h2.createForMalformedContainer("floor type greater than 1 not decodable: " + bits15, null);
                }
                int bits17 = n0Var.readBits(i12);
                int[] iArr2 = new int[bits17];
                i11 = i13;
                int i33 = -1;
                for (int i34 = 0; i34 < bits17; i34++) {
                    int bits18 = n0Var.readBits(4);
                    iArr2[i34] = bits18;
                    if (bits18 > i33) {
                        i33 = bits18;
                    }
                }
                int i35 = i33 + 1;
                int[] iArr3 = new int[i35];
                int i36 = 0;
                while (i36 < i35) {
                    iArr3[i36] = n0Var.readBits(i19) + 1;
                    int bits19 = n0Var.readBits(2);
                    if (bits19 > 0) {
                        n0Var.skipBits(8);
                    }
                    for (int i37 = 0; i37 < (i11 << bits19); i37++) {
                        n0Var.skipBits(8);
                    }
                    i36++;
                    i19 = 3;
                }
                n0Var.skipBits(2);
                int bits20 = n0Var.readBits(4);
                int i38 = 0;
                int i39 = 0;
                for (int i40 = 0; i40 < bits17; i40++) {
                    i38 += iArr3[iArr2[i40]];
                    while (i39 < i38) {
                        n0Var.skipBits(bits20);
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

    public static boolean verifyVorbisHeaderCapturePattern(int i10, v0 v0Var, boolean z10) throws h2 {
        if (v0Var.bytesLeft() < 7) {
            if (z10) {
                return false;
            }
            throw h2.createForMalformedContainer("too short header: " + v0Var.bytesLeft(), null);
        }
        if (v0Var.readUnsignedByte() != i10) {
            if (z10) {
                return false;
            }
            throw h2.createForMalformedContainer("expected header type " + Integer.toHexString(i10), null);
        }
        if (v0Var.readUnsignedByte() == 118 && v0Var.readUnsignedByte() == 111 && v0Var.readUnsignedByte() == 114 && v0Var.readUnsignedByte() == 98 && v0Var.readUnsignedByte() == 105 && v0Var.readUnsignedByte() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw h2.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static o0 readVorbisCommentHeader(v0 v0Var, boolean z10, boolean z11) throws h2 {
        if (z10) {
            verifyVorbisHeaderCapturePattern(3, v0Var, false);
        }
        String string = v0Var.readString((int) v0Var.readLittleEndianUnsignedInt());
        int length = string.length();
        long littleEndianUnsignedInt = v0Var.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) littleEndianUnsignedInt];
        int length2 = length + 15;
        for (int i10 = 0; i10 < littleEndianUnsignedInt; i10++) {
            String string2 = v0Var.readString((int) v0Var.readLittleEndianUnsignedInt());
            strArr[i10] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z11 && (v0Var.readUnsignedByte() & 1) == 0) {
            throw h2.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new o0(string, strArr, length2 + 1);
    }
}
