package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcen {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzari zzariVar;
        zzarh zzarhVar;
        long j10 = this.zza;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzard(new zzcem(byteBufferDuplicate), zzcer.zzb).zzc().iterator();
            while (true) {
                zzariVar = null;
                if (!it.hasNext()) {
                    zzarhVar = null;
                    break;
                }
                zzarf zzarfVar = (zzarf) it.next();
                if (zzarfVar instanceof zzarh) {
                    zzarhVar = (zzarh) zzarfVar;
                    break;
                }
            }
            Iterator it2 = zzarhVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzarf zzarfVar2 = (zzarf) it2.next();
                if (zzarfVar2 instanceof zzari) {
                    zzariVar = (zzari) zzarfVar2;
                    break;
                }
            }
            long jZzd = (zzariVar.zzd() * 1000) / zzariVar.zzc();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
