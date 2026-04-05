package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzawt implements Runnable {
    final /* synthetic */ zzawu zza;

    public zzawt(zzawu zzawuVar) {
        Objects.requireNonNull(zzawuVar);
        this.zza = zzawuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzawu zzawuVar = this.zza;
        if (zzawuVar.zzb != null) {
            return;
        }
        synchronized (zzawu.zzd) {
            if (zzawuVar.zzb != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) zzbeu.zzcU.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzawu.zza = zzfto.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.zza.zzb = Boolean.valueOf(z10);
            zzawu.zzd.open();
        }
    }
}
