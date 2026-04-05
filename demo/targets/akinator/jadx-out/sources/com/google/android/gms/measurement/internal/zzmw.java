package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzmw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzd;
    final /* synthetic */ zznl zze;

    public zzmw(zznl zznlVar, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = zzcuVar;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        zzpp zzppVarZzk;
        zznl zznlVar;
        zzgb zzgbVarZzZ;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zznlVar = this.zze;
                zzgbVarZzZ = zznlVar.zzZ();
            } catch (RemoteException e10) {
                this.zze.zzu.zzaV().zzb().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e10);
            }
            if (zzgbVarZzZ == null) {
                zzic zzicVar = zznlVar.zzu;
                zzicVar.zzaV().zzb().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                zzppVarZzk = zzicVar.zzk();
                zzcuVar = this.zzd;
                zzppVarZzk.zzar(zzcuVar, arrayList);
            }
            zzr zzrVar = this.zzc;
            Preconditions.checkNotNull(zzrVar);
            arrayList = zzpp.zzas(zzgbVarZzZ.zzr(this.zza, this.zzb, zzrVar));
            zznlVar.zzV();
            zznl zznlVar2 = this.zze;
            zzcuVar = this.zzd;
            zzppVarZzk = zznlVar2.zzu.zzk();
            zzppVarZzk.zzar(zzcuVar, arrayList);
        } catch (Throwable th2) {
            zznl zznlVar3 = this.zze;
            zznlVar3.zzu.zzk().zzar(this.zzd, arrayList);
            throw th2;
        }
    }
}
