package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzedj implements zzguf {
    final /* synthetic */ zzbwt zza;
    final /* synthetic */ zzbxc zzb;

    public zzedj(zzeea zzeeaVar, zzbxc zzbxcVar, zzbwt zzbwtVar) {
        this.zzb = zzbxcVar;
        this.zza = zzbwtVar;
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
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }
}
