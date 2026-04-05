package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcj extends zzbr {
    private boolean zza;
    private final zzcd zzb;
    private final zzer zzc;
    private final zzep zzd;
    private final zzcb zze;
    private long zzf;
    private final zzcv zzg;
    private final zzcv zzh;
    private final zzfb zzi;
    private long zzj;
    private boolean zzk;

    public zzcj(zzbu zzbuVar, zzbv zzbvVar) {
        super(zzbuVar);
        Preconditions.checkNotNull(zzbvVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzep(zzbuVar);
        this.zzb = new zzcd(zzbuVar);
        this.zzc = new zzer(zzbuVar);
        this.zze = new zzcb(zzbuVar);
        this.zzi = new zzfb(zzC());
        this.zzg = new zzcf(this, zzbuVar);
        this.zzh = new zzcg(this, zzbuVar);
    }

    private final void zzaf() {
        zzcx zzcxVarZzy = zzy();
        if (zzcxVarZzy.zze()) {
            zzcxVarZzy.zza();
        }
    }

    private final void zzag() {
        if (this.zzg.zzh()) {
            zzN("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzah() {
        long jZzc;
        zzcx zzcxVarZzy = zzy();
        if (zzcxVarZzy.zzc() && !zzcxVarZzy.zze()) {
            com.google.android.gms.analytics.zzr.zzh();
            zzV();
            try {
                jZzc = this.zzb.zzc();
            } catch (SQLiteException e10) {
                zzJ("Failed to get min/max hit times from local store", e10);
                jZzc = 0;
            }
            if (jZzc != 0) {
                long jAbs = Math.abs(zzC().currentTimeMillis() - jZzc);
                zzw();
                if (jAbs <= ((Long) zzeh.zzh.zzb()).longValue()) {
                    zzw();
                    zzO("Dispatch alarm scheduled (ms)", Long.valueOf(zzcs.zzd()));
                    zzcxVarZzy.zzb();
                }
            }
        }
    }

    private final void zzai(zzbw zzbwVar, zzav zzavVar) {
        Preconditions.checkNotNull(zzbwVar);
        Preconditions.checkNotNull(zzavVar);
        com.google.android.gms.analytics.zza zzaVar = new com.google.android.gms.analytics.zza(zzt());
        zzaVar.zzc(zzbwVar.zzc());
        zzaVar.zzd(zzbwVar.zzf());
        com.google.android.gms.analytics.zzh zzhVarZza = zzaVar.zza();
        zzbd zzbdVar = (zzbd) zzhVarZza.zzb(zzbd.class);
        zzbdVar.zzk("data");
        zzbdVar.zzl(true);
        zzhVarZza.zzg(zzavVar);
        zzay zzayVar = (zzay) zzhVarZza.zzb(zzay.class);
        zzau zzauVar = (zzau) zzhVarZza.zzb(zzau.class);
        for (Map.Entry entry : zzbwVar.zzd().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                zzauVar.zzk(str2);
            } else if (ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTERVERSION.equals(str)) {
                zzauVar.zzl(str2);
            } else if ("aid".equals(str)) {
                zzauVar.zzi(str2);
            } else if ("aiid".equals(str)) {
                zzauVar.zzj(str2);
            } else if ("uid".equals(str)) {
                zzbdVar.zzm(str2);
            } else {
                zzayVar.zze(str, str2);
            }
        }
        zzG("Sending installation campaign to", zzbwVar.zzc(), zzavVar);
        zzhVarZza.zzj(zzA().zza());
        zzhVarZza.zzk();
    }

    private final boolean zzaj(String str) {
        return Wrappers.packageManager(zzo()).checkCallingOrSelfPermission(str) == 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzcj zzcjVar) {
        try {
            zzcjVar.zzb.zza();
            zzcjVar.zzad();
        } catch (SQLiteException e10) {
            zzcjVar.zzR("Failed to delete stale hits", e10);
        }
        zzcv zzcvVar = zzcjVar.zzh;
        zzcjVar.zzw();
        zzcvVar.zzg(86400000L);
    }

    public final void zzY(long j10) {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (j10 < 0) {
            j10 = 0;
        }
        this.zzf = j10;
        zzad();
    }

    public final void zzZ() {
        zzV();
        Preconditions.checkState(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().zzi(new zzch(this));
    }

    public final long zza() {
        long j10 = this.zzf;
        if (j10 != Long.MIN_VALUE) {
            return j10;
        }
        zzw();
        long jLongValue = ((Long) zzeh.zze.zzb()).longValue();
        zzfg zzfgVarZzB = zzB();
        zzfgVarZzB.zzV();
        if (!zzfgVarZzB.zzc) {
            return jLongValue;
        }
        zzB().zzV();
        return r0.zzd * 1000;
    }

    public final void zzaa() {
        zzV();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        Context contextZza = zzt().zza();
        if (!zzev.zzb(contextZza)) {
            zzQ("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfa.zzh(contextZza)) {
            zzI("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zzb(contextZza)) {
            zzQ("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzaj("android.permission.ACCESS_NETWORK_STATE")) {
            zzI("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (!zzaj("android.permission.INTERNET")) {
            zzI("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (zzfa.zzh(zzo())) {
            zzN("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzQ("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzab()) {
                zzi();
            }
        }
        zzad();
    }

    public final void zzab() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzE("Sync dispatching local hits");
        long j10 = this.zzj;
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (this.zzj != j10) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzJ("Sync local dispatch failed", e10);
            zzad();
        }
    }

    public final void zzac() {
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        this.zzk = true;
        this.zze.zzc();
        zzad();
    }

    public final void zzad() {
        long jMin;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzab()) {
                    this.zzd.zzc();
                    zzag();
                    zzaf();
                    return;
                }
                if (!((Boolean) zzeh.zzz.zzb()).booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzag();
                        zzaf();
                        zzah();
                        return;
                    }
                }
                zzah();
                long jZza = zza();
                long jZzb = zzA().zzb();
                if (jZzb != 0) {
                    jMin = jZza - Math.abs(zzC().currentTimeMillis() - jZzb);
                    if (jMin <= 0) {
                        zzw();
                        jMin = Math.min(zzcs.zze(), jZza);
                    }
                } else {
                    zzw();
                    jMin = Math.min(zzcs.zze(), jZza);
                }
                zzO("Dispatch scheduled (ms)", Long.valueOf(jMin));
                if (!this.zzg.zzh()) {
                    this.zzg.zzg(jMin);
                    return;
                } else {
                    this.zzg.zze(Math.max(1L, jMin + this.zzg.zzb()));
                    return;
                }
            }
        }
        this.zzd.zzc();
        zzag();
        zzaf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        zzN("Store is empty, nothing to dispatch");
        zzag();
        zzaf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r11.zze.zzg() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        zzw();
        zzN("Service connected, sending hits to the service");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r6.isEmpty() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        r7 = (com.google.android.gms.internal.gtm.zzek) r6.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if (r11.zze.zzh(r7) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        r4 = java.lang.Math.max(r4, r7.zzb());
        r6.remove(r7);
        zzF("Hit sent do device AnalyticsService for delivery", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        r11.zzb.zzn(r7.zzb());
        r0.add(java.lang.Long.valueOf(r7.zzb()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
    
        zzJ("Failed to remove hit that was send for delivery", r0);
        zzag();
        zzaf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        if (r11.zzc.zze() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:
    
        r6 = r11.zzc.zzc(r6);
        r7 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        if (r7.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        r4 = java.lang.Math.max(r4, ((java.lang.Long) r7.next()).longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0128, code lost:
    
        r11.zzb.zzY(r6);
        r0.addAll(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        zzJ("Failed to remove successfully uploaded hits", r0);
        zzag();
        zzaf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
    
        if (r0.isEmpty() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0173, code lost:
    
        zzJ("Failed to commit local dispatch transaction", r0);
        zzag();
        zzaf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzae() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcj.zzae():boolean");
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        this.zzb.zzW();
        this.zzc.zzW();
        this.zze.zzW();
    }

    public final void zzf(zzcy zzcyVar) {
        zzg(zzcyVar, this.zzj);
    }

    public final void zzg(zzcy zzcyVar, long j10) {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long jZzb = zzA().zzb();
        zzF("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(jZzb != 0 ? Math.abs(zzC().currentTimeMillis() - jZzb) : -1L));
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (zzcyVar != null) {
                zzcyVar.zza(null);
            }
            if (this.zzj != j10) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzJ("Local dispatch failed", e10);
            zzA().zzi();
            zzad();
            if (zzcyVar != null) {
                zzcyVar.zza(e10);
            }
        }
    }

    public final void zzh() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzw();
        zzN("Delete all hits from local store");
        try {
            zzcd zzcdVar = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzcdVar.zzV();
            zzcdVar.zzf().delete("hits2", null, null);
            zzcd zzcdVar2 = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzcdVar2.zzV();
            zzcdVar2.zzf().delete("properties", null, null);
            zzad();
        } catch (SQLiteException e10) {
            zzR("Failed to delete hits from store", e10);
        }
        zzi();
        if (this.zze.zze()) {
            zzN("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    public final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (!zzcs.zzl() || this.zze.zzg()) {
            return;
        }
        zzw();
        if (this.zzi.zzc(((Long) zzeh.zzC.zzb()).longValue())) {
            this.zzi.zzb();
            zzN("Connecting to service");
            if (this.zze.zzf()) {
                zzN("Connected to service");
                this.zzi.zza();
                zzm();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf A[Catch: SQLiteException -> 0x00cc, TryCatch #5 {SQLiteException -> 0x00cc, blocks: (B:16:0x0079, B:17:0x0098, B:19:0x009e, B:21:0x00b2, B:23:0x00ba, B:25:0x00c2, B:28:0x00cf, B:31:0x00db, B:33:0x00e4, B:77:0x01f6, B:34:0x00ef, B:36:0x010a, B:38:0x011b, B:60:0x017a, B:39:0x011e, B:58:0x0176, B:62:0x018d, B:63:0x0190, B:64:0x0191, B:66:0x01bf, B:68:0x01ce, B:76:0x01f1, B:67:0x01c7, B:69:0x01d3, B:71:0x01df, B:74:0x01e7), top: B:88:0x0079, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c7 A[Catch: SQLiteException -> 0x00cc, TryCatch #5 {SQLiteException -> 0x00cc, blocks: (B:16:0x0079, B:17:0x0098, B:19:0x009e, B:21:0x00b2, B:23:0x00ba, B:25:0x00c2, B:28:0x00cf, B:31:0x00db, B:33:0x00e4, B:77:0x01f6, B:34:0x00ef, B:36:0x010a, B:38:0x011b, B:60:0x017a, B:39:0x011e, B:58:0x0176, B:62:0x018d, B:63:0x0190, B:64:0x0191, B:66:0x01bf, B:68:0x01ce, B:76:0x01f1, B:67:0x01c7, B:69:0x01d3, B:71:0x01df, B:74:0x01e7), top: B:88:0x0079, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01df A[Catch: SQLiteException -> 0x01e5, TryCatch #3 {SQLiteException -> 0x01e5, blocks: (B:69:0x01d3, B:71:0x01df, B:74:0x01e7), top: B:86:0x01d3, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7 A[Catch: SQLiteException -> 0x01e5, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e5, blocks: (B:69:0x01d3, B:71:0x01df, B:74:0x01e7), top: B:86:0x01d3, outer: #5 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(com.google.android.gms.internal.gtm.zzek r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcj.zzj(com.google.android.gms.internal.gtm.zzek):void");
    }

    public final void zzk(zzbw zzbwVar) {
        com.google.android.gms.analytics.zzr.zzh();
        zzF("Sending first hit to property", zzbwVar.zzc());
        zzfb zzfbVarZzf = zzA().zzf();
        zzw();
        if (zzfbVarZzf.zzc(zzcs.zzc())) {
            return;
        }
        String strZzg = zzA().zzg();
        if (TextUtils.isEmpty(strZzg)) {
            return;
        }
        zzav zzavVarZzb = zzff.zzb(zzz(), strZzg);
        zzF("Found relevant installation campaign", zzavVarZzb);
        zzai(zzbwVar, zzavVarZzb);
    }

    public final void zzl() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zzj = zzC().currentTimeMillis();
    }

    public final void zzm() {
        com.google.android.gms.analytics.zzr.zzh();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzw();
        zzw();
        if (!zzcs.zzl()) {
            zzQ("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzN("Service not connected");
            return;
        }
        if (this.zzb.zzab()) {
            return;
        }
        zzN("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                zzcd zzcdVar = this.zzb;
                zzw();
                List listZzj = zzcdVar.zzj(zzcs.zzh());
                if (listZzj.isEmpty()) {
                    zzad();
                    return;
                }
                while (!listZzj.isEmpty()) {
                    zzek zzekVar = (zzek) listZzj.get(0);
                    if (!this.zze.zzh(zzekVar)) {
                        zzad();
                        return;
                    }
                    listZzj.remove(zzekVar);
                    try {
                        this.zzb.zzn(zzekVar.zzb());
                    } catch (SQLiteException e10) {
                        zzJ("Failed to remove hit that was send for delivery", e10);
                        zzag();
                        zzaf();
                        return;
                    }
                }
            } catch (SQLiteException e11) {
                zzJ("Failed to read hits from store", e11);
                zzag();
                zzaf();
                return;
            }
        }
    }

    public final void zzn(String str) {
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.analytics.zzr.zzh();
        zzw();
        zzav zzavVarZzb = zzff.zzb(zzz(), str);
        if (zzavVarZzb == null) {
            zzR("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String strZzg = zzA().zzg();
        if (str.equals(strZzg)) {
            zzQ("Ignoring duplicate install campaign");
            return;
        }
        if (!TextUtils.isEmpty(strZzg)) {
            zzK("Ignoring multiple install campaigns. original, new", strZzg, str);
            return;
        }
        zzA().zzh(str);
        zzfb zzfbVarZzf = zzA().zzf();
        zzw();
        if (zzfbVarZzf.zzc(zzcs.zzc())) {
            zzR("Campaign received too late, ignoring", zzavVarZzb);
            return;
        }
        zzF("Received installation campaign", zzavVarZzb);
        zzcd zzcdVar = this.zzb;
        zzcdVar.zzV();
        com.google.android.gms.analytics.zzr.zzh();
        SQLiteDatabase sQLiteDatabaseZzf = zzcdVar.zzf();
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = {BidResponsedEx.KEY_CID, ScarConstants.TOKEN_ID_KEY, "adid", "hits_count", "params"};
                zzcdVar.zzw();
                int iIntValue = ((Integer) zzeh.zzd.zzb()).intValue();
                cursorQuery = sQLiteDatabaseZzf.query("properties", strArr, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(iIntValue));
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        boolean z10 = cursorQuery.getInt(2) != 0;
                        long j10 = cursorQuery.getInt(3);
                        Map mapZzl = zzcdVar.zzl(cursorQuery.getString(4));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            zzcdVar.zzS("Read property with empty client id or tracker id", string, string2);
                        } else {
                            arrayList.add(new zzbw(0L, string, string2, z10, j10, mapZzl));
                        }
                    } while (cursorQuery.moveToNext());
                }
                if (arrayList.size() >= iIntValue) {
                    zzcdVar.zzQ("Sending hits to too many properties. Campaign report might be incorrect");
                }
                cursorQuery.close();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzai((zzbw) it.next(), zzavVarZzb);
                }
            } catch (SQLiteException e10) {
                zzcdVar.zzJ("Error loading hits from the database", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public final long zzb(zzbw zzbwVar, boolean z10) {
        String str = QGjYBESwAiCc.aKli;
        Preconditions.checkNotNull(zzbwVar);
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        long j10 = -1;
        try {
            try {
                this.zzb.zzm();
                zzcd zzcdVar = this.zzb;
                String strZzb = zzbwVar.zzb();
                Preconditions.checkNotEmpty(strZzb);
                zzcdVar.zzV();
                com.google.android.gms.analytics.zzr.zzh();
                int iDelete = zzcdVar.zzf().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", strZzb});
                if (iDelete > 0) {
                    zzcdVar.zzO("Deleted property records", Integer.valueOf(iDelete));
                }
                long jZze = this.zzb.zze(0L, zzbwVar.zzb(), zzbwVar.zzc());
                zzbwVar.zze(1 + jZze);
                zzcd zzcdVar2 = this.zzb;
                Preconditions.checkNotNull(zzbwVar);
                zzcdVar2.zzV();
                com.google.android.gms.analytics.zzr.zzh();
                SQLiteDatabase sQLiteDatabaseZzf = zzcdVar2.zzf();
                Map mapZzd = zzbwVar.zzd();
                Preconditions.checkNotNull(mapZzd);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry entry : mapZzd.entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", (Long) 0L);
                contentValues.put(BidResponsedEx.KEY_CID, zzbwVar.zzb());
                contentValues.put(ScarConstants.TOKEN_ID_KEY, zzbwVar.zzc());
                contentValues.put("adid", Integer.valueOf(zzbwVar.zzf() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbwVar.zza()));
                contentValues.put("params", encodedQuery);
                try {
                    if (sQLiteDatabaseZzf.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        zzcdVar2.zzI("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e10) {
                    zzcdVar2.zzJ("Error storing a property", e10);
                }
                this.zzb.zzaa();
                j10 = jZze;
            } catch (Throwable th2) {
                try {
                    this.zzb.zzZ();
                } catch (SQLiteException e11) {
                    zzJ(str, e11);
                }
                throw th2;
            }
        } catch (SQLiteException e12) {
            zzJ("Failed to update Analytics property", e12);
        }
        try {
            this.zzb.zzZ();
        } catch (SQLiteException e13) {
            zzJ(str, e13);
        }
        return j10;
    }
}
