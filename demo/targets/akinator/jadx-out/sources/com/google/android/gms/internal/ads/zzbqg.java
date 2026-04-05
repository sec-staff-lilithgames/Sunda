package com.google.android.gms.internal.ads;

import android.content.Context;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbqg {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbqp zzc;
    private zzbqp zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbqp zza(Context context, VersionInfoParcel versionInfoParcel, zzflp zzflpVar) {
        zzbqp zzbqpVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbqp(zzc(context), versionInfoParcel, zzd(context) ? (String) zzbhe.zzb.zze() : (String) zzbhe.zzf.zze(), zzflpVar);
                }
                zzbqpVar = this.zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbqpVar;
    }

    public final zzbqp zzb(Context context, VersionInfoParcel versionInfoParcel, zzflp zzflpVar) {
        zzbqp zzbqpVar;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zzbqp(zzc(context), versionInfoParcel, zzd(context) ? ((Boolean) zzbha.zzg.zze()).booleanValue() ? (String) zzbhe.zza.zze() : (String) zzbhe.zze.zze() : ((Boolean) zzbha.zzf.zze()).booleanValue() ? (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zza) : (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzb), zzflpVar);
                }
                zzbqpVar = this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbqpVar;
    }

    private static final boolean zzd(Context context) {
        if (((Boolean) zzbhe.zzc.zze()).booleanValue()) {
            return Arrays.asList(((String) zzbhe.zzd.zze()).split(NyKZx.anhmjoKuRE)).contains(com.google.android.gms.ads.internal.util.zzs.zzm(zzc(context)).zza().toLowerCase(Locale.ROOT));
        }
        return false;
    }
}
