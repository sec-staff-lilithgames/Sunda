package io.bidmachine.media3.exoplayer.audio;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e1 extends hn.j {

    /* renamed from: i, reason: collision with root package name */
    public static final int f60937i = Float.floatToIntBits(Float.NaN);

    public static void b(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f60937i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // hn.j, hn.h
    public /* bridge */ /* synthetic */ long getDurationAfterProcessorApplied(long j10) {
        return super.getDurationAfterProcessorApplied(j10);
    }

    @Override // hn.j
    public hn.f onConfigure(hn.f fVar) throws hn.g {
        int i10 = fVar.f59040c;
        if (io.bidmachine.media3.common.util.a1.isEncodingHighResolutionPcm(i10)) {
            return i10 != 4 ? new hn.f(fVar.f59038a, fVar.f59039b, 4) : hn.f.f59037e;
        }
        throw new hn.g(fVar);
    }

    @Override // hn.j, hn.h
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f59043b.f59040c;
        if (i11 == 21) {
            byteBufferA = a((i10 / 3) * 4);
            while (iPosition < iLimit) {
                b(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferA);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferA = a(i10);
            while (iPosition < iLimit) {
                b((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferA);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferA = a((i10 / 3) * 4);
            while (iPosition < iLimit) {
                b(((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferA);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferA = a(i10);
            while (iPosition < iLimit) {
                b((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferA);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }
}
