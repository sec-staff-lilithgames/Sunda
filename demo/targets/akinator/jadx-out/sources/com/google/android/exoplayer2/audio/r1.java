package com.google.android.exoplayer2.audio;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r1 extends m0 {
    @Override // com.google.android.exoplayer2.audio.m0
    public s onConfigure(s sVar) throws t {
        int i10 = sVar.f27281c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new s(sVar.f27279a, sVar.f27280b, 2) : s.f27278e;
        }
        throw new t(sVar);
    }

    @Override // com.google.android.exoplayer2.audio.m0, com.google.android.exoplayer2.audio.u
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f27205b.f27281c;
        if (i11 == 3) {
            i10 *= 2;
        } else if (i11 == 4) {
            i10 /= 2;
        } else if (i11 != 268435456) {
            if (i11 != 536870912) {
                if (i11 != 805306368) {
                    throw new IllegalStateException();
                }
                i10 /= 2;
            } else {
                i10 /= 3;
                i10 *= 2;
            }
        }
        ByteBuffer byteBufferD = d(i10);
        int i12 = this.f27205b.f27281c;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferD.put((byte) 0);
                byteBufferD.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sConstrainValue = (short) (com.google.android.exoplayer2.util.n1.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferD.put((byte) (sConstrainValue & 255));
                byteBufferD.put((byte) ((sConstrainValue >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i12 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 2));
                byteBufferD.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }
}
