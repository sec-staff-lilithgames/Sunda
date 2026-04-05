package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.a;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzmn implements Runnable {
    final /* synthetic */ zzlu zza;
    final /* synthetic */ zznl zzb;

    public zzmn(zznl zznlVar, zzlu zzluVar) {
        this.zza = zzluVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            a.r(zznlVar.zzu, "Failed to send current screen to service");
            return;
        }
        try {
            zzlu zzluVar = this.zza;
            if (zzluVar == null) {
                zzgbVarZzZ.zzl(0L, null, null, zznlVar.zzu.zzaY().getPackageName());
            } else {
                zzgbVarZzZ.zzl(zzluVar.zzc, zzluVar.zza, zzluVar.zzb, zznlVar.zzu.zzaY().getPackageName());
            }
            zznlVar.zzV();
        } catch (RemoteException e10) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send current screen to the service", e10);
        }
    }
}
