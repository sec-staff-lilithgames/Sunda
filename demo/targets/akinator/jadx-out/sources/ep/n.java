package ep;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.t0;
import gn.u0;
import gn.x0;
import gn.z0;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.util.ArrayList;
import java.util.List;
import ko.n0;
import mh.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f54887a = a1.getUtf8Bytes("OpusHead");

    public static d a(int i10, m0 m0Var) {
        m0Var.setPosition(i10 + 12);
        m0Var.skipBytes(1);
        b(m0Var);
        m0Var.skipBytes(2);
        int unsignedByte = m0Var.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            m0Var.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            m0Var.skipBytes(m0Var.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            m0Var.skipBytes(2);
        }
        m0Var.skipBytes(1);
        b(m0Var);
        String mimeTypeFromMp4ObjectType = x0.getMimeTypeFromMp4ObjectType(m0Var.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new d(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        m0Var.skipBytes(4);
        long unsignedInt = m0Var.readUnsignedInt();
        long unsignedInt2 = m0Var.readUnsignedInt();
        m0Var.skipBytes(1);
        int iB = b(m0Var);
        long j10 = unsignedInt2;
        byte[] bArr = new byte[iB];
        m0Var.readBytes(bArr, 0, iB);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new d(mimeTypeFromMp4ObjectType, bArr, j10, unsignedInt > 0 ? unsignedInt : -1L);
    }

    public static int b(m0 m0Var) {
        int unsignedByte = m0Var.readUnsignedByte();
        int i10 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = m0Var.readUnsignedByte();
            i10 = (i10 << 7) | (unsignedByte & 127);
        }
        return i10;
    }

    public static Pair c(m0 m0Var, int i10, int i11) throws z0 {
        Integer num;
        d0 d0Var;
        Pair pairCreate;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int position = m0Var.getPosition();
        while (position - i10 < i11) {
            m0Var.setPosition(position);
            int i14 = m0Var.readInt();
            ko.d0.checkContainerInput(i14 > 0, "childAtomSize must be positive");
            if (m0Var.readInt() == 1936289382) {
                int i15 = position + 8;
                int i16 = 0;
                int i17 = -1;
                Integer numValueOf = null;
                String string = null;
                while (i15 - position < i14) {
                    m0Var.setPosition(i15);
                    int i18 = m0Var.readInt();
                    int i19 = m0Var.readInt();
                    if (i19 == 1718775137) {
                        numValueOf = Integer.valueOf(m0Var.readInt());
                    } else if (i19 == 1935894637) {
                        m0Var.skipBytes(4);
                        string = m0Var.readString(4);
                    } else if (i19 == 1935894633) {
                        i17 = i15;
                        i16 = i18;
                    }
                    i15 += i18;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(string) || C.CENC_TYPE_cbc1.equals(string) || C.CENC_TYPE_cens.equals(string) || C.CENC_TYPE_cbcs.equals(string)) {
                    ko.d0.checkContainerInput(numValueOf != null, "frma atom is mandatory");
                    ko.d0.checkContainerInput(i17 != -1, "schi atom is mandatory");
                    int i20 = i17 + 8;
                    while (true) {
                        if (i20 - i17 >= i16) {
                            num = numValueOf;
                            d0Var = null;
                            break;
                        }
                        m0Var.setPosition(i20);
                        int i21 = m0Var.readInt();
                        if (m0Var.readInt() == 1952804451) {
                            int fullBoxVersion = parseFullBoxVersion(m0Var.readInt());
                            m0Var.skipBytes(1);
                            if (fullBoxVersion == 0) {
                                m0Var.skipBytes(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int unsignedByte = m0Var.readUnsignedByte();
                                i12 = unsignedByte & 15;
                                i13 = (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            if (m0Var.readUnsignedByte() == 1) {
                                num2 = numValueOf;
                                z10 = true;
                            } else {
                                num2 = numValueOf;
                                z10 = false;
                            }
                            int unsignedByte2 = m0Var.readUnsignedByte();
                            byte[] bArr2 = new byte[16];
                            m0Var.readBytes(bArr2, 0, 16);
                            if (z10 && unsignedByte2 == 0) {
                                int unsignedByte3 = m0Var.readUnsignedByte();
                                byte[] bArr3 = new byte[unsignedByte3];
                                m0Var.readBytes(bArr3, 0, unsignedByte3);
                                bArr = bArr3;
                            }
                            num = num2;
                            d0Var = new d0(z10, string, unsignedByte2, bArr2, i13, i12, bArr);
                        } else {
                            i20 += i21;
                        }
                    }
                    ko.d0.checkContainerInput(d0Var != null, "tenc atom is mandatory");
                    pairCreate = Pair.create(num, (d0) a1.castNonNull(d0Var));
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            position += i14;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0594  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(io.bidmachine.media3.common.util.m0 r42, int r43, int r44, int r45, int r46, java.lang.String r47, int r48, io.bidmachine.media3.common.DrmInitData r49, ep.i r50, int r51) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 2422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.n.d(io.bidmachine.media3.common.util.m0, int, int, int, int, java.lang.String, int, io.bidmachine.media3.common.DrmInitData, ep.i, int):void");
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(m0 m0Var) {
        int position = m0Var.getPosition();
        m0Var.skipBytes(4);
        if (m0Var.readInt() != 1751411826) {
            position += 4;
        }
        m0Var.setPosition(position);
    }

    public static int parseFullBoxFlags(int i10) {
        return i10 & 16777215;
    }

    public static int parseFullBoxVersion(int i10) {
        return (i10 >> 24) & 255;
    }

    public static u0 parseMdtaFromMeta(jn.c cVar) {
        jn.d leafBoxOfType = cVar.getLeafBoxOfType(1751411826);
        jn.d leafBoxOfType2 = cVar.getLeafBoxOfType(1801812339);
        jn.d leafBoxOfType3 = cVar.getLeafBoxOfType(1768715124);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null) {
            return null;
        }
        m0 m0Var = leafBoxOfType.f69729b;
        m0Var.setPosition(16);
        if (m0Var.readInt() != 1835299937) {
            return null;
        }
        m0 m0Var2 = leafBoxOfType2.f69729b;
        m0Var2.setPosition(12);
        int i10 = m0Var2.readInt();
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = m0Var2.readInt();
            m0Var2.skipBytes(4);
            strArr[i11] = m0Var2.readString(i12 - 8);
        }
        m0 m0Var3 = leafBoxOfType3.f69729b;
        m0Var3.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (m0Var3.bytesLeft() > 8) {
            int position = m0Var3.getPosition();
            int i13 = m0Var3.readInt();
            int i14 = m0Var3.readInt() - 1;
            if (i14 < 0 || i14 >= i10) {
                e3.g.t(i14, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                jn.a mdtaMetadataEntryFromIlst = u.parseMdtaMetadataEntryFromIlst(m0Var3, position + i13, strArr[i14]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            m0Var3.setPosition(position + i13);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u0(arrayList);
    }

    public static jn.g parseMvhd(m0 m0Var) {
        long unsignedInt;
        long unsignedInt2;
        m0Var.setPosition(8);
        if (parseFullBoxVersion(m0Var.readInt()) == 0) {
            unsignedInt = m0Var.readUnsignedInt();
            unsignedInt2 = m0Var.readUnsignedInt();
        } else {
            unsignedInt = m0Var.readLong();
            unsignedInt2 = m0Var.readLong();
        }
        return new jn.g(unsignedInt, unsignedInt2, m0Var.readUnsignedInt());
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ep.f0 parseStbl(ep.c0 r43, jn.c r44, ko.n0 r45) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.n.parseStbl(ep.c0, jn.c, ko.n0):ep.f0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        r18 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ep.c0 parseTrak(jn.c r47, jn.d r48, long r49, io.bidmachine.media3.common.DrmInitData r51, boolean r52, boolean r53) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 2672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.n.parseTrak(jn.c, jn.d, long, io.bidmachine.media3.common.DrmInitData, boolean, boolean):ep.c0");
    }

    public static List<f0> parseTraks(jn.c cVar, n0 n0Var, long j10, DrmInitData drmInitData, boolean z10, boolean z11, v0 v0Var) throws z0 {
        c0 c0Var;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < cVar.f69728d.size(); i10++) {
            jn.c cVar2 = (jn.c) cVar.f69728d.get(i10);
            if (cVar2.f69730a == 1953653099 && (c0Var = (c0) v0Var.apply(parseTrak(cVar2, (jn.d) io.bidmachine.media3.common.util.a.checkNotNull(cVar.getLeafBoxOfType(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(parseStbl(c0Var, (jn.c) io.bidmachine.media3.common.util.a.checkNotNull(((jn.c) io.bidmachine.media3.common.util.a.checkNotNull(((jn.c) io.bidmachine.media3.common.util.a.checkNotNull(cVar2.getContainerBoxOfType(1835297121))).getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212)), n0Var));
            }
        }
        return arrayList;
    }

    public static u0 parseUdta(jn.d dVar) {
        m0 m0Var = dVar.f69729b;
        m0Var.setPosition(8);
        u0 u0Var = new u0(new t0[0]);
        while (m0Var.bytesLeft() >= 8) {
            int position = m0Var.getPosition();
            int i10 = m0Var.readInt();
            int i11 = m0Var.readInt();
            u0 u0Var2 = null;
            if (i11 == 1835365473) {
                m0Var.setPosition(position);
                int i12 = position + i10;
                m0Var.skipBytes(8);
                maybeSkipRemainingMetaBoxHeaderBytes(m0Var);
                while (true) {
                    if (m0Var.getPosition() >= i12) {
                        break;
                    }
                    int position2 = m0Var.getPosition();
                    int i13 = m0Var.readInt();
                    if (m0Var.readInt() == 1768715124) {
                        m0Var.setPosition(position2);
                        int i14 = position2 + i13;
                        m0Var.skipBytes(8);
                        ArrayList arrayList = new ArrayList();
                        while (m0Var.getPosition() < i14) {
                            t0 ilstElement = u.parseIlstElement(m0Var);
                            if (ilstElement != null) {
                                arrayList.add(ilstElement);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            u0Var2 = new u0(arrayList);
                        }
                    } else {
                        m0Var.setPosition(position2 + i13);
                    }
                }
                u0Var = u0Var.copyWithAppendedEntriesFrom(u0Var2);
            } else if (i11 == 1936553057) {
                m0Var.setPosition(position);
                u0Var = u0Var.copyWithAppendedEntriesFrom(a0.parseSmta(m0Var, position + i10));
            } else if (i11 == -1451722374) {
                short s10 = m0Var.readShort();
                m0Var.skipBytes(2);
                String string = m0Var.readString(s10);
                int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
                try {
                    u0Var2 = new u0(new jn.f(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                }
                u0Var = u0Var.copyWithAppendedEntriesFrom(u0Var2);
            }
            m0Var.setPosition(position + i10);
        }
        return u0Var;
    }
}
