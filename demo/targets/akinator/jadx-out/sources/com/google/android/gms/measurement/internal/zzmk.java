package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.play_billing.a;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzmk implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    public zzmk(zznl zznlVar, zzr zzrVar, boolean z10) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            a.r(zznlVar.zzu, "Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zzic zzicVar = zznlVar.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzfx zzfxVar = zzfy.zzbb;
            if (zzalVarZzc.zzp(null, zzfxVar)) {
                zznlVar.zzm(zzgbVarZzZ, null, zzrVar);
            }
            zzgbVarZzZ.zzg(zzrVar);
            zznlVar.zzu.zzm().zzo();
            zzicVar.zzc().zzp(null, zzfxVar);
            zznlVar.zzm(zzgbVarZzZ, null, zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e10) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send app launch to the service", e10);
        }
    }
}
