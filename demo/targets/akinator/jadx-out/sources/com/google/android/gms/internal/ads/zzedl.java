package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzedl implements zzguf {
    final /* synthetic */ zzbxj zza;
    final /* synthetic */ zzbxb zzb;

    public zzedl(zzeea zzeeaVar, zzbxj zzbxjVar, zzbxb zzbxbVar) {
        this.zza = zzbxjVar;
        this.zzb = zzbxbVar;
        Objects.requireNonNull(zzeeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th2));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue()) {
                this.zzb.zze(parcelFileDescriptor);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcw)).booleanValue() && (bundle = this.zza.zzm) != null) {
                bundle.putLong(zzduq.BINDER_CALL_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }
}
