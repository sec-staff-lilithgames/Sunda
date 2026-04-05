package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfpn implements Runnable {
    final /* synthetic */ zzfpo zza;

    public zzfpn(zzfpo zzfpoVar) {
        Objects.requireNonNull(zzfpoVar);
        this.zza = zzfpoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfpo zzfpoVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzfpoVar.zzf();
        float fZzc = zzfpoVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzfpoVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzfpoVar.zzd().post(new zzfpm(this, fZzc));
        }
    }
}
