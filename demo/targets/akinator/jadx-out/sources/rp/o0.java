package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o0 {
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

    public static long readPcrFromPacket(io.bidmachine.media3.common.util.m0 m0Var, int i10, int i11) {
        m0Var.setPosition(i10);
        if (m0Var.bytesLeft() < 5) {
            return C.TIME_UNSET;
        }
        int i12 = m0Var.readInt();
        if ((8388608 & i12) != 0 || ((2096896 & i12) >> 8) != i11 || (i12 & 32) == 0 || m0Var.readUnsignedByte() < 7 || m0Var.bytesLeft() < 7 || (m0Var.readUnsignedByte() & 16) != 16) {
            return C.TIME_UNSET;
        }
        m0Var.readBytes(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
