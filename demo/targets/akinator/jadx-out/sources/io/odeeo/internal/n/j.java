package io.odeeo.internal.n;

import io.odeeo.internal.q0.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f64861a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(io.odeeo.internal.g.i iVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        long length = iVar.getLength();
        long j10 = -1;
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i12 != 0 && length <= 4096) {
            j11 = length;
        }
        int i13 = (int) j11;
        x xVar = new x(64);
        int i14 = 0;
        int i15 = 0;
        boolean z14 = false;
        while (i15 < i13) {
            xVar.reset(8);
            if (!iVar.peekFully(xVar.getData(), i14, 8, true)) {
                break;
            }
            long unsignedInt = xVar.readUnsignedInt();
            int i16 = xVar.readInt();
            if (unsignedInt == 1) {
                iVar.peekFully(xVar.getData(), 8, 8);
                xVar.setLimit(16);
                z13 = i14;
                i10 = i15;
                i11 = 16;
                unsignedInt = xVar.readLong();
            } else {
                if (unsignedInt == 0) {
                    long length2 = iVar.getLength();
                    if (length2 != j10) {
                        unsignedInt = (length2 - iVar.getPeekPosition()) + 8;
                    }
                }
                z13 = i14;
                i10 = i15;
                i11 = 8;
            }
            long j12 = i11;
            if (unsignedInt < j12) {
                return z13;
            }
            int i17 = i10 + i11;
            boolean z15 = z13;
            if (i16 == 1836019574) {
                i13 += (int) unsignedInt;
                if (i12 != 0 && i13 > length) {
                    i13 = (int) length;
                }
                i15 = i17;
                i14 = z15 ? 1 : 0;
                j10 = -1;
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
                        return z15;
                    }
                    xVar.reset(i19);
                    iVar.peekFully(xVar.getData(), z15 ? 1 : 0, i19);
                    int i20 = i19 / 4;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= i20) {
                            break;
                        }
                        if (i21 == 1) {
                            xVar.skipBytes(4);
                        } else if (a(xVar.readInt(), z11)) {
                            z14 = true;
                            break;
                        }
                        i21++;
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i19 != 0) {
                    iVar.advancePeekPosition(i19);
                }
                i12 = i18;
                j10 = -1;
                i14 = 0;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    public static boolean sniffFragmented(io.odeeo.internal.g.i iVar) throws IOException {
        return a(iVar, true, false);
    }

    public static boolean sniffUnfragmented(io.odeeo.internal.g.i iVar) throws IOException {
        return a(iVar, false, false);
    }

    public static boolean sniffUnfragmented(io.odeeo.internal.g.i iVar, boolean z10) throws IOException {
        return a(iVar, false, z10);
    }

    public static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f64861a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }
}
