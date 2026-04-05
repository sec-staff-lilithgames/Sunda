package jn;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.inmobi.commons.core.configs.AdConfig;
import gn.x0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f69799a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f69800b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f69801c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f69802d = new int[10];

    public static i a(a0 a0Var) {
        a0Var.skipBit();
        return new i(a0Var.readBits(6), a0Var.readBits(6), a0Var.readBits(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jn.j b(jn.a0 r19, boolean r20, int r21, jn.j r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.readBits(r5)
            boolean r8 = r0.readBit()
            r9 = 5
            int r9 = r0.readBits(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.readBit()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.readBits(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f69741a
            boolean r8 = r2.f69742b
            int r9 = r2.f69743c
            int r11 = r2.f69744d
            int[] r4 = r2.f69745e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.readBits(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.skipBits(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.skipBits(r6)
        L7b:
            jn.j r12 = new jn.j
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: jn.u.b(jn.a0, boolean, int, jn.j):jn.j");
    }

    public static void c(a0 a0Var) {
        int unsignedExpGolombCodedInt = a0Var.readUnsignedExpGolombCodedInt() + 1;
        a0Var.skipBits(8);
        for (int i10 = 0; i10 < unsignedExpGolombCodedInt; i10++) {
            a0Var.readUnsignedExpGolombCodedInt();
            a0Var.readUnsignedExpGolombCodedInt();
            a0Var.skipBit();
        }
        a0Var.skipBits(20);
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
        io.bidmachine.media3.common.util.a.checkState(i12 >= 0);
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

    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                x4 x4VarBuilder = b5.builder();
                int i11 = 0;
                while (i11 < bArr.length) {
                    int iFindNalUnit = findNalUnit(bArr, i11, bArr.length, zArr);
                    if (iFindNalUnit != bArr.length) {
                        x4VarBuilder.add((Object) Integer.valueOf(iFindNalUnit));
                    }
                    i11 = iFindNalUnit + 3;
                }
                b5 b5VarBuild = x4VarBuilder.build();
                for (int i12 = 0; i12 < b5VarBuild.size(); i12++) {
                    if (((Integer) b5VarBuild.get(i12)).intValue() + 3 < length) {
                        a0 a0Var = new a0(bArr, ((Integer) b5VarBuild.get(i12)).intValue() + 3, length);
                        i iVarA = a(a0Var);
                        if (iVarA.f69738a == 33 && iVarA.f69739b == 0) {
                            a0Var.skipBits(4);
                            int bits = a0Var.readBits(3);
                            a0Var.skipBit();
                            j jVarB = b(a0Var, true, bits, null);
                            return io.bidmachine.media3.common.util.h.buildHevcCodecString(jVarB.f69741a, jVarB.f69742b, jVarB.f69743c, jVarB.f69744d, jVarB.f69745e, jVarB.f69746f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getH265NalUnitType(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean isDependedOn(byte[] bArr, int i10, int i11, io.bidmachine.media3.common.b bVar) {
        if (Objects.equals(bVar.f60665o, "video/avc")) {
            return isH264NalUnitDependedOn(bArr[i10]);
        }
        if (Objects.equals(bVar.f60665o, "video/hevc")) {
            i iVarA = a(new a0(bArr, i10, i11 + i10));
            int i12 = iVarA.f69738a;
            if (i12 == 35) {
                return false;
            }
            if (i12 <= 14 && i12 % 2 == 0 && iVarA.f69740c == bVar.D - 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isH264NalUnitDependedOn(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b10 & 31;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    @Deprecated
    public static boolean isNalUnitSei(String str, byte b10) {
        return (OIPXcgrVyyxoLF.KFX.equals(str) && (b10 & 31) == 6) || ("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39);
    }

    public static int numberOfBytesInNalUnitHeader(io.bidmachine.media3.common.b bVar) {
        if (Objects.equals(bVar.f60665o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(bVar.f60665o, "video/hevc") || x0.containsCodecsCorrespondingToMimeType(bVar.f60661k, "video/hevc")) ? 2 : 0;
    }

    public static n parseH265Sei3dRefDisplayInfo(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 != 0 && i11 > i12) {
            a0 a0Var = new a0(bArr, i12, i11 + 1);
            while (a0Var.canReadBits(16)) {
                int bits = a0Var.readBits(8);
                int i13 = 0;
                while (bits == 255) {
                    i13 += 255;
                    bits = a0Var.readBits(8);
                }
                int i14 = i13 + bits;
                int bits2 = a0Var.readBits(8);
                int i15 = 0;
                while (bits2 == 255) {
                    i15 += 255;
                    bits2 = a0Var.readBits(8);
                }
                int i16 = i15 + bits2;
                if (i16 == 0 || !a0Var.canReadBits(i16)) {
                    break;
                }
                if (i14 == 176) {
                    int unsignedExpGolombCodedInt = a0Var.readUnsignedExpGolombCodedInt();
                    boolean bit = a0Var.readBit();
                    int unsignedExpGolombCodedInt2 = bit ? a0Var.readUnsignedExpGolombCodedInt() : 0;
                    int unsignedExpGolombCodedInt3 = a0Var.readUnsignedExpGolombCodedInt();
                    int unsignedExpGolombCodedInt4 = -1;
                    int unsignedExpGolombCodedInt5 = -1;
                    int bits3 = -1;
                    int bits4 = -1;
                    int i17 = -1;
                    int bits5 = -1;
                    for (int i18 = 0; i18 <= unsignedExpGolombCodedInt3; i18++) {
                        unsignedExpGolombCodedInt4 = a0Var.readUnsignedExpGolombCodedInt();
                        unsignedExpGolombCodedInt5 = a0Var.readUnsignedExpGolombCodedInt();
                        bits3 = a0Var.readBits(6);
                        if (bits3 == 63) {
                            return null;
                        }
                        bits4 = a0Var.readBits(bits3 == 0 ? Math.max(0, unsignedExpGolombCodedInt - 30) : Math.max(0, (bits3 + unsignedExpGolombCodedInt) - 31));
                        if (bit) {
                            int bits6 = a0Var.readBits(6);
                            if (bits6 == 63) {
                                return null;
                            }
                            i17 = bits6;
                            bits5 = a0Var.readBits(bits6 == 0 ? Math.max(0, unsignedExpGolombCodedInt2 - 30) : Math.max(0, (bits6 + unsignedExpGolombCodedInt2) - 31));
                        }
                        if (a0Var.readBit()) {
                            a0Var.skipBits(10);
                        }
                    }
                    return new n(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3 + 1, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, bits3, bits4, i17, bits5);
                }
            }
        }
        return null;
    }

    public static o parseH265SpsNalUnit(byte[] bArr, int i10, int i11, r rVar) {
        return parseH265SpsNalUnitPayload(bArr, i10 + 2, i11, a(new a0(bArr, i10, i11)), rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jn.o parseH265SpsNalUnitPayload(byte[] r31, int r32, int r33, jn.i r34, jn.r r35) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jn.u.parseH265SpsNalUnitPayload(byte[], int, int, jn.i, jn.r):jn.o");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x060f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jn.r parseH265VpsNalUnit(byte[] r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jn.u.parseH265VpsNalUnit(byte[], int, int):jn.r");
    }

    public static s parsePpsNalUnit(byte[] bArr, int i10, int i11) {
        return parsePpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    public static s parsePpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        a0 a0Var = new a0(bArr, i10, i11);
        int unsignedExpGolombCodedInt = a0Var.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = a0Var.readUnsignedExpGolombCodedInt();
        a0Var.skipBit();
        return new s(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, a0Var.readBit());
    }

    public static t parseSpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseSpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jn.t parseSpsNalUnitPayload(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jn.u.parseSpsNalUnitPayload(byte[], int, int):jn.t");
    }

    public static int unescapeStream(byte[] bArr, int i10) {
        int i11;
        synchronized (f69801c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f69802d;
                    if (iArr.length <= i13) {
                        f69802d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f69802d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f69802d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static boolean isNalUnitSei(io.bidmachine.media3.common.b bVar, byte b10) {
        String str = bVar.f60665o;
        String str2 = bVar.f60661k;
        return ((Objects.equals(str, "video/avc") || x0.containsCodecsCorrespondingToMimeType(str2, "video/avc")) && (b10 & 31) == 6) || ((Objects.equals(bVar.f60665o, "video/hevc") || x0.containsCodecsCorrespondingToMimeType(str2, "video/hevc")) && ((b10 & 126) >> 1) == 39);
    }
}
