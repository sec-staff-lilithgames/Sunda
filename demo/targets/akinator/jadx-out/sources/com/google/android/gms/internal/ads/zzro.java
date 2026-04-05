package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzro extends zzch {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzq(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (iFloatToIntBits == zzd) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzk;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.zzb.zzd;
        if (i11 == 21) {
            byteBufferZzk = zzk((i10 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferZzk = zzk(i10);
            while (iPosition < iLimit) {
                int i12 = byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i13 = (byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                zzq(i12 | i13 | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferZzk = zzk((i10 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferZzk = zzk(i10);
            while (iPosition < iLimit) {
                int i14 = byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i15 = (byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                zzq(i14 | i15 | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzcd zzm(zzcd zzcdVar) throws zzcf {
        int i10 = zzcdVar.zzd;
        String str = zzep.zza;
        if (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736) {
            return new zzcd(zzcdVar.zzb, zzcdVar.zzc, 4);
        }
        if (i10 == 4) {
            return zzcd.zza;
        }
        throw new zzcf("Unhandled input format:", zzcdVar);
    }
}
