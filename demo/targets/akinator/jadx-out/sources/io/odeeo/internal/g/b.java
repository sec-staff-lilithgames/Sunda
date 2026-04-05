package io.odeeo.internal.g;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {
    public static int a(io.odeeo.internal.q0.x xVar) {
        int i10 = 0;
        while (xVar.bytesLeft() != 0) {
            int unsignedByte = xVar.readUnsignedByte();
            i10 += unsignedByte;
            if (unsignedByte != 255) {
                return i10;
            }
        }
        return -1;
    }

    public static void consume(long j10, io.odeeo.internal.q0.x xVar, x[] xVarArr) {
        while (true) {
            if (xVar.bytesLeft() <= 1) {
                return;
            }
            int iA = a(xVar);
            int iA2 = a(xVar);
            int position = xVar.getPosition() + iA2;
            if (iA2 == -1 || iA2 > xVar.bytesLeft()) {
                io.odeeo.internal.q0.p.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                position = xVar.limit();
            } else if (iA == 4 && iA2 >= 8) {
                int unsignedByte = xVar.readUnsignedByte();
                int unsignedShort = xVar.readUnsignedShort();
                int i10 = unsignedShort == 49 ? xVar.readInt() : 0;
                int unsignedByte2 = xVar.readUnsignedByte();
                if (unsignedShort == 47) {
                    xVar.skipBytes(1);
                }
                boolean z10 = unsignedByte == 181 && (unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3;
                if (unsignedShort == 49) {
                    z10 &= i10 == 1195456820;
                }
                if (z10) {
                    consumeCcData(j10, xVar, xVarArr);
                }
            }
            xVar.setPosition(position);
        }
    }

    public static void consumeCcData(long j10, io.odeeo.internal.q0.x xVar, x[] xVarArr) {
        long j11;
        int unsignedByte = xVar.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            xVar.skipBytes(1);
            int i10 = (unsignedByte & 31) * 3;
            int position = xVar.getPosition();
            int length = xVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                x xVar2 = xVarArr[i11];
                xVar.setPosition(position);
                xVar2.sampleData(xVar, i10);
                if (j10 != C.TIME_UNSET) {
                    j11 = j10;
                    xVar2.sampleMetadata(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i11++;
                j10 = j11;
            }
        }
    }
}
