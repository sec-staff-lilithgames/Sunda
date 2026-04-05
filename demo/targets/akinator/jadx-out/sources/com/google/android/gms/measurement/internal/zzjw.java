package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;
import sh.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzjw implements t0 {
    final /* synthetic */ zzoh zza;
    final /* synthetic */ zzlj zzb;

    public zzjw(zzlj zzljVar, zzoh zzohVar) {
        this.zza = zzohVar;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    private final void zza() {
        zzic zzicVar = this.zzb.zzu;
        SparseArray sparseArrayZzf = zzicVar.zzd().zzf();
        zzoh zzohVar = this.zza;
        sparseArrayZzf.put(zzohVar.zzc, Long.valueOf(zzohVar.zzb));
        zzhh zzhhVarZzd = zzicVar.zzd();
        int[] iArr = new int[sparseArrayZzf.size()];
        long[] jArr = new long[sparseArrayZzf.size()];
        for (int i10 = 0; i10 < sparseArrayZzf.size(); i10++) {
            iArr[i10] = sparseArrayZzf.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayZzf.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzhhVarZzd.zzi.zzb(bundle);
    }

    @Override // sh.t0
    public final void onFailure(Throwable th2) {
        zzlj zzljVar = this.zzb;
        zzljVar.zzg();
        zzljVar.zzam(false);
        zzic zzicVar = zzljVar.zzu;
        int iZzaq = (zzicVar.zzc().zzp(null, zzfy.zzaT) ? zzljVar.zzaq(th2) : 2) - 1;
        if (iZzaq == 0) {
            zzicVar.zzaV().zze().zzc("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), zzgu.zzl(th2.toString()));
            zzljVar.zzao(1);
            zzljVar.zzy().add(this.zza);
            return;
        }
        if (iZzaq != 1) {
            zzicVar.zzaV().zzb().zzc("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), th2);
            zza();
            zzljVar.zzao(1);
            zzljVar.zzz();
            return;
        }
        zzljVar.zzy().add(this.zza);
        if (zzljVar.zzan() > ((Integer) zzfy.zzaw.zzb(null)).intValue()) {
            zzljVar.zzao(1);
            zzicVar.zzaV().zze().zzc("registerTriggerAsync failed. May try later. App ID, throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), zzgu.zzl(th2.toString()));
        } else {
            zzicVar.zzaV().zze().zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), zzgu.zzl(String.valueOf(zzljVar.zzan())), zzgu.zzl(th2.toString()));
            zzljVar.zzai(zzljVar.zzan());
            int iZzan = zzljVar.zzan();
            zzljVar.zzao(iZzan + iZzan);
        }
    }

    @Override // sh.t0
    public final void onSuccess(Object obj) {
        zzlj zzljVar = this.zzb;
        zzljVar.zzg();
        zza();
        zzljVar.zzam(false);
        zzljVar.zzao(1);
        zzljVar.zzu.zzaV().zzj().zzb("Successfully registered trigger URI", this.zza.zza);
        zzljVar.zzz();
    }
}
