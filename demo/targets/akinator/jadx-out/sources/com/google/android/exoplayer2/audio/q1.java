package com.google.android.exoplayer2.audio;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q1 extends m0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f27270i = Float.floatToIntBits(Float.NaN);

    @Override // com.google.android.exoplayer2.audio.m0
    public s onConfigure(s sVar) throws t {
        int i10 = sVar.f27281c;
        if (com.google.android.exoplayer2.util.n1.isEncodingHighResolutionPcm(i10)) {
            return i10 != 4 ? new s(sVar.f27279a, sVar.f27280b, 4) : s.f27278e;
        }
        throw new t(sVar);
    }

    @Override // com.google.android.exoplayer2.audio.m0, com.google.android.exoplayer2.audio.u
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferD;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f27205b.f27281c;
        int i12 = f27270i;
        if (i11 == 536870912) {
            byteBufferD = d((i10 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i12) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferD.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferD = d(i10);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i12) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferD.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }
}
