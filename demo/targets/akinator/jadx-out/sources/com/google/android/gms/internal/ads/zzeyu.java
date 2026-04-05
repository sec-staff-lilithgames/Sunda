package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeyu implements zzeya {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgus zzc;
    private final ScheduledExecutorService zzd;
    private final zzehi zze;
    private final zzfgn zzf;
    private final VersionInfoParcel zzg;

    public zzeyu(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgus zzgusVar, ScheduledExecutorService scheduledExecutorService, zzehi zzehiVar, zzfgn zzfgnVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgusVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehiVar;
        this.zzf = zzfgnVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.zzeya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sh.n1 zza() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbel r0 = com.google.android.gms.internal.ads.zzbeu.zzlu
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lfb
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            boolean r0 = r0.zzz()
            if (r0 == 0) goto Lfb
            com.google.android.gms.internal.ads.zzbel r0 = com.google.android.gms.internal.ads.zzbeu.zzly
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzfgn r0 = r5.zzf
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            int r0 = r0.zzy
            if (r0 == r1) goto Lfb
        L3a:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r5.zzg
            int r0 = r0.clientJarVersion
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzls
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfb
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzlt
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfb
            com.google.android.gms.internal.ads.zzbel r0 = com.google.android.gms.internal.ads.zzbeu.zzlq
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
            goto La0
        L77:
            com.google.android.gms.internal.ads.zzbel r0 = com.google.android.gms.internal.ads.zzbeu.zzlr
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8a
            goto Lfb
        L8a:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.content.Context r1 = r5.zzb
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lfb
        La0:
            com.google.android.gms.internal.ads.zzehi r0 = r5.zze     // Catch: java.lang.Exception -> Lc1
            r1 = 0
            sh.n1 r0 = r0.zza(r1)     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzlw     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Exception -> Lc1
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lc1
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc1
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.ScheduledExecutorService r4 = r5.zzd     // Catch: java.lang.Exception -> Lc1
            sh.n1 r0 = com.google.android.gms.internal.ads.zzgui.zzi(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            r0 = move-exception
            sh.n1 r0 = com.google.android.gms.internal.ads.zzgui.zzc(r0)
        Lc6:
            com.google.android.gms.internal.ads.zzgus r1 = r5.zzc
            com.google.android.gms.internal.ads.zzgua r0 = com.google.android.gms.internal.ads.zzgua.zzw(r0)
            com.google.android.gms.internal.ads.zzeyt r2 = com.google.android.gms.internal.ads.zzeyt.zza
            sh.n1 r0 = com.google.android.gms.internal.ads.zzgui.zzj(r0, r2, r1)
            com.google.android.gms.internal.ads.zzgua r0 = (com.google.android.gms.internal.ads.zzgua) r0
            com.google.android.gms.internal.ads.zzeyr r2 = new com.google.android.gms.internal.ads.zzeyr
            r2.<init>()
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            sh.n1 r0 = com.google.android.gms.internal.ads.zzgui.zzh(r0, r3, r2, r1)
            com.google.android.gms.internal.ads.zzgua r0 = (com.google.android.gms.internal.ads.zzgua) r0
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzlw
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            sh.n1 r0 = com.google.android.gms.internal.ads.zzgui.zzi(r0, r1, r4, r3)
            return r0
        Lfb:
            com.google.android.gms.internal.ads.zzeyv r0 = new com.google.android.gms.internal.ads.zzeyv
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            sh.n1 r0 = com.google.android.gms.internal.ads.zzgui.zza(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyu.zza():sh.n1");
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 56;
    }

    public final /* synthetic */ n1 zzc(final Throwable th2) {
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeys
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlv)).booleanValue();
                Throwable th3 = th2;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgui.zza(th2 instanceof SecurityException ? new zzeyv("", 2, null) : th2 instanceof IllegalStateException ? new zzeyv("", 3, null) : th2 instanceof IllegalArgumentException ? new zzeyv("", 4, null) : th2 instanceof TimeoutException ? new zzeyv("", 5, null) : new zzeyv("", 0, null));
    }
}
