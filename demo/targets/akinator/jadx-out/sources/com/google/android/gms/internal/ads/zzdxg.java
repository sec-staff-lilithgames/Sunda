package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdxg implements zzdwr {
    private final long zza;
    private final zzdwv zzb;
    private final zzffl zzc;

    public zzdxg(long j10, Context context, zzdwv zzdwvVar, zzcjn zzcjnVar, String str) {
        this.zza = j10;
        this.zzb = zzdwvVar;
        zzffn zzffnVarZzq = zzcjnVar.zzq();
        zzffnVarZzq.zzc(context);
        zzffnVarZzq.zzb(str);
        this.zzc = zzffnVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new zzdxe(this));
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final void zzb() {
        try {
            zzffl zzfflVar = this.zzc;
            zzfflVar.zze(new zzdxf(this));
            zzfflVar.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzdwv zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final void zzc() {
    }
}
