package me;

import android.util.Pair;
import com.google.android.exoplayer2.container.CreationTime;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.util.l0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import me.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f74380a = n1.getUtf8Bytes("OpusHead");

    public static c a(int i10, v0 v0Var) {
        v0Var.setPosition(i10 + 12);
        v0Var.skipBytes(1);
        b(v0Var);
        v0Var.skipBytes(2);
        int unsignedByte = v0Var.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            v0Var.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            v0Var.skipBytes(v0Var.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            v0Var.skipBytes(2);
        }
        v0Var.skipBytes(1);
        b(v0Var);
        String mimeTypeFromMp4ObjectType = l0.getMimeTypeFromMp4ObjectType(v0Var.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new c(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        v0Var.skipBytes(4);
        long unsignedInt = v0Var.readUnsignedInt();
        long unsignedInt2 = v0Var.readUnsignedInt();
        v0Var.skipBytes(1);
        int iB = b(v0Var);
        long j10 = unsignedInt2;
        byte[] bArr = new byte[iB];
        v0Var.readBytes(bArr, 0, iB);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new c(mimeTypeFromMp4ObjectType, bArr, j10, unsignedInt > 0 ? unsignedInt : -1L);
    }

    public static int b(v0 v0Var) {
        int unsignedByte = v0Var.readUnsignedByte();
        int i10 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = v0Var.readUnsignedByte();
            i10 = (i10 << 7) | (unsignedByte & 127);
        }
        return i10;
    }

    public static Pair c(v0 v0Var, int i10, int i11) throws h2 {
        Integer num;
        w wVar;
        Pair pairCreate;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int position = v0Var.getPosition();
        while (position - i10 < i11) {
            v0Var.setPosition(position);
            int i14 = v0Var.readInt();
            ee.t.checkContainerInput(i14 > 0, "childAtomSize must be positive");
            if (v0Var.readInt() == 1936289382) {
                int i15 = position + 8;
                int i16 = 0;
                int i17 = -1;
                Integer numValueOf = null;
                String string = null;
                while (i15 - position < i14) {
                    v0Var.setPosition(i15);
                    int i18 = v0Var.readInt();
                    int i19 = v0Var.readInt();
                    if (i19 == 1718775137) {
                        numValueOf = Integer.valueOf(v0Var.readInt());
                    } else if (i19 == 1935894637) {
                        v0Var.skipBytes(4);
                        string = v0Var.readString(4);
                    } else if (i19 == 1935894633) {
                        i17 = i15;
                        i16 = i18;
                    }
                    i15 += i18;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(string) || C.CENC_TYPE_cbc1.equals(string) || C.CENC_TYPE_cens.equals(string) || C.CENC_TYPE_cbcs.equals(string)) {
                    ee.t.checkContainerInput(numValueOf != null, "frma atom is mandatory");
                    ee.t.checkContainerInput(i17 != -1, "schi atom is mandatory");
                    int i20 = i17 + 8;
                    while (true) {
                        if (i20 - i17 >= i16) {
                            num = numValueOf;
                            wVar = null;
                            break;
                        }
                        v0Var.setPosition(i20);
                        int i21 = v0Var.readInt();
                        if (v0Var.readInt() == 1952804451) {
                            int fullAtomVersion = a.parseFullAtomVersion(v0Var.readInt());
                            v0Var.skipBytes(1);
                            if (fullAtomVersion == 0) {
                                v0Var.skipBytes(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int unsignedByte = v0Var.readUnsignedByte();
                                i12 = unsignedByte & 15;
                                i13 = (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            if (v0Var.readUnsignedByte() == 1) {
                                num2 = numValueOf;
                                z10 = true;
                            } else {
                                num2 = numValueOf;
                                z10 = false;
                            }
                            int unsignedByte2 = v0Var.readUnsignedByte();
                            byte[] bArr2 = new byte[16];
                            v0Var.readBytes(bArr2, 0, 16);
                            if (z10 && unsignedByte2 == 0) {
                                int unsignedByte3 = v0Var.readUnsignedByte();
                                byte[] bArr3 = new byte[unsignedByte3];
                                v0Var.readBytes(bArr3, 0, unsignedByte3);
                                bArr = bArr3;
                            }
                            num = num2;
                            wVar = new w(z10, string, unsignedByte2, bArr2, i13, i12, bArr);
                        } else {
                            i20 += i21;
                        }
                    }
                    ee.t.checkContainerInput(wVar != null, "tenc atom is mandatory");
                    pairCreate = Pair.create(num, (w) n1.castNonNull(wVar));
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0231 A[ADDED_TO_REGION, LOOP:9: B:90:0x0231->B:94:0x023c, LOOP_START, PHI: r16
      0x0231: PHI (r16v4 int) = (r16v2 int), (r16v5 int) binds: [B:89:0x022f, B:94:0x023c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static me.y d(me.v r43, me.a.C0748a r44, ee.c0 r45) throws com.google.android.exoplayer2.h2 {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.k.d(me.v, me.a$a, ee.c0):me.y");
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(v0 v0Var) {
        int position = v0Var.getPosition();
        v0Var.skipBytes(4);
        if (v0Var.readInt() != 1751411826) {
            position += 4;
        }
        v0Var.setPosition(position);
    }

    public static Metadata parseMdtaFromMeta(a.C0748a c0748a) {
        a.b leafAtomOfType = c0748a.getLeafAtomOfType(1751411826);
        a.b leafAtomOfType2 = c0748a.getLeafAtomOfType(1801812339);
        a.b leafAtomOfType3 = c0748a.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null) {
            return null;
        }
        v0 v0Var = leafAtomOfType.f74346b;
        v0Var.setPosition(16);
        if (v0Var.readInt() != 1835299937) {
            return null;
        }
        v0 v0Var2 = leafAtomOfType2.f74346b;
        v0Var2.setPosition(12);
        int i10 = v0Var2.readInt();
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = v0Var2.readInt();
            v0Var2.skipBytes(4);
            strArr[i11] = v0Var2.readString(i12 - 8);
        }
        v0 v0Var3 = leafAtomOfType3.f74346b;
        v0Var3.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (v0Var3.bytesLeft() > 8) {
            int position = v0Var3.getPosition();
            int i13 = v0Var3.readInt();
            int i14 = v0Var3.readInt() - 1;
            if (i14 < 0 || i14 >= i10) {
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(i14, "Skipped metadata with unknown key index: ", "AtomParsers");
            } else {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = p.parseMdtaMetadataEntryFromIlst(v0Var3, position + i13, strArr[i14]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            v0Var3.setPosition(position + i13);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static d parseMvhd(v0 v0Var) {
        long unsignedInt;
        v0Var.setPosition(8);
        if (a.parseFullAtomVersion(v0Var.readInt()) == 0) {
            unsignedInt = v0Var.readUnsignedInt();
            v0Var.skipBytes(4);
        } else {
            long j10 = v0Var.readLong();
            v0Var.skipBytes(8);
            unsignedInt = j10;
        }
        return new d(new Metadata(new CreationTime((unsignedInt - 2082844800) * 1000)), v0Var.readUnsignedInt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        r32 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06f7 A[PHI: r0 r34 r39
      0x06f7: PHI (r0v109 java.lang.String) = (r0v96 java.lang.String), (r0v107 java.lang.String), (r0v96 java.lang.String) binds: [B:386:0x0734, B:393:0x0760, B:364:0x06f5] A[DONT_GENERATE, DONT_INLINE]
      0x06f7: PHI (r34v5 me.c) = (r34v2 me.c), (r34v3 me.c), (r34v2 me.c) binds: [B:386:0x0734, B:393:0x0760, B:364:0x06f5] A[DONT_GENERATE, DONT_INLINE]
      0x06f7: PHI (r39v2 int) = (r39v1 int), (r39v1 int), (r39v7 int) binds: [B:386:0x0734, B:393:0x0760, B:364:0x06f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0cec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<me.y> parseTraks(me.a.C0748a r66, ee.c0 r67, long r68, com.google.android.exoplayer2.drm.DrmInitData r70, boolean r71, boolean r72, mh.v0 r73) throws com.google.android.exoplayer2.h2 {
        /*
            Method dump skipped, instructions count: 3433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.k.parseTraks(me.a$a, ee.c0, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, mh.v0):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static me.j parseUdta(me.a.b r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.k.parseUdta(me.a$b):me.j");
    }
}
