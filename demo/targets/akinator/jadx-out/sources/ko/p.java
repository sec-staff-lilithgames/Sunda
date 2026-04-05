package ko;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class p {
    public static void consume(long j10, io.bidmachine.media3.common.util.m0 m0Var, e1[] e1VarArr) {
        int i10;
        while (true) {
            if (m0Var.bytesLeft() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (m0Var.bytesLeft() == 0) {
                    i10 = -1;
                    break;
                }
                int unsignedByte = m0Var.readUnsignedByte();
                i11 += unsignedByte;
                if (unsignedByte != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (m0Var.bytesLeft() == 0) {
                    i12 = -1;
                    break;
                }
                int unsignedByte2 = m0Var.readUnsignedByte();
                i12 += unsignedByte2;
                if (unsignedByte2 != 255) {
                    break;
                }
            }
            int position = m0Var.getPosition() + i12;
            if (i12 == -1 || i12 > m0Var.bytesLeft()) {
                io.bidmachine.media3.common.util.b0.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                position = m0Var.limit();
            } else if (i10 == 4 && i12 >= 8) {
                int unsignedByte3 = m0Var.readUnsignedByte();
                int unsignedShort = m0Var.readUnsignedShort();
                int i13 = unsignedShort == 49 ? m0Var.readInt() : 0;
                int unsignedByte4 = m0Var.readUnsignedByte();
                if (unsignedShort == 47) {
                    m0Var.skipBytes(1);
                }
                boolean z10 = unsignedByte3 == 181 && (unsignedShort == 49 || unsignedShort == 47) && unsignedByte4 == 3;
                if (unsignedShort == 49) {
                    z10 &= i13 == 1195456820;
                }
                if (z10) {
                    consumeCcData(j10, m0Var, e1VarArr);
                }
            }
            m0Var.setPosition(position);
        }
    }

    public static void consumeCcData(long j10, io.bidmachine.media3.common.util.m0 m0Var, e1[] e1VarArr) {
        int unsignedByte = m0Var.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            m0Var.skipBytes(1);
            int i10 = (unsignedByte & 31) * 3;
            int position = m0Var.getPosition();
            for (e1 e1Var : e1VarArr) {
                m0Var.setPosition(position);
                e1Var.sampleData(m0Var, i10);
                io.bidmachine.media3.common.util.a.checkState(j10 != C.TIME_UNSET);
                e1Var.sampleMetadata(j10, 1, i10, 0, null);
            }
        }
    }
}
