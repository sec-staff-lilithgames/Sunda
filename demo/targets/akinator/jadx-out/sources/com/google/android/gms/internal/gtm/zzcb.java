package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcb extends zzbr {
    private final zzca zza;
    private final zzcv zzb;
    private final zzfb zzc;
    private zzel zzd;

    public zzcb(zzbu zzbuVar) {
        super(zzbuVar);
        this.zzc = new zzfb(zzbuVar.zzr());
        this.zza = new zzca(this);
        this.zzb = new zzbx(this, zzbuVar);
    }

    public static /* synthetic */ void zzb(zzcb zzcbVar, ComponentName componentName) {
        com.google.android.gms.analytics.zzr.zzh();
        if (zzcbVar.zzd != null) {
            zzcbVar.zzd = null;
            zzcbVar.zzO("Disconnected from device AnalyticsService", componentName);
            zzcbVar.zzs().zzk();
        }
    }

    public static /* synthetic */ void zzi(zzcb zzcbVar, zzel zzelVar) {
        com.google.android.gms.analytics.zzr.zzh();
        zzcbVar.zzd = zzelVar;
        zzcbVar.zzj();
        zzcbVar.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        zzw();
        this.zzb.zzg(((Long) zzeh.zzA.zzb()).longValue());
    }

    public final void zzc() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        try {
            ConnectionTracker.getInstance().unbindService(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    public final boolean zze() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzel zzelVar = this.zzd;
        if (zzelVar == null) {
            return false;
        }
        try {
            zzelVar.zze();
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzN("Failed to clear hits from AnalyticsService");
            return false;
        }
    }

    public final boolean zzf() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (this.zzd != null) {
            return true;
        }
        zzel zzelVarZza = this.zza.zza();
        if (zzelVarZza == null) {
            return false;
        }
        this.zzd = zzelVarZza;
        zzj();
        return true;
    }

    public final boolean zzg() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        return this.zzd != null;
    }

    public final boolean zzh(zzek zzekVar) {
        String strZzk;
        Preconditions.checkNotNull(zzekVar);
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzel zzelVar = this.zzd;
        if (zzelVar == null) {
            return false;
        }
        if (zzekVar.zzh()) {
            zzw();
            strZzk = zzcs.zzi();
        } else {
            zzw();
            strZzk = zzcs.zzk();
        }
        try {
            zzelVar.zzf(zzekVar.zzg(), zzekVar.zzd(), strZzk, Collections.EMPTY_LIST);
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzN("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
    }
}
