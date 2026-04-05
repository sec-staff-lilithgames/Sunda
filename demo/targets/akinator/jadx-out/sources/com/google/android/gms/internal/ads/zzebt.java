package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzebt extends zzbxa {
    private final zzcca zza;
    private final zzbxj zzb;

    public zzebt(zzcca zzccaVar, zzbxj zzbxjVar) {
        this.zza = zzccaVar;
        this.zzb = zzbxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzeck(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxj zzbxjVar) {
        this.zza.zzc(new zzeck(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbxjVar));
    }
}
