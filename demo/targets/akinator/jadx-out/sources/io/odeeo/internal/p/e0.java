package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 {
    public static long a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }

    public static int findSyncBytePosition(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static boolean isStartOfTsPacket(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long readPcrFromPacket(io.odeeo.internal.q0.x xVar, int i10, int i11) {
        xVar.setPosition(i10);
        if (xVar.bytesLeft() < 5) {
            return C.TIME_UNSET;
        }
        int i12 = xVar.readInt();
        if ((8388608 & i12) != 0 || ((2096896 & i12) >> 8) != i11 || (i12 & 32) == 0 || xVar.readUnsignedByte() < 7 || xVar.bytesLeft() < 7 || (xVar.readUnsignedByte() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        xVar.readBytes(bArr, 0, 6);
        return a(bArr);
    }
}
