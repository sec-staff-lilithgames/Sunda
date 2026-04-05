package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbvz {
    private static zzcas zze;
    private final Context zza;
    private final AdFormat zzb;
    private final com.google.android.gms.ads.internal.client.zzek zzc;
    private final String zzd;

    public zzbvz(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzek zzekVar, String str) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzekVar;
        this.zzd = str;
    }

    public static zzcas zza(Context context) {
        zzcas zzcasVar;
        synchronized (zzbvz.class) {
            try {
                if (zze == null) {
                    zze = com.google.android.gms.ads.internal.client.zzbb.zzb().zzj(context, new zzbrf());
                }
                zzcasVar = zze;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzcasVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zzmVarZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzcas zzcasVarZza = zza(context);
        if (zzcasVarZza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.zzc;
        if (zzekVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzi(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzekVar.zzp(jCurrentTimeMillis);
            zzmVarZza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzekVar);
        }
        try {
            zzcasVarZza.zze(iObjectWrapperWrap, new zzcaw(this.zzd, this.zzb.name(), null, zzmVarZza, 0, null), new zzbvy(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
