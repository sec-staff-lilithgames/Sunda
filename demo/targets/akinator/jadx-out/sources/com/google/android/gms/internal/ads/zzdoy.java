package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.C3209f4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdoy {
    private final Context zza;
    private final zzdoe zzb;
    private final zzaxa zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbdt zzf;
    private final Executor zzg;
    private final zzbhx zzh;
    private final zzdpq zzi;
    private final zzdse zzj;
    private final ScheduledExecutorService zzk;
    private final zzdqz zzl;
    private final zzdvi zzm;
    private final zzfng zzn;
    private final zzefy zzo;
    private final zzegj zzp;
    private final zzfgr zzq;
    private final zzdvc zzr;
    private final zzdwl zzs;

    public zzdoy(Context context, zzdoe zzdoeVar, zzaxa zzaxaVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbdt zzbdtVar, Executor executor, zzfgn zzfgnVar, zzdpq zzdpqVar, zzdse zzdseVar, ScheduledExecutorService scheduledExecutorService, zzdvi zzdviVar, zzfng zzfngVar, zzefy zzefyVar, zzdqz zzdqzVar, zzegj zzegjVar, zzfgr zzfgrVar, zzdvc zzdvcVar, zzdwl zzdwlVar) {
        this.zza = context;
        this.zzb = zzdoeVar;
        this.zzc = zzaxaVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbdtVar;
        this.zzg = executor;
        this.zzh = zzfgnVar.zzj;
        this.zzi = zzdpqVar;
        this.zzj = zzdseVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdviVar;
        this.zzn = zzfngVar;
        this.zzo = zzefyVar;
        this.zzl = zzdqzVar;
        this.zzp = zzegjVar;
        this.zzq = zzfgrVar;
        this.zzr = zzdvcVar;
        this.zzs = zzdwlVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzez zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (jSONObjectOptJSONObject == null) {
            return zzgpe.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgpe.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            com.google.android.gms.ads.internal.client.zzez zzezVarZzt = zzt(jSONArrayOptJSONArray.optJSONObject(i10));
            if (zzezVarZzt != null) {
                arrayList.add(zzezVarZzt);
            }
        }
        return zzgpe.zzq(arrayList);
    }

    private final n1 zzm(JSONArray jSONArray, boolean z10, boolean z11, zzduq zzduqVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgui.zza(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzr.zze(), zzduqVar.zza());
        }
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i10), z10, null));
        }
        return zzgui.zzk(zzgui.zzm(arrayList), zzdox.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final sh.n1 zzn(org.json.JSONObject r14, boolean r15, com.google.android.gms.internal.ads.zzduq r16) {
        /*
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L8
            sh.n1 r14 = com.google.android.gms.internal.ads.zzgui.zza(r0)
            return r14
        L8:
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzex
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L55
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzey
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L55
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzbel r2 = com.google.android.gms.internal.ads.zzbeu.zzez
            com.google.android.gms.internal.ads.zzbes r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 0
        L45:
            if (r4 >= r3) goto L53
            r5 = r2[r4]
            java.lang.String r6 = r14.getString(r5)     // Catch: org.json.JSONException -> L50
            r1.put(r5, r6)     // Catch: org.json.JSONException -> L50
        L50:
            int r4 = r4 + 1
            goto L45
        L53:
            r12 = r1
            goto L56
        L55:
            r12 = r0
        L56:
            java.lang.String r1 = "url"
            java.lang.String r3 = r14.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L6a
            if (r12 == 0) goto L65
            goto L6a
        L65:
            sh.n1 r14 = com.google.android.gms.internal.ads.zzgui.zza(r0)
            return r14
        L6a:
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzcC
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L8b
            if (r16 == 0) goto L8b
            com.google.android.gms.internal.ads.zzdvc r1 = r13.zzr
            android.os.Bundle r1 = r1.zze()
            java.lang.String r2 = r16.zza()
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(r1, r2)
        L8b:
            java.lang.String r1 = "scale"
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r14.optDouble(r1, r4)
            java.lang.String r1 = "is_transparent"
            r2 = 1
            boolean r1 = r14.optBoolean(r1, r2)
            java.lang.String r2 = "width"
            r6 = -1
            int r10 = r14.optInt(r2, r6)
            java.lang.String r2 = "height"
            int r7 = r14.optInt(r2, r6)
            if (r15 != 0) goto Lcb
            if (r12 == 0) goto Lae
            r8 = r4
            r6 = r10
            goto Lcd
        Lae:
            com.google.android.gms.internal.ads.zzdoe r2 = r13.zzb
            sh.n1 r1 = r2.zza(r3, r4, r1)
            com.google.android.gms.internal.ads.zzdon r2 = new com.google.android.gms.internal.ads.zzdon
            r6 = r10
            r2.<init>()
            java.util.concurrent.Executor r3 = r13.zzg
            sh.n1 r1 = com.google.android.gms.internal.ads.zzgui.zzk(r1, r2, r3)
            java.lang.String r2 = "require"
            boolean r14 = r14.optBoolean(r2)
            sh.n1 r14 = zzr(r14, r1, r0)
            return r14
        Lcb:
            r6 = r10
            r8 = r4
        Lcd:
            com.google.android.gms.internal.ads.zzbht r5 = new com.google.android.gms.internal.ads.zzbht
            r10 = r6
            r6 = 0
            android.net.Uri r14 = android.net.Uri.parse(r3)
            r11 = r7
            r7 = r14
            r5.<init>(r6, r7, r8, r10, r11, r12)
            sh.n1 r14 = com.google.android.gms.internal.ads.zzgui.zza(r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdoy.zzn(org.json.JSONObject, boolean, com.google.android.gms.internal.ads.zzduq):sh.n1");
    }

    private static Integer zzo(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final n1 zzp(JSONObject jSONObject, zzffu zzffuVar, zzffx zzffxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzt zzbztVar) {
        final n1 n1VarZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzffuVar, zzffxVar, zzs(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzbztVar);
        return zzgui.zzj(n1VarZzb, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) throws zzekz {
                zzcgy zzcgyVar = (zzcgy) obj;
                if (zzcgyVar == null || zzcgyVar.zzh() == null) {
                    throw new zzekz(1, "Retrieve video view in html5 ad response failed.");
                }
                return n1VarZzb;
            }
        }, zzcbv.zzg);
    }

    private static n1 zzq(n1 n1Var, Object obj) {
        final Object obj2 = null;
        return zzgui.zzh(n1Var, Exception.class, new zzgtq(obj2) { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgui.zza(null);
            }
        }, zzcbv.zzg);
    }

    private static n1 zzr(boolean z10, final n1 n1Var, Object obj) {
        return z10 ? zzgui.zzj(n1Var, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj2) {
                return obj2 != null ? n1Var : zzgui.zzc(new zzekz(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcbv.zzg) : zzq(n1Var, null);
    }

    private final com.google.android.gms.ads.internal.client.zzr zzs(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i10 = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i10, i11));
    }

    private static final com.google.android.gms.ads.internal.client.zzez zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(strOptString, strOptString2);
    }

    public final n1 zza(JSONObject jSONObject, String str, zzduq zzduqVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzduqVar);
    }

    public final n1 zzb(JSONObject jSONObject, String str, zzduq zzduqVar) {
        zzbhx zzbhxVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbhxVar.zzb, zzbhxVar.zzd, zzduqVar);
    }

    public final n1 zzc(JSONObject jSONObject, String str, final zzffu zzffuVar, final zzffx zzffxVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbzt zzbztVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzla)).booleanValue()) {
            return zzgui.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgui.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgui.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzex)).booleanValue()) {
            if (jSONObjectOptJSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzey))) {
                return zzgui.zza(null);
            }
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzs = zzs(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgui.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzr.zze(), zzduq.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza());
        }
        final n1 n1VarZzj = zzgui.zzj(zzgui.zza(null), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzh(zzrVarZzs, zzffuVar, zzffxVar, zzbVar, zzbztVar, strOptString, strOptString2, obj);
            }
        }, zzcbv.zzf);
        return zzgui.zzj(n1VarZzj, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdop
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) throws zzekz {
                if (((zzcgy) obj) != null) {
                    return n1VarZzj;
                }
                throw new zzekz(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcbv.zzg);
    }

    public final n1 zzd(JSONObject jSONObject, String str, zzduq zzduqVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C3209f4.f36683c);
        if (jSONObjectOptJSONObject == null) {
            return zzgui.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzr(jSONObjectOptJSONObject.optBoolean("require"), zzgui.zzk(zzm(jSONArrayOptJSONArray, false, true, zzduqVar), new zzglu() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final n1 zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbzt zzbztVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgui.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzgui.zza(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgui.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzr.zze(), zzduq.NATIVE_ASSETS_LOADING_OMID_START.zza());
        }
        return zzgui.zzj(zzgui.zza(null), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdor
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzj(strOptString, zzbztVar, zzbVar, obj);
            }
        }, zzcbv.zzf);
    }

    public final n1 zzf(n1 n1Var) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzr.zze(), zzduq.NATIVE_ASSETS_LOADING_MEDIA_START.zza());
        }
        zzcca zzccaVar = new zzcca();
        zzgui.zzr(n1Var, new zzdom(this, zzccaVar), zzcbv.zzf);
        return zzccaVar;
    }

    public final n1 zzg(JSONObject jSONObject, zzffu zzffuVar, zzffx zzffxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzt zzbztVar) {
        n1 n1VarZza;
        zzdoy zzdoyVar;
        JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (jSONObjectZzi != null) {
            return zzp(jSONObjectZzi, zzffuVar, zzffxVar, zzbVar, zzbztVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgui.zza(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z10 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkZ)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z10 = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z10) {
                n1VarZza = this.zzi.zza(jSONObjectOptJSONObject, zzbVar, zzbztVar);
                zzdoyVar = this;
            }
            return zzq(zzgui.zzi(n1VarZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzep)).intValue(), TimeUnit.SECONDS, zzdoyVar.zzk), null);
        }
        if (!z10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
            return zzgui.zza(null);
        }
        zzdoyVar = this;
        n1VarZza = zzdoyVar.zzp(jSONObjectOptJSONObject, zzffuVar, zzffxVar, zzbVar, zzbztVar);
        return zzq(zzgui.zzi(n1VarZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzep)).intValue(), TimeUnit.SECONDS, zzdoyVar.zzk), null);
    }

    public final /* synthetic */ n1 zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzffu zzffuVar, zzffx zzffxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzt zzbztVar, String str, String str2, Object obj) throws zzchn {
        zzdwl zzdwlVar;
        zzcgy zzcgyVarZza = this.zzj.zza(zzrVar, zzffuVar, zzffxVar);
        final zzcbz zzcbzVarZza = zzcbz.zza(zzcgyVarZza);
        zzdqw zzdqwVarZza = this.zzl.zza();
        zzciw zzciwVarZzP = zzcgyVarZza.zzP();
        zzbel zzbelVar = zzbeu.zzoB;
        zzciwVarZzP.zzZ(zzdqwVarZza, zzdqwVarZza, zzdqwVarZza, zzdqwVarZza, zzdqwVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() ? null : zzbztVar, this.zzo, this.zzn, this.zzm, null, zzdqwVarZza, null, null, null, null, null, null);
        zzcgyVarZza.zzab("/getNativeAdViewSignals", zzblw.zzs);
        zzcgyVarZza.zzab("/getNativeClickMeta", zzblw.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziu)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziw)).booleanValue() && (zzdwlVar = this.zzs) != null) {
                zzcgyVarZza.zzab("/onDeviceStorageEvent", new zzbmf(zzdwlVar));
            }
        }
        zzcgyVarZza.zzP().zzQ(true);
        zzcgyVarZza.zzP().zzG(new zzciu() { // from class: com.google.android.gms.internal.ads.zzdow
            @Override // com.google.android.gms.internal.ads.zzciu
            public final /* synthetic */ void zza(boolean z10, int i10, String str3, String str4) {
                zzcbz zzcbzVar = zzcbzVarZza;
                if (z10) {
                    zzcbzVar.zzb();
                    return;
                }
                int length = String.valueOf(i10).length();
                StringBuilder sb2 = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb2.append("Image Web View failed to load. Error code: ");
                sb2.append(i10);
                sb2.append(", Description: ");
                sb2.append(str3);
                zzcbzVar.zzd(new zzekz(1, o2.o(sb2, ", Failing URL: ", str4)));
            }
        });
        zzcgyVarZza.zzau(str, str2, null);
        return zzcbzVarZza;
    }

    public final /* synthetic */ zzbhq zzi(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbhq(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    public final /* synthetic */ n1 zzj(String str, zzbzt zzbztVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) throws zzchn {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzegj zzegjVar = this.zzp;
        zzcgy zzcgyVarZza = zzcho.zza(context, zzcji.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzegjVar, this.zzq, this.zzm);
        final zzcbz zzcbzVarZza = zzcbz.zza(zzcgyVarZza);
        zzcgyVarZza.zzP().zzG(new zzciu() { // from class: com.google.android.gms.internal.ads.zzdov
            @Override // com.google.android.gms.internal.ads.zzciu
            public final /* synthetic */ void zza(boolean z10, int i10, String str2, String str3) {
                zzcbzVarZza.zzb();
            }
        });
        zzcgyVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoB)).booleanValue()) {
            if (zzbztVar != null) {
                zzcgyVarZza.zzP().zzj(zzbztVar);
            }
            zzcgyVarZza.zzP().zzi(zzbVar);
        }
        return zzcbzVarZza;
    }
}
