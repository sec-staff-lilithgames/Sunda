package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzeln extends zzemo {
    private final zzdhe zza;

    public zzeln(zzcym zzcymVar, zzdgt zzdgtVar, zzczg zzczgVar, zzczv zzczvVar, zzdaa zzdaaVar, zzczb zzczbVar, zzdds zzddsVar, zzdhr zzdhrVar, zzdaz zzdazVar, zzdhe zzdheVar, zzddo zzddoVar) {
        super(zzcymVar, zzdgtVar, zzczgVar, zzczvVar, zzdaaVar, zzddsVar, zzdazVar, zzdhrVar, zzddoVar, zzczbVar);
        this.zza = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemo, com.google.android.gms.internal.ads.zzbrp
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzemo, com.google.android.gms.internal.ads.zzbrp
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzemo, com.google.android.gms.internal.ads.zzbrp
    public final void zzp(zzbyh zzbyhVar) {
        this.zza.zzb(zzbyhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemo, com.google.android.gms.internal.ads.zzbrp
    public final void zzr(zzbyl zzbylVar) throws RemoteException {
        this.zza.zzb(new zzbyh(zzbylVar.zze(), zzbylVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzemo, com.google.android.gms.internal.ads.zzbrp
    public final void zzt() throws RemoteException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzemo, com.google.android.gms.internal.ads.zzbrp
    public final void zzz() throws RemoteException {
        this.zza.zzb(null);
    }
}
