package io.odeeo.internal.d;

import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.d.f;
import io.odeeo.internal.q0.g0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t extends l {
    @Override // io.odeeo.internal.d.l
    public f.a onConfigure(f.a aVar) throws f.b {
        int i10 = aVar.f63354c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new f.a(aVar.f63352a, aVar.f63353b, 2) : f.a.f63351e;
        }
        throw new f.b(aVar);
    }

    @Override // io.odeeo.internal.d.l, io.odeeo.internal.d.f
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f63406b.f63354c;
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
        ByteBuffer byteBufferA = a(i10);
        int i12 = this.f63406b.f63354c;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferA.put((byte) 0);
                byteBufferA.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sConstrainValue = (short) (g0.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferA.put((byte) (sConstrainValue & 255));
                byteBufferA.put((byte) ((sConstrainValue >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i12 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                byteBufferA.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }
}
