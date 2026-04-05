package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbu {
    private static volatile zzbu zza;
    private final Context zzb;
    private final Context zzc;
    private final Clock zzd;
    private final zzcs zze;
    private final zzeo zzf;
    private final com.google.android.gms.analytics.zzr zzg;
    private final zzbp zzh;
    private final zzcx zzi;
    private final zzfg zzj;
    private final zzeu zzk;
    private final GoogleAnalytics zzl;
    private final zzcm zzm;
    private final zzbh zzn;
    private final zzce zzo;
    private final zzcw zzp;

    public zzbu(zzbv zzbvVar) {
        Context contextZza = zzbvVar.zza();
        Preconditions.checkNotNull(contextZza, "Application context can't be null");
        Context contextZzb = zzbvVar.zzb();
        Preconditions.checkNotNull(contextZzb);
        this.zzb = contextZza;
        this.zzc = contextZzb;
        this.zzd = DefaultClock.getInstance();
        this.zze = new zzcs(this);
        zzeo zzeoVar = new zzeo(this);
        zzeoVar.zzW();
        this.zzf = zzeoVar;
        zzm().zzL("Google Analytics " + zzbs.zza + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzeu zzeuVar = new zzeu(this);
        zzeuVar.zzW();
        this.zzk = zzeuVar;
        zzfg zzfgVar = new zzfg(this);
        zzfgVar.zzW();
        this.zzj = zzfgVar;
        zzbp zzbpVar = new zzbp(this, zzbvVar);
        zzcm zzcmVar = new zzcm(this);
        zzbh zzbhVar = new zzbh(this);
        zzce zzceVar = new zzce(this);
        zzcw zzcwVar = new zzcw(this);
        com.google.android.gms.analytics.zzr zzrVarZzb = com.google.android.gms.analytics.zzr.zzb(contextZza);
        zzrVarZzb.zzj(new zzbt(this));
        this.zzg = zzrVarZzb;
        GoogleAnalytics googleAnalytics = new GoogleAnalytics(this);
        zzcmVar.zzW();
        this.zzm = zzcmVar;
        zzbhVar.zzW();
        this.zzn = zzbhVar;
        zzceVar.zzW();
        this.zzo = zzceVar;
        zzcwVar.zzW();
        this.zzp = zzcwVar;
        zzcx zzcxVar = new zzcx(this);
        zzcxVar.zzW();
        this.zzi = zzcxVar;
        zzbpVar.zzW();
        this.zzh = zzbpVar;
        googleAnalytics.zzg();
        this.zzl = googleAnalytics;
        zzbpVar.zzm();
    }

    public static zzbu zzg(Context context) {
        Preconditions.checkNotNull(context);
        if (zza == null) {
            synchronized (zzbu.class) {
                try {
                    if (zza == null) {
                        Clock defaultClock = DefaultClock.getInstance();
                        long jElapsedRealtime = defaultClock.elapsedRealtime();
                        zzbu zzbuVar = new zzbu(new zzbv(context));
                        zza = zzbuVar;
                        GoogleAnalytics.zzf();
                        long jElapsedRealtime2 = defaultClock.elapsedRealtime() - jElapsedRealtime;
                        Long l9 = (Long) zzeh.zzE.zzb();
                        if (jElapsedRealtime2 > l9.longValue()) {
                            zzbuVar.zzm().zzS("Slow initialization (ms)", Long.valueOf(jElapsedRealtime2), l9);
                        }
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbr zzbrVar) {
        Preconditions.checkNotNull(zzbrVar, "Analytics service not created/initialized");
        Preconditions.checkArgument(zzbrVar.zzX(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final GoogleAnalytics zzc() {
        Preconditions.checkNotNull(this.zzl);
        Preconditions.checkArgument(this.zzl.zzj(), "Analytics instance not initialized");
        return this.zzl;
    }

    public final com.google.android.gms.analytics.zzr zzd() {
        Preconditions.checkNotNull(this.zzg);
        return this.zzg;
    }

    public final zzbh zze() {
        zzs(this.zzn);
        return this.zzn;
    }

    public final zzbp zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzce zzh() {
        zzs(this.zzo);
        return this.zzo;
    }

    public final zzcm zzi() {
        zzs(this.zzm);
        return this.zzm;
    }

    public final zzcs zzj() {
        return this.zze;
    }

    public final zzcw zzk() {
        return this.zzp;
    }

    public final zzcx zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzeo zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzeo zzn() {
        return this.zzf;
    }

    public final zzeu zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzeu zzp() {
        zzeu zzeuVar = this.zzk;
        if (zzeuVar == null || !zzeuVar.zzX()) {
            return null;
        }
        return zzeuVar;
    }

    public final zzfg zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final Clock zzr() {
        return this.zzd;
    }
}
