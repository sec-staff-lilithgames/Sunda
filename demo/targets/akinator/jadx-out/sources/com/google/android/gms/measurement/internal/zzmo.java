package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.play_billing.a;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzmo implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbe zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zznl zze;

    public zzmo(zznl zznlVar, boolean z10, zzr zzrVar, boolean z11, zzbe zzbeVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = z11;
        this.zzc = zzbeVar;
        this.zzd = bundle;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zze;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            a.r(zznlVar.zzu, "Failed to send default event parameters to service");
            return;
        }
        if (zznlVar.zzu.zzc().zzp(null, zzfy.zzbb)) {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            this.zze.zzm(zzgbVarZzZ, this.zzb ? null : this.zzc, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.zza;
            Preconditions.checkNotNull(zzrVar2);
            zzgbVarZzZ.zzu(this.zzd, zzrVar2);
            zznlVar.zzV();
        } catch (RemoteException e10) {
            this.zze.zzu.zzaV().zzb().zzb("Failed to send default event parameters to service", e10);
        }
    }
}
