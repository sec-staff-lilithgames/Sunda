package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzggb implements zzgfh {
    private final zzght zza;
    private final zzggu zzb;
    private final ExecutorService zzc;
    private final zzghy zzd;
    private final zzgjd zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private zzgga zzj;

    public zzggb(zzifw zzifwVar, zzght zzghtVar, zzggu zzgguVar, zzghy zzghyVar, zzgjd zzgjdVar, zzfxt zzfxtVar, ExecutorService executorService) {
        this.zza = zzghtVar;
        this.zzb = zzgguVar;
        this.zzc = executorService;
        this.zzd = zzghyVar;
        this.zze = zzgjdVar;
        this.zzg = zzfxtVar.zzb();
        this.zzh = zzfxtVar.zzk();
        this.zzi = zzfxtVar.zzj();
    }

    private final String zzq(Map map) throws zzarp, zzarl {
        String strZzb;
        zzgjd zzgjdVar = this.zze;
        try {
            zzgjdVar.zza(20110).zza();
            synchronized (this.zzf) {
                try {
                    zzgga zzggaVar = this.zzj;
                    if (zzggaVar == null) {
                        zzgjdVar.zzb(20109);
                        strZzb = "";
                    } else {
                        strZzb = zzggaVar.zzb(map);
                    }
                } finally {
                }
            }
            return strZzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final String zza() {
        synchronized (this.zzf) {
            try {
                zzgga zzggaVar = this.zzj;
                if (zzggaVar == null) {
                    return "3.-1";
                }
                return zzggaVar.zzd();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final n1 zzb() {
        zzgua zzguaVarZzw = zzgua.zzw(this.zzb.zza());
        zzgfz zzgfzVar = zzgfz.zza;
        ExecutorService executorService = this.zzc;
        return (zzgua) zzgui.zzj((zzgua) zzgui.zzg(zzguaVarZzw, Throwable.class, zzgfzVar, executorService), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzgfr
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzi((zzgaa) obj);
            }
        }, executorService);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final n1 zzc(final Context context) {
        return zzgui.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgfs
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzj(context);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final n1 zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgui.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgft
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final n1 zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgui.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgfu
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                try {
                    zzgga zzggaVar = this.zzj;
                    if (zzggaVar != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        zzggaVar.zzc(map);
                    } else {
                        this.zze.zzb(20105);
                    }
                } finally {
                }
            }
        } catch (zzarl | zzarp e10) {
            this.zze.zzd(20104, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzggb.zzh(java.util.Map):void");
    }

    public final /* synthetic */ n1 zzi(zzgaa zzgaaVar) {
        if (this.zza.zzb(zzgaaVar)) {
            return zzgui.zzk(this.zzb.zzc(), new zzglu() { // from class: com.google.android.gms.internal.ads.zzgfv
                @Override // com.google.android.gms.internal.ads.zzglu
                public final /* synthetic */ Object apply(Object obj) {
                    this.zza.zzm((byte[]) obj);
                    return null;
                }
            }, zzguz.zza());
        }
        this.zze.zzb(20103);
        throw new zzgfi(1);
    }

    public final /* synthetic */ String zzj(final Context context) throws zzarp, zzarl {
        final HashMap map = new HashMap();
        this.zze.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(map, context);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ String zzk(final Context context, String str, final View view, final Activity activity) throws zzarp, zzarl {
        final HashMap map = new HashMap();
        final String str2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgfx
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ String zzl(final Context context, final String str, final View view, Activity activity) throws zzarp, zzarl {
        final HashMap map = new HashMap();
        final Activity activity2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgfy
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ Void zzm(byte[] bArr) {
        zzarn zzarnVarZzc = zzgge.zzc();
        zzgjb zzgjbVarZza = this.zze.zza(20102);
        try {
            try {
                zzgjbVarZza.zza();
                synchronized (this.zzf) {
                    this.zzj = zzgga.zza(zzarnVarZzc, bArr);
                }
                zzgjbVarZza.zzc();
                return null;
            } catch (zzarl e10) {
                e = e10;
                zzgjbVarZza.zzb(e);
                throw new zzgfi(2, e);
            } catch (zzarp e11) {
                e = e11;
                zzgjbVarZza.zzb(e);
                throw new zzgfi(2, e);
            } catch (Throwable th2) {
                zzgjbVarZza.zzb(th2);
                throw th2;
            }
        } catch (Throwable th3) {
            zzgjbVarZza.zzc();
            throw th3;
        }
    }

    public final /* synthetic */ void zzn(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
        map.put("ctx", context);
    }

    public final /* synthetic */ void zzo(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_VERSION);
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", activity);
        map.put("bds", null);
    }

    public final /* synthetic */ void zzp(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", null);
        map.put("bds", str);
    }
}
