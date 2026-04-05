package io.odeeo.internal.d;

import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.d.f;
import io.odeeo.internal.q0.g0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends l {

    /* renamed from: i, reason: collision with root package name */
    public static final int f63472i = Float.floatToIntBits(Float.NaN);

    public static void a(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f63472i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // io.odeeo.internal.d.l
    public f.a onConfigure(f.a aVar) throws f.b {
        int i10 = aVar.f63354c;
        if (g0.isEncodingHighResolutionPcm(i10)) {
            return i10 != 4 ? new f.a(aVar.f63352a, aVar.f63353b, 4) : f.a.f63351e;
        }
        throw new f.b(aVar);
    }

    @Override // io.odeeo.internal.d.l, io.odeeo.internal.d.f
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f63406b.f63354c;
        if (i11 == 536870912) {
            byteBufferA = a((i10 / 3) * 4);
            while (iPosition < iLimit) {
                a(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferA);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferA = a(i10);
            while (iPosition < iLimit) {
                a((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferA);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }
}
