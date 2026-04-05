package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.List;
import java.util.Map;
import z.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zza extends zzc {
    private final zzic zza;
    private final zzlj zzb;

    public zza(zzic zzicVar) {
        super(null);
        Preconditions.checkNotNull(zzicVar);
        this.zza = zzicVar;
        this.zzb = zzicVar.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.zzb.zzB(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzb(String str, String str2, Bundle bundle, long j10) throws IllegalStateException {
        this.zzb.zzC(str, str2, bundle, true, false, j10);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Map zzc(boolean z10) {
        List<zzpl> listZzO = this.zzb.zzO(z10);
        f fVar = new f(listZzO.size());
        for (zzpl zzplVar : listZzO) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                fVar.put(zzplVar.zzb, objZza);
            }
        }
        return fVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z10) {
        return this.zzb.zzP(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zze(zzjp zzjpVar) {
        this.zzb.zzV(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzf(zzjq zzjqVar) {
        this.zzb.zzW(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzg(zzjq zzjqVar) {
        this.zzb.zzX(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        return this.zzb.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        return this.zzb.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        return this.zzb.zzQ();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        return this.zzb.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.zza.zzk().zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) throws IllegalStateException {
        zzic zzicVar = this.zza;
        zzicVar.zzw().zza(str, zzicVar.zzaZ().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) throws IllegalStateException {
        zzic zzicVar = this.zza;
        zzicVar.zzw().zzb(str, zzicVar.zzaZ().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) throws IllegalStateException {
        this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.zza.zzj().zzab(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        return this.zzb.zzac(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        this.zzb.zzY(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Boolean zzs() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Integer zzt() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final String zzu() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Long zzv() {
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Double zzw() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Object zzx(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? this.zzb.zzi() : this.zzb.zzl() : this.zzb.zzm() : this.zzb.zzk() : this.zzb.zzj();
    }
}
