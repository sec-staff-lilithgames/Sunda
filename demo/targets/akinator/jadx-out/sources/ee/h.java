package ee;

import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h {
    public static void consume(long j10, v0 v0Var, l0[] l0VarArr) {
        int i10;
        while (true) {
            if (v0Var.bytesLeft() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (v0Var.bytesLeft() == 0) {
                    i10 = -1;
                    break;
                }
                int unsignedByte = v0Var.readUnsignedByte();
                i11 += unsignedByte;
                if (unsignedByte != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (v0Var.bytesLeft() == 0) {
                    i12 = -1;
                    break;
                }
                int unsignedByte2 = v0Var.readUnsignedByte();
                i12 += unsignedByte2;
                if (unsignedByte2 != 255) {
                    break;
                }
            }
            int position = v0Var.getPosition() + i12;
            if (i12 == -1 || i12 > v0Var.bytesLeft()) {
                com.google.android.exoplayer2.util.f0.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                position = v0Var.limit();
            } else if (i10 == 4 && i12 >= 8) {
                int unsignedByte3 = v0Var.readUnsignedByte();
                int unsignedShort = v0Var.readUnsignedShort();
                int i13 = unsignedShort == 49 ? v0Var.readInt() : 0;
                int unsignedByte4 = v0Var.readUnsignedByte();
                if (unsignedShort == 47) {
                    v0Var.skipBytes(1);
                }
                boolean z10 = unsignedByte3 == 181 && (unsignedShort == 49 || unsignedShort == 47) && unsignedByte4 == 3;
                if (unsignedShort == 49) {
                    z10 &= i13 == 1195456820;
                }
                if (z10) {
                    consumeCcData(j10, v0Var, l0VarArr);
                }
            }
            v0Var.setPosition(position);
        }
    }

    public static void consumeCcData(long j10, v0 v0Var, l0[] l0VarArr) {
        long j11;
        int unsignedByte = v0Var.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            v0Var.skipBytes(1);
            int i10 = (unsignedByte & 31) * 3;
            int position = v0Var.getPosition();
            int length = l0VarArr.length;
            int i11 = 0;
            while (i11 < length) {
                l0 l0Var = l0VarArr[i11];
                v0Var.setPosition(position);
                l0Var.sampleData(v0Var, i10);
                if (j10 != C.TIME_UNSET) {
                    j11 = j10;
                    l0Var.sampleMetadata(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i11++;
                j10 = j11;
            }
        }
    }
}
