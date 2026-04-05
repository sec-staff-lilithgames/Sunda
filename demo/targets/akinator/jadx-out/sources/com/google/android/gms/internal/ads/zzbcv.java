package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbcv {
    private com.google.android.gms.ads.internal.client.zzbx zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzek zzd;
    private final AppOpenAd.AppOpenAdLoadCallback zze;
    private final zzbrf zzf = new zzbrf();
    private final com.google.android.gms.ads.internal.client.zzq zzg = com.google.android.gms.ads.internal.client.zzq.zza;

    public zzbcv(Context context, String str, com.google.android.gms.ads.internal.client.zzek zzekVar, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzekVar;
        this.zze = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzr zzrVarZzd = com.google.android.gms.ads.internal.client.zzr.zzd();
            com.google.android.gms.ads.internal.client.zzaz zzazVarZzb = com.google.android.gms.ads.internal.client.zzbb.zzb();
            Context context = this.zzb;
            String str = this.zzc;
            com.google.android.gms.ads.internal.client.zzbx zzbxVarZza = zzazVarZzb.zza(context, zzrVarZzd, str, this.zzf);
            this.zza = zzbxVarZza;
            if (zzbxVarZza != null) {
                com.google.android.gms.ads.internal.client.zzek zzekVar = this.zzd;
                zzekVar.zzp(jCurrentTimeMillis);
                this.zza.zzJ(new zzbci(this.zze, str));
                this.zza.zze(this.zzg.zza(context, zzekVar));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }
}
