package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbmk implements zzblx {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdvi zzb;
    private final zzbuh zzd;
    private final zzefy zze;
    private final zzcpe zzf;
    private final zzcxn zzg;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final zzgus zzi = zzcbv.zzg;

    public zzbmk(com.google.android.gms.ads.internal.zzb zzbVar, zzbuh zzbuhVar, zzefy zzefyVar, zzdvi zzdviVar, zzcpe zzcpeVar, zzcxn zzcxnVar) {
        this.zza = zzbVar;
        this.zzd = zzbuhVar;
        this.zze = zzefyVar;
        this.zzb = zzdviVar;
        this.zzf = zzcpeVar;
        this.zzg = zzcxnVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM.equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzd(Context context, zzaxa zzaxaVar, Uri uri, View view, Activity activity, zzfgr zzfgrVar) {
        if (zzaxaVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmY)).booleanValue() || zzfgrVar == null) {
                    if (zzaxaVar.zze(uri)) {
                        return zzaxaVar.zzd(uri, context, view, activity);
                    }
                } else if (zzaxaVar.zze(uri)) {
                    return zzfgrVar.zza(uri, context, view, activity);
                }
            } catch (zzaxb unused) {
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e10) {
            String strValueOf = String.valueOf(uri.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e10);
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0369  */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.String r27, com.google.android.gms.ads.internal.client.zza r28, java.util.Map r29, java.lang.String r30) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbmk.zzf(java.lang.String, com.google.android.gms.ads.internal.client.zza, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbeu.zzjt)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbeu.zzjo)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbeu.zzjn)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbmk.zzi(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzefy zzefyVar = this.zze;
        zzefyVar.zzd(str);
        zzdvi zzdviVar = this.zzb;
        if (zzdviVar != null) {
            zzegj.zzk(context, zzdviVar, zzefyVar, str, "dialog_not_shown", zzgph.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk(com.google.android.gms.ads.internal.client.zza r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbmk.zzk(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzl(boolean z10) {
        zzbuh zzbuhVar = this.zzd;
        if (zzbuhVar != null) {
            zzbuhVar.zzb(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i10) {
        zzdvi zzdviVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfh)).booleanValue() || (zzdviVar = this.zzb) == null) {
            return;
        }
        zzdvh zzdvhVarZza = zzdviVar.zza();
        zzdvhVarZza.zzc("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdvhVarZza.zzc("cct_open_status", str);
        zzdvhVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzcpe zzcpeVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_URL);
        Map map2 = new HashMap();
        zzcgy zzcgyVar = (zzcgy) zzaVar;
        if (zzcgyVar.zzC() != null) {
            map2 = zzcgyVar.zzC().zzaw;
        }
        String strZza = zzcah.zza(str, zzcgyVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzgui.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlb)).booleanValue() && (zzcpeVar = this.zzf) != null && zzcpe.zzc(strZza)) ? zzcpeVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgui.zza(strZza), new zzbmg(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(strZza);
        }
    }
}
