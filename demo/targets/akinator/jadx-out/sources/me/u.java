package me;

import com.google.android.exoplayer2.util.v0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f74473a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(ee.q qVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        int i10;
        int i11;
        long length = qVar.getLength();
        long j10 = -1;
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i12 != 0 && length <= 4096) {
            j11 = length;
        }
        int i13 = (int) j11;
        v0 v0Var = new v0(64);
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (i15 < i13) {
            v0Var.reset(8);
            if (!qVar.peekFully(v0Var.getData(), i14, 8, true)) {
                break;
            }
            long unsignedInt = v0Var.readUnsignedInt();
            int i16 = v0Var.readInt();
            if (unsignedInt == 1) {
                qVar.peekFully(v0Var.getData(), 8, 8);
                v0Var.setLimit(16);
                i10 = i15;
                i11 = 16;
                unsignedInt = v0Var.readLong();
            } else {
                if (unsignedInt == 0) {
                    long length2 = qVar.getLength();
                    if (length2 != j10) {
                        unsignedInt = (length2 - qVar.getPeekPosition()) + 8;
                    }
                }
                i10 = i15;
                i11 = 8;
            }
            long j12 = i11;
            if (unsignedInt < j12) {
                return false;
            }
            int i17 = i10 + i11;
            if (i16 == 1836019574) {
                i13 += (int) unsignedInt;
                if (i12 != 0 && i13 > length) {
                    i13 = (int) length;
                }
                i15 = i17;
            } else {
                if (i16 == 1836019558 || i16 == 1836475768) {
                    z12 = true;
                    break;
                }
                int i18 = i12;
                if ((i17 + unsignedInt) - j12 >= i13) {
                    break;
                }
                int i19 = (int) (unsignedInt - j12);
                i15 = i17 + i19;
                if (i16 == 1718909296) {
                    if (i19 < 8) {
                        return false;
                    }
                    v0Var.reset(i19);
                    qVar.peekFully(v0Var.getData(), 0, i19);
                    int i20 = i19 / 4;
                    for (int i21 = 0; i21 < i20; i21++) {
                        if (i21 != 1) {
                            int i22 = v0Var.readInt();
                            if ((i22 >>> 8) != 3368816 && (i22 != 1751476579 || !z11)) {
                                for (int i23 = 0; i23 < 29; i23++) {
                                    if (f74473a[i23] != i22) {
                                    }
                                }
                            }
                            z13 = true;
                            break;
                        }
                        v0Var.skipBytes(4);
                    }
                    if (!z13) {
                        return false;
                    }
                } else if (i19 != 0) {
                    qVar.advancePeekPosition(i19);
                }
                i12 = i18;
            }
            j10 = -1;
            i14 = 0;
        }
        z12 = false;
        return z13 && z10 == z12;
    }

    public static boolean sniffFragmented(ee.q qVar) throws IOException {
        return a(qVar, true, false);
    }

    public static boolean sniffUnfragmented(ee.q qVar) throws IOException {
        return a(qVar, false, false);
    }

    public static boolean sniffUnfragmented(ee.q qVar, boolean z10) throws IOException {
        return a(qVar, false, z10);
    }
}
