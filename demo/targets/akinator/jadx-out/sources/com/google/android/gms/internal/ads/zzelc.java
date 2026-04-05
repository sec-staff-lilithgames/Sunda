package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzelc implements zzgtq {
    private final zzfks zza;
    private final zzcyq zzb;
    private final zzfnc zzc;
    private final zzfng zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzctr zzg;
    private final zzekv zzh;
    private final zzehp zzi;
    private final Context zzj;
    private final zzflm zzk;
    private final zzekf zzl;
    private final zzdvc zzm;

    public zzelc(Context context, zzfks zzfksVar, zzekv zzekvVar, zzcyq zzcyqVar, zzfnc zzfncVar, zzfng zzfngVar, zzctr zzctrVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzehp zzehpVar, zzflm zzflmVar, zzekf zzekfVar, zzdvc zzdvcVar) {
        this.zzj = context;
        this.zza = zzfksVar;
        this.zzh = zzekvVar;
        this.zzb = zzcyqVar;
        this.zzc = zzfncVar;
        this.zzd = zzfngVar;
        this.zzg = zzctrVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzehpVar;
        this.zzk = zzflmVar;
        this.zzl = zzekfVar;
        this.zzm = zzdvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zzb(com.google.android.gms.internal.ads.zzfgf r5) {
        /*
            com.google.android.gms.internal.ads.zzbel r0 = com.google.android.gms.internal.ads.zzbeu.zzgg
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfge r5 = r5.zzb
            com.google.android.gms.internal.ads.zzffx r5 = r5.zzb
            int r2 = r5.zzf
            if (r2 == 0) goto L5b
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbel r2 = com.google.android.gms.internal.ads.zzbeu.zzgf
            com.google.android.gms.internal.ads.zzbes r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L5b
            goto L5c
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L5c
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r1 = p0.o2.l(r2, r0, r1)
            goto L5c
        L5b:
            r1 = r0
        L5c:
            com.google.android.gms.internal.ads.zzffw r5 = r5.zzj
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.zza()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelc.zzb(com.google.android.gms.internal.ads.zzfgf):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final /* synthetic */ n1 zza(Object obj) throws Exception {
        int i10;
        Bundle bundle;
        final zzfgf zzfgfVar = (zzfgf) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue() && (bundle = zzfgfVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcw)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzm.zze(), zzduq.RENDERING_START.zza());
        }
        String strZzb = zzb(zzfgfVar);
        zzehp zzehpVar = this.zzi;
        zzfge zzfgeVar = zzfgfVar.zzb;
        zzffx zzffxVar = zzfgeVar.zzb;
        zzehpVar.zza(zzffxVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjh)).booleanValue() && (i10 = zzffxVar.zzf) != 0 && (i10 < 200 || i10 >= 300)) {
            return zzgui.zzc(new zzekz(3, strZzb));
        }
        String str = zzffxVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzee)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzffu zzffuVar : zzfgeVar.zza) {
                zzehpVar.zzb(zzffuVar);
                Iterator it = zzffuVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzehpVar.zze(zzffuVar, 0L, zzfhp.zzd(1, null, null));
                        break;
                    }
                    zzehk zzehkVarZza = this.zzg.zza(zzffuVar.zzb, (String) it.next());
                    if (zzehkVarZza == null || !zzehkVarZza.zza(zzfgfVar, zzffuVar)) {
                    }
                }
            }
        } else {
            zzehpVar.zzc(str, zzfgeVar.zza);
        }
        zzcyq zzcyqVar = this.zzb;
        zzcpi zzcpiVar = new zzcpi(zzfgfVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzcyqVar.zzq(zzcpiVar, executor);
        if (zzffxVar.zzr > 1) {
            return this.zzl.zza(zzfgfVar);
        }
        String strZzb2 = zzb(zzfgfVar);
        zzfks zzfksVar = this.zza;
        zzfkm zzfkmVar = zzfkm.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfksVar);
        zzfjz zzfjzVarZzi = zzfkd.zza(zzgui.zzc(new zzekz(3, strZzb2)), zzfkmVar, zzfksVar).zzi();
        final zzekv zzekvVar = this.zzh;
        zzekvVar.zza();
        int i11 = 0;
        for (final zzffu zzffuVar2 : zzfgeVar.zza) {
            Iterator it2 = zzffuVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzehk zzehkVarZza2 = this.zzg.zza(zzffuVar2.zzb, str2);
                if (zzehkVarZza2 != null && zzehkVarZza2.zza(zzfgfVar, zzffuVar2)) {
                    zzfkj zzfkjVarZza = zzfksVar.zza(zzfkm.RENDER_CONFIG_WATERFALL, zzfjzVarZzi);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(str2).length());
                    sb2.append("render-config-");
                    sb2.append(i11);
                    sb2.append("-");
                    sb2.append(str2);
                    zzfjzVarZzi = zzfkjVarZza.zza(sb2.toString()).zzg(Throwable.class, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzelb
                        @Override // com.google.android.gms.internal.ads.zzgtq
                        public final /* synthetic */ n1 zza(Object obj2) {
                            return this.zza.zzc(zzffuVar2, zzfgfVar, zzehkVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i11++;
        }
        zzfjzVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzela
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzekvVar.zzb();
            }
        }, executor);
        return zzfjzVarZzi;
    }

    public final /* synthetic */ n1 zzc(zzffu zzffuVar, zzfgf zzfgfVar, zzehk zzehkVar, Throwable th2) {
        zzflc zzflcVarZzn = zzflc.zzn(this.zzj, 12);
        zzflcVarZzn.zzi(zzffuVar.zzE);
        zzflcVarZzn.zza();
        n1 n1VarZzi = zzgui.zzi(zzehkVar.zzb(zzfgfVar, zzffuVar), zzffuVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfgfVar, zzffuVar, n1VarZzi, this.zzc);
        zzfll.zzd(n1VarZzi, this.zzk, zzflcVarZzn);
        return n1VarZzi;
    }
}
