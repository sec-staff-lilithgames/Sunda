package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdxc implements zzdwr {
    private final long zza;
    private final zzepb zzb;

    public zzdxc(long j10, Context context, zzdwv zzdwvVar, zzcjn zzcjnVar, String str) {
        this.zza = j10;
        zzfea zzfeaVarZzn = zzcjnVar.zzn();
        zzfeaVarZzn.zzd(context);
        zzfeaVarZzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzfeaVarZzn.zzc(str);
        zzepb zzepbVarZza = zzfeaVarZzn.zza().zza();
        this.zzb = zzepbVarZza;
        zzepbVarZza.zzdW(new zzdxb(this, zzdwvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final void zzc() {
        this.zzb.zzc();
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }
}
